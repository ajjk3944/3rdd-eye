package W0;

import a1.AbstractC3750a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23532b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final k f23533c = new k(0);

    /* renamed from: d, reason: collision with root package name */
    private static final k f23534d = new k(1);

    /* renamed from: e, reason: collision with root package name */
    private static final k f23535e = new k(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f23536a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((k) list.get(i10)).e());
            }
            return new k(numValueOf.intValue());
        }

        public final k b() {
            return k.f23535e;
        }

        public final k c() {
            return k.f23533c;
        }

        public final k d() {
            return k.f23534d;
        }

        private a() {
        }
    }

    public k(int i10) {
        this.f23536a = i10;
    }

    public final boolean d(k kVar) {
        int i10 = this.f23536a;
        return (kVar.f23536a | i10) == i10;
    }

    public final int e() {
        return this.f23536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f23536a == ((k) obj).f23536a;
    }

    public int hashCode() {
        return this.f23536a;
    }

    public String toString() {
        if (this.f23536a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f23536a & f23534d.f23536a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f23536a & f23535e.f23536a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + AbstractC3750a.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
