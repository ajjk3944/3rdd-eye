package L4;

import O4.C1461g;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import androidx.work.s;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4057a;

    /* renamed from: b, reason: collision with root package name */
    public a f4058b = null;

    /* compiled from: DevelopmentPlatformProvider.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f4059a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4060b;

        public a(d dVar) throws Resources.NotFoundException, IOException {
            int iD = C1461g.d(dVar.f4057a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = dVar.f4057a;
            if (iD != 0) {
                this.f4059a = "Unity";
                String string = context.getResources().getString(iD);
                this.f4060b = string;
                String strD = s.d("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strD, null);
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
                    this.f4059a = "Flutter";
                    this.f4060b = null;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                        return;
                    }
                    return;
                } catch (IOException unused) {
                }
            }
            this.f4059a = null;
            this.f4060b = null;
        }
    }

    public d(Context context) {
        this.f4057a = context;
    }
}
