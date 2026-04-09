package B2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: B2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0044a {
        Bitmap a(int i10, int i11, Bitmap.Config config);

        int[] b(int i10);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i10);

        void f(int[] iArr);
    }

    ByteBuffer b();

    void c();

    void clear();

    int d();

    int e();

    void f(Bitmap.Config config);

    void g();

    Bitmap getNextFrame();

    int h();

    int i();
}
