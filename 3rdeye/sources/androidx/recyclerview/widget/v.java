package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1801c;
import androidx.recyclerview.widget.C1802d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.F;
import androidx.recyclerview.widget.p;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: ListAdapter.java */
/* loaded from: classes.dex */
public abstract class v<T, VH extends RecyclerView.F> extends RecyclerView.h<VH> {
    final C1802d<T> mDiffer;
    private final C1802d.b<T> mListener;

    /* compiled from: ListAdapter.java */
    public class a implements C1802d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C1802d.b
        public final void a(List<T> list, List<T> list2) {
            v.this.onCurrentListChanged(list, list2);
        }
    }

    public v(p.e<T> eVar) {
        a aVar = new a();
        this.mListener = aVar;
        C1800b c1800b = new C1800b(this);
        synchronized (C1801c.a.f16604a) {
            try {
                if (C1801c.a.f16605b == null) {
                    C1801c.a.f16605b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1802d<T> c1802d = new C1802d<>(c1800b, new C1801c(C1801c.a.f16605b, eVar));
        this.mDiffer = c1802d;
        c1802d.f16610d.add(aVar);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.f16612f;
    }

    public T getItem(int i) {
        return this.mDiffer.f16612f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.mDiffer.f16612f.size();
    }

    public void submitList(List<T> list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }

    public v(C1801c<T> c1801c) {
        a aVar = new a();
        this.mListener = aVar;
        C1802d<T> c1802d = new C1802d<>(new C1800b(this), c1801c);
        this.mDiffer = c1802d;
        c1802d.f16610d.add(aVar);
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }
}
