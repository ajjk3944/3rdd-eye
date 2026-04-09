package h9;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f10508c = new x(v.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final x f10509d = new x(v.xMidYMid, w.meet);

    /* renamed from: a, reason: collision with root package name */
    public final v f10510a;

    /* renamed from: b, reason: collision with root package name */
    public final w f10511b;

    static {
        v vVar = v.none;
        v vVar2 = v.none;
        v vVar3 = v.none;
        v vVar4 = v.none;
        w wVar = w.meet;
    }

    public x(v vVar, w wVar) {
        this.f10510a = vVar;
        this.f10511b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f10510a == xVar.f10510a && this.f10511b == xVar.f10511b;
    }

    public final String toString() {
        return this.f10510a + " " + this.f10511b;
    }
}
