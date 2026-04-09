package tv;

import android.content.Context;
import android.content.SharedPreferences;
import fg.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import mq.o;
import tg.e1;
import tt.l;
import wg.c;

/* loaded from: classes.dex */
public final class b implements vg.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f23027a;

    /* renamed from: d, reason: collision with root package name */
    public Object f23028d;

    /* renamed from: g, reason: collision with root package name */
    public Object f23029g;

    /* renamed from: r, reason: collision with root package name */
    public Object f23030r;

    /* renamed from: x, reason: collision with root package name */
    public Object f23031x;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f23029g = obj;
        this.f23027a = obj2;
        this.f23028d = obj3;
        this.f23030r = obj4;
        this.f23031x = obj5;
    }

    public ArrayList a() {
        String str = (String) ((AtomicReference) this.f23031x).get();
        if (str != null) {
            return o.R0(l.N0(str, new String[]{","}, 6));
        }
        return null;
    }

    public uv.b b() {
        uv.b bVar = (uv.b) this.f23031x;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("No root scope");
    }

    public String c() {
        return (String) ((AtomicReference) this.f23028d).get();
    }

    public SharedPreferences d() {
        SharedPreferences sharedPreferences = ((Context) this.f23029g).getSharedPreferences("sdkinsdkcontribution", 0);
        br.l.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public void e(String str) {
        if (br.l.a((String) ((AtomicReference) this.f23028d).getAndSet(str), str)) {
            return;
        }
        io.sentry.config.a.e0(d(), "runningSdkId", str);
    }

    public void f(String str) {
        if (br.l.a((String) ((AtomicReference) this.f23031x).getAndSet(str), str)) {
            return;
        }
        io.sentry.config.a.e0(d(), "sdkInTheAppList", str);
    }

    @Override // kq.a
    public Object get() {
        return new c((e1) ((kq.a) this.f23029g).get(), (e) ((kq.a) this.f23027a).get(), (tg.b) ((kq.a) this.f23028d).get(), (wg.e) ((kq.a) this.f23030r).get(), (wg.o) ((vg.c) this.f23031x).get());
    }
}
