package D9;

import A9.C0583j;
import f9.InterfaceC4347e;

/* compiled from: SharedFlow.kt */
/* loaded from: classes3.dex */
public final class F extends E9.d<C<?>> {

    /* renamed from: a, reason: collision with root package name */
    public long f1154a = -1;

    /* renamed from: b, reason: collision with root package name */
    public C0583j f1155b;

    @Override // E9.d
    public final boolean a(E9.b bVar) {
        C c10 = (C) bVar;
        if (this.f1154a >= 0) {
            return false;
        }
        long j4 = c10.i;
        if (j4 < c10.f1136j) {
            c10.f1136j = j4;
        }
        this.f1154a = j4;
        return true;
    }

    @Override // E9.d
    public final InterfaceC4347e[] b(E9.b bVar) {
        long j4 = this.f1154a;
        this.f1154a = -1L;
        this.f1155b = null;
        return ((C) bVar).t(j4);
    }
}
