package b6;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.inputmethod.InputMethodManager;
import c0.a1;
import c0.e0;
import c0.q0;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.gson.j;
import d.v;
import d.w;
import d0.d0;
import d3.f;
import f1.e;
import f1.i;
import f6.c;
import g2.l;
import h1.g;
import i0.u;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kl.d;
import ml.k;
import pg.h;
import r0.b0;
import r0.f0;
import r0.g0;
import r0.m;
import r0.t;
import r0.z;
import u0.a0;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1966a;

    public /* synthetic */ a(int i4) {
        this.f1966a = i4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yj.f] */
    @Override // mk.a
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Class<?> returnType;
        d[] dVarArr;
        switch (this.f1966a) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 1:
                a0 a0Var = q0.f2488a;
                return e0.f2399b;
            case 2:
                return new a1();
            case 3:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new w(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return v.f21634a;
                }
            case 4:
                float f10 = d0.f21693a;
                return Boolean.TRUE;
            case 5:
                o2 o2Var = d1.b.f21931a;
                return d1.a.f21930a;
            case 6:
                qk.a aVar = qk.d.f32443a;
                return Integer.valueOf(qk.d.f32443a.c().nextInt(2147418112) + 65536);
            case 7:
                return new e(new LinkedHashMap());
            case 8:
                o2 o2Var2 = i.f23623a;
                return null;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 10:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    return null;
                }
            case 11:
                try {
                    Method method = (Method) c.f23661d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused3) {
                    return null;
                }
            case 12:
                return new gg.b();
            case 13:
                o2 o2Var3 = h1.e.f24805a;
                return null;
            case 14:
                o2 o2Var4 = g.f24807a;
                return null;
            case 15:
                return new u(0, 0);
            case 16:
                return new j();
            case 17:
                ArrayList arrayList = new ArrayList(0);
                ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                return (arrayList2 == null || (dVarArr = (d[]) arrayList2.toArray(new d[0])) == null) ? k.f29419a : dVarArr;
            case 18:
                o2 o2Var5 = n0.b.f29504a;
                return null;
            case 19:
                a0 a0Var2 = p0.a.f30942a;
                return null;
            case 20:
                return p0.c.f30946b;
            case 21:
                return h.f31961a;
            case 22:
                return m.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            case 23:
                o2 o2Var6 = m.f32596a;
                return Boolean.TRUE;
            case 24:
                l lVar = t.f32655a;
                return Boolean.TRUE;
            case 25:
                return new f(48);
            case 26:
                o2 o2Var7 = r0.w.f32683a;
                return Boolean.FALSE;
            case 27:
                return z.f32711a;
            case 28:
                return new b0();
            default:
                return new g0(f0.f32522a, f0.f32523b, f0.f32524c, f0.f32525d, f0.f32527f);
        }
    }

    public /* synthetic */ a(ml.m mVar) {
        this.f1966a = 17;
    }
}
