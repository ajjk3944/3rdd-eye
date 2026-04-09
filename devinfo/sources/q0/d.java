package q0;

import android.content.Context;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f32046a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32047b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32048c;

    /* renamed from: d, reason: collision with root package name */
    public final o f32049d;

    /* renamed from: e, reason: collision with root package name */
    public int f32050e;

    public d(Context context) {
        super(context);
        this.f32046a = 5;
        ArrayList arrayList = new ArrayList();
        this.f32047b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f32048c = arrayList2;
        this.f32049d = new o(9);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f32050e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
    }
}
