package H5;

import a0.C0244C;
import a0.C0253g;
import c.C0383h;
import c5.C0412i;
import d5.AbstractC2282j;
import d5.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5.l;
import q0.C2794g;
import q0.s;
import s0.C2885f;

/* loaded from: classes3.dex */
public final class g extends q5.j implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj) {
        super(1);
        this.f1820b = i;
        this.f1821c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5.b, java.lang.Object] */
    @Override // p5.l
    public final Object f(Object obj) {
        switch (this.f1820b) {
            case 0:
                ((i) this.f1821c).b();
                return C0412i.f5929a;
            case 1:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((C0244C) this.f1821c).f4557e.J(new C0253g(th));
                }
                Object obj2 = C0244C.i;
                C0244C c0244c = (C0244C) this.f1821c;
                synchronized (obj2) {
                    C0244C.f4552h.remove(c0244c.b().getAbsolutePath());
                }
                return C0412i.f5929a;
            case 2:
                q5.i.e((String) obj, "key");
                s sVar = (s) this.f1821c;
                ArrayList arrayList = sVar.f23015d;
                Collection collectionValues = ((Map) sVar.f23019h.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    p.R(((q0.p) it.next()).f23005b, arrayList2);
                }
                return Boolean.valueOf(!AbstractC2282j.e0(AbstractC2282j.e0(arrayList, arrayList2), (List) sVar.f23021k.getValue()).contains(r6));
            default:
                C2794g c2794g = (C2794g) obj;
                q5.i.e(c2794g, "entry");
                return new C0383h((C2885f) this.f1821c, 1, c2794g);
        }
    }
}
