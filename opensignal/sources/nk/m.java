package nk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final f f18420c = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final r f18421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18422b;

    public m(r rVar, int i10) {
        this.f18422b = i10;
        this.f18421a = rVar;
    }

    @Override // nk.r
    public Object fromJson(w wVar) {
        Collection arrayList;
        switch (this.f18422b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        wVar.b();
        while (wVar.w()) {
            arrayList.add(this.f18421a.fromJson(wVar));
        }
        wVar.h();
        return arrayList;
    }

    @Override // nk.r
    public void toJson(c0 c0Var, Object obj) {
        c0Var.b();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f18421a.toJson(c0Var, it.next());
        }
        c0Var.i();
    }

    public final String toString() {
        return this.f18421a + ".collection()";
    }
}
