package m0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;

/* loaded from: classes.dex */
public final class N0 extends e1 {

    /* renamed from: e, reason: collision with root package name */
    private final List f52830e;

    /* renamed from: f, reason: collision with root package name */
    private final List f52831f;

    /* renamed from: g, reason: collision with root package name */
    private final long f52832g;

    /* renamed from: h, reason: collision with root package name */
    private final long f52833h;

    /* renamed from: i, reason: collision with root package name */
    private final int f52834i;

    public /* synthetic */ N0(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    @Override // m0.e1
    public Shader b(long j10) {
        return f1.a(AbstractC6532h.a(C6531g.m(this.f52832g) == Float.POSITIVE_INFINITY ? C6537m.i(j10) : C6531g.m(this.f52832g), C6531g.n(this.f52832g) == Float.POSITIVE_INFINITY ? C6537m.g(j10) : C6531g.n(this.f52832g)), AbstractC6532h.a(C6531g.m(this.f52833h) == Float.POSITIVE_INFINITY ? C6537m.i(j10) : C6531g.m(this.f52833h), C6531g.n(this.f52833h) == Float.POSITIVE_INFINITY ? C6537m.g(j10) : C6531g.n(this.f52833h)), this.f52830e, this.f52831f, this.f52834i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return AbstractC6492s.d(this.f52830e, n02.f52830e) && AbstractC6492s.d(this.f52831f, n02.f52831f) && C6531g.j(this.f52832g, n02.f52832g) && C6531g.j(this.f52833h, n02.f52833h) && m1.f(this.f52834i, n02.f52834i);
    }

    public int hashCode() {
        int iHashCode = this.f52830e.hashCode() * 31;
        List list = this.f52831f;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C6531g.o(this.f52832g)) * 31) + C6531g.o(this.f52833h)) * 31) + m1.g(this.f52834i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (AbstractC6532h.b(this.f52832g)) {
            str = "start=" + ((Object) C6531g.t(this.f52832g)) + ", ";
        } else {
            str = "";
        }
        if (AbstractC6532h.b(this.f52833h)) {
            str2 = "end=" + ((Object) C6531g.t(this.f52833h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f52830e + ", stops=" + this.f52831f + ", " + str + str2 + "tileMode=" + ((Object) m1.h(this.f52834i)) + ')';
    }

    private N0(List list, List list2, long j10, long j11, int i10) {
        this.f52830e = list;
        this.f52831f = list2;
        this.f52832g = j10;
        this.f52833h = j11;
        this.f52834i = i10;
    }
}
