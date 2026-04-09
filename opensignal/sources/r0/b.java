package r0;

import ar.k;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21113a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Collection f21114d;

    public /* synthetic */ b(int i10, Collection collection) {
        this.f21113a = i10;
        this.f21114d = collection;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        boolean zContains;
        switch (this.f21113a) {
            case 0:
                zContains = this.f21114d.contains(obj);
                break;
            case 1:
                zContains = this.f21114d.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f21114d);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
