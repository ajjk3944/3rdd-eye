package b2;

/* compiled from: DependencyDao_Impl.java */
/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822c extends w1.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1822c(w1.k kVar, int i) {
        super(kVar);
        this.f17114d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17114d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    @Override // w1.d
    public final void i(F1.f fVar, Object obj) throws Throwable {
        switch (this.f17114d) {
            case 0:
                C1820a c1820a = (C1820a) obj;
                fVar.h(1, c1820a.f17112a);
                String str = c1820a.f17113b;
                if (str != null) {
                    fVar.h(2, str);
                    break;
                } else {
                    fVar.f(2);
                    break;
                }
            default:
                C1838s c1838s = (C1838s) obj;
                String str2 = c1838s.f17132a;
                if (str2 == null) {
                    fVar.f(1);
                } else {
                    fVar.h(1, str2);
                }
                byte[] bArrI = androidx.work.e.i(c1838s.f17133b);
                if (bArrI != null) {
                    fVar.b0(2, bArrI);
                    break;
                } else {
                    fVar.f(2);
                    break;
                }
        }
    }
}
