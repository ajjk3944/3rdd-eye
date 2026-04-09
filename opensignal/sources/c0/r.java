package c0;

import x1.o1;

/* loaded from: classes.dex */
public final class r extends z0.l implements o1 {

    /* renamed from: p, reason: collision with root package name */
    public float f3099p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3100q;

    @Override // x1.o1
    public final Object N(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar == null) {
            vVar = new v();
            vVar.f3109a = 0.0f;
            vVar.f3110b = true;
        }
        vVar.f3109a = this.f3099p;
        vVar.f3110b = this.f3100q;
        return vVar;
    }
}
