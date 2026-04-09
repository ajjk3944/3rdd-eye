package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.utils.hxp;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    private OnBackInvokedCallback emc;
    protected String ru;
    protected boolean zz = false;

    public static class emc implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> emc;

        public emc(TTBaseActivity tTBaseActivity) {
            this.emc = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.emc.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.ypw();
            }
        }
    }

    public boolean emc() {
        return false;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (emc() && hxp.emc()) {
            this.emc = new emc(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.emc);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!hxp.emc() || this.emc == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.emc);
        this.emc = null;
    }

    @Override // android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (IllegalArgumentException unused) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || i < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e6) {
            ul.emc("TTBaseActivity", "super.onResume() run fail", e6);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e7) {
                ul.emc("TTBaseActivity", "onResume set mCalled fail", e7);
            }
        }
    }

    public void xq(boolean z6) {
        this.zz = z6;
    }

    public void ypw() {
        onBackPressed();
    }
}
