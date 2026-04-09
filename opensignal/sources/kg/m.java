package kg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import ir.f0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class m implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f14378a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Future f14379d;

    /* renamed from: g, reason: collision with root package name */
    public dd.r f14380g;

    public m(URL url) {
        this.f14378a = url;
    }

    public final Bitmap b() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f14378a;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrX = f0.X(new d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrX.length;
                Objects.toString(url);
            }
            if (bArrX.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length);
            if (bitmapDecodeByteArray != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Objects.toString(url);
                }
                return bitmapDecodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14379d.cancel(true);
    }
}
