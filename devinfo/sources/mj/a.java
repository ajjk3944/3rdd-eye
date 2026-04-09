package mj;

import android.os.Environment;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f29398a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f29399b;

    static {
        String absolutePath = Environment.getExternalStoragePublicDirectory("android").getAbsolutePath();
        String absolutePath2 = Environment.getExternalStoragePublicDirectory("dcim").getAbsolutePath();
        String absolutePath3 = Environment.getExternalStoragePublicDirectory("pictures").getAbsolutePath();
        f29398a = Arrays.asList(absolutePath, absolutePath2, absolutePath3, Environment.getExternalStoragePublicDirectory("download").getAbsolutePath(), Environment.getExternalStoragePublicDirectory("downloads").getAbsolutePath(), Environment.getExternalStoragePublicDirectory("documents").getAbsolutePath());
        f29399b = Arrays.asList(absolutePath2, absolutePath3);
    }
}
