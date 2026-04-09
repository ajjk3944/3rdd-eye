package Me;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f13133a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f13134b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f13135c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f13136d;

    /* renamed from: e, reason: collision with root package name */
    private final a f13137e;

    /* renamed from: f, reason: collision with root package name */
    private final List f13138f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13139g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IDENTIFIED = new a("IDENTIFIED", 0);
        public static final a UNIDENTIFIED = new a("UNIDENTIFIED", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{IDENTIFIED, UNIDENTIFIED};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public g(String id2, InterfaceC7929a image, s9.d name, s9.d info, a state, List labels) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(info, "info");
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(labels, "labels");
        this.f13133a = id2;
        this.f13134b = image;
        this.f13135c = name;
        this.f13136d = info;
        this.f13137e = state;
        this.f13138f = labels;
        this.f13139g = "lanItem";
    }

    public final InterfaceC7929a a() {
        return this.f13134b;
    }

    public final s9.d b() {
        return this.f13136d;
    }

    public final List c() {
        return this.f13138f;
    }

    public final s9.d d() {
        return this.f13135c;
    }

    public final a e() {
        return this.f13137e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC6492s.d(this.f13133a, gVar.f13133a) && AbstractC6492s.d(this.f13134b, gVar.f13134b) && AbstractC6492s.d(this.f13135c, gVar.f13135c) && AbstractC6492s.d(this.f13136d, gVar.f13136d) && this.f13137e == gVar.f13137e && AbstractC6492s.d(this.f13138f, gVar.f13138f);
    }

    @Override // Ee.C2706g.b
    public String getId() {
        return this.f13133a;
    }

    @Override // Ee.C2706g.b
    public String getType() {
        return this.f13139g;
    }

    public int hashCode() {
        return (((((((((this.f13133a.hashCode() * 31) + this.f13134b.hashCode()) * 31) + this.f13135c.hashCode()) * 31) + this.f13136d.hashCode()) * 31) + this.f13137e.hashCode()) * 31) + this.f13138f.hashCode();
    }

    public String toString() {
        return "DiscoveryResultLan(id=" + this.f13133a + ", image=" + this.f13134b + ", name=" + this.f13135c + ", info=" + this.f13136d + ", state=" + this.f13137e + ", labels=" + this.f13138f + ")";
    }
}
