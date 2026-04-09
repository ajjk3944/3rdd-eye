package oj;

import android.view.View;
import nj.d;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends d implements ql.d {
    @Override // ql.d
    public final String a(int i4, View view) {
        k.e(view, "view");
        if (i4 < 0 || i4 >= this.f29954i.size()) {
            return "";
        }
        String[] strArrF = wi.c.f(((aj.b) this.f29954i.get(i4)).f406a);
        int i10 = (int) Float.parseFloat(strArrF[0]);
        if (11 <= i10 && i10 < 100) {
            i10 = (i10 / 10) * 10;
        } else if (101 <= i10 && i10 < 1000) {
            i10 = (i10 / 100) * 100;
        } else if (1001 <= i10 && i10 < 10000) {
            i10 = (i10 / 1000) * 1000;
        }
        return i10 + " " + strArrF[1].charAt(0);
    }
}
