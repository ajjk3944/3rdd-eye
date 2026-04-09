package s0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import r0.C5508e;
import r0.C5509f;

/* compiled from: BasicMeasure.java */
/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5543b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<C5508e> f45898a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final a f45899b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final C5509f f45900c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: s0.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public C5508e.b f45901a;

        /* renamed from: b, reason: collision with root package name */
        public C5508e.b f45902b;

        /* renamed from: c, reason: collision with root package name */
        public int f45903c;

        /* renamed from: d, reason: collision with root package name */
        public int f45904d;

        /* renamed from: e, reason: collision with root package name */
        public int f45905e;

        /* renamed from: f, reason: collision with root package name */
        public int f45906f;

        /* renamed from: g, reason: collision with root package name */
        public int f45907g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f45908h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public int f45909j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: s0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0526b {
    }

    public C5543b(C5509f c5509f) {
        this.f45900c = c5509f;
    }

    public final boolean a(int i, C5508e c5508e, InterfaceC0526b interfaceC0526b) {
        C5508e.b[] bVarArr = c5508e.f45535U;
        C5508e.b bVar = bVarArr[0];
        a aVar = this.f45899b;
        aVar.f45901a = bVar;
        aVar.f45902b = bVarArr[1];
        aVar.f45903c = c5508e.q();
        aVar.f45904d = c5508e.k();
        aVar.i = false;
        aVar.f45909j = i;
        C5508e.b bVar2 = aVar.f45901a;
        C5508e.b bVar3 = C5508e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f45902b == bVar3;
        boolean z12 = z10 && c5508e.f45539Y > 0.0f;
        boolean z13 = z11 && c5508e.f45539Y > 0.0f;
        int[] iArr = c5508e.f45576t;
        if (z12 && iArr[0] == 4) {
            aVar.f45901a = C5508e.b.FIXED;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f45902b = C5508e.b.FIXED;
        }
        ((ConstraintLayout.c) interfaceC0526b).b(c5508e, aVar);
        c5508e.O(aVar.f45905e);
        c5508e.L(aVar.f45906f);
        c5508e.f45519E = aVar.f45908h;
        c5508e.I(aVar.f45907g);
        aVar.f45909j = 0;
        return aVar.i;
    }

    public final void b(C5509f c5509f, int i, int i10, int i11) {
        int i12 = c5509f.f45548d0;
        int i13 = c5509f.f45550e0;
        c5509f.f45548d0 = 0;
        c5509f.f45550e0 = 0;
        c5509f.O(i10);
        c5509f.L(i11);
        if (i12 < 0) {
            c5509f.f45548d0 = 0;
        } else {
            c5509f.f45548d0 = i12;
        }
        if (i13 < 0) {
            c5509f.f45550e0 = 0;
        } else {
            c5509f.f45550e0 = i13;
        }
        C5509f c5509f2 = this.f45900c;
        c5509f2.f45599u0 = i;
        c5509f2.R();
    }

    public final void c(C5509f c5509f) {
        ArrayList<C5508e> arrayList = this.f45898a;
        arrayList.clear();
        int size = c5509f.f45667r0.size();
        for (int i = 0; i < size; i++) {
            C5508e c5508e = c5509f.f45667r0.get(i);
            C5508e.b[] bVarArr = c5508e.f45535U;
            C5508e.b bVar = bVarArr[0];
            C5508e.b bVar2 = C5508e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                arrayList.add(c5508e);
            }
        }
        c5509f.f45598t0.f45913b = true;
    }
}
