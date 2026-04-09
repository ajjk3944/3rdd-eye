package Nd;

import Ii.C3048c0;
import Ii.M;
import Ii.N;
import Ii.O;
import Ii.S0;
import Li.InterfaceC3220g;
import com.ui.sso.api.UiAccountApi;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class f implements Nd.c {

    /* renamed from: a, reason: collision with root package name */
    private final UiAccountApi.b f16389a;

    /* renamed from: b, reason: collision with root package name */
    private final i f16390b;

    /* renamed from: c, reason: collision with root package name */
    private final i f16391c;

    private static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private final String f16392a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16393b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16394c;

        public a(String apiProviderPackage, int i10) {
            AbstractC6492s.i(apiProviderPackage, "apiProviderPackage");
            this.f16392a = apiProviderPackage;
            this.f16393b = i10;
            this.f16394c = "Account API of '" + apiProviderPackage + "' backed by LOCAL Storage Type. API version: " + i10;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f16394c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16395a;

        static {
            int[] iArr = new int[Na.c.values().length];
            try {
                iArr[Na.c.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Na.c.ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16395a = iArr;
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3220g apply(N s10) {
            AbstractC6492s.i(s10, "s");
            return f.this.f16389a.a(s10);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16397a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC3220g it) {
            AbstractC6492s.i(it, "it");
            return Qi.i.c(it, null, 1, null);
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(UiAccountApi it) {
            AbstractC6492s.i(it, "it");
            f.this.f(it.getState());
        }
    }

    public f(UiAccountApi.b uiAccountApiService) {
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        this.f16389a = uiAccountApiService;
        i iVarI2 = i.N(new k() { // from class: Nd.e
            @Override // gg.k
            public final void a(j jVar) {
                f.g(jVar);
            }
        }, EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f16390b = iVarI2;
        i iVarI22 = iVarI2.N0(new c()).p0(d.f16397a).f0(new e()).e1().Y0(Gg.a.a(), false, 1).F1(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f16391c = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(UiAccountApi.c cVar) {
        int i10 = b.f16395a[cVar.e().ordinal()];
        if (i10 == 1) {
            Z7.b.e("Account API backed by LOCAL Storage Type", new a(cVar.d(), cVar.c()), null, 4, null);
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final N nA = O.a(S0.b(null, 1, null).plus(C3048c0.a()).plus(new M("UiAccountApiServiceRx")));
        emitter.h(nA);
        emitter.d(new InterfaceC6468e() { // from class: Nd.d
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                f.h(nA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(N n10) {
        O.f(n10, null, 1, null);
    }

    @Override // Nd.c
    public i c() {
        return this.f16391c;
    }
}
