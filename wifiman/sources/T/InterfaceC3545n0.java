package T;

/* renamed from: T.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3545n0 extends W, InterfaceC3551q0 {
    @Override // T.W
    int e();

    void l(int i10);

    @Override // T.InterfaceC3551q0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    @Override // T.z1
    default Integer getValue() {
        return Integer.valueOf(e());
    }

    default void setValue(int i10) {
        l(i10);
    }
}
