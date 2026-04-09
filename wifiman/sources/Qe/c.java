package Qe;

import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19315a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final List f19316b = AbstractC3689v.o(a.SPEED, a.SIGNAL, a.SCAN, a.DISCOVERY, a.TELEPORT);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19317c = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DISCOVERY;
        public static final a SCAN;
        public static final a SIGNAL;
        public static final a SPEED;
        public static final a TELEPORT;
        private final s9.b icon;
        private final s9.b iconSelected;
        private final s9.d title;

        private static final /* synthetic */ a[] $values() {
            return new a[]{SPEED, SIGNAL, SCAN, DISCOVERY, TELEPORT};
        }

        static {
            d.b bVar = new d.b(AbstractC6780c.f53505i1);
            Pe.a aVar = Pe.a.f18599a;
            SPEED = new a("SPEED", 0, bVar, aVar.L(), aVar.M());
            SIGNAL = new a("SIGNAL", 1, new d.b(AbstractC6780c.f53498h1), aVar.I(), aVar.J());
            SCAN = new a("SCAN", 2, new d.b(AbstractC6780c.f53491g1), aVar.F(), aVar.G());
            DISCOVERY = new a("DISCOVERY", 3, new d.b(AbstractC6780c.f53484f1), aVar.l(), aVar.m());
            TELEPORT = new a("TELEPORT", 4, new d.b(AbstractC6780c.f53512j1), aVar.Q(), aVar.R());
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, s9.d dVar, s9.b bVar, s9.b bVar2) {
            this.title = dVar;
            this.icon = bVar;
            this.iconSelected = bVar2;
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

        public final s9.b getIcon() {
            return this.icon;
        }

        public final s9.b getIconSelected() {
            return this.iconSelected;
        }

        public final s9.d getTitle() {
            return this.title;
        }
    }

    private c() {
    }

    public final a a() {
        return (a) AbstractC3689v.q0(f19316b);
    }

    public final List b() {
        return f19316b;
    }
}
