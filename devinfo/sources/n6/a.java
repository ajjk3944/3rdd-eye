package n6;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import b5.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f29766a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f29767b;

    public abstract void a(Object obj);

    public abstract void b();

    public abstract int c();

    public int d(Object obj) {
        return -1;
    }

    public abstract String e(int i4);

    public abstract z f(ViewPager viewPager, int i4);

    public abstract void g(ViewPager viewPager, int i4, Object obj);

    public final void h(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f29767b = dataSetObserver;
        }
    }

    public abstract void i(ViewPager viewPager);
}
