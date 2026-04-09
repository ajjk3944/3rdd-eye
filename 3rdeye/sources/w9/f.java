package W9;

import ia.C4467c;
import ia.q;
import java.io.IOException;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class f extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f13410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str) {
        super(str, true);
        this.f13410e = dVar;
    }

    @Override // X9.a
    public final long a() {
        d dVar = this.f13410e;
        synchronized (dVar) {
            if (!dVar.f13382m || dVar.f13383n) {
                return -1L;
            }
            try {
                dVar.W();
            } catch (IOException unused) {
                dVar.f13384o = true;
            }
            try {
                if (dVar.l()) {
                    dVar.D();
                    dVar.f13379j = 0;
                }
            } catch (IOException unused2) {
                dVar.f13385p = true;
                dVar.f13378h = q.b(new C4467c());
            }
            return -1L;
        }
    }
}
