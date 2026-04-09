package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Log;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class er3 implements cs, iq3, bb4 {
    public static final er3 h;
    public static final er3 i;
    public static final er3 j;
    public static final er3 k;
    public static final er3 l;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new er3("ENABLED", i2);
        i = new er3("DISABLED", i2);
        j = new er3("DESTROYED", i2);
        int i3 = 1;
        k = new er3("TINK", i3);
        l = new er3("NO_PREFIX", i3);
    }

    public /* synthetic */ er3(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = ex0.m(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return ex0.l(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            h(this.g, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            h(this.g, str, objArr);
        }
    }

    @Override // defpackage.bb4
    public /* synthetic */ void d(JsonWriter jsonWriter) throws IOException {
        Object obj = wb4.b;
        jsonWriter.name("params").beginObject();
        String str = this.g;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.g, str, objArr));
        }
    }

    public void f(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.g, str, objArr), remoteException);
        }
    }

    @Override // defpackage.cs
    public boolean g(CharSequence charSequence, int i2, int i3, q31 q31Var) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.g)) {
            return true;
        }
        q31Var.c = (q31Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        hg4.C.h.d(this.g, th);
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g;
            case 1:
                return this.g;
            default:
                return super.toString();
        }
    }

    public er3(String str) {
        this.f = 4;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        ex0.o(sb, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb.append("] ");
        this.g = sb.toString().concat(str);
    }

    @Override // defpackage.cs
    public Object b() {
        return this;
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
    }
}
