package xd;

import be.InterfaceC4091e;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kd.InterfaceC6454d;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: xd.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8458i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4091e f65618a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6454d f65619b;

    /* renamed from: xd.i$a */
    public static final class a extends AbstractC8451b {

        /* renamed from: a, reason: collision with root package name */
        private final String f65620a;

        public a(String str) {
            this.f65620a = str;
        }

        public final String a() {
            return this.f65620a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f65620a, ((a) obj).f65620a);
        }

        public int hashCode() {
            String str = this.f65620a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Result(resultId=" + this.f65620a + ")";
        }
    }

    /* renamed from: xd.i$b */
    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f65621a;

        /* renamed from: xd.i$b$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f65622a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a apply(String it) {
                AbstractC6492s.i(it, "it");
                return new a(it);
            }
        }

        /* renamed from: xd.i$b$b, reason: collision with other inner class name */
        public static final class C2321b implements C {
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(new a(null));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        b(Speedtest.d dVar) {
            this.f65621a = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final gg.D apply(Yg.s r13) {
            /*
                Method dump skipped, instructions count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xd.C8458i.b.apply(Yg.s):gg.D");
        }
    }

    public C8458i(InterfaceC4091e unifiWifimanApiManager, InterfaceC6454d publicIPService) {
        AbstractC6492s.i(unifiWifimanApiManager, "unifiWifimanApiManager");
        AbstractC6492s.i(publicIPService, "publicIPService");
        this.f65618a = unifiWifimanApiManager;
        this.f65619b = publicIPService;
    }

    public z a(Speedtest.d state, C8452c c8452c) {
        AbstractC6492s.i(state, "state");
        z zVarS = Ag.c.f753a.a(this.f65618a.c(), this.f65619b.a()).o0().s(new b(state));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }
}
