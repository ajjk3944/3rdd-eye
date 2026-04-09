package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final org.tensorflow.lite.a f57155a;

    /* renamed from: b, reason: collision with root package name */
    private c f57156b;

    public e() {
        this(org.tensorflow.lite.a.UINT8);
    }

    public static e a(e eVar, org.tensorflow.lite.a aVar) {
        e eVar2 = new e(aVar);
        eVar2.f57156b = eVar.f57156b.clone();
        return eVar2;
    }

    public static e b(Bitmap bitmap) {
        e eVar = new e();
        eVar.j(bitmap);
        return eVar;
    }

    public ByteBuffer c() {
        return h().g();
    }

    public b d() {
        c cVar = this.f57156b;
        if (cVar != null) {
            return cVar.c();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public org.tensorflow.lite.a e() {
        return this.f57155a;
    }

    public int f() {
        c cVar = this.f57156b;
        if (cVar != null) {
            return cVar.getHeight();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public Image g() {
        c cVar = this.f57156b;
        if (cVar != null) {
            return cVar.b();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public Jj.a h() {
        c cVar = this.f57156b;
        if (cVar != null) {
            return cVar.a(this.f57155a);
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public int i() {
        c cVar = this.f57156b;
        if (cVar != null) {
            return cVar.getWidth();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public void j(Bitmap bitmap) {
        this.f57156b = a.e(bitmap);
    }

    public e(org.tensorflow.lite.a aVar) {
        this.f57156b = null;
        Ij.a.b(aVar == org.tensorflow.lite.a.UINT8 || aVar == org.tensorflow.lite.a.FLOAT32, "Illegal data type for TensorImage: Only FLOAT32 and UINT8 are accepted");
        this.f57155a = aVar;
    }
}
