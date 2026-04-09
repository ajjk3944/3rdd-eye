package e4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public c2 f22368a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f22370c;

    public l0(View view, s sVar) {
        this.f22369b = view;
        this.f22370c = sVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        c2 c2VarH = c2.h(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        s sVar = this.f22370c;
        if (i4 < 30) {
            m0.a(windowInsets, this.f22369b);
            if (c2VarH.equals(this.f22368a)) {
                return sVar.j(view, c2VarH).g();
            }
        }
        this.f22368a = c2VarH;
        c2 c2VarJ = sVar.j(view, c2VarH);
        if (i4 >= 30) {
            return c2VarJ.g();
        }
        WeakHashMap weakHashMap = v0.f22405a;
        k0.c(view);
        return c2VarJ.g();
    }
}
