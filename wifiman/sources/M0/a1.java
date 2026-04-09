package m0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6537m;

/* loaded from: classes.dex */
public final class a1 extends e1 {

    /* renamed from: e, reason: collision with root package name */
    private final List f52873e;

    /* renamed from: f, reason: collision with root package name */
    private final List f52874f;

    /* renamed from: g, reason: collision with root package name */
    private final long f52875g;

    /* renamed from: h, reason: collision with root package name */
    private final float f52876h;

    /* renamed from: i, reason: collision with root package name */
    private final int f52877i;

    public /* synthetic */ a1(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    @Override // m0.e1
    public Shader b(long j10) {
        float fI;
        float fG;
        if (AbstractC6532h.d(this.f52875g)) {
            long jB = AbstractC6538n.b(j10);
            fI = C6531g.m(jB);
            fG = C6531g.n(jB);
        } else {
            fI = C6531g.m(this.f52875g) == Float.POSITIVE_INFINITY ? C6537m.i(j10) : C6531g.m(this.f52875g);
            fG = C6531g.n(this.f52875g) == Float.POSITIVE_INFINITY ? C6537m.g(j10) : C6531g.n(this.f52875g);
        }
        List list = this.f52873e;
        List list2 = this.f52874f;
        long jA = AbstractC6532h.a(fI, fG);
        float f10 = this.f52876h;
        return f1.c(jA, f10 == Float.POSITIVE_INFINITY ? C6537m.h(j10) / 2 : f10, list, list2, this.f52877i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return AbstractC6492s.d(this.f52873e, a1Var.f52873e) && AbstractC6492s.d(this.f52874f, a1Var.f52874f) && C6531g.j(this.f52875g, a1Var.f52875g) && this.f52876h == a1Var.f52876h && m1.f(this.f52877i, a1Var.f52877i);
    }

    public int hashCode() {
        int iHashCode = this.f52873e.hashCode() * 31;
        List list = this.f52874f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C6531g.o(this.f52875g)) * 31) + Float.hashCode(this.f52876h)) * 31) + m1.g(this.f52877i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (AbstractC6532h.c(this.f52875g)) {
            str = "center=" + ((Object) C6531g.t(this.f52875g)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f52876h;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + this.f52876h + ", ";
        }
        return "RadialGradient(colors=" + this.f52873e + ", stops=" + this.f52874f + ", " + str + str2 + "tileMode=" + ((Object) m1.h(this.f52877i)) + ')';
    }

    private a1(List list, List list2, long j10, float f10, int i10) {
        this.f52873e = list;
        this.f52874f = list2;
        this.f52875g = j10;
        this.f52876h = f10;
        this.f52877i = i10;
    }
}
