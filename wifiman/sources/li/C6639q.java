package li;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: li.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6639q implements InterfaceC6632j {

    /* renamed from: a, reason: collision with root package name */
    private final Bh.N f52748a;

    public C6639q(Bh.N packageFragmentProvider) {
        AbstractC6492s.i(packageFragmentProvider, "packageFragmentProvider");
        this.f52748a = packageFragmentProvider;
    }

    @Override // li.InterfaceC6632j
    public C6631i a(Zh.b classId) {
        C6631i c6631iA;
        AbstractC6492s.i(classId, "classId");
        for (Bh.M m10 : Bh.S.c(this.f52748a, classId.f())) {
            if ((m10 instanceof AbstractC6640r) && (c6631iA = ((AbstractC6640r) m10).G0().a(classId)) != null) {
                return c6631iA;
            }
        }
        return null;
    }
}
