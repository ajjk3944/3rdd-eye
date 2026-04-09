package jd;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends j6.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4) {
        super(1);
        this.f27496b = i4;
    }

    @Override // j6.i
    public final void s(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f27496b) {
            case 0:
                RectF rectFI = j6.i.i(tabLayout, view);
                RectF rectFI2 = j6.i.i(tabLayout, view2);
                if (rectFI.left < rectFI2.left) {
                    double d10 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d10));
                    fCos = (float) Math.sin(d10);
                } else {
                    double d11 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d11);
                    fCos = (float) (1.0d - Math.cos(d11));
                }
                drawable.setBounds(jc.a.c(fSin, (int) rectFI.left, (int) rectFI2.left), drawable.getBounds().top, jc.a.c(fCos, (int) rectFI.right, (int) rectFI2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF rectFI3 = j6.i.i(tabLayout, view);
                float fB = f10 < 0.5f ? jc.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : jc.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) rectFI3.left, drawable.getBounds().top, (int) rectFI3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
