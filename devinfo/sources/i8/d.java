package i8;

import a8.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.p;
import t8.f;
import yb.i;
import z7.v;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements y, v {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f25937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25938b;

    public d(Drawable drawable, int i4) {
        this.f25938b = i4;
        f.c(drawable, "Argument must not be null");
        this.f25937a = drawable;
    }

    @Override // z7.y
    public final void a() {
        g gVar;
        g gVar2;
        g gVar3;
        switch (this.f25938b) {
            case 0:
                break;
            default:
                k8.b bVar = (k8.b) this.f25937a;
                bVar.stop();
                bVar.f28078d = true;
                k8.f fVar = (k8.f) bVar.f28075a.f27975b;
                p pVar = fVar.f28093d;
                fVar.f28092c.clear();
                Bitmap bitmap = fVar.f28099l;
                if (bitmap != null) {
                    fVar.f28094e.d(bitmap);
                    fVar.f28099l = null;
                }
                fVar.f28095f = false;
                k8.d dVar = fVar.f28097i;
                if (dVar != null) {
                    pVar.j(dVar);
                    fVar.f28097i = null;
                }
                k8.d dVar2 = fVar.f28098k;
                if (dVar2 != null) {
                    pVar.j(dVar2);
                    fVar.f28098k = null;
                }
                k8.d dVar3 = fVar.f28100m;
                if (dVar3 != null) {
                    pVar.j(dVar3);
                    fVar.f28100m = null;
                }
                w7.d dVar4 = fVar.f28090a;
                i iVar = dVar4.f36522c;
                dVar4.f36529l = null;
                byte[] bArr = dVar4.f36527i;
                if (bArr != null && (gVar3 = (g) iVar.f37517c) != null) {
                    gVar3.i(bArr);
                }
                int[] iArr = dVar4.j;
                if (iArr != null && (gVar2 = (g) iVar.f37517c) != null) {
                    gVar2.i(iArr);
                }
                Bitmap bitmap2 = dVar4.f36530m;
                if (bitmap2 != null) {
                    ((a8.b) iVar.f37516b).d(bitmap2);
                }
                dVar4.f36530m = null;
                dVar4.f36523d = null;
                dVar4.f36536s = null;
                byte[] bArr2 = dVar4.f36524e;
                if (bArr2 != null && (gVar = (g) iVar.f37517c) != null) {
                    gVar.i(bArr2);
                }
                fVar.j = true;
                break;
        }
    }

    @Override // z7.y
    public final Class b() {
        switch (this.f25938b) {
            case 0:
                return this.f25937a.getClass();
            default:
                return k8.b.class;
        }
    }

    @Override // z7.y
    public final Object get() {
        Drawable drawable = this.f25937a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // z7.y
    public final int getSize() {
        switch (this.f25938b) {
            case 0:
                Drawable drawable = this.f25937a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                k8.f fVar = (k8.f) ((k8.b) this.f25937a).f28075a.f27975b;
                w7.d dVar = fVar.f28090a;
                return (dVar.j.length * 4) + dVar.f36523d.limit() + dVar.f36527i.length + fVar.f28101n;
        }
    }

    @Override // z7.v
    public void initialize() {
        switch (this.f25938b) {
            case 1:
                ((k8.f) ((k8.b) this.f25937a).f28075a.f27975b).f28099l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f25937a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof k8.b) {
                        ((k8.f) ((k8.b) drawable).f28075a.f27975b).f28099l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
