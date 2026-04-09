package o5;

import android.util.Base64;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f55442a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final String f55443b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f55444c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f55445d;

    static {
        String strEncodeToString = Base64.encodeToString(kotlin.text.t.z(v.f55441a.e()), 10);
        f55443b = strEncodeToString;
        f55444c = "firebase_session_" + strEncodeToString + "_data";
        f55445d = "firebase_session_" + strEncodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f55444c;
    }

    public final String b() {
        return f55445d;
    }
}
