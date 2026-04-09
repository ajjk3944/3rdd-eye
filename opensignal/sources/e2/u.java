package e2;

import ht.x;
import java.util.Comparator;
import x1.f0;

/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7765a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7766d;

    public /* synthetic */ u(int i10, Object obj) {
        this.f7765a = i10;
        this.f7766d = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7765a) {
            case 0:
                int iCompare = ((Comparator) this.f7766d).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return f0.N.compare(((k) obj).f7716c, ((k) obj2).f7716c);
            case 1:
                int iCompare2 = ((u) this.f7766d).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : se.b.n(Integer.valueOf(((k) obj).f7720g), Integer.valueOf(((k) obj2).f7720g));
            default:
                x xVar = (x) obj;
                ar.k kVar = (ar.k) this.f7766d;
                br.l.d(xVar, "it");
                String string = kVar.a(xVar).toString();
                x xVar2 = (x) obj2;
                br.l.d(xVar2, "it");
                return se.b.n(string, kVar.a(xVar2).toString());
        }
    }

    public u(Comparator comparator) {
        this.f7765a = 0;
        this.f7766d = comparator;
    }
}
