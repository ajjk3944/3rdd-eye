package W7;

import Yg.m;
import Yg.n;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final m f23687a = n.b(new c());

    /* renamed from: b, reason: collision with root package name */
    private final m f23688b = n.b(new b());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXCELLENT = new a("EXCELLENT", 0);
        public static final a GOOD = new a("GOOD", 1);
        public static final a POOR = new a("POOR", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{EXCELLENT, GOOD, POOR};
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

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf((int) (f.this.g() * 100));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(f.this.d() > f.this.b() ? 0.0f : f.this.c() < f.this.b() ? 1.0f : (f.this.b() - f.this.d()) / (f.this.c() - f.this.d()));
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        AbstractC6492s.i(other, "other");
        return AbstractC6492s.k(b(), other.b());
    }

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final float g() {
        return ((Number) this.f23687a.getValue()).floatValue();
    }

    public abstract a h();

    public abstract int hashCode();
}
