package T;

/* renamed from: T.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3543m0 extends P, InterfaceC3551q0 {
    @Override // T.P
    float c();

    void k(float f10);

    default void n(float f10) {
        k(f10);
    }

    @Override // T.InterfaceC3551q0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        n(((Number) obj).floatValue());
    }

    @Override // T.z1
    default Float getValue() {
        return Float.valueOf(c());
    }
}
