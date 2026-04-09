package lg;

/* loaded from: classes.dex */
public enum a implements ag.d {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    a(int i10) {
        this.number_ = i10;
    }

    @Override // ag.d
    public int getNumber() {
        return this.number_;
    }
}
