package oa;

/* compiled from: TextStyle.java */
/* loaded from: classes3.dex */
public enum m {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public m asNormal() {
        return values()[ordinal() & (-2)];
    }

    public m asStandalone() {
        return values()[ordinal() | 1];
    }

    public boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }
}
