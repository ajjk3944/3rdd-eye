package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1766t<E> extends AbstractC1764q {

    /* renamed from: b, reason: collision with root package name */
    public final ActivityC1762o f15951b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityC1762o f15952c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f15953d;

    /* renamed from: e, reason: collision with root package name */
    public final z f15954e;

    public AbstractC1766t(ActivityC1762o activityC1762o) {
        Handler handler = new Handler();
        this.f15954e = new z();
        this.f15951b = activityC1762o;
        this.f15952c = activityC1762o;
        this.f15953d = handler;
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract ActivityC1762o e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
