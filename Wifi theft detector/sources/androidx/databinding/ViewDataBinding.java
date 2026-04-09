package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.z;
import androidx.databinding.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f2852n = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2861a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2862b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2863c;

    /* renamed from: d, reason: collision with root package name */
    public k[] f2864d;

    /* renamed from: e, reason: collision with root package name */
    public final View f2865e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.databinding.c f2866f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2867g;

    /* renamed from: h, reason: collision with root package name */
    public Choreographer f2868h;

    /* renamed from: i, reason: collision with root package name */
    public final Choreographer.FrameCallback f2869i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f2870j;

    /* renamed from: k, reason: collision with root package name */
    public ViewDataBinding f2871k;

    /* renamed from: l, reason: collision with root package name */
    public n f2872l;

    /* renamed from: m, reason: collision with root package name */
    public static int f2851m = Build.VERSION.SDK_INT;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f2853o = true;

    /* renamed from: p, reason: collision with root package name */
    public static final androidx.databinding.d f2854p = new a();

    /* renamed from: q, reason: collision with root package name */
    public static final androidx.databinding.d f2855q = new b();

    /* renamed from: r, reason: collision with root package name */
    public static final androidx.databinding.d f2856r = new c();

    /* renamed from: s, reason: collision with root package name */
    public static final androidx.databinding.d f2857s = new d();

    /* renamed from: t, reason: collision with root package name */
    public static final c.a f2858t = new e();

    /* renamed from: u, reason: collision with root package name */
    public static final ReferenceQueue f2859u = new ReferenceQueue();

    /* renamed from: v, reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f2860v = new f();

    public static class OnStartListener implements m {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f2873a;

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f2873a.get();
            if (viewDataBinding != null) {
                viewDataBinding.t();
            }
        }
    }

    public class a implements androidx.databinding.d {
    }

    public class b implements androidx.databinding.d {
    }

    public class c implements androidx.databinding.d {
    }

    public class d implements androidx.databinding.d {
    }

    public class e extends c.a {
        @Override // androidx.databinding.c.a
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i10, Object obj3) {
            z.a(obj);
            b(null, (ViewDataBinding) obj2, i10, (Void) obj3);
        }

        public void b(j jVar, ViewDataBinding viewDataBinding, int i10, Void r42) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                throw null;
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.w(view).f2861a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f2862b = false;
            }
            ViewDataBinding.E();
            if (ViewDataBinding.this.f2865e.isAttachedToWindow()) {
                ViewDataBinding.this.t();
            } else {
                ViewDataBinding.this.f2865e.removeOnAttachStateChangeListener(ViewDataBinding.f2860v);
                ViewDataBinding.this.f2865e.addOnAttachStateChangeListener(ViewDataBinding.f2860v);
            }
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            ViewDataBinding.this.f2861a.run();
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f2876a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][] f2877b;

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f2878c;

        public i(int i10) {
            this.f2876a = new String[i10][];
            this.f2877b = new int[i10][];
            this.f2878c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f2876a[i10] = strArr;
            this.f2877b[i10] = iArr;
            this.f2878c[i10] = iArr2;
        }
    }

    public ViewDataBinding(androidx.databinding.f fVar, View view, int i10) {
        this.f2861a = new g();
        this.f2862b = false;
        this.f2863c = false;
        this.f2864d = new k[i10];
        this.f2865e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f2853o) {
            this.f2868h = Choreographer.getInstance();
            this.f2869i = new h();
        } else {
            this.f2869i = null;
            this.f2870j = new Handler(Looper.myLooper());
        }
    }

    public static boolean A(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void B(androidx.databinding.f r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.ViewDataBinding.i r21, android.util.SparseIntArray r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.B(androidx.databinding.f, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] C(androidx.databinding.f fVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        B(fVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static int D(String str, int i10) {
        int iCharAt = 0;
        while (i10 < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    public static void E() {
        while (f2859u.poll() != null) {
        }
    }

    public static androidx.databinding.f j(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static void s(ViewDataBinding viewDataBinding) {
        viewDataBinding.r();
    }

    public static int u(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f2876a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int v(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (A(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public static ViewDataBinding w(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(z0.a.dataBinding);
        }
        return null;
    }

    public void F() {
        ViewDataBinding viewDataBinding = this.f2871k;
        if (viewDataBinding != null) {
            viewDataBinding.F();
            return;
        }
        n nVar = this.f2872l;
        if (nVar == null || nVar.getLifecycle().b().f(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f2862b) {
                        return;
                    }
                    this.f2862b = true;
                    if (f2853o) {
                        this.f2868h.postFrameCallback(this.f2869i);
                    } else {
                        this.f2870j.post(this.f2861a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void G(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f2871k = this;
        }
    }

    public void H(View view) {
        view.setTag(z0.a.dataBinding, this);
    }

    public abstract void q();

    public final void r() {
        if (this.f2867g) {
            F();
            return;
        }
        if (y()) {
            this.f2867g = true;
            this.f2863c = false;
            androidx.databinding.c cVar = this.f2866f;
            if (cVar != null) {
                cVar.c(this, 1, null);
                if (this.f2863c) {
                    this.f2866f.c(this, 2, null);
                }
            }
            if (!this.f2863c) {
                q();
                androidx.databinding.c cVar2 = this.f2866f;
                if (cVar2 != null) {
                    cVar2.c(this, 3, null);
                }
            }
            this.f2867g = false;
        }
    }

    public void t() {
        ViewDataBinding viewDataBinding = this.f2871k;
        if (viewDataBinding == null) {
            r();
        } else {
            viewDataBinding.t();
        }
    }

    public View x() {
        return this.f2865e;
    }

    public abstract boolean y();

    public abstract void z();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewDataBinding(Object obj, View view, int i10) {
        this((androidx.databinding.f) null, view, i10);
        j(obj);
    }
}
