package u1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import b4.C0344i;
import java.io.IOException;
import o1.InterfaceC2753a;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2948c implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23730a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2753a f23731b;

    public C2948c() {
        this.f23730a = 0;
        this.f23731b = new C0344i(26);
    }

    @Override // l1.j
    public final /* bridge */ /* synthetic */ boolean a(Object obj, l1.h hVar) {
        switch (this.f23730a) {
            case 0:
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.w(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // l1.j
    public final n1.z b(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23730a) {
            case 0:
                return c(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.g(obj), i, i3, hVar);
            default:
                return C2949d.d(((k1.d) obj).b(), this.f23731b);
        }
    }

    public C2949d c(ImageDecoder.Source source, int i, int i3, l1.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new t1.b(i, i3, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i3 + "]");
        }
        return new C2949d(bitmapDecodeBitmap, (C0344i) this.f23731b);
    }

    public C2948c(InterfaceC2753a interfaceC2753a) {
        this.f23730a = 1;
        this.f23731b = interfaceC2753a;
    }
}
