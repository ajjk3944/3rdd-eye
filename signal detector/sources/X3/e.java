package X3;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import o4.AbstractC2763b;
import q2.InterfaceC2831m0;
import u2.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4174b;

    public e(String str, int i) {
        this.f4173a = i;
        switch (i) {
            case 1:
                this.f4174b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
                break;
            default:
                this.f4174b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
                break;
        }
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e6) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e6);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC2763b.f(str, " : ", str2);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e6) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e6);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC2763b.f(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", f(this.f4174b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f4174b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        switch (this.f4173a) {
            case 0:
                if (Log.isLoggable("PlayCore", 4)) {
                    Log.i("PlayCore", e(this.f4174b, str, objArr));
                    break;
                }
                break;
            default:
                if (Log.isLoggable("PlayCore", 4)) {
                    Log.i("PlayCore", f(this.f4174b, str, objArr));
                    break;
                }
                break;
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f4174b, str, objArr));
        }
    }

    public String toString() {
        switch (this.f4173a) {
            case 2:
                return this.f4174b;
            default:
                return super.toString();
        }
    }

    public e(InterfaceC2831m0 interfaceC2831m0) {
        String strB;
        this.f4173a = 2;
        try {
            strB = interfaceC2831m0.b();
        } catch (RemoteException e6) {
            k.f("", e6);
            strB = null;
        }
        this.f4174b = strB;
    }
}
