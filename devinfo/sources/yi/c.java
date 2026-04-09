package yi;

import android.os.Environment;
import java.io.File;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37626a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f37627b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f37628c;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        k.d(path, "getPath(...)");
        f37626a = path;
        f37627b = new File(path, "Android/data").getPath();
        f37628c = new File(path, "Android/obb").getPath();
    }
}
