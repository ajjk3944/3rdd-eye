package com.bytedance.sdk.openadsdk.core.cf.yu;

import android.app.Activity;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.sdk.openadsdk.core.cf.ouw.vt;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import com.bytedance.sdk.openadsdk.core.cf.yu.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements rn, ouw.InterfaceC0084ouw {

    /* renamed from: lh, reason: collision with root package name */
    protected static int f8174lh = 8;
    private String bly;

    /* renamed from: cf, reason: collision with root package name */
    private JSONObject f8175cf;
    private final Activity fkw;

    /* renamed from: jg, reason: collision with root package name */
    private float f8176jg;
    private float ko;

    /* renamed from: le, reason: collision with root package name */
    private final vpp f8177le;
    private String mwh;
    public com.bytedance.sdk.openadsdk.core.cf.ra.ouw ouw;
    private String pno;
    private boolean qbp = true;
    private final com.bytedance.sdk.openadsdk.core.cf.pno.ouw ra;
    private float rn;
    private final com.bytedance.sdk.openadsdk.core.cf.ra.vt ryl;

    /* renamed from: th, reason: collision with root package name */
    private long f8178th;
    private String tlj;
    private long vm;
    public View vt;
    private ouw yu;
    private float zih;

    public vt(Activity activity, vpp vppVar, com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar, String str, com.bytedance.sdk.openadsdk.core.cf.ra.vt vtVar) {
        this.fkw = activity;
        this.mwh = str;
        this.f8177le = vppVar;
        this.ryl = vtVar;
        this.ra = ouwVar;
    }

    public final void ouw() {
        if (this.f8177le == null) {
            this.ryl.ouw(1, "material is null", "net");
            return;
        }
        if (this.ra == null) {
            this.ryl.ouw(1, "material ugen template is null", "net");
            return;
        }
        this.yu = new ouw(this.fkw);
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = this.ra;
        this.tlj = ouwVar.f8158lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
        this.f8175cf = this.f8177le.ouw(true);
        this.ryl.ouw("endcard");
        com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw("endcard", this.tlj, this.pno, this.bly, "", new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.1
            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(JSONObject jSONObject, String str) throws JSONException {
                vt vtVar = vt.this;
                vt.ouw(vtVar, jSONObject, vtVar.f8175cf);
                vt.this.ryl.vt(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw
            public final void ouw(int i4, String str, String str2) {
                vt.this.ryl.ouw(i4, str, str2);
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vm = System.currentTimeMillis();
            this.f8176jg = motionEvent.getRawX();
            this.ko = motionEvent.getRawY();
            this.qbp = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.f8176jg) >= f8174lh || Math.abs(motionEvent.getRawY() - this.ko) >= f8174lh) {
                this.qbp = false;
                return;
            }
            return;
        }
        this.rn = motionEvent.getRawX();
        this.zih = motionEvent.getRawY();
        if (Math.abs(this.rn - this.f8176jg) >= f8174lh || Math.abs(this.zih - this.ko) >= f8174lh) {
            this.qbp = false;
        }
        this.f8178th = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.yu.ouw.InterfaceC0084ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.adsdk.ugeno.core.mwh r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.yu.vt.ouw(com.bytedance.adsdk.ugeno.core.mwh):void");
    }

    public static /* synthetic */ void ouw(vt vtVar, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        ouw ouwVar = vtVar.yu;
        ouwVar.ouw = vtVar;
        ouwVar.vt = vtVar;
        vtVar.ryl.ouw();
        ouw ouwVar2 = vtVar.yu;
        yu yuVar = new yu() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.vt.2
            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(int i4, String str) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(i4, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
            public final void ouw(lh<View> lhVar) {
                if (vt.this.ryl != null) {
                    vt.this.ryl.ouw(lhVar);
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ouwVar2.ouw(jSONObject, jSONObject2, yuVar);
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.ouw.1

                /* renamed from: lh */
                final /* synthetic */ yu f8173lh;
                final /* synthetic */ JSONObject ouw;
                final /* synthetic */ JSONObject vt;

                public AnonymousClass1(JSONObject jSONObject3, JSONObject jSONObject22, yu yuVar2) {
                    jSONObject = jSONObject3;
                    jSONObject = jSONObject22;
                    yuVar = yuVar2;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ouw.this.ouw(jSONObject, jSONObject, yuVar);
                }
            });
        }
    }
}
