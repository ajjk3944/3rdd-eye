package e8;

import android.os.Environment;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20990a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f20991b;

    /* renamed from: c, reason: collision with root package name */
    public static String f20992c;

    /* renamed from: d, reason: collision with root package name */
    public static String f20993d;

    static {
        String str = Environment.getExternalStorageDirectory() + "/WiFiHackerDetector/";
        f20990a = str;
        f20991b = str + "log/";
        f20992c = "com.closeapps.closeallrunningapps.closeapp";
        f20993d = "com.duplicatephoto.duplicatephotoremover.similarphoto";
    }
}
