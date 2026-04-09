package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ra.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends lh implements pno.ouw {

    /* renamed from: cf, reason: collision with root package name */
    private int f7015cf;
    private Handler mwh;
    private boolean ryl;

    public cf(Context context) {
        super(context);
        this.f7015cf = 500;
        this.mwh = new com.bytedance.adsdk.ugeno.ra.pno(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.yu.cf cfVar;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.f7015cf = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("delay"), 500);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mwh.sendEmptyMessageDelayed(1102, this.f7015cf);
        } else {
            if (action == 1) {
                if (!this.ryl || (cfVar = this.ouw) == null) {
                    Handler handler = this.mwh;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    this.ryl = false;
                    return false;
                }
                cfVar.ouw(this.f7018le, this.f7019lh.vt);
                this.ryl = false;
                Handler handler2 = this.mwh;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                return true;
            }
            if (action == 3) {
                Handler handler3 = this.mwh;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.ryl = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.ryl = true;
        Handler handler = this.mwh;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
