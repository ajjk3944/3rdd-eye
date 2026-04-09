package Q6;

import Q6.q;
import c9.C2097r;
import c9.C2100u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: VariableMonitor.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final A8.q f11365a;

    /* renamed from: c, reason: collision with root package name */
    public q.a f11367c;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11366b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public Object f11368d = C2100u.f18582b;

    public p(A8.q qVar) {
        this.f11365a = qVar;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.f11366b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            b9.l lVar = (b9.l) entry.getKey();
            arrayList.add(new b9.l(lVar.f18083b, (Z6.d) entry.getValue()));
        }
        List<? extends b9.l<? extends String, ? extends Z6.d>> listC0 = C2097r.C0(new o(), arrayList);
        q.a aVar = this.f11367c;
        if (aVar != null) {
            aVar.invoke(listC0);
        }
    }
}
