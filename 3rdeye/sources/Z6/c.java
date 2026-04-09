package Z6;

import N7.B8;
import N7.C1154e9;
import androidx.work.s;
import b9.j;
import com.google.android.gms.common.internal.ImagesContract;
import d7.C4278a;
import d7.C4280c;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoredValue.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: StoredValue.kt */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14018a;

        /* renamed from: b, reason: collision with root package name */
        public final JSONArray f14019b;

        public a(String name, JSONArray value) {
            l.f(name, "name");
            l.f(value, "value");
            this.f14018a = name;
            this.f14019b = value;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14018a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.b(this.f14018a, aVar.f14018a) && l.b(this.f14019b, aVar.f14019b);
        }

        public final int hashCode() {
            return this.f14019b.hashCode() + (this.f14018a.hashCode() * 31);
        }

        public final String toString() {
            return "ArrayStoredValue(name=" + this.f14018a + ", value=" + this.f14019b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14020a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14021b;

        public b(String name, boolean z10) {
            l.f(name, "name");
            this.f14020a = name;
            this.f14021b = z10;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14020a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.b(this.f14020a, bVar.f14020a) && this.f14021b == bVar.f14021b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int iHashCode = this.f14020a.hashCode() * 31;
            boolean z10 = this.f14021b;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BooleanStoredValue(name=");
            sb.append(this.f14020a);
            sb.append(", value=");
            return C1154e9.k(sb, this.f14021b, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    /* renamed from: Z6.c$c, reason: collision with other inner class name */
    public static final class C0206c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14022a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14023b;

        public C0206c(String name, int i) {
            l.f(name, "name");
            this.f14022a = name;
            this.f14023b = i;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14022a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0206c)) {
                return false;
            }
            C0206c c0206c = (C0206c) obj;
            return l.b(this.f14022a, c0206c.f14022a) && this.f14023b == c0206c.f14023b;
        }

        public final int hashCode() {
            return (this.f14022a.hashCode() * 31) + this.f14023b;
        }

        public final String toString() {
            return "ColorStoredValue(name=" + this.f14022a + ", value=" + ((Object) C4278a.a(this.f14023b)) + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14024a;

        /* renamed from: b, reason: collision with root package name */
        public final JSONObject f14025b;

        public d(String name, JSONObject value) {
            l.f(name, "name");
            l.f(value, "value");
            this.f14024a = name;
            this.f14025b = value;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14024a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.b(this.f14024a, dVar.f14024a) && l.b(this.f14025b, dVar.f14025b);
        }

        public final int hashCode() {
            return this.f14025b.hashCode() + (this.f14024a.hashCode() * 31);
        }

        public final String toString() {
            return "DictStoredValue(name=" + this.f14024a + ", value=" + this.f14025b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14026a;

        /* renamed from: b, reason: collision with root package name */
        public final double f14027b;

        public e(String name, double d10) {
            l.f(name, "name");
            this.f14026a = name;
            this.f14027b = d10;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14026a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return l.b(this.f14026a, eVar.f14026a) && Double.compare(this.f14027b, eVar.f14027b) == 0;
        }

        public final int hashCode() {
            int iHashCode = this.f14026a.hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.f14027b);
            return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }

        public final String toString() {
            return "DoubleStoredValue(name=" + this.f14026a + ", value=" + this.f14027b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14028a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14029b;

        public f(String name, long j4) {
            l.f(name, "name");
            this.f14028a = name;
            this.f14029b = j4;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14028a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return l.b(this.f14028a, fVar.f14028a) && this.f14029b == fVar.f14029b;
        }

        public final int hashCode() {
            int iHashCode = this.f14028a.hashCode() * 31;
            long j4 = this.f14029b;
            return iHashCode + ((int) (j4 ^ (j4 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntegerStoredValue(name=");
            sb.append(this.f14028a);
            sb.append(", value=");
            return s.f(sb, this.f14029b, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class g extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14030a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14031b;

        public g(String name, String value) {
            l.f(name, "name");
            l.f(value, "value");
            this.f14030a = name;
            this.f14031b = value;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14030a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return l.b(this.f14030a, gVar.f14030a) && l.b(this.f14031b, gVar.f14031b);
        }

        public final int hashCode() {
            return this.f14031b.hashCode() + (this.f14030a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringStoredValue(name=");
            sb.append(this.f14030a);
            sb.append(", value=");
            return B8.j(sb, this.f14031b, ')');
        }
    }

    /* compiled from: StoredValue.kt */
    public enum h {
        STRING("string"),
        INTEGER("integer"),
        BOOLEAN("boolean"),
        NUMBER("number"),
        COLOR("color"),
        URL(ImagesContract.URL),
        ARRAY("array"),
        DICT("dict");

        public static final a Converter = new a();
        private final String value;

        /* compiled from: StoredValue.kt */
        public static final class a {
            public static h a(String str) {
                h hVar = h.STRING;
                if (str.equals(hVar.value)) {
                    return hVar;
                }
                h hVar2 = h.INTEGER;
                if (str.equals(hVar2.value)) {
                    return hVar2;
                }
                h hVar3 = h.BOOLEAN;
                if (str.equals(hVar3.value)) {
                    return hVar3;
                }
                h hVar4 = h.NUMBER;
                if (str.equals(hVar4.value)) {
                    return hVar4;
                }
                h hVar5 = h.COLOR;
                if (str.equals(hVar5.value)) {
                    return hVar5;
                }
                h hVar6 = h.URL;
                if (str.equals(hVar6.value)) {
                    return hVar6;
                }
                h hVar7 = h.ARRAY;
                if (str.equals(hVar7.value)) {
                    return hVar7;
                }
                h hVar8 = h.DICT;
                if (str.equals(hVar8.value)) {
                    return hVar8;
                }
                return null;
            }
        }

        h(String str) {
            this.value = str;
        }
    }

    /* compiled from: StoredValue.kt */
    public static final class i extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f14032a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14033b;

        public i(String name, String str) {
            l.f(name, "name");
            this.f14032a = name;
            this.f14033b = str;
        }

        @Override // Z6.c
        public final String a() {
            return this.f14032a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return l.b(this.f14032a, iVar.f14032a) && l.b(this.f14033b, iVar.f14033b);
        }

        public final int hashCode() {
            return this.f14033b.hashCode() + (this.f14032a.hashCode() * 31);
        }

        public final String toString() {
            return "UrlStoredValue(name=" + this.f14032a + ", value=" + ((Object) this.f14033b) + ')';
        }
    }

    public abstract String a();

    public final Object b() {
        if (this instanceof g) {
            return ((g) this).f14031b;
        }
        if (this instanceof f) {
            return Long.valueOf(((f) this).f14029b);
        }
        if (this instanceof b) {
            return Boolean.valueOf(((b) this).f14021b);
        }
        if (this instanceof e) {
            return Double.valueOf(((e) this).f14027b);
        }
        if (this instanceof C0206c) {
            return new C4278a(((C0206c) this).f14023b);
        }
        if (this instanceof i) {
            return new C4280c(((i) this).f14033b);
        }
        if (this instanceof a) {
            return ((a) this).f14019b;
        }
        if (this instanceof d) {
            return ((d) this).f14025b;
        }
        throw new j();
    }
}
