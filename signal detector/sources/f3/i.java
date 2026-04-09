package f3;

import R.O;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final View f20106a;

    /* renamed from: b, reason: collision with root package name */
    public int f20107b;

    /* renamed from: c, reason: collision with root package name */
    public int f20108c;

    /* renamed from: d, reason: collision with root package name */
    public int f20109d;

    public i(View view) {
        this.f20106a = view;
    }

    public final void a() {
        int i = this.f20109d;
        View view = this.f20106a;
        int top = i - (view.getTop() - this.f20107b);
        WeakHashMap weakHashMap = O.f3270a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f20108c));
    }

    public final boolean b(int i) {
        if (this.f20109d == i) {
            return false;
        }
        this.f20109d = i;
        a();
        return true;
    }
}
