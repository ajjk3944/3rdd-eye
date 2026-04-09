package j0;

import android.content.Context;
import android.view.ViewGroup;
import io.sentry.t;
import java.util.ArrayList;
import z0.n;

/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f13024a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13025d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13026g;

    /* renamed from: r, reason: collision with root package name */
    public final t f13027r;

    /* renamed from: x, reason: collision with root package name */
    public int f13028x;

    public d(Context context) {
        super(context);
        this.f13024a = 5;
        ArrayList arrayList = new ArrayList();
        this.f13025d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13026g = arrayList2;
        this.f13027r = new t(7);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f13028x = 1;
        setTag(n.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
