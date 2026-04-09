package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;

/* loaded from: classes.dex */
public interface e0 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, h.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    androidx.core.view.g1 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z10);

    void o(int i10);

    void p();

    void q(boolean z10);

    void r();

    void s(t0 t0Var);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i10);

    void u(h.a aVar, d.a aVar2);

    int v();

    void w();

    void x(Drawable drawable);
}
