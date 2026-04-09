package f1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x.e0;
import x.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f23620a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f23621b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f23622c;

    public h(Map map, mk.c cVar) {
        e0 e0Var;
        this.f23620a = cVar;
        if (map == null || map.isEmpty()) {
            e0Var = null;
        } else {
            e0Var = new e0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                e0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f23621b = e0Var;
    }

    @Override // f1.g
    public final boolean a(Object obj) {
        return ((Boolean) this.f23620a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // f1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.h.b():java.util.Map");
    }

    @Override // f1.g
    public final Object c(String str) {
        e0 e0Var = this.f23621b;
        List list = e0Var != null ? (List) e0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && e0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = e0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = e0Var.f36875c;
            Object obj = objArr[iF];
            e0Var.f36874b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // f1.g
    public final f d(String str, mk.a aVar) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!com.bumptech.glide.d.u(str.charAt(i4))) {
                e0 e0Var = this.f23622c;
                if (e0Var == null) {
                    long[] jArr = l0.f36914a;
                    e0Var = new e0();
                    this.f23622c = e0Var;
                }
                Object objG = e0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    e0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new yb.e(e0Var, str, aVar, 20);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
