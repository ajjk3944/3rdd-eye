package g0;

import C.J;
import C.S;
import G.n;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: ScreenFlashView.java */
/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4362i extends View {

    /* renamed from: b, reason: collision with root package name */
    public Window f37915b;

    /* renamed from: c, reason: collision with root package name */
    public C4360g f37916c;

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f37915b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        S.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f37915b == null) {
            S.b("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            S.b("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f37915b.getAttributes();
        attributes.screenBrightness = f10;
        this.f37915b.setAttributes(attributes);
        S.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(J.g gVar) {
        S.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public J.g getScreenFlash() {
        return this.f37916c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC4354a abstractC4354a) {
        n.a();
    }

    public void setScreenFlashWindow(Window window) {
        n.a();
        if (this.f37915b != window) {
            this.f37916c = window == null ? null : new C4360g(this);
        }
        this.f37915b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
