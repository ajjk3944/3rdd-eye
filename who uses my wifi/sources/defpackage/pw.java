package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements ys0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ys0
    public final Bundle a() {
        gk0[] gk0VarArr;
        switch (this.a) {
            case 0:
                return ((xw) this.b).S();
            default:
                g4 g4Var = (g4) this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) g4Var.i;
                i30.m(linkedHashMap, "<this>");
                int size = linkedHashMap.size();
                Map linkedHashMap2 = os.f;
                for (Map.Entry entry : (size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : gb0.k0(linkedHashMap) : linkedHashMap2).entrySet()) {
                    g4Var.e(((ay0) ((pf0) entry.getValue())).E(), (String) entry.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) g4Var.j;
                i30.m(linkedHashMap3, "<this>");
                int size2 = linkedHashMap3.size();
                if (size2 != 0) {
                    linkedHashMap2 = size2 != 1 ? new LinkedHashMap(linkedHashMap3) : gb0.k0(linkedHashMap3);
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    g4Var.e(((ys0) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) g4Var.g;
                if (linkedHashMap4.isEmpty()) {
                    gk0VarArr = new gk0[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap4.size());
                    for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                        arrayList.add(new gk0((String) entry3.getKey(), entry3.getValue()));
                    }
                    gk0VarArr = (gk0[]) arrayList.toArray(new gk0[0]);
                }
                return uk2.b((gk0[]) Arrays.copyOf(gk0VarArr, gk0VarArr.length));
        }
    }
}
