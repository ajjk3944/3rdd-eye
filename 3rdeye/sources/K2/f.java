package k2;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5278k;
import n2.C5351e;
import p2.C5441a;
import p2.s;
import u2.C5628g;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public final class f implements m, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f43185b;

    /* renamed from: c, reason: collision with root package name */
    public final z f43186c;

    /* renamed from: d, reason: collision with root package name */
    public final C5278k f43187d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5268a<?, PointF> f43188e;

    /* renamed from: f, reason: collision with root package name */
    public final C5441a f43189f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43191h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f43184a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final C5211b f43190g = new C5211b();

    public f(z zVar, q2.b bVar, C5441a c5441a) {
        this.f43185b = c5441a.f45014a;
        this.f43186c = zVar;
        AbstractC5268a<?, ?> abstractC5268aA = c5441a.f45016c.a();
        this.f43187d = (C5278k) abstractC5268aA;
        AbstractC5268a<PointF, PointF> abstractC5268aA2 = c5441a.f45015b.a();
        this.f43188e = abstractC5268aA2;
        this.f43189f = c5441a;
        bVar.e(abstractC5268aA);
        bVar.e(abstractC5268aA2);
        abstractC5268aA.a(this);
        abstractC5268aA2.a(this);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43191h = false;
        this.f43186c.invalidateSelf();
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC5212c interfaceC5212c = (InterfaceC5212c) arrayList.get(i);
            if (interfaceC5212c instanceof u) {
                u uVar = (u) interfaceC5212c;
                if (uVar.f43295c == s.a.SIMULTANEOUSLY) {
                    this.f43190g.f43173a.add(uVar);
                    uVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        if (colorFilter == InterfaceC4433F.f38305f) {
            this.f43187d.k(fVar);
        } else if (colorFilter == InterfaceC4433F.i) {
            this.f43188e.k(fVar);
        }
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43185b;
    }

    @Override // k2.m
    public final Path getPath() {
        boolean z10 = this.f43191h;
        Path path = this.f43184a;
        if (z10) {
            return path;
        }
        path.reset();
        C5441a c5441a = this.f43189f;
        if (c5441a.f45018e) {
            this.f43191h = true;
            return path;
        }
        PointF pointFF = this.f43187d.f();
        float f10 = pointFF.x / 2.0f;
        float f11 = pointFF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (c5441a.f45017d) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFF2 = this.f43188e.f();
        path.offset(pointFF2.x, pointFF2.y);
        path.close();
        this.f43190g.a(path);
        this.f43191h = true;
        return path;
    }
}
