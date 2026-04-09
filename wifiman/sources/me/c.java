package Me;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f13120a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f13121b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f13122c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f13123d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f13124e;

    /* renamed from: f, reason: collision with root package name */
    private final a f13125f;

    /* renamed from: g, reason: collision with root package name */
    private final List f13126g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13127h;

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

    public c(String id2, InterfaceC7929a image, s9.d name, s9.d info, s9.d signal, a state, List labels) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(info, "info");
        AbstractC6492s.i(signal, "signal");
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(labels, "labels");
        this.f13120a = id2;
        this.f13121b = image;
        this.f13122c = name;
        this.f13123d = info;
        this.f13124e = signal;
        this.f13125f = state;
        this.f13126g = labels;
        this.f13127h = "btItem";
    }

    public final InterfaceC7929a a() {
        return this.f13121b;
    }

    public final s9.d b() {
        return this.f13123d;
    }

    public final List c() {
        return this.f13126g;
    }

    public final s9.d d() {
        return this.f13122c;
    }

    public final s9.d e() {
        return this.f13124e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f13120a, cVar.f13120a) && AbstractC6492s.d(this.f13121b, cVar.f13121b) && AbstractC6492s.d(this.f13122c, cVar.f13122c) && AbstractC6492s.d(this.f13123d, cVar.f13123d) && AbstractC6492s.d(this.f13124e, cVar.f13124e) && this.f13125f == cVar.f13125f && AbstractC6492s.d(this.f13126g, cVar.f13126g);
    }

    public final a f() {
        return this.f13125f;
    }

    @Override // Ee.C2706g.b
    public String getId() {
        return this.f13120a;
    }

    @Override // Ee.C2706g.b
    public String getType() {
        return this.f13127h;
    }

    public int hashCode() {
        return (((((((((((this.f13120a.hashCode() * 31) + this.f13121b.hashCode()) * 31) + this.f13122c.hashCode()) * 31) + this.f13123d.hashCode()) * 31) + this.f13124e.hashCode()) * 31) + this.f13125f.hashCode()) * 31) + this.f13126g.hashCode();
    }

    public String toString() {
        return "DiscoveryResultBluetooth(id=" + this.f13120a + ", image=" + this.f13121b + ", name=" + this.f13122c + ", info=" + this.f13123d + ", signal=" + this.f13124e + ", state=" + this.f13125f + ", labels=" + this.f13126g + ")";
    }
}
