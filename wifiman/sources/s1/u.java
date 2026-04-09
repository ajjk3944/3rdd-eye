package s1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;
import t1.AbstractC8021a;

/* loaded from: classes.dex */
public final class u implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f61138a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Context f61139b;

    public interface a {
        Intent m();
    }

    private u(Context context) {
        this.f61139b = context;
    }

    public static u i(Context context) {
        return new u(context);
    }

    public u b(Intent intent) {
        this.f61138a.add(intent);
        return this;
    }

    public u e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f61139b.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u f(Activity activity) {
        Intent intentM = activity instanceof a ? ((a) activity).m() : null;
        if (intentM == null) {
            intentM = i.a(activity);
        }
        if (intentM != null) {
            ComponentName component = intentM.getComponent();
            if (component == null) {
                component = intentM.resolveActivity(this.f61139b.getPackageManager());
            }
            g(component);
            b(intentM);
        }
        return this;
    }

    public u g(ComponentName componentName) {
        int size = this.f61138a.size();
        try {
            Intent intentB = i.b(this.f61139b, componentName);
            while (intentB != null) {
                this.f61138a.add(size, intentB);
                intentB = i.b(this.f61139b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f61138a.iterator();
    }

    public PendingIntent j(int i10, int i11) {
        return k(i10, i11, null);
    }

    public PendingIntent k(int i10, int i11, Bundle bundle) {
        if (this.f61138a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f61138a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f61139b, i10, intentArr, i11, bundle);
    }

    public void m() {
        o(null);
    }

    public void o(Bundle bundle) {
        if (this.f61138a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f61138a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC8021a.m(this.f61139b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.f61139b.startActivity(intent);
    }
}
