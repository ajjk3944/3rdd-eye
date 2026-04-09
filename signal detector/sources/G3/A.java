package G3;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: c, reason: collision with root package name */
    public o f1521c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1519a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1520b = false;

    /* renamed from: d, reason: collision with root package name */
    public RectF f1522d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f1523e = new Path();

    public abstract void a(NavigationView navigationView);

    public abstract boolean b();

    public final void c() {
        o oVar;
        RectF rectF = this.f1522d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (oVar = this.f1521c) == null) {
            return;
        }
        p.f1635a.a(oVar, null, 1.0f, rectF, null, this.f1523e);
    }
}
