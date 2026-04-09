package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class l extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f3334a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3335b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3337d;

    /* renamed from: e, reason: collision with root package name */
    public final FragmentManager f3338e;

    public l(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    public Activity e() {
        return this.f3334a;
    }

    public Context f() {
        return this.f3335b;
    }

    public Handler g() {
        return this.f3336c;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(Fragment fragment, String[] strArr, int i10) {
    }

    public abstract boolean l(String str);

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.f3335b, intent, bundle);
    }

    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        f0.b.g(this.f3334a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public abstract void o();

    public l(Activity activity, Context context, Handler handler, int i10) {
        this.f3338e = new t();
        this.f3334a = activity;
        this.f3335b = (Context) r0.i.h(context, "context == null");
        this.f3336c = (Handler) r0.i.h(handler, "handler == null");
        this.f3337d = i10;
    }
}
