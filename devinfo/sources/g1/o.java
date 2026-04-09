package g1;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f24268b;

    public /* synthetic */ o(int i4, Collection collection) {
        this.f24267a = i4;
        this.f24268b = collection;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        switch (this.f24267a) {
            case 0:
                zRetainAll = ((List) obj).retainAll(this.f24268b);
                break;
            case 1:
                zRetainAll = this.f24268b.contains(obj);
                break;
            default:
                zRetainAll = this.f24268b.contains(obj);
                break;
        }
        return Boolean.valueOf(zRetainAll);
    }
}
