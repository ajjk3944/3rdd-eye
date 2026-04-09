package o4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.d f18803b;

    public h0(androidx.fragment.app.d dVar, int i10) {
        this.f18803b = dVar;
        this.f18802a = i10;
    }

    @Override // o4.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        androidx.fragment.app.d dVar = this.f18803b;
        androidx.fragment.app.b bVar = dVar.f1459z;
        int i10 = this.f18802a;
        if (bVar == null || i10 >= 0 || !bVar.m().T(-1, 0)) {
            return dVar.U(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}
