package o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5375C {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f44490a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f44491b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f44492c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* renamed from: o.C$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f44493a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f44494b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f44495c;

        /* renamed from: d, reason: collision with root package name */
        public static final Field f44496d;

        /* renamed from: e, reason: collision with root package name */
        public static final Field f44497e;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f44498f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3c
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L34
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L48
                r8 = r0
                goto L4a
            L2d:
                r7 = r1
                goto L48
            L2f:
                r6 = r1
            L30:
                r7 = r6
                goto L48
            L32:
                r6 = r1
                goto L30
            L34:
                r6 = r1
                goto L30
            L36:
                r5 = r1
            L37:
                r6 = r5
                goto L30
            L39:
                r5 = r1
            L3a:
                r6 = r5
                goto L30
            L3c:
                r5 = r1
            L3d:
                r6 = r5
                goto L30
            L3f:
                r4 = r1
                r5 = r4
                goto L37
            L42:
                r4 = r1
                r5 = r4
                goto L3a
            L45:
                r4 = r1
                r5 = r4
                goto L3d
            L48:
                r3 = r1
                r8 = r2
            L4a:
                if (r8 == 0) goto L59
                o.C5375C.a.f44494b = r4
                o.C5375C.a.f44495c = r5
                o.C5375C.a.f44496d = r6
                o.C5375C.a.f44497e = r7
                o.C5375C.a.f44498f = r3
                o.C5375C.a.f44493a = r0
                goto L65
            L59:
                o.C5375C.a.f44494b = r1
                o.C5375C.a.f44495c = r1
                o.C5375C.a.f44496d = r1
                o.C5375C.a.f44497e = r1
                o.C5375C.a.f44498f = r1
                o.C5375C.a.f44493a = r2
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C5375C.a.<clinit>():void");
        }
    }

    /* compiled from: DrawableUtils.java */
    /* renamed from: o.C$b */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f44490a);
        } else {
            drawable.setState(f44491b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = b.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z10 = drawable instanceof D0.c;
        Drawable drawableB = drawable;
        if (z10) {
            drawableB = ((D0.c) drawable).b();
        }
        if (i >= 29) {
            boolean z11 = a.f44493a;
        } else if (a.f44493a) {
            try {
                Object objInvoke = a.f44494b.invoke(drawableB, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(a.f44495c.getInt(objInvoke), a.f44496d.getInt(objInvoke), a.f44497e.getInt(objInvoke), a.f44498f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f44492c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
