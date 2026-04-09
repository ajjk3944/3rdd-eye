package cg;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3741a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3742b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3741a = str;
        this.f3742b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3741a.equals(aVar.f3741a) && this.f3742b.equals(aVar.f3742b);
    }

    public final int hashCode() {
        return ((this.f3741a.hashCode() ^ 1000003) * 1000003) ^ this.f3742b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3741a + ", usedDates=" + this.f3742b + "}";
    }
}
