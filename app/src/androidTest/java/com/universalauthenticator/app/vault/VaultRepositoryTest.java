package com.universalauthenticator.app.vault;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;

import com.universalauthenticator.app.Universal AuthenticatorTest;
import com.universalauthenticator.app.vault.slots.PasswordSlot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import dagger.hilt.android.testing.HiltAndroidTest;

@RunWith(AndroidJUnit4.class)
@HiltAndroidTest
@SmallTest
public class VaultRepositoryTest extends Universal AuthenticatorTest {
    @Before
    public void before() {
        initEncryptedVault();
    }

    @Test
    public void testToggleEncryption() throws VaultRepositoryException {
        VaultRepository vault = _vaultManager.getVault();
        _vaultManager.disableEncryption();
        assertFalse(vault.isEncryptionEnabled());
        assertNull(vault.getCredentials());

        VaultFileCredentials creds = generateCredentials();
        _vaultManager.enableEncryption(creds);
        assertTrue(vault.isEncryptionEnabled());
        assertNotNull(vault.getCredentials());
        assertEquals(vault.getCredentials().getSlots().findAll(PasswordSlot.class).size(), 1);
    }
}
