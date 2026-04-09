package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ViewGroupKt {

    public static final class a implements kotlin.sequences.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2631a;

        public a(ViewGroup viewGroup) {
            this.f2631a = viewGroup;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return ViewGroupKt.c(this.f2631a);
        }
    }

    public static final class b implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f2632a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2633b;

        public b(ViewGroup viewGroup) {
            this.f2633b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f2633b;
            int i10 = this.f2632a;
            this.f2632a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2632a < this.f2633b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f2633b;
            int i10 = this.f2632a - 1;
            this.f2632a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final class c implements kotlin.sequences.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2634a;

        public c(ViewGroup viewGroup) {
            this.f2634a = viewGroup;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return new v0(ViewGroupKt.a(this.f2634a).iterator(), new l9.l() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                @Override // l9.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Iterator invoke(View view) {
                    kotlin.sequences.g gVarA;
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup == null || (gVarA = ViewGroupKt.a(viewGroup)) == null) {
                        return null;
                    }
                    return gVarA.iterator();
                }
            });
        }
    }

    public static final kotlin.sequences.g a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final kotlin.sequences.g b(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
