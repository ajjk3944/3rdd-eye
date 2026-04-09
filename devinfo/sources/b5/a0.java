package b5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements a6.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1728b;

    public /* synthetic */ a0(int i4, Object obj) {
        this.f1727a = i4;
        this.f1728b = obj;
    }

    @Override // a6.d
    public final Bundle a() {
        yj.i[] iVarArr;
        switch (this.f1727a) {
            case 0:
                i.g gVar = (i.g) this.f1728b;
                while (i.g.t(gVar.s())) {
                }
                gVar.f25292v.e(androidx.lifecycle.r.ON_STOP);
                return new Bundle();
            case 1:
                return ((u0) this.f1728b).Y();
            case 2:
                d.j jVar = (d.j) this.f1728b;
                Bundle bundle = new Bundle();
                d.i iVar = jVar.f21610i;
                iVar.getClass();
                LinkedHashMap linkedHashMap = iVar.f21598b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f21600d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.g));
                return bundle;
            case 3:
                androidx.lifecycle.f1 f1Var = (androidx.lifecycle.f1) this.f1728b;
                for (Map.Entry entry : zj.w.L((LinkedHashMap) f1Var.f1137e).entrySet()) {
                    f1Var.J(((al.i1) ((al.u0) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : zj.w.L((LinkedHashMap) f1Var.f1135c).entrySet()) {
                    f1Var.J(((a6.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) f1Var.f1134b;
                if (linkedHashMap2.isEmpty()) {
                    iVarArr = new yj.i[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new yj.i((String) entry3.getKey(), entry3.getValue()));
                    }
                    iVarArr = (yj.i[]) arrayList.toArray(new yj.i[0]);
                }
                return com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(iVarArr, iVarArr.length));
            default:
                Map mapB = ((f1.h) this.f1728b).b();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : mapB.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
