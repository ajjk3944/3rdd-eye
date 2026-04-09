package m2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;
import m2.q;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f53039a = new p();

    private p() {
    }

    public static final q.a a(Context context, Class klass, String str) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(klass, "klass");
        if (str == null || kotlin.text.t.m0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q.a(context, klass, str);
    }

    public static final Object b(Class klass, String suffix) throws ClassNotFoundException {
        String str;
        AbstractC6492s.i(klass, "klass");
        AbstractC6492s.i(suffix, "suffix");
        Package r02 = klass.getPackage();
        AbstractC6492s.f(r02);
        String fullPackage = r02.getName();
        String canonicalName = klass.getCanonicalName();
        AbstractC6492s.f(canonicalName);
        AbstractC6492s.h(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC6492s.h(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = kotlin.text.t.K(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            AbstractC6492s.g(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }
}
