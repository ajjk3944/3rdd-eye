package w1;

import H1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.n;
import com.google.android.gms.internal.ads.C0752Tp;
import n1.w;
import n1.z;
import o1.InterfaceC2753a;
import t2.q;
import y1.f;

/* loaded from: classes.dex */
public final class c implements z, w {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f23943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23944b;

    public c(Drawable drawable, int i) {
        this.f23944b = i;
        g.c(drawable, "Argument must not be null");
        this.f23943a = drawable;
    }

    @Override // n1.w
    public void a() {
        switch (this.f23944b) {
            case 1:
                ((f) ((y1.b) this.f23943a).f24213a.f2634b).f24240l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f23943a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof y1.b) {
                        ((f) ((y1.b) drawable).f24213a.f2634b).f24240l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // n1.z
    public final void b() {
        C0752Tp c0752Tp;
        C0752Tp c0752Tp2;
        C0752Tp c0752Tp3;
        switch (this.f23944b) {
            case 0:
                break;
            default:
                y1.b bVar = (y1.b) this.f23943a;
                bVar.stop();
                bVar.f24216d = true;
                f fVar = (f) bVar.f24213a.f2634b;
                n nVar = fVar.f24233d;
                fVar.f24232c.clear();
                Bitmap bitmap = fVar.f24240l;
                if (bitmap != null) {
                    fVar.f24234e.e(bitmap);
                    fVar.f24240l = null;
                }
                fVar.f24235f = false;
                y1.d dVar = fVar.i;
                if (dVar != null) {
                    nVar.k(dVar);
                    fVar.i = null;
                }
                y1.d dVar2 = fVar.f24239k;
                if (dVar2 != null) {
                    nVar.k(dVar2);
                    fVar.f24239k = null;
                }
                y1.d dVar3 = fVar.f24241m;
                if (dVar3 != null) {
                    nVar.k(dVar3);
                    fVar.f24241m = null;
                }
                k1.d dVar4 = fVar.f24230a;
                q qVar = dVar4.f21763c;
                dVar4.f21771l = null;
                byte[] bArr = dVar4.i;
                if (bArr != null && (c0752Tp3 = (C0752Tp) qVar.f23649c) != null) {
                    c0752Tp3.i(bArr);
                }
                int[] iArr = dVar4.f21769j;
                if (iArr != null && (c0752Tp2 = (C0752Tp) qVar.f23649c) != null) {
                    c0752Tp2.i(iArr);
                }
                Bitmap bitmap2 = dVar4.f21772m;
                if (bitmap2 != null) {
                    ((InterfaceC2753a) qVar.f23648b).e(bitmap2);
                }
                dVar4.f21772m = null;
                dVar4.f21764d = null;
                dVar4.f21778s = null;
                byte[] bArr2 = dVar4.f21765e;
                if (bArr2 != null && (c0752Tp = (C0752Tp) qVar.f23649c) != null) {
                    c0752Tp.i(bArr2);
                }
                fVar.f24238j = true;
                break;
        }
    }

    @Override // n1.z
    public final int c() {
        switch (this.f23944b) {
            case 0:
                Drawable drawable = this.f23943a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                f fVar = (f) ((y1.b) this.f23943a).f24213a.f2634b;
                k1.d dVar = fVar.f24230a;
                return (dVar.f21769j.length * 4) + dVar.f21764d.limit() + dVar.i.length + fVar.f24242n;
        }
    }

    @Override // n1.z
    public final Class e() {
        switch (this.f23944b) {
            case 0:
                return this.f23943a.getClass();
            default:
                return y1.b.class;
        }
    }

    @Override // n1.z
    public final Object get() {
        Drawable drawable = this.f23943a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void d() {
    }
}
