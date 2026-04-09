package k7;

import br.l;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f14180a;

    /* renamed from: d, reason: collision with root package name */
    public final int f14181d;

    /* renamed from: g, reason: collision with root package name */
    public final String f14182g;

    /* renamed from: r, reason: collision with root package name */
    public final String f14183r;

    public c(String str, int i10, int i11, String str2) {
        this.f14180a = i10;
        this.f14181d = i11;
        this.f14182g = str;
        this.f14183r = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        l.e(cVar, "other");
        int i10 = this.f14180a - cVar.f14180a;
        return i10 == 0 ? this.f14181d - cVar.f14181d : i10;
    }
}
