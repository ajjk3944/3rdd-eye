package mu;

import h7.h0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ku.p0;
import mq.f0;

/* loaded from: classes.dex */
public class o extends a {

    /* renamed from: f, reason: collision with root package name */
    public final lu.w f17021f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.e f17022g;

    /* renamed from: h, reason: collision with root package name */
    public int f17023h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17024i;

    public /* synthetic */ o(lu.c cVar, lu.w wVar, String str, int i10) {
        this(cVar, wVar, (i10 & 4) != 0 ? null : str, (iu.e) null);
    }

    @Override // mu.a
    public lu.l E(String str) {
        br.l.e(str, "tag");
        return (lu.l) mq.b0.O(S(), str);
    }

    @Override // mu.a
    public String Q(iu.e eVar, int i10) throws IOException {
        Object next;
        br.l.e(eVar, "descriptor");
        lu.c cVar = this.f17003c;
        l.m(eVar, cVar);
        String strL = eVar.l(i10);
        if (this.f17005e.f15948f && !S().f15960a.keySet().contains(strL)) {
            br.l.e(cVar, "<this>");
            h0 h0Var = cVar.f15936c;
            c8.x xVar = new c8.x(eVar, 3, cVar);
            h0Var.getClass();
            m mVar = l.f17018a;
            Object objW = h0Var.w(eVar, mVar);
            if (objW == null) {
                objW = xVar.c();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h0Var.f10078a;
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(mVar, objW);
            }
            Map map = (Map) objW;
            Iterator it = S().f15960a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strL;
    }

    @Override // mu.a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public lu.w S() {
        return this.f17021f;
    }

    @Override // mu.a, ju.c
    public final ju.a b(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        iu.e eVar2 = this.f17022g;
        if (eVar != eVar2) {
            return super.b(eVar);
        }
        lu.l lVarF = F();
        String strH = eVar2.h();
        if (lVarF instanceof lu.w) {
            String str = this.f17004d;
            return new o(this.f17003c, (lu.w) lVarF, str, eVar2);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        br.y yVar = br.x.f2918a;
        sb2.append(yVar.b(lu.w.class).p());
        sb2.append(", but had ");
        sb2.append(yVar.b(lVarF.getClass()).p());
        sb2.append(" as the serialized body of ");
        sb2.append(strH);
        sb2.append(" at element: ");
        sb2.append(U());
        throw l.d(-1, lVarF.toString(), sb2.toString());
    }

    @Override // mu.a, ju.a
    public void c(iu.e eVar) {
        Set setN;
        br.l.e(eVar, "descriptor");
        lu.i iVar = this.f17005e;
        if (iVar.f15944b || (eVar.f() instanceof iu.b)) {
            return;
        }
        lu.c cVar = this.f17003c;
        l.m(eVar, cVar);
        if (iVar.f15948f) {
            Set setB = p0.b(eVar);
            br.l.e(cVar, "<this>");
            Map map = (Map) cVar.f15936c.w(eVar, l.f17018a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = mq.y.f16947a;
            }
            setN = f0.N(setB, setKeySet);
        } else {
            setN = p0.b(eVar);
        }
        for (String str : S().f15960a.keySet()) {
            if (!setN.contains(str) && !br.l.a(str, this.f17004d)) {
                String string = S().toString();
                br.l.e(str, "key");
                br.l.e(string, "input");
                StringBuilder sbU = c7.a.u("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbU.append((Object) l.l(string, -1));
                throw l.e(-1, sbU.toString());
            }
        }
    }

    @Override // ju.a
    public int t(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        while (this.f17023h < eVar.k()) {
            int i10 = this.f17023h;
            this.f17023h = i10 + 1;
            String strR = R(eVar, i10);
            int i11 = this.f17023h - 1;
            this.f17024i = false;
            if (!S().containsKey(strR)) {
                boolean z10 = (this.f17003c.f15934a.f15945c || eVar.o(i11) || !eVar.n(i11).i()) ? false : true;
                this.f17024i = z10;
                if (z10) {
                }
            }
            this.f17005e.getClass();
            return i11;
        }
        return -1;
    }

    @Override // mu.a, ju.c
    public final boolean u() {
        return !this.f17024i && super.u();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lu.c cVar, lu.w wVar, String str, iu.e eVar) {
        super(cVar, str);
        br.l.e(cVar, "json");
        this.f17021f = wVar;
        this.f17022g = eVar;
    }
}
