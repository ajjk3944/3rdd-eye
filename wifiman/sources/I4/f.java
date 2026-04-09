package I4;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.crashlytics.internal.common.AbstractC5107i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8614a;

    /* renamed from: b, reason: collision with root package name */
    private b f8615b = null;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f8616a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8617b;

        private b() throws Resources.NotFoundException {
            int iP = AbstractC5107i.p(f.this.f8614a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f8616a = null;
                    this.f8617b = null;
                    return;
                } else {
                    this.f8616a = "Flutter";
                    this.f8617b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f8616a = "Unity";
            String string = f.this.f8614a.getResources().getString(iP);
            this.f8617b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f8614a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) throws IOException {
        if (this.f8614a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f8614a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f8615b == null) {
            this.f8615b = new b();
        }
        return this.f8615b;
    }

    public String d() {
        return f().f8616a;
    }

    public String e() {
        return f().f8617b;
    }
}
