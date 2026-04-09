package w5;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes2.dex */
public enum p implements b5.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    p(int i) {
        this.number = i;
    }

    @Override // b5.f
    public int getNumber() {
        return this.number;
    }
}
