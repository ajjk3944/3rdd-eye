package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t1.AbstractC8021a;

/* loaded from: classes.dex */
public abstract class o extends AbstractC4001l {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f31463a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31464b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f31465c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31466d;

    /* renamed from: e, reason: collision with root package name */
    final w f31467e;

    o(AbstractActivityC3999j abstractActivityC3999j) {
        this(abstractActivityC3999j, abstractActivityC3999j, new Handler(), 0);
    }

    Activity f() {
        return this.f31463a;
    }

    Context g() {
        return this.f31464b;
    }

    public Handler h() {
        return this.f31465c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object k();

    public abstract LayoutInflater m();

    public void n(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC8021a.n(this.f31464b, intent, bundle);
    }

    public abstract void p();

    o(Activity activity, Context context, Handler handler, int i10) {
        this.f31467e = new x();
        this.f31463a = activity;
        this.f31464b = (Context) E1.h.h(context, "context == null");
        this.f31465c = (Handler) E1.h.h(handler, "handler == null");
        this.f31466d = i10;
    }
}
