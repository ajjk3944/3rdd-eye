package ji;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends CameraManager.TorchCallback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27681a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f27682b;

    public a(f1 f1Var) {
        this.f27682b = f1Var;
    }

    @Override // android.hardware.camera2.CameraManager.TorchCallback
    public final void onTorchModeChanged(String str, boolean z3) {
        f1 f1Var = this.f27682b;
        if (TextUtils.equals(str, (String) f1Var.f1135c)) {
            if (!Boolean.valueOf(z3).equals((Boolean) f1Var.f1137e)) {
                f1Var.f1137e = Boolean.valueOf(z3);
            }
            Boolean bool = Boolean.TRUE;
            if (bool.equals((Boolean) f1Var.f1136d)) {
                return;
            }
            f1Var.f1136d = bool;
        }
    }

    @Override // android.hardware.camera2.CameraManager.TorchCallback
    public final void onTorchModeUnavailable(String str) {
        f1 f1Var = this.f27682b;
        if (TextUtils.equals(str, (String) f1Var.f1135c)) {
            Boolean bool = Boolean.FALSE;
            if (bool.equals((Boolean) f1Var.f1136d)) {
                return;
            }
            f1Var.f1136d = bool;
        }
    }
}
