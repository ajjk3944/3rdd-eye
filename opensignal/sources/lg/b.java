package lg;

/* loaded from: classes.dex */
public enum b implements ag.d {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    b(int i10) {
        this.number_ = i10;
    }

    @Override // ag.d
    public int getNumber() {
        return this.number_;
    }
}
