package h4;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24845a;

    /* renamed from: b, reason: collision with root package name */
    public final b f24846b;

    /* renamed from: c, reason: collision with root package name */
    public v3.b f24847c;

    /* renamed from: d, reason: collision with root package name */
    public v3.b f24848d;

    /* renamed from: e, reason: collision with root package name */
    public c f24849e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f24850f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f24851h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i4, int i10) {
        b bVar = new b();
        bVar.f24852a = -1;
        bVar.f24853b = -1;
        v3.b bVar2 = v3.b.f35792e;
        bVar.f24854c = bVar2;
        bVar.f24855d = false;
        bVar.f24856e = null;
        bVar.f24857f = 0.0f;
        bVar.g = 0.0f;
        bVar.f24858h = 1.0f;
        this.f24846b = bVar;
        this.f24847c = bVar2;
        this.f24848d = bVar2;
        this.f24849e = null;
        if (i4 != 1 && i4 != 2 && i4 != 4 && i4 != 8) {
            throw new IllegalArgumentException(u.r(i4, "Unexpected side: "));
        }
        this.f24845a = i4;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f24850f = colorDrawable;
        this.f24851h = 0;
        this.g = true;
        if (i10 != 0) {
            this.f24851h = i10;
            colorDrawable.setColor(i10);
            bVar.f24856e = colorDrawable;
            y4.a aVar = bVar.f24859i;
            if (aVar != null) {
                ((View) aVar.f37324b).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f10) {
        float f11 = f10 * 1.0f;
        b bVar = this.f24846b;
        if (bVar.f24858h != f11) {
            bVar.f24858h = f11;
            y4.a aVar = bVar.f24859i;
            if (aVar != null) {
                ((View) aVar.f37324b).setAlpha(f11);
            }
        }
    }

    public final void b(float f10) {
        float f11 = f10 * 1.0f;
        b bVar = this.f24846b;
        int i4 = this.f24845a;
        if (i4 == 1) {
            float f12 = (-(1.0f - f11)) * bVar.f24852a;
            if (bVar.f24857f != f12) {
                bVar.f24857f = f12;
                y4.a aVar = bVar.f24859i;
                if (aVar != null) {
                    ((View) aVar.f37324b).setTranslationX(f12);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 2) {
            float f13 = (-(1.0f - f11)) * bVar.f24853b;
            if (bVar.g != f13) {
                bVar.g = f13;
                y4.a aVar2 = bVar.f24859i;
                if (aVar2 != null) {
                    ((View) aVar2.f37324b).setTranslationY(f13);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 4) {
            float f14 = (1.0f - f11) * bVar.f24852a;
            if (bVar.f24857f != f14) {
                bVar.f24857f = f14;
                y4.a aVar3 = bVar.f24859i;
                if (aVar3 != null) {
                    ((View) aVar3.f37324b).setTranslationX(f14);
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 8) {
            return;
        }
        float f15 = (1.0f - f11) * bVar.f24853b;
        if (bVar.g != f15) {
            bVar.g = f15;
            y4.a aVar4 = bVar.f24859i;
            if (aVar4 != null) {
                ((View) aVar4.f37324b).setTranslationY(f15);
            }
        }
    }
}
