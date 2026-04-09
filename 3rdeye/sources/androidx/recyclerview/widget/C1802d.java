package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.p;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1802d<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final c f16606h = new c();

    /* renamed from: a, reason: collision with root package name */
    public final C1800b f16607a;

    /* renamed from: b, reason: collision with root package name */
    public final C1801c<T> f16608b;

    /* renamed from: c, reason: collision with root package name */
    public final c f16609c;

    /* renamed from: e, reason: collision with root package name */
    public List<T> f16611e;

    /* renamed from: g, reason: collision with root package name */
    public int f16613g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f16610d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List<T> f16612f = Collections.EMPTY_LIST;

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f16614b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f16615c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f16616d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Runnable f16617e;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C0261a extends p.b {
            public C0261a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.p.b
            public final boolean a(int i, int i10) {
                a aVar = a.this;
                Object obj = aVar.f16614b.get(i);
                Object obj2 = aVar.f16615c.get(i10);
                if (obj != null && obj2 != null) {
                    return C1802d.this.f16608b.f16603b.areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.p.b
            public final boolean b(int i, int i10) {
                a aVar = a.this;
                Object obj = aVar.f16614b.get(i);
                Object obj2 = aVar.f16615c.get(i10);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C1802d.this.f16608b.f16603b.areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.p.b
            public final Object c(int i, int i10) {
                a aVar = a.this;
                Object obj = aVar.f16614b.get(i);
                Object obj2 = aVar.f16615c.get(i10);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C1802d.this.f16608b.f16603b.getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int d() {
                return a.this.f16615c.size();
            }

            @Override // androidx.recyclerview.widget.p.b
            public final int e() {
                return a.this.f16614b.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p.d f16620b;

            public b(p.d dVar) {
                this.f16620b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                C1802d c1802d = C1802d.this;
                if (c1802d.f16613g == aVar.f16616d) {
                    List<T> list = c1802d.f16612f;
                    List<T> list2 = aVar.f16615c;
                    c1802d.f16611e = list2;
                    c1802d.f16612f = Collections.unmodifiableList(list2);
                    this.f16620b.a(c1802d.f16607a);
                    c1802d.a(list, aVar.f16617e);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.f16614b = list;
            this.f16615c = list2;
            this.f16616d = i;
            this.f16617e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1802d.this.f16609c.execute(new b(p.a(new C0261a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$c */
    public static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f16622b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f16622b.post(runnable);
        }
    }

    public C1802d(C1800b c1800b, C1801c c1801c) {
        this.f16607a = c1800b;
        this.f16608b = c1801c;
        c1801c.getClass();
        this.f16609c = f16606h;
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.f16610d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f16612f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List<T> list, Runnable runnable) {
        int i = this.f16613g + 1;
        this.f16613g = i;
        List<T> list2 = this.f16611e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f16612f;
        C1800b c1800b = this.f16607a;
        if (list == null) {
            int size = list2.size();
            this.f16611e = null;
            this.f16612f = Collections.EMPTY_LIST;
            c1800b.c(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f16608b.f16602a.execute(new a(list2, list, i, runnable));
            return;
        }
        this.f16611e = list;
        this.f16612f = Collections.unmodifiableList(list);
        c1800b.b(0, list.size());
        a(list3, runnable);
    }
}
