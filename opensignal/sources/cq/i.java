package cq;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f6627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6628b;

    public i(String str, int i10) {
        br.l.e(str, "screenName");
        this.f6627a = str;
        this.f6628b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return br.l.a(this.f6627a, iVar.f6627a) && this.f6628b == iVar.f6628b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6628b) + (this.f6627a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenDelayTrigger(screenName=");
        sb2.append(this.f6627a);
        sb2.append(", delayInSeconds=");
        return c7.a.q(sb2, this.f6628b, ')');
    }
}
