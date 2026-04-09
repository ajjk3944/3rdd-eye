package androidx.databinding;

import androidx.appcompat.app.z;
import androidx.databinding.c;
import androidx.databinding.i;

/* loaded from: classes.dex */
public class h extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final r0.h f2885f = new r0.h(10);

    /* renamed from: g, reason: collision with root package name */
    public static final c.a f2886g = new a();

    public class a extends c.a {
        @Override // androidx.databinding.c.a
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i10, Object obj3) {
            z.a(obj);
            b(null, (i) obj2, i10, (b) obj3);
        }

        public void b(i.a aVar, i iVar, int i10, b bVar) {
            if (i10 == 1) {
                int i11 = bVar.f2887a;
                throw null;
            }
            if (i10 == 2) {
                int i12 = bVar.f2887a;
                throw null;
            }
            if (i10 == 3) {
                int i13 = bVar.f2887a;
                throw null;
            }
            if (i10 != 4) {
                throw null;
            }
            int i14 = bVar.f2887a;
            throw null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2887a;

        /* renamed from: b, reason: collision with root package name */
        public int f2888b;

        /* renamed from: c, reason: collision with root package name */
        public int f2889c;
    }

    public h() {
        super(f2886g);
    }

    public static b i(int i10, int i11, int i12) {
        b bVar = (b) f2885f.b();
        if (bVar == null) {
            bVar = new b();
        }
        bVar.f2887a = i10;
        bVar.f2889c = i11;
        bVar.f2888b = i12;
        return bVar;
    }

    @Override // androidx.databinding.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized void c(i iVar, int i10, b bVar) {
        super.c(iVar, i10, bVar);
        if (bVar != null) {
            f2885f.a(bVar);
        }
    }

    public void k(i iVar, int i10, int i11) {
        c(iVar, 1, i(i10, 0, i11));
    }

    public void l(i iVar, int i10, int i11) {
        c(iVar, 2, i(i10, 0, i11));
    }

    public void m(i iVar, int i10, int i11) {
        c(iVar, 4, i(i10, 0, i11));
    }
}
