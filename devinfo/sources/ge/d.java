package ge;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import je.g;
import je.u;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24696a;

    /* renamed from: b, reason: collision with root package name */
    public String f24697b;

    /* renamed from: c, reason: collision with root package name */
    public String f24698c;

    public boolean equals(Object obj) {
        switch (this.f24696a) {
            case 1:
                return (obj instanceof d4.b) && this.f24697b == null && this.f24698c == null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f24696a) {
            case 1:
                String str = this.f24697b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f24698c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f24696a) {
            case 1:
                return "Pair{" + ((Object) this.f24697b) + " " + ((Object) this.f24698c) + "}";
            default:
                return super.toString();
        }
    }

    public d(i iVar) throws Resources.NotFoundException, IOException {
        this.f24696a = 0;
        Context context = (Context) iVar.f37516b;
        int iD = g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f24697b = "Unity";
            String string = context.getResources().getString(iD);
            this.f24698c = string;
            String strT = u.t("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strT, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f24697b = "Flutter";
                this.f24698c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f24697b = null;
        this.f24698c = null;
    }
}
