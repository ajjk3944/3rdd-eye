package w4;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import o4.v;
import o4.w;
import o4.x;

/* renamed from: w4.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8263h implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final C8263h f64393a = new C8263h();

    /* renamed from: w4.h$b */
    private static class b implements InterfaceC8262g {

        /* renamed from: a, reason: collision with root package name */
        private final v f64394a;

        private b(v vVar) {
            this.f64394a = vVar;
        }
    }

    private C8263h() {
    }

    static void d() {
        x.n(f64393a);
    }

    @Override // o4.w
    public Class a() {
        return InterfaceC8262g.class;
    }

    @Override // o4.w
    public Class b() {
        return InterfaceC8262g.class;
    }

    @Override // o4.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC8262g c(v vVar) throws GeneralSecurityException {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(vVar);
    }
}
