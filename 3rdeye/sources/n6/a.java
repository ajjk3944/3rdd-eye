package N6;

import K6.C0713c;
import N7.Ba;
import N7.C1175g0;
import N7.C9;
import android.util.DisplayMetrics;
import y7.c;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes.dex */
public final class a implements c.f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Ba.a f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f4678b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.d f4679c;

    public a(Ba.a item, DisplayMetrics displayMetrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(item, "item");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        this.f4677a = item;
        this.f4678b = displayMetrics;
        this.f4679c = resolver;
    }

    @Override // y7.c.f.a
    public final Integer a() {
        C9 height = this.f4677a.f4959a.d().getHeight();
        if (height instanceof C9.a) {
            return Integer.valueOf(C0713c.d0(height, this.f4678b, this.f4679c, null));
        }
        return null;
    }

    @Override // y7.c.f.a
    public final Integer b() {
        return Integer.valueOf(C0713c.d0(this.f4677a.f4959a.d().getHeight(), this.f4678b, this.f4679c, null));
    }

    @Override // y7.c.f.a
    public final C1175g0 c() {
        return this.f4677a.f4961c;
    }

    @Override // y7.c.f.a
    public final String getTitle() {
        return this.f4677a.f4960b.a(this.f4679c);
    }
}
