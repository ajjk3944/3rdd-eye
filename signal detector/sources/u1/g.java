package u1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23737a;

    /* renamed from: b, reason: collision with root package name */
    public final C2948c f23738b;

    public g(int i) {
        this.f23737a = i;
        switch (i) {
            case 1:
                this.f23738b = new C2948c();
                break;
            default:
                this.f23738b = new C2948c();
                break;
        }
    }

    @Override // l1.j
    public final /* bridge */ /* synthetic */ boolean a(Object obj, l1.h hVar) {
        switch (this.f23737a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // l1.j
    public final n1.z b(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23737a) {
            case 0:
                return this.f23738b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i3, hVar);
            default:
                return this.f23738b.c(ImageDecoder.createSource(H1.b.b((InputStream) obj)), i, i3, hVar);
        }
    }
}
