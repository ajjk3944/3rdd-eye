package k2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import i2.C4448h;
import i2.z;
import j2.C5167a;
import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import n2.C5351e;
import n2.InterfaceC5352f;
import o2.C5417h;
import p2.InterfaceC5442b;
import u2.C5629h;

/* compiled from: ContentGroup.java */
/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5213d implements InterfaceC5214e, m, AbstractC5268a.InterfaceC0489a, InterfaceC5352f {

    /* renamed from: a, reason: collision with root package name */
    public final C5167a f43174a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f43175b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f43176c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f43177d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f43178e;

    /* renamed from: f, reason: collision with root package name */
    public final String f43179f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43180g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f43181h;
    public final z i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f43182j;

    /* renamed from: k, reason: collision with root package name */
    public final l2.p f43183k;

    public C5213d(z zVar, q2.b bVar, p2.p pVar, C4448h c4448h) {
        C5417h c5417h;
        String str = pVar.f45078a;
        List<InterfaceC5442b> list = pVar.f45079b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC5212c interfaceC5212cA = list.get(i10).a(zVar, c4448h, bVar);
            if (interfaceC5212cA != null) {
                arrayList.add(interfaceC5212cA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c5417h = null;
                break;
            }
            InterfaceC5442b interfaceC5442b = list.get(i);
            if (interfaceC5442b instanceof C5417h) {
                c5417h = (C5417h) interfaceC5442b;
                break;
            }
            i++;
        }
        this(zVar, bVar, str, pVar.f45080c, arrayList, c5417h);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        int size = list.size();
        ArrayList arrayList = this.f43181h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(size2);
            interfaceC5212c.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC5212c);
        }
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        l2.p pVar = this.f43183k;
        if (pVar != null) {
            pVar.c(colorFilter, fVar);
        }
    }

    @Override // k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f43176c;
        matrix2.set(matrix);
        l2.p pVar = this.f43183k;
        if (pVar != null) {
            matrix2.preConcat(pVar.e());
        }
        RectF rectF2 = this.f43178e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f43181h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(size);
            if (interfaceC5212c instanceof InterfaceC5214e) {
                ((InterfaceC5214e) interfaceC5212c).d(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public final List<m> e() {
        if (this.f43182j == null) {
            this.f43182j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f43181h;
                if (i >= arrayList.size()) {
                    break;
                }
                InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(i);
                if (interfaceC5212c instanceof m) {
                    this.f43182j.add((m) interfaceC5212c);
                }
                i++;
            }
        }
        return this.f43182j;
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        String str = this.f43179f;
        if (!c5351e.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            C5351e c5351e3 = new C5351e(c5351e2);
            c5351e3.f44270a.add(str);
            if (c5351e.a(i, str)) {
                C5351e c5351e4 = new C5351e(c5351e3);
                c5351e4.f44271b = this;
                arrayList.add(c5351e4);
            }
            c5351e2 = c5351e3;
        }
        if (!c5351e.d(i, str)) {
            return;
        }
        int iB = c5351e.b(i, str) + i;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f43181h;
            if (i10 >= arrayList2.size()) {
                return;
            }
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList2.get(i10);
            if (interfaceC5212c instanceof InterfaceC5352f) {
                ((InterfaceC5352f) interfaceC5212c).g(c5351e, iB, arrayList, c5351e2);
            }
            i10++;
        }
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        throw null;
    }

    @Override // k2.m
    public final Path getPath() {
        Matrix matrix = this.f43176c;
        matrix.reset();
        l2.p pVar = this.f43183k;
        if (pVar != null) {
            matrix.set(pVar.e());
        }
        Path path = this.f43177d;
        path.reset();
        if (!this.f43180g) {
            ArrayList arrayList = this.f43181h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(size);
                if (interfaceC5212c instanceof m) {
                    path.addPath(((m) interfaceC5212c).getPath(), matrix);
                }
            }
        }
        return path;
    }

    @Override // k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.f43180g) {
            return;
        }
        Matrix matrix2 = this.f43176c;
        matrix2.set(matrix);
        l2.p pVar = this.f43183k;
        if (pVar != null) {
            matrix2.preConcat(pVar.e());
            i = (int) (((((pVar.f43742j == null ? 100 : r9.f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z10 = this.i.f38441u;
        ArrayList arrayList = this.f43181h;
        boolean z11 = false;
        if (z10) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i10) instanceof InterfaceC5214e) || (i11 = i11 + 1) < 2) {
                    i10++;
                } else if (i != 255) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            RectF rectF = this.f43175b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix2, true);
            C5167a c5167a = this.f43174a;
            c5167a.setAlpha(i);
            C5629h.f(canvas, rectF, c5167a);
        }
        if (z11) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC5214e) {
                ((InterfaceC5214e) obj).h(canvas, matrix2, i);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    public C5213d(z zVar, q2.b bVar, String str, boolean z10, ArrayList arrayList, C5417h c5417h) {
        this.f43174a = new C5167a();
        this.f43175b = new RectF();
        this.f43176c = new Matrix();
        this.f43177d = new Path();
        this.f43178e = new RectF();
        this.f43179f = str;
        this.i = zVar;
        this.f43180g = z10;
        this.f43181h = arrayList;
        if (c5417h != null) {
            l2.p pVar = new l2.p(c5417h);
            this.f43183k = pVar;
            pVar.a(bVar);
            pVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(size);
            if (interfaceC5212c instanceof j) {
                arrayList2.add((j) interfaceC5212c);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
