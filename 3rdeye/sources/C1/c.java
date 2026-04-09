package C1;

import kotlin.jvm.internal.l;

/* compiled from: SchemaInfoUtil.kt */
/* loaded from: classes.dex */
public final class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f841c;

    /* renamed from: d, reason: collision with root package name */
    public final String f842d;

    /* renamed from: e, reason: collision with root package name */
    public final String f843e;

    public c(int i, int i10, String from, String to) {
        l.f(from, "from");
        l.f(to, "to");
        this.f840b = i;
        this.f841c = i10;
        this.f842d = from;
        this.f843e = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c other = cVar;
        l.f(other, "other");
        int i = this.f840b - other.f840b;
        return i == 0 ? this.f841c - other.f841c : i;
    }
}
