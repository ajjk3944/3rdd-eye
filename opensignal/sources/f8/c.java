package f8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import c8.e0;
import c8.g0;
import ir.f0;
import java.nio.ByteBuffer;
import l8.n;
import u7.p;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8678a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8679b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8680c;

    public /* synthetic */ c(Object obj, n nVar, int i10) {
        this.f8678a = i10;
        this.f8680c = obj;
        this.f8679b = nVar;
    }

    @Override // f8.g
    public final Object a(pq.c cVar) {
        int i10 = this.f8678a;
        boolean z10 = true;
        z10 = true;
        Object obj = this.f8680c;
        n nVar = this.f8679b;
        switch (i10) {
            case 0:
                return new d(new BitmapDrawable(nVar.f14948a.getResources(), (Bitmap) obj), false, c8.h.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    cv.g gVar = new cv.g();
                    gVar.write(byteBuffer);
                    byteBuffer.position(0);
                    return new m(new g0(gVar, new e0(nVar.f14948a, z10 ? 1 : 0), null), null, c8.h.MEMORY);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = q8.i.f20736a;
                if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof p)) {
                    z10 = false;
                }
                if (z10) {
                    bitmapDrawable = new BitmapDrawable(nVar.f14948a.getResources(), f0.j(bitmapDrawable, nVar.f14949b, nVar.f14951d, nVar.f14952e, nVar.f14953f));
                }
                return new d(bitmapDrawable, z10, c8.h.MEMORY);
        }
    }
}
