package G;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1509a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1510b;

    public t(Context context) {
        this.f1510b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f1510b;
        ArrayList arrayList = this.f1509a;
        int size = arrayList.size();
        try {
            for (Intent intentC = c.c(context, componentName); intentC != null; intentC = c.c(context, intentC.getComponent())) {
                arrayList.add(size, intentC);
            }
        } catch (PackageManager.NameNotFoundException e6) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e6);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f1509a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f1510b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1509a.iterator();
    }
}
