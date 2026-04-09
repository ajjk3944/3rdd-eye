package q8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import l8.t;
import ou.s;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f20736a;

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f20737b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f20738c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20736a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f20737b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f20738c = new s((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || tt.l.D0(str)) {
            return null;
        }
        String strX0 = tt.l.X0(tt.l.X0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(tt.l.T0('.', tt.l.T0('/', strX0, strX0), ""));
    }

    public static final t c(View view) {
        t tVar;
        Object tag = view.getTag(b8.a.coil_request_manager);
        t tVar2 = tag instanceof t ? (t) tag : null;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(b8.a.coil_request_manager);
                tVar = tag2 instanceof t ? (t) tag2 : null;
                if (tVar == null) {
                    tVar = new t(view);
                    view.addOnAttachStateChangeListener(tVar);
                    view.setTag(b8.a.coil_request_manager, tVar);
                }
            } finally {
            }
        }
        return tVar;
    }

    public static final boolean d(Uri uri) {
        return br.l.a(uri.getScheme(), "file") && br.l.a((String) mq.o.t0(uri.getPathSegments()), "android_asset");
    }

    public static final int e(a.a aVar, m8.g gVar) {
        if (aVar instanceof m8.a) {
            return ((m8.a) aVar).f16320f;
        }
        int i10 = h.f20735b[gVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new bf.n();
    }
}
