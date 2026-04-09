package ud;

import gg.i;
import je.AbstractC6317r;
import je.u;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* renamed from: ud.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8161b implements InterfaceC8160a {

    /* renamed from: a, reason: collision with root package name */
    private final u f62934a;

    /* renamed from: ud.b$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f62935a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            AbstractC6317r.b.a aVar = it instanceof AbstractC6317r.b.a ? (AbstractC6317r.b.a) it : null;
            return new C6556a(aVar != null ? aVar.f() : null);
        }
    }

    /* renamed from: ud.b$b, reason: collision with other inner class name */
    static final class C2227b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C2227b f62936a = new C2227b();

        C2227b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final W7.b apply(W7.b r5, l9.C6556a r6) {
            /*
                r4 = this;
                java.lang.String r0 = "cache"
                kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
                java.lang.Object r6 = r6.a()
                W7.b r6 = (W7.b) r6
                W7.a r0 = r5.b()
                r1 = 0
                if (r0 == 0) goto L3b
                if (r6 == 0) goto L1e
                W7.a r0 = r6.b()
                goto L1f
            L1e:
                r0 = r1
            L1f:
                if (r0 == 0) goto L36
                W7.a r0 = r5.b()
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                W7.a r2 = r6.b()
                kotlin.jvm.internal.AbstractC6492s.f(r2)
                int r0 = r0.compareTo(r2)
                if (r0 >= 0) goto L36
                goto L3b
            L36:
                W7.a r0 = r5.b()
                goto L43
            L3b:
                if (r6 == 0) goto L42
                W7.a r0 = r6.b()
                goto L43
            L42:
                r0 = r1
            L43:
                W7.a r2 = r5.c()
                if (r2 == 0) goto L6d
                if (r6 == 0) goto L50
                W7.a r2 = r6.c()
                goto L51
            L50:
                r2 = r1
            L51:
                if (r2 == 0) goto L68
                W7.a r2 = r5.c()
                kotlin.jvm.internal.AbstractC6492s.f(r2)
                W7.a r3 = r6.c()
                kotlin.jvm.internal.AbstractC6492s.f(r3)
                int r2 = r2.compareTo(r3)
                if (r2 >= 0) goto L68
                goto L6d
            L68:
                W7.a r1 = r5.c()
                goto L73
            L6d:
                if (r6 == 0) goto L73
                W7.a r1 = r6.c()
            L73:
                W7.b r5 = r5.a(r0, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.C8161b.C2227b.apply(W7.b, l9.a):W7.b");
        }
    }

    public C8161b(u wifiConnectionService) {
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        this.f62934a = wifiConnectionService;
    }

    @Override // ud.InterfaceC8160a
    public i a() {
        i iVarW = this.f62934a.a().N0(a.f62935a).W().q1(new W7.b(null, null), C2227b.f62936a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }
}
