package l4;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f23167a;

    /* renamed from: b, reason: collision with root package name */
    public int f23168b;

    /* renamed from: c, reason: collision with root package name */
    public int f23169c;

    /* renamed from: d, reason: collision with root package name */
    public int f23170d;

    /* renamed from: e, reason: collision with root package name */
    public int f23171e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23172f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23173g = true;

    public g(View view) {
        this.f23167a = view;
    }

    public void a() {
        View view = this.f23167a;
        ViewCompat.U(view, this.f23170d - (view.getTop() - this.f23168b));
        View view2 = this.f23167a;
        ViewCompat.T(view2, this.f23171e - (view2.getLeft() - this.f23169c));
    }

    public int b() {
        return this.f23170d;
    }

    public void c() {
        this.f23168b = this.f23167a.getTop();
        this.f23169c = this.f23167a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f23173g || this.f23171e == i10) {
            return false;
        }
        this.f23171e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f23172f || this.f23170d == i10) {
            return false;
        }
        this.f23170d = i10;
        a();
        return true;
    }
}
