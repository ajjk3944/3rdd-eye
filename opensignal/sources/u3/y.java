package u3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public h1 f23232a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f23234c;

    public y(View view, n nVar) {
        this.f23233b = view;
        this.f23234c = nVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h1 h1VarG = h1.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f23234c;
        if (i10 < 30) {
            z.a(windowInsets, this.f23233b);
            if (h1VarG.equals(this.f23232a)) {
                return nVar.c0(view, h1VarG).f();
            }
        }
        this.f23232a = h1VarG;
        h1 h1VarC0 = nVar.c0(view, h1VarG);
        if (i10 >= 30) {
            return h1VarC0.f();
        }
        WeakHashMap weakHashMap = i0.f23177a;
        x.c(view);
        return h1VarC0.f();
    }
}
