package f2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public class u extends s {

    /* renamed from: h, reason: collision with root package name */
    private final C5499E f46909h;

    /* renamed from: i, reason: collision with root package name */
    private int f46910i;

    /* renamed from: j, reason: collision with root package name */
    private String f46911j;

    /* renamed from: k, reason: collision with root package name */
    private th.d f46912k;

    /* renamed from: l, reason: collision with root package name */
    private Object f46913l;

    /* renamed from: m, reason: collision with root package name */
    private final List f46914m;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46915a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(r it) {
            AbstractC6492s.i(it, "it");
            String strW = it.w();
            AbstractC6492s.f(strW);
            return strW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C5499E provider, String startDestination, String str) {
        super(provider.d(v.class), str);
        AbstractC6492s.i(provider, "provider");
        AbstractC6492s.i(startDestination, "startDestination");
        this.f46914m = new ArrayList();
        this.f46909h = provider;
        this.f46911j = startDestination;
    }

    @Override // f2.s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t b() {
        t tVar = (t) super.b();
        tVar.M(this.f46914m);
        int i10 = this.f46910i;
        if (i10 == 0 && this.f46911j == null && this.f46912k == null && this.f46913l == null) {
            if (d() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f46911j;
        if (str != null) {
            AbstractC6492s.f(str);
            tVar.c0(str);
        } else {
            th.d dVar = this.f46912k;
            if (dVar != null) {
                AbstractC6492s.f(dVar);
                tVar.a0(Vi.w.d(dVar), a.f46915a);
            } else {
                Object obj = this.f46913l;
                if (obj != null) {
                    AbstractC6492s.f(obj);
                    tVar.b0(obj);
                } else {
                    tVar.Z(i10);
                }
            }
        }
        return tVar;
    }

    public final void g(s navDestination) {
        AbstractC6492s.i(navDestination, "navDestination");
        this.f46914m.add(navDestination.b());
    }

    public final C5499E h() {
        return this.f46909h;
    }
}
