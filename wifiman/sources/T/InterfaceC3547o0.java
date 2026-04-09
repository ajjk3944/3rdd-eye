package T;

/* renamed from: T.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3547o0 extends InterfaceC3527f0, InterfaceC3551q0 {
    @Override // T.InterfaceC3527f0
    long a();

    void m(long j10);

    @Override // T.InterfaceC3551q0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        setValue(((Number) obj).longValue());
    }

    @Override // T.z1
    default Long getValue() {
        return Long.valueOf(a());
    }

    default void setValue(long j10) {
        m(j10);
    }
}
