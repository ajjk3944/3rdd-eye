package s0;

import java.util.Iterator;
import java.util.regex.Matcher;
import st.o;

/* loaded from: classes.dex */
public final class j extends mq.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21838a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21839d;

    public /* synthetic */ j(int i10, Object obj) {
        this.f21838a = i10;
        this.f21839d = obj;
    }

    @Override // mq.a
    public final int a() {
        switch (this.f21838a) {
            case 0:
                c cVar = (c) this.f21839d;
                cVar.getClass();
                return cVar.f21827d;
            default:
                return ((tt.j) this.f21839d).f23004a.groupCount() + 1;
        }
    }

    public tt.i b(int i10) {
        Matcher matcher = ((tt.j) this.f21839d).f23004a;
        hr.d dVarT = vc.e.T(matcher.start(i10), matcher.end(i10));
        if (dVarT.f10863a < 0) {
            return null;
        }
        String strGroup = matcher.group(i10);
        br.l.d(strGroup, "group(...)");
        return new tt.i(strGroup, dVarT);
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f21838a) {
            case 0:
                return ((c) this.f21839d).containsValue(obj);
            default:
                if (obj == null ? true : obj instanceof tt.i) {
                    return super.contains((tt.i) obj);
                }
                return false;
        }
    }

    @Override // mq.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f21838a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f21838a) {
            case 0:
                k kVar = ((c) this.f21839d).f21826a;
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(2);
                }
                return new i(kVar, lVarArr);
            default:
                return new o(st.l.b0(mq.o.j0(new hr.d(0, size() - 1, 1)), new cg.j(15, this)));
        }
    }
}
