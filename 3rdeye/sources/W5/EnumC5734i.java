package w5;

/* compiled from: SessionEvent.kt */
/* renamed from: w5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5734i implements b5.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    EnumC5734i(int i) {
        this.number = i;
    }

    @Override // b5.f
    public int getNumber() {
        return this.number;
    }
}
