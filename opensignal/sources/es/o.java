package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8319d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(0);
        this.f8319d = i10;
        this.f8320g = pVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f8319d) {
            case 0:
                List listB = this.f8320g.f8322o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((xr.u) obj).f25515a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iP = mq.b0.P(mq.p.a0(arrayList, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((xr.u) next).c(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f8320g.f8322o.f25509a.getDeclaredClasses();
                br.l.d(declaredClasses, "klass.declaredClasses");
                return mq.o.U0(st.l.d0(st.l.c0(new st.f(mq.l.Y(declaredClasses), false, xr.c.f25489x), xr.c.f25490y)));
            default:
                p pVar = this.f8320g;
                return mq.f0.N(pVar.d(), pVar.g());
        }
    }
}
