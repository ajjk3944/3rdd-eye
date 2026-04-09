package h4;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import e4.m0;
import e4.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f24874a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24875b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public v3.b f24876c;

    /* renamed from: d, reason: collision with root package name */
    public v3.b f24877d;

    /* renamed from: e, reason: collision with root package name */
    public int f24878e;

    public g(ViewGroup viewGroup) {
        v3.b bVar = v3.b.f35792e;
        this.f24876c = bVar;
        this.f24877d = bVar;
        Drawable background = viewGroup.getBackground();
        this.f24878e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f24874a = eVar;
        eVar.setWillNotDraw(true);
        ca.b bVar2 = new ca.b(15, this);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(eVar, bVar2);
        v0.r(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
