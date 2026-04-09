package o5;

/* renamed from: o5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC7083d implements b5.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    EnumC7083d(int i10) {
        this.number = i10;
    }

    @Override // b5.f
    public int getNumber() {
        return this.number;
    }
}
