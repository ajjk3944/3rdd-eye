package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vt;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.od;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends PAGAppOpenAd {
    private boolean bly;
    private final AtomicBoolean fkw = new AtomicBoolean(false);

    /* renamed from: le, reason: collision with root package name */
    private final String f8046le = ex.ouw();

    /* renamed from: lh, reason: collision with root package name */
    private final AdSlot f8047lh;
    private final Context ouw;
    private boolean pno;
    private final boolean ra;
    private final vpp vt;
    private com.bytedance.sdk.openadsdk.ouw.yu.vt yu;

    public yu(Context context, vpp vppVar, boolean z3, AdSlot adSlot) {
        this.ouw = context;
        this.vt = vppVar;
        this.ra = z3;
        this.f8047lh = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Object getExtraInfo(String str) {
        Map<String, Object> map;
        vpp vppVar = this.vt;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return null;
        }
        try {
            return map.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTAppOpenAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Map<String, Object> getMediaExtraInfo() {
        vpp vppVar = this.vt;
        if (vppVar != null) {
            return vppVar.npr;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.vt, d10, str, str2);
        this.bly = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public final void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.yu = new fkw(pAGAppOpenAdInteractionCallback);
        ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public final void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.yu = new fkw(pAGAppOpenAdInteractionListener);
        ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public final void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.fkw.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ko.fkw("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.vt(this.ouw, this.vt);
        Context contextOuw = activity != null ? activity : this.ouw;
        if (contextOuw == null) {
            contextOuw = zih.ouw();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.vt.pno() ? new Intent(contextOuw, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextOuw, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.ra ? 1 : 2);
        boolean zPno = com.bytedance.sdk.openadsdk.vpp.ouw.pno();
        intent.putExtra("enable_new_arch", zPno);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.vt.ouw(true).toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f8046le);
        } else {
            com.bytedance.sdk.openadsdk.core.od.ouw().vt();
            intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.vt));
            if (zPno) {
                intent.putExtra("single_process_listener_key", this.f8046le);
                com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f8046le, (String) this.yu);
            } else {
                com.bytedance.sdk.openadsdk.core.od.ouw().yu = this.yu;
            }
            this.yu = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.vt.ouw(contextOuw, intent, new vt.InterfaceC0061vt() { // from class: com.bytedance.sdk.openadsdk.component.yu.2
            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0061vt
            public final void ouw() {
                ko.vt("TTAppOpenAdImpl", "app open ad startActivitySuccess");
            }

            @Override // com.bytedance.sdk.component.utils.vt.InterfaceC0061vt
            public final void ouw(Throwable th2) {
                ko.vt("TTAppOpenAdImpl", "app open ad startActivityFail");
            }
        });
        jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.f8047lh != null) {
                    try {
                        if (yu.this.vt == null || vpp.ra(yu.this.vt) || yu.this.vt.zn) {
                            return;
                        }
                        le leVarOuw = le.ouw(yu.this.ouw);
                        le.yu(Integer.parseInt(yu.this.f8047lh.getCodeId()));
                        leVarOuw.ouw(yu.this.f8047lh);
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void win(Double d10) {
        if (this.pno) {
            return;
        }
        od.ouw(this.vt, d10);
        this.pno = true;
    }

    private void ouw() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new pno("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.yu.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (yu.this.yu != null) {
                        ko.vt("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(7));
                        if (iListenerManagerAsInterface != null) {
                            try {
                                iListenerManagerAsInterface.registerAppOpenAdListener(yu.this.f8046le, new com.bytedance.sdk.openadsdk.multipro.aidl.vt.ouw(yu.this.yu));
                                yu.this.yu = null;
                                ko.vt("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e2) {
                                qbp.lh("TTAppOpenAdImpl", e2.getMessage());
                            }
                        }
                    }
                }
            });
        }
    }
}
