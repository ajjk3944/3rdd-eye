package Wh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0907a f23915f = new C0907a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f23916a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23917b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23918c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23919d;

    /* renamed from: e, reason: collision with root package name */
    private final List f23920e;

    /* renamed from: Wh.a$a, reason: collision with other inner class name */
    public static final class C0907a {
        public /* synthetic */ C0907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0907a() {
        }
    }

    public a(int... numbers) {
        List listL;
        AbstractC6492s.i(numbers, "numbers");
        this.f23916a = numbers;
        Integer numH0 = AbstractC3682n.h0(numbers, 0);
        this.f23917b = numH0 != null ? numH0.intValue() : -1;
        Integer numH02 = AbstractC3682n.h0(numbers, 1);
        this.f23918c = numH02 != null ? numH02.intValue() : -1;
        Integer numH03 = AbstractC3682n.h0(numbers, 2);
        this.f23919d = numH03 != null ? numH03.intValue() : -1;
        if (numbers.length <= 3) {
            listL = AbstractC3689v.l();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listL = AbstractC3689v.i1(AbstractC3682n.d(numbers).subList(3, numbers.length));
        }
        this.f23920e = listL;
    }

    public final int a() {
        return this.f23917b;
    }

    public final int b() {
        return this.f23918c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f23917b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f23918c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f23919d >= i12;
    }

    public final boolean d(a version) {
        AbstractC6492s.i(version, "version");
        return c(version.f23917b, version.f23918c, version.f23919d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f23917b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f23918c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f23919d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && AbstractC6492s.d(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f23917b == aVar.f23917b && this.f23918c == aVar.f23918c && this.f23919d == aVar.f23919d && AbstractC6492s.d(this.f23920e, aVar.f23920e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(a ourVersion) {
        AbstractC6492s.i(ourVersion, "ourVersion");
        int i10 = this.f23917b;
        if (i10 == 0) {
            if (ourVersion.f23917b != 0 || this.f23918c != ourVersion.f23918c) {
                return false;
            }
        } else if (i10 != ourVersion.f23917b || this.f23918c > ourVersion.f23918c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f23916a;
    }

    public int hashCode() {
        int i10 = this.f23917b;
        int i11 = i10 + (i10 * 31) + this.f23918c;
        int i12 = i11 + (i11 * 31) + this.f23919d;
        return i12 + (i12 * 31) + this.f23920e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC3689v.z0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
