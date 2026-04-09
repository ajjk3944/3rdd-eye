package q;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f3172b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Context f3173c;

    public interface a {
        Intent j();
    }

    private g(Context context) {
        this.f3173c = context;
    }

    public static g d(Context context) {
        return new g(context);
    }

    public g a(Intent intent) {
        this.f3172b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g b(Activity activity) {
        Intent intentJ = activity instanceof a ? ((a) activity).j() : null;
        if (intentJ == null) {
            intentJ = e.a(activity);
        }
        if (intentJ != null) {
            ComponentName component = intentJ.getComponent();
            if (component == null) {
                component = intentJ.resolveActivity(this.f3173c.getPackageManager());
            }
            c(component);
            a(intentJ);
        }
        return this;
    }

    public g c(ComponentName componentName) {
        int size = this.f3172b.size();
        try {
            Context context = this.f3173c;
            while (true) {
                Intent intentB = e.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f3172b.add(size, intentB);
                context = this.f3173c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f3172b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f3172b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (r.a.d(this.f3173c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f3173c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f3172b.iterator();
    }
}
