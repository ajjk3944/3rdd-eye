package Y2;

import K2.a;
import Y2.f;
import android.graphics.Bitmap;
import com.bumptech.glide.l;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends W2.c<c> {
    @Override // N2.u
    public final void a() {
        O2.g gVar;
        O2.g gVar2;
        O2.g gVar3;
        c cVar = (c) this.f13335b;
        cVar.stop();
        cVar.f13731e = true;
        f fVar = cVar.f13728b.f13737a;
        fVar.f13741c.clear();
        Bitmap bitmap = fVar.f13749l;
        if (bitmap != null) {
            fVar.f13743e.b(bitmap);
            fVar.f13749l = null;
        }
        fVar.f13744f = false;
        f.a aVar = fVar.i;
        l lVar = fVar.f13742d;
        if (aVar != null) {
            lVar.i(aVar);
            fVar.i = null;
        }
        f.a aVar2 = fVar.f13748k;
        if (aVar2 != null) {
            lVar.i(aVar2);
            fVar.f13748k = null;
        }
        f.a aVar3 = fVar.f13751n;
        if (aVar3 != null) {
            lVar.i(aVar3);
            fVar.f13751n = null;
        }
        K2.e eVar = fVar.f13739a;
        eVar.f3101l = null;
        byte[] bArr = eVar.i;
        a.InterfaceC0054a interfaceC0054a = eVar.f3093c;
        if (bArr != null && (gVar3 = ((b) interfaceC0054a).f13727b) != null) {
            gVar3.h(bArr);
        }
        int[] iArr = eVar.f3099j;
        if (iArr != null && (gVar2 = ((b) interfaceC0054a).f13727b) != null) {
            gVar2.h(iArr);
        }
        Bitmap bitmap2 = eVar.f3102m;
        if (bitmap2 != null) {
            ((b) interfaceC0054a).f13726a.b(bitmap2);
        }
        eVar.f3102m = null;
        eVar.f3094d = null;
        eVar.f3108s = null;
        byte[] bArr2 = eVar.f3095e;
        if (bArr2 != null && (gVar = ((b) interfaceC0054a).f13727b) != null) {
            gVar.h(bArr2);
        }
        fVar.f13747j = true;
    }

    @Override // N2.u
    public final Class<c> c() {
        return c.class;
    }

    @Override // N2.u
    public final int getSize() {
        f fVar = ((c) this.f13335b).f13728b.f13737a;
        K2.e eVar = fVar.f13739a;
        return (eVar.f3099j.length * 4) + eVar.f3094d.limit() + eVar.i.length + fVar.f13752o;
    }

    @Override // W2.c, N2.r
    public final void initialize() {
        ((c) this.f13335b).f13728b.f13737a.f13749l.prepareToDraw();
    }
}
