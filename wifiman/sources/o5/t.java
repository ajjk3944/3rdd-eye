package o5;

/* loaded from: classes3.dex */
public enum t implements b5.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    t(int i10) {
        this.number = i10;
    }

    @Override // b5.f
    public int getNumber() {
        return this.number;
    }
}
