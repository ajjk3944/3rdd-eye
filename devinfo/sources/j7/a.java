package j7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import f7.z;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f27471d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f27472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27473b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f27474c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f27473b = str;
        } else {
            this.f27473b = str.concat("/");
        }
        this.f27474c = map;
        if (callback instanceof View) {
            this.f27472a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f27472a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f27471d) {
            ((z) this.f27474c.get(str)).f23832f = bitmap;
        }
    }
}
