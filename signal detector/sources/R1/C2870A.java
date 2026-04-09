package r1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l1.InterfaceC2636b;

/* renamed from: r1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2870A implements s, InterfaceC2636b {

    /* renamed from: b, reason: collision with root package name */
    public static final C2870A f23325b = new C2870A(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23326a;

    public /* synthetic */ C2870A(int i) {
        this.f23326a = i;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f23326a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // r1.s
    public r d(x xVar) {
        switch (this.f23326a) {
            case 0:
                return B.f23327b;
            case 2:
                return new C2873c(0, new C2870A(1));
            case 4:
                return new C2873c(0, new C2870A(3));
            case 6:
                return new B(1);
            case 11:
                return new z(xVar.c(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new z(xVar.c(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new z(xVar.c(Uri.class, InputStream.class), 0);
            default:
                return new E(xVar.c(h.class, InputStream.class));
        }
    }

    @Override // l1.InterfaceC2636b
    public boolean l(Object obj, File file, l1.h hVar) throws Throwable {
        try {
            H1.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e6);
            return false;
        }
    }
}
