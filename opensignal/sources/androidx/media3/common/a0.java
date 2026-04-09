package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1561b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1562c;

    /* renamed from: d, reason: collision with root package name */
    public final oe.h0 f1563d;

    public a0(Uri uri, String str, kc.f fVar, List list, oe.h0 h0Var) {
        this.f1560a = uri;
        this.f1561b = str;
        this.f1562c = list;
        this.f1563d = h0Var;
        oe.f0 f0Var = oe.h0.f19336d;
        oe.s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < h0Var.size()) {
            ((d0) h0Var.get(i10)).getClass();
            d0 d0Var = new d0();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, oe.e0.e(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = d0Var;
            i10++;
            i11 = i12;
        }
        oe.h0.k(i11, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f1560a.equals(a0Var.f1560a) && a5.d0.a(this.f1561b, a0Var.f1561b) && a5.d0.a(null, null) && this.f1562c.equals(a0Var.f1562c) && this.f1563d.equals(a0Var.f1563d);
    }

    public final int hashCode() {
        int iHashCode = this.f1560a.hashCode() * 31;
        String str = this.f1561b;
        return (this.f1563d.hashCode() + ((this.f1562c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
    }
}
