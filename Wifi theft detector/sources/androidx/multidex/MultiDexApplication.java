package androidx.multidex;

import android.app.Application;
import android.content.Context;
import m1.a;

/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a.l(this);
    }
}
