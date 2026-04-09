package androidx.recyclerview.widget;

import N7.H7;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public int f16762b;

    /* renamed from: c, reason: collision with root package name */
    public int f16763c;

    /* renamed from: d, reason: collision with root package name */
    public int f16764d;

    /* renamed from: e, reason: collision with root package name */
    public int f16765e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16768h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16761a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f16766f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f16767g = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f16762b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f16763c);
        sb.append(", mItemDirection=");
        sb.append(this.f16764d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f16765e);
        sb.append(", mStartLine=");
        sb.append(this.f16766f);
        sb.append(", mEndLine=");
        return H7.p(sb, this.f16767g, '}');
    }
}
