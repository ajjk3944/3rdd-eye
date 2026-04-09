package b2;

/* compiled from: PreferenceDao_Impl.java */
/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825f extends w1.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1825f(w1.k kVar, int i) {
        super(kVar);
        this.f17117d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17117d) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // w1.d
    public final void i(F1.f fVar, Object obj) {
        switch (this.f17117d) {
            case 0:
                C1823d c1823d = (C1823d) obj;
                fVar.h(1, c1823d.f17115a);
                fVar.b(2, c1823d.f17116b.longValue());
                break;
            default:
                C1817D c1817d = (C1817D) obj;
                String str = c1817d.f17106a;
                if (str == null) {
                    fVar.f(1);
                } else {
                    fVar.h(1, str);
                }
                String str2 = c1817d.f17107b;
                if (str2 != null) {
                    fVar.h(2, str2);
                    break;
                } else {
                    fVar.f(2);
                    break;
                }
        }
    }
}
