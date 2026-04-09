package va;

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a3 f36030a = new a3();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = pa.p.f31541b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
