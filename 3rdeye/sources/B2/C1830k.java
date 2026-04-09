package b2;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: b2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830k extends w1.d {
    @Override // n.AbstractC5340b
    public final String e() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // w1.d
    public final void i(F1.f fVar, Object obj) {
        String str = ((C1828i) obj).f17119a;
        if (str == null) {
            fVar.f(1);
        } else {
            fVar.h(1, str);
        }
        fVar.b(2, r5.f17120b);
        fVar.b(3, r5.f17121c);
    }
}
