package hn;

import w.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10848c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10851f;

    public /* synthetic */ a() {
        this(125, 3, true, 5, 2, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10846a == aVar.f10846a && this.f10847b == aVar.f10847b && this.f10848c == aVar.f10848c && this.f10849d == aVar.f10849d && this.f10850e == aVar.f10850e && this.f10851f == aVar.f10851f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10851f) + c7.a.C(this.f10850e, c7.a.C(this.f10849d, g.b(c7.a.C(this.f10847b, Integer.hashCode(this.f10846a) * 31, 31), this.f10848c, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingConfig(daysBetweenPrompts=");
        sb2.append(this.f10846a);
        sb2.append(", daysSinceFirstUse=");
        sb2.append(this.f10847b);
        sb2.append(", isEnabled=");
        sb2.append(this.f10848c);
        sb2.append(", numberOfSpeedTestsBeforePrompt=");
        sb2.append(this.f10849d);
        sb2.append(", numberOfVideoTestsBeforePrompt=");
        sb2.append(this.f10850e);
        sb2.append(", secondsWaitAfterSpeedTestEnd=");
        return c7.a.q(sb2, this.f10851f, ')');
    }

    public a(int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f10846a = i10;
        this.f10847b = i11;
        this.f10848c = z10;
        this.f10849d = i12;
        this.f10850e = i13;
        this.f10851f = i14;
    }
}
