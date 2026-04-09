package f0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21020a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f21021b;

    public interface a {
        Intent b();
    }

    public u(Context context) {
        this.f21021b = context;
    }

    public static u e(Context context) {
        return new u(context);
    }

    public u b(Intent intent) {
        this.f21020a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u c(Activity activity) {
        Intent intentB = activity instanceof a ? ((a) activity).b() : null;
        if (intentB == null) {
            intentB = n.a(activity);
        }
        if (intentB != null) {
            ComponentName component = intentB.getComponent();
            if (component == null) {
                component = intentB.resolveActivity(this.f21021b.getPackageManager());
            }
            d(component);
            b(intentB);
        }
        return this;
    }

    public u d(ComponentName componentName) {
        int size = this.f21020a.size();
        try {
            Intent intentB = n.b(this.f21021b, componentName);
            while (intentB != null) {
                this.f21020a.add(size, intentB);
                intentB = n.b(this.f21021b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void f() {
        g(null);
    }

    public void g(Bundle bundle) {
        if (this.f21020a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f21020a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (ContextCompat.startActivities(this.f21021b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f21021b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f21020a.iterator();
    }
}
