package Fc;

import Cc.AbstractC2558b;
import Dc.k;
import Ec.t;
import Fc.a;
import Yg.m;
import Yg.n;
import Zg.AbstractC3689v;
import inet.ipaddr.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;
import le.C6588i;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Fc.a$a, reason: collision with other inner class name */
    public static final class C0249a {

        /* renamed from: a, reason: collision with root package name */
        private final k f6441a;

        public C0249a(k combiner) {
            AbstractC6492s.i(combiner, "combiner");
            this.f6441a = combiner;
        }

        public final k a() {
            return this.f6441a;
        }
    }

    public static final class b extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f6442a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6443b;

        /* renamed from: c, reason: collision with root package name */
        private final long f6444c;

        /* renamed from: d, reason: collision with root package name */
        private final List f6445d;

        /* renamed from: e, reason: collision with root package name */
        private final t.c f6446e;

        /* renamed from: f, reason: collision with root package name */
        private final AbstractC2558b f6447f;

        /* renamed from: g, reason: collision with root package name */
        private final m f6448g;

        /* renamed from: h, reason: collision with root package name */
        private final m f6449h;

        public b(g ipAddress, long j10, long j11, List wifiSignals) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(wifiSignals, "wifiSignals");
            this.f6442a = ipAddress;
            this.f6443b = j10;
            this.f6444c = j11;
            this.f6445d = wifiSignals;
            this.f6446e = t.c.AP;
            this.f6447f = AbstractC2558b.g.a.f2493b;
            this.f6448g = n.b(new InterfaceC6824a() { // from class: Fc.b
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return a.b.m(this.f6450a);
                }
            });
            this.f6449h = n.b(new InterfaceC6824a() { // from class: Fc.c
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return a.b.n(this.f6451a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List m(b bVar) {
            List list = bVar.f6445d;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC6458c abstractC6458cR = ((C6588i) it.next()).r();
                String strB = abstractC6458cR != null ? abstractC6458cR.b() : null;
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            return AbstractC3689v.g0(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final com.ui.wifiman.model.vendor.d n(b bVar) {
            Iterator it = bVar.f6445d.iterator();
            while (it.hasNext()) {
                com.ui.wifiman.model.vendor.d dVarU = ((C6588i) it.next()).u();
                if (dVarU != null) {
                    return dVarU;
                }
            }
            return null;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f6446e;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f6442a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f6442a, bVar.f6442a) && this.f6443b == bVar.f6443b && this.f6444c == bVar.f6444c && AbstractC6492s.d(this.f6445d, bVar.f6445d);
        }

        @Override // Ec.t.b
        public long f() {
            return this.f6444c;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final AbstractC2558b i() {
            return this.f6447f;
        }

        public final List j() {
            return (List) this.f6448g.getValue();
        }

        public final com.ui.wifiman.model.vendor.d k() {
            return (com.ui.wifiman.model.vendor.d) this.f6449h.getValue();
        }

        public final List l() {
            return this.f6445d;
        }

        public String toString() {
            return "Result(ipAddress=" + this.f6442a + ", createdAt=" + this.f6443b + ", validUntil=" + this.f6444c + ", wifiSignals=" + this.f6445d + ")";
        }
    }
}
