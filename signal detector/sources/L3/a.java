package L3;

import G3.C0152f;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import e3.AbstractC2303a;

/* loaded from: classes.dex */
public final class a extends C0152f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        super(22);
        this.f2571b = i;
    }

    @Override // G3.C0152f
    public final void t(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float fSin;
        float fCos;
        switch (this.f2571b) {
            case 0:
                RectF rectFB = C0152f.b(tabLayout, view);
                RectF rectFB2 = C0152f.b(tabLayout, view2);
                if (rectFB.left < rectFB2.left) {
                    double d6 = (f2 * 3.141592653589793d) / 2.0d;
                    fSin = (float) (1.0d - Math.cos(d6));
                    fCos = (float) Math.sin(d6);
                } else {
                    double d7 = (f2 * 3.141592653589793d) / 2.0d;
                    fSin = (float) Math.sin(d7);
                    fCos = (float) (1.0d - Math.cos(d7));
                }
                drawable.setBounds(AbstractC2303a.c(fSin, (int) rectFB.left, (int) rectFB2.left), drawable.getBounds().top, AbstractC2303a.c(fCos, (int) rectFB.right, (int) rectFB2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f2 >= 0.5f) {
                    view = view2;
                }
                RectF rectFB3 = C0152f.b(tabLayout, view);
                float fB = f2 < 0.5f ? AbstractC2303a.b(1.0f, 0.0f, 0.0f, 0.5f, f2) : AbstractC2303a.b(0.0f, 1.0f, 0.5f, 1.0f, f2);
                drawable.setBounds((int) rectFB3.left, drawable.getBounds().top, (int) rectFB3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
