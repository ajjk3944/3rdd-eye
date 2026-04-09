package j3;

/* compiled from: PreserveAspectRatio.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f42712c = new e(a.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final e f42713d = new e(a.xMidYMid, b.meet);

    /* renamed from: a, reason: collision with root package name */
    public final a f42714a;

    /* renamed from: b, reason: collision with root package name */
    public final b f42715b;

    /* compiled from: PreserveAspectRatio.java */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* compiled from: PreserveAspectRatio.java */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.none;
        a aVar2 = a.none;
        a aVar3 = a.none;
        a aVar4 = a.none;
        b bVar = b.meet;
    }

    public e(a aVar, b bVar) {
        this.f42714a = aVar;
        this.f42715b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f42714a == eVar.f42714a && this.f42715b == eVar.f42715b;
    }

    public final String toString() {
        return this.f42714a + " " + this.f42715b;
    }
}
