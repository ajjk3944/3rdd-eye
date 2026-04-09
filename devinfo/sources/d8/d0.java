package d8;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements w, x7.b {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f22003b = new d0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22004a;

    public /* synthetic */ d0(int i4) {
        this.f22004a = i4;
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
        switch (this.f22004a) {
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

    @Override // x7.b
    public boolean g(Object obj, File file, x7.h hVar) throws Throwable {
        try {
            t8.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e2);
            return false;
        }
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        switch (this.f22004a) {
            case 0:
                return e0.f22009b;
            case 2:
                return new c(0, new d0(1));
            case 4:
                return new c(0, new d0(3));
            case 6:
                return new e0(1);
            case 11:
                return new c0(b0Var.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new c0(b0Var.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new c0(b0Var.b(Uri.class, InputStream.class), 0);
            default:
                return new h0(b0Var.b(l.class, InputStream.class));
        }
    }
}
