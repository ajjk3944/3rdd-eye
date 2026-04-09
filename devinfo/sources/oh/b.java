package oh;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30550a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        int iCompare = Integer.compare(aVar.f30547b, aVar2.f30547b);
        return iCompare == 0 ? Integer.compare(aVar2.f30546a, aVar.f30546a) : iCompare;
    }
}
