package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class x {
    public static n0.g a(n0.g gVar, n0.g gVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < gVar.g() + gVar2.g()) {
            Locale localeD = i10 < gVar.g() ? gVar.d(i10) : gVar2.d(i10 - gVar.g());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i10++;
        }
        return n0.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static n0.g b(n0.g gVar, n0.g gVar2) {
        return (gVar == null || gVar.f()) ? n0.g.e() : a(gVar, gVar2);
    }
}
