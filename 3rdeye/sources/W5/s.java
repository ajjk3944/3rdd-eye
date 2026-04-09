package w5;

import N7.C1154e9;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.google.android.gms.common.util.ProcessUtils;
import y9.C5819a;

/* compiled from: SessionDataStoreConfigs.kt */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f47441a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f47442b;

    static {
        String myProcessName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            myProcessName = Process.myProcessName();
            kotlin.jvm.internal.l.e(myProcessName, "myProcessName()");
        } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        byte[] bytes = myProcessName.getBytes(C5819a.f48359b);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f47441a = C1154e9.i("firebase_session_", strEncodeToString, "_data");
        f47442b = C1154e9.i("firebase_session_", strEncodeToString, "_settings");
    }
}
