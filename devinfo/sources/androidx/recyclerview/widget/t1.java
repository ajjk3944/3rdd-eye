package androidx.recyclerview.widget;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1503a;

    /* renamed from: b, reason: collision with root package name */
    public int f1504b;

    /* renamed from: c, reason: collision with root package name */
    public int f1505c;

    /* renamed from: d, reason: collision with root package name */
    public int f1506d;

    /* renamed from: e, reason: collision with root package name */
    public int f1507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1508f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1509h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1510i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1511k;

    /* renamed from: l, reason: collision with root package name */
    public int f1512l;

    /* renamed from: m, reason: collision with root package name */
    public long f1513m;

    /* renamed from: n, reason: collision with root package name */
    public int f1514n;

    public final void a(int i4) {
        if ((this.f1506d & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f1506d));
    }

    public final int b() {
        return this.g ? this.f1504b - this.f1505c : this.f1507e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f1503a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f1507e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f1510i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f1504b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f1505c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f1508f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.j);
        sb2.append(", mRunPredictiveAnimations=");
        return d.h.x(sb2, this.f1511k, '}');
    }
}
