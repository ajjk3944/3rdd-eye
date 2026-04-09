package lg;

/* loaded from: classes.dex */
public enum c implements ag.d {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    c(int i10) {
        this.number_ = i10;
    }

    @Override // ag.d
    public int getNumber() {
        return this.number_;
    }
}
