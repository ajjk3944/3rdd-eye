package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.ra.pno;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends lh implements pno.ouw {

    /* renamed from: cf, reason: collision with root package name */
    private int f7022cf;

    /* renamed from: jg, reason: collision with root package name */
    private int f7023jg;
    private Handler mwh;
    private int ryl;

    public tlj(Context context) {
        super(context);
        this.ryl = 0;
        this.mwh = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
        this.f7023jg = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        Map<String, String> map = this.fkw;
        if (map != null) {
            int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(map.get("loop"), 0);
            this.f7022cf = iOuw;
            if (iOuw <= 0) {
                this.f7023jg = -1;
            } else {
                this.f7023jg = iOuw;
            }
            this.ryl = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("duration"), 0);
        }
        this.mwh.sendEmptyMessageDelayed(1001, this.ryl);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        int i4;
        int i10;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.f7023jg);
        this.ouw.ouw(this.f7018le, this.f7019lh.vt);
        int i11 = this.f7023jg + (-1);
        this.f7023jg = i11;
        if (i11 < 0 && (i10 = this.ryl) != 0) {
            this.mwh.sendEmptyMessageDelayed(1001, i10);
        } else if (i11 > 0 && (i4 = this.ryl) != 0) {
            this.mwh.sendEmptyMessageDelayed(1001, i4);
        } else {
            this.mwh.removeMessages(1001);
        }
    }
}
