package L6;

import H6.C0672i;
import H6.C0683u;
import H6.H;
import K6.P;
import N7.Z;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;
import java.util.WeakHashMap;
import z6.C5865d;

/* compiled from: DivGalleryAdapter.kt */
/* loaded from: classes.dex */
public final class a extends P<j> {

    /* renamed from: o, reason: collision with root package name */
    public final C0672i f4069o;

    /* renamed from: p, reason: collision with root package name */
    public final C0683u f4070p;

    /* renamed from: q, reason: collision with root package name */
    public final H f4071q;

    /* renamed from: r, reason: collision with root package name */
    public final C5865d f4072r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakHashMap<i7.b, Long> f4073s;

    /* renamed from: t, reason: collision with root package name */
    public long f4074t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List<i7.b> list, C0672i c0672i, C0683u c0683u, H viewCreator, C5865d c5865d) {
        super(list);
        kotlin.jvm.internal.l.f(viewCreator, "viewCreator");
        this.f4069o = c0672i;
        this.f4070p = c0683u;
        this.f4071q = viewCreator;
        this.f4072r = c5865d;
        this.f4073s = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        i7.b bVar = (i7.b) this.f3271l.get(i);
        WeakHashMap<i7.b, Long> weakHashMap = this.f4073s;
        Long l5 = weakHashMap.get(bVar);
        if (l5 != null) {
            return l5.longValue();
        }
        long j4 = this.f4074t;
        this.f4074t = 1 + j4;
        weakHashMap.put(bVar, Long.valueOf(j4));
        return j4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        j holder = (j) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        i7.b bVar = (i7.b) this.f3271l.get(i);
        C0672i c0672iA = this.f4069o.a(bVar.f38461b);
        int iIndexOf = this.f3269j.indexOf(bVar);
        Z div = bVar.f38460a;
        kotlin.jvm.internal.l.f(div, "div");
        holder.a(c0672iA, div, iIndexOf);
        holder.f4099s.setTag(R.id.div_gallery_item_index, Integer.valueOf(i));
        holder.f4100t.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        j6.e context = this.f4069o.f2146a.getContext$div_release();
        kotlin.jvm.internal.l.f(context, "context");
        return new j(this.f4069o, new g(context), this.f4070p, this.f4071q, this.f4072r);
    }
}
