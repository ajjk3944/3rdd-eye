package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public interface d0 {
    boolean a();

    void b(Menu menu, j.a aVar);

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    void h();

    a0.w i(int i2, long j2);

    int j();

    void k(int i2);

    void l();

    boolean m();

    void n(int i2);

    void o(p0 p0Var);

    ViewGroup p();

    void q(boolean z2);

    void r();

    void s(boolean z2);

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    Context t();

    void u(int i2);

    int v();
}
