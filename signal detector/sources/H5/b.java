package H5;

import c5.C0412i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p5.l;

/* loaded from: classes3.dex */
public final class b extends q5.j implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i) {
        super(1);
        this.f1814b = i;
        this.f1815c = dVar;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        switch (this.f1814b) {
            case 0:
                this.f1815c.d();
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1818g;
                d dVar = this.f1815c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d();
                break;
        }
        return C0412i.f5929a;
    }
}
