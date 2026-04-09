package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.ypw;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.xmt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class dg extends PAGAppOpenAd {
    private com.bytedance.sdk.openadsdk.emc.dg.ypw dg;
    private final Context emc;
    private boolean msw;
    private final boolean uym;
    private final AdSlot xq;
    private final rie ypw;
    private boolean zz;
    private final AtomicBoolean bw = new AtomicBoolean(false);
    private final String ycc = db.emc();

    public dg(Context context, @NonNull rie rieVar, boolean z10, AdSlot adSlot) {
        this.emc = context;
        this.ypw = rieVar;
        this.uym = z10;
        this.xq = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        rie rieVar = this.ypw;
        if (rieVar == null || rieVar.zek() == null) {
            return null;
        }
        try {
            return this.ypw.zek().get(str);
        } catch (Throwable th) {
            ul.xq("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        rie rieVar = this.ypw;
        if (rieVar != null) {
            return rieVar.zek();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.ypw != null && System.currentTimeMillis() / 1000 <= this.ypw.az();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        xmt.emc(this.ypw, d10, str, str2);
        this.zz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.dg = new bw(pAGAppOpenAdInteractionCallback);
        emc();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.dg = new bw(pAGAppOpenAdInteractionListener);
        emc();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int rotation;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.bw.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.ypw(this.emc, this.ypw);
        Context contextEmc = activity != null ? activity : this.emc;
        if (contextEmc == null) {
            contextEmc = aa.emc();
        }
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            rotation = 0;
        }
        Intent intent = this.ypw.lt() ? new Intent(contextEmc, (Class<?>) TTAppOpenAdTransActivity.class) : new Intent(contextEmc, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("ad_source", this.uym ? 1 : 2);
        boolean zZz = com.bytedance.sdk.openadsdk.sra.emc.zz();
        intent.putExtra("enable_new_arch", zZz);
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.ypw.uie().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.ycc);
        } else {
            sf.emc().bw();
            intent.putExtra("meta_index", sf.emc().emc(this.ypw));
            if (zZz) {
                intent.putExtra("single_process_listener_key", this.ycc);
                sf.emc().emc(this.ycc, (String) this.dg);
            } else {
                sf.emc().emc(this.dg);
            }
            this.dg = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.xq;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.ypw.vaf() != null) {
                cacheTime = this.ypw.vaf().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.ypw.emc(contextEmc, intent, new ypw.InterfaceC0122ypw() { // from class: com.bytedance.sdk.openadsdk.component.dg.2
            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0122ypw
            public void emc() {
            }

            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0122ypw
            public void emc(Throwable th) {
            }
        });
        qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.dg.3
            @Override // java.lang.Runnable
            public void run() {
                if (dg.this.xq != null) {
                    try {
                        if (dg.this.ypw == null || rie.uym(dg.this.ypw) || dg.this.ypw.wh()) {
                            return;
                        }
                        ycc.emc(dg.this.emc).emc(Integer.parseInt(dg.this.xq.getCodeId()), dg.this.ypw.lvs());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.msw) {
            return;
        }
        xmt.emc(this.ypw, d10);
        this.msw = true;
    }

    private void emc() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            iyl.xq(new msw("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.dg.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc emcVarEmc = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc();
                    if (dg.this.dg == null || (iListenerManagerAsInterface = IListenerManager.Stub.asInterface(emcVarEmc.emc(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(dg.this.ycc, new com.bytedance.sdk.openadsdk.multipro.aidl.ypw.emc(dg.this.dg));
                        dg.this.dg = null;
                    } catch (RemoteException e10) {
                        ul.xq("TTAppOpenAdImpl", e10.getMessage());
                    }
                }
            }, 5);
        }
    }
}
