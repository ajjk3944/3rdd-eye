package Q6;

import N7.G8;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class o<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        b9.l lVar = (b9.l) t10;
        String str = (String) lVar.f18083b;
        Z6.d dVar = (Z6.d) lVar.f18084c;
        StringBuilder sbU = G8.u(str);
        sbU.append(dVar.a());
        String string = sbU.toString();
        b9.l lVar2 = (b9.l) t11;
        String str2 = (String) lVar2.f18083b;
        Z6.d dVar2 = (Z6.d) lVar2.f18084c;
        StringBuilder sbU2 = G8.u(str2);
        sbU2.append(dVar2.a());
        return com.google.gson.internal.c.g(string, sbU2.toString());
    }
}
