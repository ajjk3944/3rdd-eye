package y8;

import Te.I;
import Te.L;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import gg.AbstractC5912b;
import gg.y;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import m9.C6783c;
import s9.d;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private final m.c f66440a;

    /* renamed from: b, reason: collision with root package name */
    private final y f66441b;

    /* renamed from: c, reason: collision with root package name */
    private final L f66442c;

    static final class a implements gg.m {

        /* renamed from: y8.f$a$a, reason: collision with other inner class name */
        static final class C2360a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f66444a;

            /* renamed from: y8.f$a$a$a, reason: collision with other inner class name */
            public static final class C2361a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f66445a;

                public C2361a(N n10) {
                    this.f66445a = n10;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    try {
                        Object obj = this.f66445a.f51689a;
                        if (obj != null) {
                            oVar.onSuccess(obj);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            C2360a(N n10) {
                this.f66444a = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r apply(Long it) {
                AbstractC6492s.i(it, "it");
                gg.n nVarC = gg.n.c(new C2361a(this.f66444a));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f66446a;

            b(N n10) {
                this.f66446a = n10;
            }

            @Override // kg.InterfaceC6469f
            public final void accept(Object it) {
                AbstractC6492s.i(it, "it");
                this.f66446a.f51689a = it;
            }
        }

        a() {
        }

        @Override // gg.m
        public final Dj.a a(gg.i stream) {
            AbstractC6492s.i(stream, "stream");
            N n10 = new N();
            AbstractC5912b abstractC5912bE0 = stream.f0(new b(n10)).E0();
            AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
            return gg.i.G0(0L, 50L, TimeUnit.MILLISECONDS, f.this.f66441b).e1().U0(abstractC5912bE0).v0(new C2360a(n10));
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected final m.c d() {
        return this.f66440a;
    }

    protected final L e() {
        return this.f66442c;
    }

    protected final I f(long j10, AbstractC8627a marker, float f10) {
        AbstractC6492s.i(marker, "marker");
        if (marker instanceof AbstractC8627a.C2357a) {
            AbstractC8627a.C2357a c2357a = (AbstractC8627a.C2357a) marker;
            float fH = h(j10, c2357a.a());
            String strB = c2357a.b();
            return new I.b(fH, f10, strB != null ? new d.c(strB) : new d.b(R.string.signal_mapper_chart_roaming_ap_name_fallback));
        }
        if (!(marker instanceof AbstractC8627a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC8627a.c cVar = (AbstractC8627a.c) marker;
        return new I.a(h(j10, cVar.a()), f10, new d.c(cVar.b()));
    }

    protected final gg.i g(gg.i iVar) {
        AbstractC6492s.i(iVar, "<this>");
        gg.i iVarX = iVar.x(new a());
        AbstractC6492s.h(iVarX, "compose(...)");
        return iVarX;
    }

    protected final float h(long j10, long j11) {
        return (30000 - j10) + j11;
    }

    private f() {
        this.f66440a = m.c.NORMAL;
        this.f66441b = C6783c.f53633a.h("signalMapperChart");
        this.f66442c = new L(0.0f, 30000.0f);
    }
}
