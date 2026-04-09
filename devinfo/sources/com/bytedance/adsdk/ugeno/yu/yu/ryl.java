package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ra.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends lh implements pno.ouw {

    /* renamed from: cf, reason: collision with root package name */
    private int f7021cf;
    private Handler ryl;

    public ryl(Context context) {
        super(context);
        this.f7021cf = 500;
        this.ryl = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            MotionEvent motionEvent = (MotionEvent) objArr[0];
            this.f7021cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("delay"), 500);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.ryl.sendEmptyMessageDelayed(1101, this.f7021cf);
            } else if (action == 1 || action == 3) {
                this.ryl.removeMessages(1101);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.yu.cf cfVar = this.ouw;
        if (cfVar != null) {
            cfVar.ouw(this.f7018le, this.f7019lh.vt);
        }
        Handler handler = this.ryl;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
