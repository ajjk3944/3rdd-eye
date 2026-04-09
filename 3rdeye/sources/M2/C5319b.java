package m2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import i2.C4430C;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5319b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f44054d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f44055a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44056b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, C4430C> f44057c;

    public C5319b(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f44056b = str;
        } else {
            this.f44056b = str.concat("/");
        }
        this.f44057c = map;
        if (callback instanceof View) {
            this.f44055a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f44055a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f44054d) {
            this.f44057c.get(str).f38288f = bitmap;
        }
    }
}
