package ef;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import hf.f;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8187a = 2;

    /* renamed from: b, reason: collision with root package name */
    public String f8188b;

    /* renamed from: c, reason: collision with root package name */
    public String f8189c;

    public /* synthetic */ c() {
    }

    public boolean equals(Object obj) {
        switch (this.f8187a) {
            case 2:
                if (!(obj instanceof t3.b)) {
                    return false;
                }
                if (this.f8188b != null) {
                    throw null;
                }
                if (this.f8189c == null) {
                    return true;
                }
                throw null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f8187a) {
            case 2:
                String str = this.f8188b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f8189c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f8187a) {
            case 2:
                return "Pair{" + ((Object) this.f8188b) + " " + ((Object) this.f8189c) + "}";
            default:
                return super.toString();
        }
    }

    public c(String str, String str2) {
        this.f8188b = str;
        this.f8189c = str2;
    }

    public c(io.sentry.internal.debugmeta.c cVar) throws Resources.NotFoundException, IOException {
        Context context = (Context) cVar.f12353d;
        int iD = f.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f8188b = "Unity";
            this.f8189c = context.getResources().getString(iD);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f8188b = "Flutter";
                this.f8189c = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.f8188b = null;
        this.f8189c = null;
    }
}
