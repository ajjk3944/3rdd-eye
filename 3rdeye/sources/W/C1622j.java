package W;

import N7.C1094a9;
import W.C1635x;
import android.util.Size;
import java.util.List;

/* compiled from: AutoValue_Quality_ConstantQuality.java */
/* renamed from: W.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622j extends C1635x.a {

    /* renamed from: j, reason: collision with root package name */
    public final int f13272j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13273k;

    /* renamed from: l, reason: collision with root package name */
    public final List<Size> f13274l;

    public C1622j(int i, String str, List<Size> list) {
        this.f13272j = i;
        this.f13273k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f13274l = list;
    }

    @Override // W.C1635x.a
    public final String a() {
        return this.f13273k;
    }

    @Override // W.C1635x.a
    public final List<Size> b() {
        return this.f13274l;
    }

    @Override // W.C1635x.a
    public final int c() {
        return this.f13272j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1635x.a)) {
            return false;
        }
        C1635x.a aVar = (C1635x.a) obj;
        return this.f13272j == aVar.c() && this.f13273k.equals(aVar.a()) && this.f13274l.equals(aVar.b());
    }

    public final int hashCode() {
        return ((((this.f13272j ^ 1000003) * 1000003) ^ this.f13273k.hashCode()) * 1000003) ^ this.f13274l.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.f13272j);
        sb.append(", name=");
        sb.append(this.f13273k);
        sb.append(", typicalSizes=");
        return C1094a9.h(sb, this.f13274l, "}");
    }
}
