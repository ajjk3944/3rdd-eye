package re;

import com.ui.wifiman.model.wmw.WifimanWizard;
import je.AbstractC6317r;
import je.u;
import ke.AbstractC6458c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.AbstractC6561f;
import l9.C6556a;
import re.InterfaceC7588a;

/* renamed from: re.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7589b implements InterfaceC7588a {

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f60342a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f60343b;

    /* renamed from: re.b$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60344a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof AbstractC6317r.b.a) {
                AbstractC6458c abstractC6458cI = ((AbstractC6317r.b.a) state).i();
                return new C6556a(abstractC6458cI != null ? abstractC6458cI.b() : null);
            }
            if ((state instanceof AbstractC6317r.b.C1875b) || (state instanceof AbstractC6317r.a)) {
                return new C6556a(null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: re.b$b, reason: collision with other inner class name */
    static final class C2113b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2113b f60345a = new C2113b();

        C2113b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(String it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    /* renamed from: re.b$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WifimanWizard f60346a;

        c(WifimanWizard wifimanWizard) {
            this.f60346a = wifimanWizard;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            return new C6556a(str != null ? new C7594g(str, this.f60346a) : null);
        }
    }

    /* renamed from: re.b$d */
    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WifimanWizard f60347a;

        /* renamed from: re.b$d$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7594g f60348a;

            a(C7594g c7594g) {
                this.f60348a = c7594g;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC7588a.b apply(WifimanWizard.a state) {
                AbstractC6492s.i(state, "state");
                if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                    return new InterfaceC7588a.b.C2111a(this.f60348a, new C7604q(((WifimanWizard.a.AbstractC1520a.C1521a) state).b(), this.f60348a));
                }
                if ((state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.c)) {
                    return InterfaceC7588a.b.C2112b.f60341a;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        d(WifimanWizard wifimanWizard) {
            this.f60347a = wifimanWizard;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            C7594g c7594g = (C7594g) c6556a.a();
            if (c7594g != null) {
                gg.i iVarN0 = this.f60347a.getState().N0(new a(c7594g));
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(InterfaceC7588a.b.C2112b.f60341a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    public C7589b(WifimanWizard wizard, u wifiConnectionService) {
        AbstractC6492s.i(wizard, "wizard");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        gg.i iVarN0 = wifiConnectionService.a().N0(a.f60344a);
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarW = AbstractC6561f.e(iVarN0).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f60342a = iVarW;
        gg.i iVarI2 = iVarW.N0(C2113b.f60345a).z1(new C6556a(null)).N0(new c(wizard)).I1(new d(wizard)).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f60343b = iVarI2;
    }

    @Override // re.InterfaceC7588a
    public gg.i getState() {
        return this.f60343b;
    }
}
