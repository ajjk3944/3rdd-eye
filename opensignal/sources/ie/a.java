package ie;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class a extends io.sentry.hints.i {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11338r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(9);
        this.f11338r = i10;
    }

    @Override // io.sentry.hints.i
    public final void T(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f11338r) {
            case 0:
                RectF rectFK = io.sentry.hints.i.K(tabLayout, view);
                RectF rectFK2 = io.sentry.hints.i.K(tabLayout, view2);
                if (rectFK.left < rectFK2.left) {
                    double d6 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d6));
                    fCos = (float) Math.sin(d6);
                } else {
                    double d10 = (f10 * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d10);
                    fCos = (float) (1.0d - Math.cos(d10));
                }
                drawable.setBounds(fd.a.c((int) rectFK.left, fSin, (int) rectFK2.left), drawable.getBounds().top, fd.a.c((int) rectFK.right, fCos, (int) rectFK2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF rectFK3 = io.sentry.hints.i.K(tabLayout, view);
                float fB = f10 < 0.5f ? fd.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : fd.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) rectFK3.left, drawable.getBounds().top, (int) rectFK3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
