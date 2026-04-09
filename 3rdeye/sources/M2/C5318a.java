package m2;

import B0.f;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import u2.C5624c;

/* compiled from: FontAssetManager.java */
/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5318a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f44052d;

    /* renamed from: a, reason: collision with root package name */
    public final f f44049a = new f(5);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f44050b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f44051c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public String f44053e = ".ttf";

    public C5318a(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f44052d = ((View) callback).getContext().getAssets();
        } else {
            C5624c.b("LottieDrawable must be inside of a view for images to work.");
            this.f44052d = null;
        }
    }
}
