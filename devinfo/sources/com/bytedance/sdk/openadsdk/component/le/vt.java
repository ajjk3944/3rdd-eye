package com.bytedance.sdk.openadsdk.component.le;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements Handler.Callback {

    /* renamed from: cf, reason: collision with root package name */
    private long f7889cf;
    private final com.bytedance.sdk.openadsdk.component.pno.ouw fkw;
    private boolean ra;
    private boolean ryl;
    private long tlj;
    public ouw vt;
    public Handler ouw = new Handler(Looper.myLooper(), this);

    /* renamed from: le, reason: collision with root package name */
    private int f7890le = 0;

    /* renamed from: lh, reason: collision with root package name */
    public int f7891lh = 5;
    public int yu = 0;
    private final int pno = 1000;
    private int bly = 1000;

    public vt(com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar) {
        this.fkw = ouwVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4;
        if (message.what == 100 && this.ouw != null) {
            int i10 = message.arg1;
            this.f7890le = i10;
            int i11 = this.f7891lh - i10;
            this.fkw.vt = i11;
            if (i10 <= 0) {
                ouw ouwVar = this.vt;
                if (ouwVar != null && !this.ra) {
                    ouwVar.yu();
                    this.ra = true;
                }
                i4 = 0;
            } else {
                i4 = i10;
            }
            ouw ouwVar2 = this.vt;
            if (ouwVar2 != null) {
                int i12 = this.yu;
                ouwVar2.ouw(i12 - i11, i4 == 0 || i11 >= i12);
            }
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.ouw.sendMessageDelayed(messageObtain, this.bly);
            }
        }
        return true;
    }

    public final void ouw() {
        if (this.ouw != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.f7890le;
            this.ouw.sendMessage(messageObtain);
        }
    }

    public final void vt() {
        Handler handler = this.ouw;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public final void ouw(int i4, float f10, boolean z3) {
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar;
        if ((i4 == 1 || i4 == 2) && this.ryl != z3) {
            this.ryl = z3;
            if (i4 == 1 && (ouwVar = this.fkw) != null) {
                ouwVar.f7901lh = z3;
            }
            if (z3) {
                try {
                    this.bly = (int) (1000.0f / f10);
                    this.f7889cf = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.f7889cf) + this.tlj;
                this.tlj = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2 = this.fkw;
                if (ouwVar2 != null) {
                    ouwVar2.yu = jCurrentTimeMillis;
                }
            }
            this.bly = 1000;
        }
    }
}
