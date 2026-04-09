package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final b f16397a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16398b;

    /* compiled from: ViewBoundsCheck.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f16399a;

        /* renamed from: b, reason: collision with root package name */
        public int f16400b;

        /* renamed from: c, reason: collision with root package name */
        public int f16401c;

        /* renamed from: d, reason: collision with root package name */
        public int f16402d;

        /* renamed from: e, reason: collision with root package name */
        public int f16403e;

        public final boolean a() {
            int i = this.f16399a;
            int i10 = 2;
            if ((i & 7) != 0) {
                int i11 = this.f16402d;
                int i12 = this.f16400b;
                if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i13 = this.f16402d;
                int i14 = this.f16401c;
                if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i15 = this.f16403e;
                int i16 = this.f16400b;
                if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i17 = this.f16403e;
                int i18 = this.f16401c;
                if (i17 > i18) {
                    i10 = 1;
                } else if (i17 != i18) {
                    i10 = 4;
                }
                if ((i & (i10 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i);

        int e(View view);
    }

    public H(b bVar) {
        this.f16397a = bVar;
        a aVar = new a();
        aVar.f16399a = 0;
        this.f16398b = aVar;
    }

    public final View a(int i, int i10, int i11, int i12) {
        b bVar = this.f16397a;
        int iB = bVar.b();
        int iC = bVar.c();
        int i13 = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View viewD = bVar.d(i);
            int iA = bVar.a(viewD);
            int iE = bVar.e(viewD);
            a aVar = this.f16398b;
            aVar.f16400b = iB;
            aVar.f16401c = iC;
            aVar.f16402d = iA;
            aVar.f16403e = iE;
            if (i11 != 0) {
                aVar.f16399a = i11;
                if (aVar.a()) {
                    return viewD;
                }
            }
            if (i12 != 0) {
                aVar.f16399a = i12;
                if (aVar.a()) {
                    view = viewD;
                }
            }
            i += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f16397a;
        int iB = bVar.b();
        int iC = bVar.c();
        int iA = bVar.a(view);
        int iE = bVar.e(view);
        a aVar = this.f16398b;
        aVar.f16400b = iB;
        aVar.f16401c = iC;
        aVar.f16402d = iA;
        aVar.f16403e = iE;
        aVar.f16399a = 24579;
        return aVar.a();
    }
}
