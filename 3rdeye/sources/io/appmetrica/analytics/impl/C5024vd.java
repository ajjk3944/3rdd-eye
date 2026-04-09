package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5024vd extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f41855b;

    public C5024vd(C4940s5 c4940s5) {
        super(c4940s5);
        String strB = c4940s5.b().b();
        strB = strB == null ? "empty" : strB;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = Ga.j().n().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(new b9.l(entry.getValue(), new C4793md(c4940s5, (String) entry.getKey())));
        }
        this.f41855b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        ArrayList arrayList = this.f41855b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b9.l lVar = (b9.l) it.next();
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) lVar.f18083b;
            C4793md c4793md = (C4793md) lVar.f18084c;
            if (moduleServiceEventHandler.handle(new C4871pd(c4793md.f41254b, c4793md.f41253a, new C4845od(c4793md.f41255c, c4683i6)), c4683i6)) {
                return true;
            }
        }
        return false;
    }
}
