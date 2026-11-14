package com.universalauthenticator.app.helpers.comparators;

import com.universalauthenticator.app.vault.VaultEntry;

import java.util.Comparator;

public class UsageCountComparator implements Comparator<VaultEntry> {
    @Override
    public int compare(VaultEntry a, VaultEntry b) {
        return Integer.compare(a.getUsageCount(), b.getUsageCount());
    }
}