package e5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4315a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f37716a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37717b;

    public C4315a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f37716a = str;
        this.f37717b = arrayList;
    }

    @Override // e5.i
    public final List<String> a() {
        return this.f37717b;
    }

    @Override // e5.i
    public final String b() {
        return this.f37716a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f37716a.equals(iVar.b()) && this.f37717b.equals(iVar.a());
    }

    public final int hashCode() {
        return ((this.f37716a.hashCode() ^ 1000003) * 1000003) ^ this.f37717b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f37716a + ", usedDates=" + this.f37717b + "}";
    }
}
