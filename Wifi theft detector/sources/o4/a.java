package o4;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: c, reason: collision with root package name */
    public final View f23643c;

    /* renamed from: d, reason: collision with root package name */
    public int f23644d;

    /* renamed from: e, reason: collision with root package name */
    public int f23645e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f23646f;

    public a(View view) {
        super(0);
        this.f23646f = new int[2];
        this.f23643c = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f23643c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f23643c.getLocationOnScreen(this.f23646f);
        this.f23644d = this.f23646f[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimationCompat) it.next()).c() & WindowInsetsCompat.Type.b()) != 0) {
                this.f23643c.setTranslationY(k4.a.c(this.f23645e, 0, r0.b()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.a e(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.a aVar) {
        this.f23643c.getLocationOnScreen(this.f23646f);
        int i10 = this.f23644d - this.f23646f[1];
        this.f23645e = i10;
        this.f23643c.setTranslationY(i10);
        return aVar;
    }
}
