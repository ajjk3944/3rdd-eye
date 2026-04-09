package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.mxo;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.dg.ru;
import com.bytedance.sdk.openadsdk.utils.cf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class TTAdActivity extends TTBaseActivity {
    private ypw emc;
    private boolean ypw;
    private int xq = -1;
    private final AtomicBoolean dg = new AtomicBoolean(false);

    private void bw() {
        ypw ypwVar = this.emc;
        if (ypwVar == null) {
            super.onBackPressed();
        } else {
            ypwVar.zz();
        }
    }

    private void dg() {
        if (!this.ypw) {
            sf.emc().emc((com.bytedance.sdk.openadsdk.emc.bw.emc) null);
            sf.emc().emc((com.bytedance.sdk.openadsdk.emc.xq.ypw) null);
        } else if (!TextUtils.isEmpty(this.ru)) {
            sf.emc().emc(this.ru, isFinishing(), isChangingConfigurations());
        }
        cf.emc();
        mxo.emc().emc(String.valueOf(hashCode()));
    }

    private void xq() {
        if (this.dg.compareAndSet(false, true)) {
            ypw ypwVar = this.emc;
            if (ypwVar != null) {
                ypwVar.bw(this);
            }
            dg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean emc() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.emc((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        bw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ul.emc("BVA", "onCreate: isEnableNewArch = " + this.ypw + ",listenerKey=" + this.ru);
        rie rieVarEmc = com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.sz.dg.ypw) null);
        if (bundle != null) {
            this.ru = bundle.getString("single_process_listener_key");
            this.ypw = bundle.getBoolean("enable_new_arch", false);
            ru.emc(rieVarEmc, "activity_recreate", rieVarEmc != null ? rieVarEmc.bw() : null, "activity_recreate", null);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.ru = intent.getStringExtra("single_process_listener_key");
                this.ypw = intent.getBooleanExtra("enable_new_arch", false);
                long longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
                if (rieVarEmc != null) {
                    rieVarEmc.emc(longExtra);
                }
            }
        }
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVarEmc = emc(this.ru);
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVarYpw = ypw(this.ru);
        if (rieVarEmc != null) {
            try {
                this.emc = new ypw(this, rieVarEmc, this.ypw);
                if (bundle != null && rieVarEmc.wo()) {
                    this.emc.aa();
                }
                this.emc.emc(this, bundle, emcVarEmc, ypwVarYpw);
                com.bytedance.sdk.openadsdk.utils.ypw.emc(rieVarEmc);
                return;
            } catch (Throwable th) {
                ul.emc("BVA", "onCreate: ", th);
                ru.emc(rieVarEmc, "show_ad_fail", rieVarEmc.bw(), "init_view_crash");
            }
        }
        finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.xq(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.ypw(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.ru)) {
            bundle.putString("single_process_listener_key", this.ru);
        }
        bundle.putBoolean("enable_new_arch", this.ypw);
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            rie rieVarEmc = ypwVar.emc();
            if (this.emc.vk() && rieVarEmc != null) {
                rieVarEmc.ra();
            }
            int iEmc = sf.emc().emc(rieVarEmc);
            this.xq = iEmc;
            this.emc.emc(this, bundle, iEmc);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.xq >= 0) {
            sf.emc().xq(this.xq);
            this.xq = -1;
        }
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.emc(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.dg(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.emc(z10);
        }
    }

    public com.bytedance.sdk.openadsdk.emc.xq.ypw ypw(String str) {
        if (!this.ypw) {
            return sf.emc().xq();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.emc.xq.ypw) sf.emc().emc(str, com.bytedance.sdk.openadsdk.emc.xq.ypw.class);
    }

    public com.bytedance.sdk.openadsdk.emc.bw.emc emc(String str) {
        if (!this.ypw) {
            return sf.emc().ypw();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (com.bytedance.sdk.openadsdk.emc.bw.emc) sf.emc().emc(str, com.bytedance.sdk.openadsdk.emc.bw.emc.class);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void ypw() {
        bw();
    }
}
