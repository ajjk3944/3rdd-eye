package P3;

import L0.V;
import L0.X;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes2.dex */
public final class d extends V.b {

    /* renamed from: b, reason: collision with root package name */
    public final View f10591b;

    /* renamed from: c, reason: collision with root package name */
    public int f10592c;

    /* renamed from: d, reason: collision with root package name */
    public int f10593d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f10594e = new int[2];

    public d(View view) {
        this.f10591b = view;
    }

    @Override // L0.V.b
    public final X a(X x10, List<V> list) {
        Iterator<V> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f3820a.c() & 8) != 0) {
                this.f10591b.setTranslationY(L3.a.c(r0.f3820a.b(), this.f10593d, 0));
                break;
            }
        }
        return x10;
    }
}
