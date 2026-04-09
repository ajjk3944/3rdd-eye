package R;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public r0 f3263a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0188o f3265c;

    public E(View view, InterfaceC0188o interfaceC0188o) {
        this.f3264b = view;
        this.f3265c = interfaceC0188o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r0 r0VarG = r0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0188o interfaceC0188o = this.f3265c;
        if (i < 30) {
            F.a(windowInsets, this.f3264b);
            if (r0VarG.equals(this.f3263a)) {
                return interfaceC0188o.p(view, r0VarG).f();
            }
        }
        this.f3263a = r0VarG;
        r0 r0VarP = interfaceC0188o.p(view, r0VarG);
        if (i >= 30) {
            return r0VarP.f();
        }
        WeakHashMap weakHashMap = O.f3270a;
        D.c(view);
        return r0VarP.f();
    }
}
