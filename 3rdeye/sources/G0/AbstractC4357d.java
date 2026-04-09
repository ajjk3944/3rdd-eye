package g0;

import C.S;
import C.k0;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import t4.C5606d;

/* compiled from: PreviewViewImplementation.java */
/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4357d {

    /* renamed from: a, reason: collision with root package name */
    public Size f37904a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f37905b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.view.b f37906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37907d = false;

    public AbstractC4357d(FrameLayout frameLayout, androidx.camera.view.b bVar) {
        this.f37905b = frameLayout;
        this.f37906c = bVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(k0 k0Var, D3.b bVar);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.f37907d) {
            return;
        }
        FrameLayout frameLayout = this.f37905b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        androidx.camera.view.b bVar = this.f37906c;
        bVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            S.g("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (bVar.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(bVar.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z10 = false;
                boolean z11 = (!bVar.f15183g || display == null || display.getRotation() == bVar.f15181e) ? false : true;
                boolean z12 = bVar.f15183g;
                if (!z12) {
                    if ((!z12 ? bVar.f15179c : -C5606d.E(bVar.f15181e)) != 0) {
                        z10 = true;
                    }
                }
                if (z11 || z10) {
                    S.b("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = bVar.e(size, layoutDirection);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / bVar.f15177a.getWidth());
            viewA.setScaleY(rectFE.height() / bVar.f15177a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public abstract A4.a<Void> g();
}
