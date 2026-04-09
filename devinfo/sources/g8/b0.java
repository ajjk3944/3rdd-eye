package g8;

import android.graphics.Bitmap;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 implements z7.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24555a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24556b;

    public b0(byte[] bArr) {
        t8.f.c(bArr, "Argument must not be null");
        this.f24556b = bArr;
    }

    @Override // z7.y
    public final void a() {
        int i4 = this.f24555a;
    }

    @Override // z7.y
    public final Class b() {
        switch (this.f24555a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f24556b).getClass();
        }
    }

    @Override // z7.y
    public final Object get() {
        switch (this.f24555a) {
            case 0:
                return (Bitmap) this.f24556b;
            case 1:
                return (byte[]) this.f24556b;
            default:
                return (File) this.f24556b;
        }
    }

    @Override // z7.y
    public final int getSize() {
        switch (this.f24555a) {
            case 0:
                return t8.m.c((Bitmap) this.f24556b);
            case 1:
                return ((byte[]) this.f24556b).length;
            default:
                return 1;
        }
    }

    public b0(File file) {
        t8.f.c(file, "Argument must not be null");
        this.f24556b = file;
    }

    public b0(Bitmap bitmap) {
        this.f24556b = bitmap;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
