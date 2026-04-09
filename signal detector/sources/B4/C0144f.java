package B4;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.apm.insight.R;
import com.lefan.base.view.ZoomImageView;
import h0.C2352b;
import k0.DialogInterfaceOnCancelListenerC2610n;

/* renamed from: B4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144f extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public Bitmap f713A0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_full_view, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ZoomImageView zoomImageView = (ZoomImageView) viewInflate;
        new C2352b(zoomImageView, zoomImageView);
        zoomImageView.setImageBitmap(this.f713A0);
        return zoomImageView;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        Bitmap bitmap = this.f713A0;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.FullScreenDialogTheme;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final Dialog b0(Bundle bundle) {
        Dialog dialogB0 = super.b0(bundle);
        if (dialogB0.getWindow() != null) {
            Window window = dialogB0.getWindow();
            q5.i.b(window);
            window.setLayout(-1, -1);
        }
        return dialogB0;
    }
}
