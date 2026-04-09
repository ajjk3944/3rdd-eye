package B2;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import f0.p;
import f0.v;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import o4.AbstractC2763b;
import u2.g;
import u2.h;

/* loaded from: classes.dex */
public final class a implements p, g {

    /* renamed from: c, reason: collision with root package name */
    public static a f519c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* renamed from: b, reason: collision with root package name */
    public String f521b;

    public /* synthetic */ a(String str, int i) {
        this.f520a = i;
        this.f521b = str;
    }

    public static String g(String str, String str2, Object... objArr) {
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

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f521b).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // f0.p
    public boolean c(CharSequence charSequence, int i, int i3, v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i3), this.f521b)) {
            return true;
        }
        vVar.f20025c = (vVar.f20025c & 3) | 4;
        return false;
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", g(this.f521b, str, objArr));
        }
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", g(this.f521b, str, objArr), remoteException);
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", g(this.f521b, str, objArr));
        }
    }

    @Override // u2.g
    public /* synthetic */ void j(JsonWriter jsonWriter) throws IOException {
        Object obj = h.f23803b;
        jsonWriter.name("params").beginObject();
        String str = this.f521b;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f520a) {
            case 1:
                return "<" + this.f521b + '>';
            default:
                return super.toString();
        }
    }

    public a(int i) {
        this.f520a = i;
        switch (i) {
            case 6:
                break;
            default:
                this.f521b = (String) AbstractC0709Rg.f10927k.v();
                break;
        }
    }

    public a(String str) {
        this.f520a = 2;
        this.f521b = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    @Override // f0.p
    public Object b() {
        return this;
    }
}
