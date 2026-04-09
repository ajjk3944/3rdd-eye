package h7;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10101a;

    /* renamed from: b, reason: collision with root package name */
    public int f10102b;

    /* renamed from: c, reason: collision with root package name */
    public int f10103c;

    /* renamed from: d, reason: collision with root package name */
    public int f10104d;

    /* renamed from: e, reason: collision with root package name */
    public int f10105e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10106f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10107g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10108h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10109i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f10110l;

    /* renamed from: m, reason: collision with root package name */
    public long f10111m;

    /* renamed from: n, reason: collision with root package name */
    public int f10112n;

    public final void a(int i10) {
        if ((this.f10104d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f10104d));
    }

    public final int b() {
        return this.f10107g ? this.f10102b - this.f10103c : this.f10105e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f10101a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f10105e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f10109i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f10102b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f10103c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f10106f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f10107g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.j);
        sb2.append(", mRunPredictiveAnimations=");
        return c7.a.r(sb2, this.k, '}');
    }
}
