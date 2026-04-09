package p6;

import C.e0;
import H6.I;
import X0.n;
import a7.AbstractC1664a;
import a7.C1668e;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import s6.k;

/* compiled from: LocalFunction.kt */
/* loaded from: classes.dex */
public final class e extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f45214a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45215b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1667d f45216c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f45217d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1664a.c f45218e;

    public e(String str, ArrayList arrayList, EnumC1667d resultType, ArrayList arrayList2, String str2) {
        l.f(resultType, "resultType");
        this.f45214a = str;
        this.f45215b = arrayList;
        this.f45216c = resultType;
        this.f45217d = arrayList2;
        this.f45218e = new AbstractC1664a.c(str2);
    }

    @Override // a7.g
    public final Object a(n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : this.f45217d) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            linkedHashMap.put((String) obj, list.get(i));
            i = i10;
        }
        return new C1668e(new n(new s6.j((k) nVar.f13448a, new B7.e(linkedHashMap, 8)), (e0) nVar.f13449b, (H7.e) nVar.f13450c, (I) nVar.f13451d)).b(this.f45218e);
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f45215b;
    }

    @Override // a7.g
    public final String c() {
        return this.f45214a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f45216c;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
