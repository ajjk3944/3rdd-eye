package B0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f359a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f360b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f361c = new Object();

    /* compiled from: ResourcesCompat.java */
    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i10, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i10, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f362a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f363b;

        /* renamed from: c, reason: collision with root package name */
        public final int f364c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f362a = colorStateList;
            this.f363b = configuration;
            this.f364c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f365a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f366b;

        public d(Resources resources, Resources.Theme theme) {
            this.f365a = resources;
            this.f366b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f365a.equals(dVar.f365a) && Objects.equals(this.f366b, dVar.f366b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f365a, this.f366b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class e {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i, Handler handler) {
            getHandler(handler).post(new h(i, 0, this));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new B.a(1, this, typeface));
        }

        /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackSuccessAsync$0(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    public static final class f {

        /* compiled from: ResourcesCompat.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final Object f367a = new Object();

            /* renamed from: b, reason: collision with root package name */
            public static Method f368b;

            /* renamed from: c, reason: collision with root package name */
            public static boolean f369c;
        }

        /* compiled from: ResourcesCompat.java */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(android.content.res.Resources.Theme r6) {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                B0.g.f.b.a(r6)
                return
            La:
                java.lang.Object r0 = B0.g.f.a.f367a
                monitor-enter(r0)
                boolean r1 = B0.g.f.a.f369c     // Catch: java.lang.Throwable -> L23
                r2 = 0
                if (r1 != 0) goto L2f
                r1 = 1
                java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                java.lang.String r4 = "rebase"
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
                java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
                B0.g.f.a.f368b = r3     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
                r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
                goto L2d
            L23:
                r6 = move-exception
                goto L48
            L25:
                r3 = move-exception
                java.lang.String r4 = "ResourcesCompat"
                java.lang.String r5 = "Failed to retrieve rebase() method"
                android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L23
            L2d:
                B0.g.f.a.f369c = r1     // Catch: java.lang.Throwable -> L23
            L2f:
                java.lang.reflect.Method r1 = B0.g.f.a.f368b     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L46
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L3b
                r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L23 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L3b
                goto L46
            L39:
                r6 = move-exception
                goto L3c
            L3b:
                r6 = move-exception
            L3c:
                java.lang.String r1 = "ResourcesCompat"
                java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L23
                r6 = 0
                B0.g.f.a.f368b = r6     // Catch: java.lang.Throwable -> L23
            L46:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return
            L48:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.g.f.a(android.content.res.Resources$Theme):void");
        }
    }

    public static void a(d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f361c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f360b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i, new c(colorStateList, dVar.f365a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface c(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, B0.g.e r16, boolean r17, boolean r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.g.c(android.content.Context, int, android.util.TypedValue, int, B0.g$e, boolean, boolean):android.graphics.Typeface");
    }
}
