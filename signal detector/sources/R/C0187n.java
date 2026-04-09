package R;

import android.view.View;
import com.google.android.gms.internal.ads.W7;

/* renamed from: R.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187n {

    /* renamed from: a, reason: collision with root package name */
    public int f3349a;

    /* renamed from: b, reason: collision with root package name */
    public int f3350b;

    public C0187n(int i, int i3) {
        this.f3349a = i;
        this.f3350b = i3;
    }

    public void a(androidx.recyclerview.widget.g0 g0Var) {
        View view = g0Var.itemView;
        this.f3349a = view.getLeft();
        this.f3350b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public C0187n(W7 w7, int i, int i3) {
        this.f3349a = i;
        this.f3350b = i3;
    }
}
