package t8;

import java.util.List;

/* loaded from: classes.dex */
public final class s implements u8.a, c {

    /* renamed from: a, reason: collision with root package name */
    public final r8.v f22644a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.d f22645b;

    /* renamed from: c, reason: collision with root package name */
    public z8.p f22646c;

    public s(r8.v vVar, a9.b bVar, z8.o oVar) {
        this.f22644a = vVar;
        u8.d dVarE0 = oVar.f26756a.E0();
        this.f22645b = dVarE0;
        bVar.e(dVarE0);
        dVarE0.a(this);
    }

    public static int c(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // u8.a
    public final void a() {
        this.f22644a.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
    }
}
