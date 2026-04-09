package s3;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f61329a;

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f61330b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f61331c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f61329a = uri;
        f61330b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
