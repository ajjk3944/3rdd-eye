package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.osn;
import com.bytedance.sdk.openadsdk.utils.ko;
import com.bytedance.sdk.openadsdk.yu.tlj;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTAdActivity extends TTBaseActivity {

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7691lh;
    protected long ouw;
    private vt vt;
    private int yu = -1;
    private final AtomicBoolean fkw = new AtomicBoolean(false);

    private void lh() {
        vt vtVar = this.vt;
        if (vtVar == null) {
            super.onBackPressed();
        } else {
            vtVar.tlj.bly();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.tlj.vt(this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qbp.ouw("BVA", "onCreate: isEnableNewArch = " + this.f7691lh + ",listenerKey=" + this.f7699jg);
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.mwh.yu.vt) null);
        boolean z3 = false;
        if (bundle != null) {
            this.f7699jg = bundle.getString("single_process_listener_key");
            this.f7691lh = bundle.getBoolean("enable_new_arch", false);
            tlj.ouw(vppVarOuw, "activity_recreate", vppVarOuw != null ? vppVarOuw.vt() : null, "activity_recreate", null);
        } else {
            this.f7699jg = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
                z3 = true;
            }
            this.f7691lh = z3;
        }
        String str = this.f7699jg;
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f7691lh ? TextUtils.isEmpty(str) ? null : (com.bytedance.sdk.openadsdk.ouw.fkw.ouw) od.ouw().ouw(str, com.bytedance.sdk.openadsdk.ouw.fkw.ouw.class) : od.ouw().vt;
        String str2 = this.f7699jg;
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.f7691lh ? TextUtils.isEmpty(str2) ? null : (com.bytedance.sdk.openadsdk.ouw.lh.vt) od.ouw().ouw(str2, com.bytedance.sdk.openadsdk.ouw.lh.vt.class) : od.ouw().f8377lh;
        this.ouw = SystemClock.elapsedRealtime();
        if (vppVarOuw == null) {
            finish();
            return;
        }
        vt vtVar2 = new vt(this, vppVarOuw, this.f7691lh);
        this.vt = vtVar2;
        vtVar2.f7773jg = bundle;
        vtVar2.mwh = 1;
        vtVar2.ra = ouwVar;
        vtVar2.pno = vtVar;
        if (!vtVar2.qbp && bundle != null) {
            if (ouwVar == null) {
                vtVar2.ra = vt.ouw;
                vt.ouw = null;
            }
            if (vtVar == null) {
                vtVar2.pno = vt.vt;
                vt.vt = null;
            }
        }
        vtVar2.tlj.ouw(bundle);
        com.bytedance.sdk.openadsdk.utils.vt.ouw(vppVarOuw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        vpp vppVar;
        super.onDestroy();
        if (this.fkw.compareAndSet(false, true) && this.vt != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ouw;
            if (jElapsedRealtime > 0 && (vppVar = this.vt.f7775lh) != null) {
                vppVar.vby = jElapsedRealtime;
            }
            vt vtVar = this.vt;
            vtVar.mwh = 6;
            vtVar.tlj.ouw(this);
            vtVar.vm.ouw(this);
            vtVar.ryl = null;
        }
        if (!this.f7691lh) {
            od.ouw().vt = null;
            od.ouw().f8377lh = null;
        } else if (!TextUtils.isEmpty(this.f7699jg)) {
            od.ouw().ouw(this.f7699jg, isFinishing(), isChangingConfigurations());
        }
        ko.ouw();
        osn.ouw().ouw(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 4;
            vtVar.tlj.lh();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = vtVar.f7774le;
            if (tljVar != null) {
                tljVar.ouw();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 3;
            vtVar.tlj.vt();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = vtVar.f7774le;
            if (tljVar != null) {
                tljVar.vt();
            }
            vtVar.vm.ouw(this, vtVar.f7775lh.jqy(), vtVar.f7775lh.ex(), vtVar.zin);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.component.utils.ko.vt("TTAdActivity", "onSaveInstanceState: isEnableNewArch = " + this.f7691lh + ",listenerKey=" + this.f7699jg);
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f7699jg)) {
            bundle.putString("single_process_listener_key", this.f7699jg);
        }
        bundle.putBoolean("enable_new_arch", this.f7691lh);
        vt vtVar = this.vt;
        if (vtVar != null) {
            int iOuw = od.ouw().ouw(vtVar.f7775lh);
            this.yu = iOuw;
            vt vtVar2 = this.vt;
            Intent intent = getIntent();
            vpp vppVar = vtVar2.f7775lh;
            if (vppVar != null) {
                try {
                    bundle.putInt("meta_index", iOuw);
                    com.bytedance.sdk.component.utils.ko.vt("BVA", "onSaveInstanceStateForOneMoreAd metaIndex =" + iOuw + ",materialMeta =" + vppVar);
                    if (intent != null) {
                        bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                        bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
                    }
                } catch (Throwable th2) {
                    qbp.ouw("TTAD.RFDM", "onSaveInstanceState: ", th2);
                }
            }
            if (vtVar2.qbp) {
                return;
            }
            com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = vtVar2.ra;
            if (ouwVar != null) {
                vt.ouw = ouwVar;
                return;
            }
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
            if (vtVar3 != null) {
                vt.vt = vtVar3;
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.yu >= 0) {
            od.ouw().vt(this.yu);
            this.yu = -1;
        }
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 2;
            vtVar.tlj.le();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 5;
            vtVar.tlj.ra();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.tlj.ouw(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        lh();
    }
}
