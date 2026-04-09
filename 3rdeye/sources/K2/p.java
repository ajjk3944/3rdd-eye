package k2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import l2.AbstractC5268a;
import l2.C5271d;
import n2.C5351e;
import o2.C5417h;
import u2.C5628g;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public final class p implements InterfaceC5214e, m, j, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f43269a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f43270b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final z f43271c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.b f43272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f43273e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f43274f;

    /* renamed from: g, reason: collision with root package name */
    public final C5271d f43275g;

    /* renamed from: h, reason: collision with root package name */
    public final C5271d f43276h;
    public final l2.p i;

    /* renamed from: j, reason: collision with root package name */
    public C5213d f43277j;

    public p(z zVar, q2.b bVar, p2.l lVar) {
        this.f43271c = zVar;
        this.f43272d = bVar;
        this.f43273e = lVar.f45063a;
        this.f43274f = lVar.f45067e;
        C5271d c5271dA = lVar.f45064b.a();
        this.f43275g = c5271dA;
        bVar.e(c5271dA);
        c5271dA.a(this);
        C5271d c5271dA2 = lVar.f45065c.a();
        this.f43276h = c5271dA2;
        bVar.e(c5271dA2);
        c5271dA2.a(this);
        C5417h c5417h = lVar.f45066d;
        c5417h.getClass();
        l2.p pVar = new l2.p(c5417h);
        this.i = pVar;
        pVar.a(bVar);
        pVar.b(this);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43271c.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        this.f43277j.b(list, list2);
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        if (this.i.c(colorFilter, fVar)) {
            return;
        }
        if (colorFilter == InterfaceC4433F.f38314p) {
            this.f43275g.k(fVar);
        } else if (colorFilter == InterfaceC4433F.f38315q) {
            this.f43276h.k(fVar);
        }
    }

    @Override // k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f43277j.d(rectF, matrix, z10);
    }

    @Override // k2.j
    public final void e(ListIterator<InterfaceC5212c> listIterator) {
        if (this.f43277j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f43277j = new C5213d(this.f43271c, this.f43272d, "Repeater", this.f43274f, arrayList, null);
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
        for (int i10 = 0; i10 < this.f43277j.f43181h.size(); i10++) {
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) this.f43277j.f43181h.get(i10);
            if (interfaceC5212c instanceof k) {
                C5628g.f(c5351e, i, arrayList, c5351e2, (k) interfaceC5212c);
            }
        }
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43273e;
    }

    @Override // k2.m
    public final Path getPath() {
        Path path = this.f43277j.getPath();
        Path path2 = this.f43270b;
        path2.reset();
        float fFloatValue = this.f43275g.f().floatValue();
        float fFloatValue2 = this.f43276h.f().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f43269a;
            matrix.set(this.i.f(i + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // k2.InterfaceC5214e
    public final void h(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f43275g.f().floatValue();
        float fFloatValue2 = this.f43276h.f().floatValue();
        l2.p pVar = this.i;
        float fFloatValue3 = pVar.f43745m.f().floatValue() / 100.0f;
        float fFloatValue4 = pVar.f43746n.f().floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix2 = this.f43269a;
            matrix2.set(matrix);
            float f10 = i10;
            matrix2.preConcat(pVar.f(f10 + fFloatValue2));
            this.f43277j.h(canvas, matrix2, (int) (C5628g.e(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i));
        }
    }
}
