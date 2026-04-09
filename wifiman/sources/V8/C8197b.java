package v8;

import Sd.d;
import com.ui.wifiman.model.ubiquiti.console.e;
import de.n;
import gg.AbstractC5912b;
import gg.i;
import gg.o;
import gg.q;
import gg.r;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import v8.InterfaceC8196a;

/* renamed from: v8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8197b implements InterfaceC8196a {

    /* renamed from: a, reason: collision with root package name */
    private final n f63500a;

    /* renamed from: b, reason: collision with root package name */
    private final i f63501b;

    /* renamed from: c, reason: collision with root package name */
    private final i f63502c;

    /* renamed from: d, reason: collision with root package name */
    private final i f63503d;

    /* renamed from: v8.b$a */
    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63504a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8196a.AbstractC2249a apply(d.a directConnectionStatus, Boolean alreadyRecommended) {
            AbstractC6492s.i(directConnectionStatus, "directConnectionStatus");
            AbstractC6492s.i(alreadyRecommended, "alreadyRecommended");
            if (!(directConnectionStatus instanceof d.a.AbstractC0739a.C0740a) && !alreadyRecommended.booleanValue()) {
                return InterfaceC8196a.AbstractC2249a.b.f63499a;
            }
            return new InterfaceC8196a.AbstractC2249a.C2250a(alreadyRecommended.booleanValue());
        }
    }

    /* renamed from: v8.b$b, reason: collision with other inner class name */
    static final class C2251b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2251b f63505a = new C2251b();

        C2251b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC8196a.AbstractC2249a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Direct Console Connection Popup availability: " + it, null, 2, null);
        }
    }

    /* renamed from: v8.b$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f63506a = new c();

        /* renamed from: v8.b$c$a */
        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f63507a;

            public a(String str) {
                this.f63507a = str;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    String str = this.f63507a;
                    e.b bVarA = str != null ? e.b.a(str) : null;
                    if (bVarA != null) {
                        oVar.onSuccess(bVarA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            gg.n nVarC = gg.n.c(new a(bVar != null ? bVar.n() : null));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: v8.b$d */
    static final class d implements kg.n {
        d() {
        }

        public final gg.f a(String id2) {
            AbstractC6492s.i(id2, "id");
            n nVar = C8197b.this.f63500a;
            AbstractC6492s.f(e.b.a(id2));
            return nVar.b(id2, true);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((e.b) obj).n());
        }
    }

    /* renamed from: v8.b$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f63509a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a it) {
            com.ui.wifiman.model.ubiquiti.console.e eVarA;
            AbstractC6492s.i(it, "it");
            d.b bVar = (d.b) it.b();
            String strF = (bVar == null || (eVarA = bVar.a()) == null) ? null : eVarA.f();
            return new C6556a(strF != null ? e.b.a(strF) : null);
        }
    }

    /* renamed from: v8.b$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f63510a = new f();

        /* renamed from: v8.b$f$a */
        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f63511a;

            public a(String str) {
                this.f63511a = str;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    String str = this.f63511a;
                    e.b bVarA = str != null ? e.b.a(str) : null;
                    if (bVarA != null) {
                        oVar.onSuccess(bVarA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            gg.n nVarC = gg.n.c(new a(bVar != null ? bVar.n() : null));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: v8.b$g */
    static final class g implements kg.n {
        g() {
        }

        public final gg.f a(String id2) {
            AbstractC6492s.i(id2, "id");
            n nVar = C8197b.this.f63500a;
            AbstractC6492s.f(e.b.a(id2));
            return nVar.b(id2, false);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((e.b) obj).n());
        }
    }

    /* renamed from: v8.b$h */
    static final class h implements kg.n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            e.b bVar = (e.b) c6556a.a();
            String strN = bVar != null ? bVar.n() : null;
            return strN == null ? i.K0(Boolean.FALSE) : C8197b.this.f63500a.a(strN);
        }
    }

    public C8197b(Sd.d localConsole, n visibilityManager) {
        AbstractC6492s.i(localConsole, "localConsole");
        AbstractC6492s.i(visibilityManager, "visibilityManager");
        this.f63500a = visibilityManager;
        i iVarW = localConsole.c().N0(e.f63509a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f63501b = iVarW;
        i iVarI1 = iVarW.I1(new h());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f63502c = iVarI1;
        i iVarI2 = i.v(localConsole.a(), iVarI1, a.f63504a).W().f0(C2251b.f63505a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f63503d = iVarI2;
    }

    @Override // v8.InterfaceC8196a
    public i a() {
        return this.f63503d;
    }

    @Override // v8.InterfaceC8196a
    public AbstractC5912b b() {
        AbstractC5912b abstractC5912bK = this.f63501b.o0().u(f.f63510a).k(new g());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // v8.InterfaceC8196a
    public AbstractC5912b dismiss() {
        AbstractC5912b abstractC5912bK = this.f63501b.o0().u(c.f63506a).k(new d());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }
}
