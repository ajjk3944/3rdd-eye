package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wt1 extends hu1 {
    public final Map h;
    public final View i;
    public final Context j;

    public wt1(jt1 jt1Var, fr1 fr1Var, int i, HashMap map, View view, Context context) {
        super(jt1Var, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", fr1Var, i, 85);
        this.h = map;
        this.i = view;
        this.j = context;
    }

    @Override // defpackage.hu1
    public final void a() {
        Map map = this.h;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.h;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.j;
        if (context == null) {
            context = this.a.a;
        }
        long[] jArr2 = (long[]) this.e.invoke(null, jArr, context, this.i);
        long j = jArr2[0];
        Map map3 = this.h;
        map3.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map3.put(2, Long.valueOf(jArr2[3]));
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            fr1Var.b();
            ((qr1) fr1Var.g).j0(j);
            fr1Var.b();
            ((qr1) fr1Var.g).k0(j2);
        }
    }
}
