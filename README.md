# Universal Authenticator

A free two-factor authentication (2FA) app for Android: generate one-time codes for TOTP, HOTP and Steam, encrypted with your own vault password and stored only on your device.

## Contact

Questions or feedback? Reach us on Telegram: [@johnconstantine570](https://t.me/johnconstantine570)

## Building

Requires the Android SDK and JDK:

```
./gradlew :app:assembleDebug
```

## Sync

`.github/workflows/sync.yml` pulls upstream changes daily, re-applies the Universal Authenticator branding via `scripts/migrate.py`, and pushes.
