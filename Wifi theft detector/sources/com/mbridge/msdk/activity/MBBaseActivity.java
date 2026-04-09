package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f12658a;

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f12659b;

    /* renamed from: c, reason: collision with root package name */
    private int f12660c = -1;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f12661d = false;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f12662e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.backdispatcher.a f12663f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f12658a != null ? MBBaseActivity.this.f12658a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f12660c != 1) {
                MBBaseActivity.this.f12660c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f12660c != 2) {
                MBBaseActivity.this.f12660c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f12660c != 3) {
                MBBaseActivity.this.f12660c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f12660c == 4) {
                    return;
                }
                MBBaseActivity.this.f12660c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    public class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        public c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f12659b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f12659b.enable();
        } else {
            this.f12659b.disable();
            this.f12659b = null;
        }
    }

    public void getNotchParams() {
        if (this.f12661d) {
            return;
        }
        this.f12662e = new a();
        getWindow().getDecorView().postDelayed(this.f12662e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12661d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f12661d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f12659b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f12659b = null;
            }
            if (this.f12662e != null) {
                getWindow().getDecorView().removeCallbacks(this.f12662e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f14986f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f12663f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f12663f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout;
        int i15 = Build.VERSION.SDK_INT;
        if (this.f12661d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i16 = -1;
        if (rootWindowInsets == null || i15 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i10 = -1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f12658a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f12660c == -1) {
                this.f12660c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                q0.b("MBBaseActivity", this.f12660c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i16 = 90;
                } else if (rotation == 2) {
                    i16 = 180;
                } else if (rotation == 3) {
                    i16 = 270;
                }
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = i16;
            } else {
                mBBaseActivity = this;
                i14 = safeInsetBottom;
                i11 = safeInsetLeft;
                i10 = 0;
            }
            i12 = safeInsetRight;
            i13 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i10, i11, i12, i13, i14);
        if (mBBaseActivity.f12659b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    private int a() {
        if (this.f12658a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f12658a = getDisplay();
            } else {
                this.f12658a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f12658a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
