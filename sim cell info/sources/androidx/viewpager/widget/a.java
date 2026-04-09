package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f2402a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f2403b;

    public abstract void a(ViewGroup viewGroup, int i2, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract int c();

    public abstract int d(Object obj);

    public float e(int i2) {
        return 1.0f;
    }

    public abstract Object f(ViewGroup viewGroup, int i2);

    public abstract boolean g(View view, Object obj);

    public abstract void h(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable i();

    public abstract void j(ViewGroup viewGroup, int i2, Object obj);

    void k(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2403b = dataSetObserver;
        }
    }

    public abstract void l(ViewGroup viewGroup);
}
