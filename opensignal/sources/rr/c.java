package rr;

/* loaded from: classes.dex */
public enum c {
    DECLARATION,
    FAKE_OVERRIDE,
    DELEGATION,
    SYNTHESIZED;

    public boolean isReal() {
        return this != FAKE_OVERRIDE;
    }
}
