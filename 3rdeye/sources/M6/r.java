package M6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FixedPageSizeItemDecoration.kt */
/* loaded from: classes.dex */
public final class r extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public final u f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4298e;

    public r(j jVar, u uVar) {
        this.f4294a = uVar;
        this.f4295b = b(jVar.i);
        this.f4296c = b(jVar.f4259j);
        this.f4297d = b(jVar.f4260k);
        this.f4298e = b(jVar.f4261l);
    }

    public final int b(Integer num) {
        return num != null ? num.intValue() : com.google.gson.internal.c.y(this.f4294a.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
        kotlin.jvm.internal.l.f(outRect, "outRect");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(parent, "parent");
        kotlin.jvm.internal.l.f(state, "state");
        outRect.set(this.f4295b, this.f4296c, this.f4297d, this.f4298e);
    }
}
