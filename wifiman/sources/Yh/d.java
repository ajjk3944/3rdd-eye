package Yh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25039a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            this.f25039a = name;
            this.f25040b = desc;
        }

        @Override // Yh.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f25039a;
        }

        public final String c() {
            return this.f25040b;
        }

        public String d() {
            return this.f25040b;
        }

        public String e() {
            return this.f25039a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f25039a, aVar.f25039a) && AbstractC6492s.d(this.f25040b, aVar.f25040b);
        }

        public int hashCode() {
            return (this.f25039a.hashCode() * 31) + this.f25040b.hashCode();
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25041a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25042b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            this.f25041a = name;
            this.f25042b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f25041a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f25042b;
            }
            return bVar.b(str, str2);
        }

        @Override // Yh.d
        public String a() {
            return e() + d();
        }

        public final b b(String name, String desc) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(desc, "desc");
            return new b(name, desc);
        }

        public String d() {
            return this.f25042b;
        }

        public String e() {
            return this.f25041a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f25041a, bVar.f25041a) && AbstractC6492s.d(this.f25042b, bVar.f25042b);
        }

        public int hashCode() {
            return (this.f25041a.hashCode() * 31) + this.f25042b.hashCode();
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
