package com.bytedance.adsdk.ugeno.yu.yu;

import a0.g;
import android.content.Context;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends lh {

    /* renamed from: cf, reason: collision with root package name */
    private int f7020cf;
    private int mwh;
    private int ryl;

    public pno(Context context) {
        super(context);
        this.f7020cf = -1;
        this.ryl = -1;
        this.mwh = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[0]), -1);
            int iOuw2 = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[1]), -1);
            int iOuw3 = com.bytedance.adsdk.ugeno.ra.lh.ouw(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.fkw;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                g.v(iOuw, map2, "fromIndex", iOuw2, "toIndex");
                map2.put("type", Integer.valueOf(iOuw3));
                Iterator<le.ouw> it = this.f7019lh.vt.iterator();
                while (it.hasNext()) {
                    it.next().f7009le = map2;
                }
                this.ouw.ouw(this.f7018le, this.f7019lh.vt);
            } else {
                this.f7020cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("fromIndex"), -1);
                this.ryl = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("toIndex"), -1);
                int iOuw4 = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("type"), -1);
                this.mwh = iOuw4;
                if (iOuw == this.f7020cf && iOuw2 == this.ryl && iOuw3 == iOuw4) {
                    this.ouw.ouw(this.f7018le, this.f7019lh.vt);
                }
            }
        }
        return false;
    }
}
