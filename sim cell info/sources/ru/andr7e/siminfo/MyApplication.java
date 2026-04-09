package ru.andr7e.siminfo;

import android.app.Application;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MyApplication extends Application {

    /* renamed from: f, reason: collision with root package name */
    private static MyApplication f3217f;

    /* renamed from: b, reason: collision with root package name */
    boolean f3218b = false;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<b> f3219c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    ArrayList<String> f3220d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    int f3221e = 24;

    public static MyApplication e() {
        return f3217f;
    }

    public static boolean g(int i2) {
        return i2 != Integer.MAX_VALUE;
    }

    public void a() {
        this.f3219c.clear();
        this.f3220d.clear();
    }

    public b b(int i2, int i3) {
        if (!g(i3)) {
            return null;
        }
        Iterator<b> it = this.f3219c.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f3242f == i3 && next.f3244h == i2) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<b> c() {
        return this.f3219c;
    }

    public int d() {
        return this.f3221e;
    }

    boolean f() {
        return this.f3218b;
    }

    public void h(b bVar) {
        int i2;
        if (n0.b.b() && Build.VERSION.SDK_INT >= 24 && bVar.f3244h != 0 && (i2 = bVar.f3240d) > 0) {
            String str = i2 + "";
            if (this.f3220d.contains(str)) {
                return;
            }
            this.f3219c.add(bVar);
            this.f3220d.add(str);
        }
    }

    public void i(int i2) {
        if (i2 < 22) {
            return;
        }
        this.f3221e = i2;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f3217f = this;
        this.f3218b = i0.b.a("ru.andr7e.deviceinfohw.pro", getApplicationContext().getPackageManager());
    }
}
