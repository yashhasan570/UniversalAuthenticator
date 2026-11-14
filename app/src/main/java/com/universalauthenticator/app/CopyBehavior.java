package com.universalauthenticator.app;

public enum CopyBehavior {
    NEVER,
    SINGLETAP,
    DOUBLETAP;

    private static CopyBehavior[] _values;

    static {
        _values = values();
    }

    public static CopyBehavior fromInteger(int x) {
        return _values[x];
    }
}
