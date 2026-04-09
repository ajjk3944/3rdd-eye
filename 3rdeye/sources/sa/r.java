package sa;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.zipoapps.premiumhelper.toto.TotoServiceApi;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform.java */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f46281c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46282a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f46283b;

    /* compiled from: Platform.java */
    public static final class a extends r {

        /* compiled from: Platform.java */
        /* renamed from: sa.r$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0532a implements Executor {

            /* renamed from: b, reason: collision with root package name */
            public final Handler f46284b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f46284b.post(runnable);
            }
        }

        @Override // sa.r
        public final Executor a() {
            return new ExecutorC0532a();
        }

        @Override // sa.r
        public final Object b(Method method, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        r rVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            rVar = new a(Build.VERSION.SDK_INT >= 24);
        } else {
            rVar = new r(true);
        }
        f46281c = rVar;
    }

    public r(boolean z10) throws NoSuchMethodException, SecurityException {
        this.f46282a = z10;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z10) {
            try {
                declaredConstructor = H2.b.h().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f46283b = declaredConstructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f46283b;
        return (constructor != null ? I2.d.j(constructor.newInstance(TotoServiceApi.class, -1)) : MethodHandles.lookup()).unreflectSpecial(method, TotoServiceApi.class).bindTo(obj).invokeWithArguments(objArr);
    }
}
