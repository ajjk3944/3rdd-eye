package F1;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private int f5653a;

    /* renamed from: b, reason: collision with root package name */
    private int f5654b;

    public E(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f5653a | this.f5654b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f5654b = i10;
        } else {
            this.f5653a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f5654b = 0;
        } else {
            this.f5653a = 0;
        }
    }
}
