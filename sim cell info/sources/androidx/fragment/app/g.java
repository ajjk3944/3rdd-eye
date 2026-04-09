package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class g<E> extends d {

    /* renamed from: b, reason: collision with root package name */
    private final Activity f1609b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1610c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f1611d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1612e;

    /* renamed from: f, reason: collision with root package name */
    final i f1613f;

    g(Activity activity, Context context, Handler handler, int i2) {
        this.f1613f = new i();
        this.f1609b = activity;
        this.f1610c = (Context) z.g.c(context, "context == null");
        this.f1611d = (Handler) z.g.c(handler, "handler == null");
        this.f1612e = i2;
    }

    g(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.d
    public View f(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.d
    public boolean g() {
        return true;
    }

    Activity h() {
        return this.f1609b;
    }

    Context i() {
        return this.f1610c;
    }

    Handler j() {
        return this.f1611d;
    }

    void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f1610c);
    }

    public int o() {
        return this.f1612e;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r() {
    }
}
