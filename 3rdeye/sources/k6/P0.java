package K6;

import N7.B8;
import N7.C1434y6;
import R9.AbstractC1564a;
import c9.C2078B;
import c9.C2100u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class P0 extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3305h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(int i, Object obj, Object obj2) {
        super(0);
        this.f3304g = i;
        this.f3305h = obj;
        this.i = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        String[] strArrNames;
        switch (this.f3304g) {
            case 0:
                return ((C1434y6) this.f3305h).f9933b.a((A7.d) this.i);
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                O9.e eVar = (O9.e) this.f3305h;
                S9.y.c(eVar, (AbstractC1564a) this.i);
                int iF = eVar.f();
                for (int i = 0; i < iF; i++) {
                    List<Annotation> listH = eVar.h(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listH) {
                        if (obj instanceof R9.w) {
                            arrayList.add(obj);
                        }
                    }
                    R9.w wVar = (R9.w) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (wVar != null && (strArrNames = wVar.names()) != null) {
                        for (String str : strArrNames) {
                            if (linkedHashMap.containsKey(str)) {
                                StringBuilder sbK = B8.k("The suggested name '", str, "' for property ");
                                sbK.append(eVar.g(i));
                                sbK.append(" is already one of the names for property ");
                                sbK.append(eVar.g(((Number) C2078B.n(linkedHashMap, str)).intValue()));
                                sbK.append(" in ");
                                sbK.append(eVar);
                                String message = sbK.toString();
                                kotlin.jvm.internal.l.f(message, "message");
                                throw new S9.x(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C2100u.f18582b : linkedHashMap;
        }
    }
}
