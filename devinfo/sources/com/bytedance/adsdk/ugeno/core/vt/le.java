package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.ra.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements pno.ouw {
    public com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* renamed from: le, reason: collision with root package name */
    public Handler f6869le = new pno(Looper.getMainLooper(), this);

    /* renamed from: lh, reason: collision with root package name */
    public ko f6870lh;
    public boolean ouw;
    private Context ra;
    public int vt;
    public mwh yu;

    public le(Context context, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.ra = context;
        this.yu = mwhVar;
        this.fkw = lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1001) {
            return;
        }
        ko koVar = this.f6870lh;
        if (koVar != null) {
            koVar.ouw(this.yu, this.fkw);
        }
        if (this.ouw) {
            this.f6869le.sendEmptyMessageDelayed(1001, this.vt);
        } else {
            this.f6869le.removeMessages(1001);
        }
    }
}
