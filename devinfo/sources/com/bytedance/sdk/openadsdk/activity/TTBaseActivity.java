package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.utils.jqy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTBaseActivity extends Activity {

    /* renamed from: jg, reason: collision with root package name */
    protected String f7699jg;
    protected boolean mwh = false;
    private OnBackInvokedCallback ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> ouw;

        public ouw(TTBaseActivity tTBaseActivity) {
            this.ouw = new WeakReference<>(tTBaseActivity);
        }

        public final void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.ouw.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.vt();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public final void fkw() {
        this.mwh = true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ouw() && jqy.ouw()) {
            this.ouw = new ouw(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.ouw);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!jqy.ouw() || this.ouw == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.ouw);
        this.ouw = null;
    }

    @Override // android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e2) {
            ko.lh("TTBaseActivity", "super.onPause(); run fail", e2);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e10) {
                ko.lh("TTBaseActivity", "onPause() set mCalled fail", e10);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28 || i4 < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e2) {
            qbp.ouw("TTBaseActivity", "super.onResume() run fail", e2);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e10) {
                qbp.ouw("TTBaseActivity", "onResume set mCalled fail", e10);
            }
        }
    }

    public boolean ouw() {
        return false;
    }

    public void vt() {
        onBackPressed();
    }
}
