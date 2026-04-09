package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kh1 {
    public final Uri a;
    public final List b;
    public final xm3 c;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public kh1(Uri uri, xm3 xm3Var) {
        List list = Collections.EMPTY_LIST;
        this.a = uri;
        ArrayList arrayList = pp1.a;
        this.b = list;
        this.c = xm3Var;
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArr = new Object[4];
        if (xm3Var.size() <= 0) {
            xm3.o(objArr, 0);
        } else {
            xm3Var.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh1)) {
            return false;
        }
        kh1 kh1Var = (kh1) obj;
        return this.a.equals(kh1Var.a) && this.b.equals(kh1Var.b) && this.c.equals(kh1Var.c);
    }

    public final int hashCode() {
        return (int) ((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
