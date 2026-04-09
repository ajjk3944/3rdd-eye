package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5442a;

    /* renamed from: b, reason: collision with root package name */
    public int f5443b;

    /* renamed from: c, reason: collision with root package name */
    public int f5444c;

    /* renamed from: d, reason: collision with root package name */
    public int f5445d;

    /* renamed from: e, reason: collision with root package name */
    public int f5446e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5448g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5449h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5450j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5451k;

    /* renamed from: l, reason: collision with root package name */
    public int f5452l;

    /* renamed from: m, reason: collision with root package name */
    public long f5453m;

    /* renamed from: n, reason: collision with root package name */
    public int f5454n;

    public final void a(int i) {
        if ((this.f5445d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5445d));
    }

    public final int b() {
        return this.f5448g ? this.f5443b - this.f5444c : this.f5446e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5442a + ", mData=null, mItemCount=" + this.f5446e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f5443b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5444c + ", mStructureChanged=" + this.f5447f + ", mInPreLayout=" + this.f5448g + ", mRunSimpleAnimations=" + this.f5450j + ", mRunPredictiveAnimations=" + this.f5451k + '}';
    }
}
