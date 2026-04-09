package ld;

import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import java.util.Iterator;
import java.util.List;
import om.f;
import u3.h1;
import u3.u0;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: g, reason: collision with root package name */
    public final View f15135g;

    /* renamed from: r, reason: collision with root package name */
    public int f15136r;

    /* renamed from: x, reason: collision with root package name */
    public int f15137x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f15138y;

    public a(View view) {
        super(0);
        this.f15138y = new int[2];
        this.f15135g = view;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(u0 u0Var) {
        this.f15135g.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e() {
        View view = this.f15135g;
        int[] iArr = this.f15138y;
        view.getLocationOnScreen(iArr);
        this.f15136r = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final h1 f(h1 h1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((u0) it.next()).f23222a.c() & 8) != 0) {
                this.f15135g.setTranslationY(fd.a.c(this.f15137x, r0.f23222a.b(), 0));
                break;
            }
        }
        return h1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final f g(u0 u0Var, f fVar) {
        View view = this.f15135g;
        int[] iArr = this.f15138y;
        view.getLocationOnScreen(iArr);
        int i10 = this.f15136r - iArr[1];
        this.f15137x = i10;
        view.setTranslationY(i10);
        return fVar;
    }
}
