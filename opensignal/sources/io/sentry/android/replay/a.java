package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.f0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a extends br.n implements ar.a {
    public static final a B;
    public static final a D;
    public static final a E;
    public static final a F;

    /* renamed from: g, reason: collision with root package name */
    public static final a f11833g;

    /* renamed from: r, reason: collision with root package name */
    public static final a f11834r;

    /* renamed from: x, reason: collision with root package name */
    public static final a f11835x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f11836y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11837d;

    static {
        int i10 = 0;
        f11833g = new a(i10, 0);
        f11834r = new a(i10, 1);
        f11835x = new a(i10, 2);
        f11836y = new a(i10, 3);
        B = new a(i10, 4);
        D = new a(i10, 5);
        E = new a(i10, 6);
        F = new a(i10, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f11837d = i11;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lq.h] */
    @Override // ar.a
    public final Object c() throws NoSuchFieldException, SecurityException {
        Method method;
        switch (this.f11837d) {
            case 0:
                return new tt.k("_[a-z]");
            case 1:
                return new io.sentry.util.h();
            case 2:
                q qVar = new q();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new f0(25, qVar));
                return qVar;
            case 3:
                Class cls = (Class) w.f12029a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th2) {
                    Log.w("WindowManagerSpy", th2);
                    return null;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                Class cls2 = (Class) w.f12029a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused) {
                    return null;
                }
            default:
                Class cls3 = (Class) b0.f11847a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused2) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
