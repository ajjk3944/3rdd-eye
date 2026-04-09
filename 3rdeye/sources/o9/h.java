package O9;

import Q9.C;
import java.util.Iterator;
import q9.InterfaceC5499a;
import y9.C5820b;
import y9.C5820b.a;

/* compiled from: Iterables.kt */
/* loaded from: classes3.dex */
public final class h implements Iterable, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10519c;

    public /* synthetic */ h(Object obj, int i) {
        this.f10518b = i;
        this.f10519c = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10518b) {
            case 0:
                return new g((C) this.f10519c);
            default:
                return ((C5820b) this.f10519c).new a();
        }
    }
}
