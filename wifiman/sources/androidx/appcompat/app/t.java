package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class t {
    private static A1.j a(A1.j jVar, A1.j jVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < jVar.f() + jVar2.f()) {
            Locale localeC = i10 < jVar.f() ? jVar.c(i10) : jVar2.c(i10 - jVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return A1.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static A1.j b(A1.j jVar, A1.j jVar2) {
        return (jVar == null || jVar.e()) ? A1.j.d() : a(jVar, jVar2);
    }
}
