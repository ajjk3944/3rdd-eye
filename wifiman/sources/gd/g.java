package gd;

import Zg.AbstractC3689v;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.C7974i;

/* loaded from: classes4.dex */
public interface g {

    public static final class a {
        public static /* synthetic */ gg.i a(g gVar, String str, C7974i c7974i, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scan");
            }
            if ((i10 & 2) != 0) {
                c7974i = new C7974i(0, 65535);
            }
            return gVar.a(str, c7974i);
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f47840a;

            /* renamed from: b, reason: collision with root package name */
            private final int f47841b;

            /* renamed from: c, reason: collision with root package name */
            private final TreeMap f47842c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String host, int i10, TreeMap services) {
                super(null);
                AbstractC6492s.i(host, "host");
                AbstractC6492s.i(services, "services");
                this.f47840a = host;
                this.f47841b = i10;
                this.f47842c = services;
            }

            @Override // gd.g.b
            public String a() {
                return this.f47840a;
            }

            @Override // gd.g.b
            public int b() {
                return this.f47841b;
            }

            @Override // gd.g.b
            public float c() {
                return 1.0f;
            }

            @Override // gd.g.b
            public int d() {
                return b();
            }

            @Override // gd.g.b
            public TreeMap e() {
                return this.f47842c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f47840a, aVar.f47840a) && this.f47841b == aVar.f47841b && AbstractC6492s.d(this.f47842c, aVar.f47842c);
            }

            public int hashCode() {
                return (((this.f47840a.hashCode() * 31) + Integer.hashCode(this.f47841b)) * 31) + this.f47842c.hashCode();
            }

            @Override // gd.g.b
            public String toString() {
                return super.toString();
            }
        }

        /* renamed from: gd.g$b$b, reason: collision with other inner class name */
        public static final class C1781b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f47843a;

            /* renamed from: b, reason: collision with root package name */
            private final int f47844b;

            /* renamed from: c, reason: collision with root package name */
            private final int f47845c;

            /* renamed from: d, reason: collision with root package name */
            private final TreeMap f47846d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1781b(String host, int i10, int i11, TreeMap services) {
                super(null);
                AbstractC6492s.i(host, "host");
                AbstractC6492s.i(services, "services");
                this.f47843a = host;
                this.f47844b = i10;
                this.f47845c = i11;
                this.f47846d = services;
            }

            @Override // gd.g.b
            public String a() {
                return this.f47843a;
            }

            @Override // gd.g.b
            public int b() {
                return this.f47845c;
            }

            @Override // gd.g.b
            public float c() {
                return d() / b();
            }

            @Override // gd.g.b
            public int d() {
                return this.f47844b;
            }

            @Override // gd.g.b
            public TreeMap e() {
                return this.f47846d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1781b)) {
                    return false;
                }
                C1781b c1781b = (C1781b) obj;
                return AbstractC6492s.d(this.f47843a, c1781b.f47843a) && this.f47844b == c1781b.f47844b && this.f47845c == c1781b.f47845c && AbstractC6492s.d(this.f47846d, c1781b.f47846d);
            }

            public int hashCode() {
                return (((((this.f47843a.hashCode() * 31) + Integer.hashCode(this.f47844b)) * 31) + Integer.hashCode(this.f47845c)) * 31) + this.f47846d.hashCode();
            }

            @Override // gd.g.b
            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String a();

        public abstract int b();

        public abstract float c();

        public abstract int d();

        public abstract TreeMap e();

        public String toString() {
            int iC = (int) (c() * 100);
            String simpleName = getClass().getSimpleName();
            int iD = d();
            Set setKeySet = e().keySet();
            AbstractC6492s.h(setKeySet, "<get-keys>(...)");
            return "PORT SCAN " + iC + " " + simpleName + " (scannedCount: " + iD + ") services found on: " + AbstractC3689v.z0(setKeySet, ",", null, null, 0, null, null, 62, null) + ")";
        }

        private b() {
        }
    }

    gg.i a(String str, C7974i c7974i);

    gg.i b(b.C1781b c1781b);
}
