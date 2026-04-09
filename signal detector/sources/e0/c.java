package E0;

import q5.i;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1347d;

    public c(int i, int i3, String str, String str2) {
        this.f1344a = i;
        this.f1345b = i3;
        this.f1346c = str;
        this.f1347d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        i.e(cVar, "other");
        int i = this.f1344a - cVar.f1344a;
        return i == 0 ? this.f1345b - cVar.f1345b : i;
    }
}
