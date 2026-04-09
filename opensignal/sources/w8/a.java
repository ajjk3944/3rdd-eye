package w8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f24381d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f24382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24383b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f24384c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f24383b = str;
        } else {
            this.f24383b = str.concat("/");
        }
        this.f24384c = map;
        if (callback instanceof View) {
            this.f24382a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f24382a = null;
        }
    }
}
