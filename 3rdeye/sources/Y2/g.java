package Y2;

import L2.j;
import N2.u;
import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes.dex */
public final class g implements j<K2.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final O2.b f13760a;

    public g(O2.b bVar) {
        this.f13760a = bVar;
    }

    @Override // L2.j
    public final /* bridge */ /* synthetic */ boolean a(K2.a aVar, L2.h hVar) throws IOException {
        return true;
    }

    @Override // L2.j
    public final u<Bitmap> b(K2.a aVar, int i, int i10, L2.h hVar) throws IOException {
        return U2.e.b(this.f13760a, aVar.a());
    }
}
