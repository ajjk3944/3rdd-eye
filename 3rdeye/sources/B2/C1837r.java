package b2;

/* compiled from: WorkNameDao_Impl.java */
/* renamed from: b2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837r extends w1.d {
    @Override // n.AbstractC5340b
    public final String e() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // w1.d
    public final void i(F1.f fVar, Object obj) {
        C1835p c1835p = (C1835p) obj;
        String str = c1835p.f17130a;
        if (str == null) {
            fVar.f(1);
        } else {
            fVar.h(1, str);
        }
        fVar.h(2, c1835p.f17131b);
    }
}
