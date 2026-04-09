package U2;

import U2.m;
import U2.s;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public final class y implements L2.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f12458a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.g f12459b;

    /* compiled from: StreamBitmapDecoder.java */
    public static class a implements m.b {

        /* renamed from: a, reason: collision with root package name */
        public final w f12460a;

        /* renamed from: b, reason: collision with root package name */
        public final h3.d f12461b;

        public a(w wVar, h3.d dVar) {
            this.f12460a = wVar;
            this.f12461b = dVar;
        }

        @Override // U2.m.b
        public final void a(O2.b bVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f12461b.f38201c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bVar.b(bitmap);
                throw iOException;
            }
        }

        @Override // U2.m.b
        public final void b() {
            w wVar = this.f12460a;
            synchronized (wVar) {
                wVar.f12452d = wVar.f12450b.length;
            }
        }
    }

    public y(m mVar, O2.g gVar) {
        this.f12458a = mVar;
        this.f12459b = gVar;
    }

    @Override // L2.j
    public final boolean a(InputStream inputStream, L2.h hVar) throws IOException {
        this.f12458a.getClass();
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(InputStream inputStream, int i, int i10, L2.h hVar) throws IOException {
        boolean z10;
        w wVar;
        h3.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof w) {
            wVar = (w) inputStream2;
            z10 = false;
        } else {
            z10 = true;
            wVar = new w(inputStream2, this.f12459b);
        }
        ArrayDeque arrayDeque = h3.d.f38199d;
        synchronized (arrayDeque) {
            dVar = (h3.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new h3.d();
        }
        h3.d dVar2 = dVar;
        dVar2.f38200b = wVar;
        h3.j jVar = new h3.j(dVar2);
        a aVar = new a(wVar, dVar2);
        try {
            m mVar = this.f12458a;
            e eVarA = mVar.a(new s.b(jVar, mVar.f12423d, mVar.f12422c), i, i10, hVar, aVar);
            dVar2.release();
            if (z10) {
                wVar.release();
            }
            return eVarA;
        } finally {
        }
    }
}
