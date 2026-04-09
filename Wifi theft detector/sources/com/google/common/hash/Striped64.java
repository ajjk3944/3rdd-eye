package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class Striped64 extends Number {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f12078d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final Random f12079e = new Random();

    /* renamed from: f, reason: collision with root package name */
    public static final int f12080f = Runtime.getRuntime().availableProcessors();

    /* renamed from: g, reason: collision with root package name */
    public static final Unsafe f12081g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f12082h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f12083i;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient b[] f12084a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient long f12085b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient int f12086c;

    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final Unsafe f12087b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f12088c;

        /* renamed from: a, reason: collision with root package name */
        public volatile long f12089a;

        static {
            try {
                Unsafe unsafeI = Striped64.i();
                f12087b = unsafeI;
                f12088c = unsafeI.objectFieldOffset(b.class.getDeclaredField("a"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        public b(long j10) {
            this.f12089a = j10;
        }

        public final boolean a(long j10, long j11) {
            return f12087b.compareAndSwapLong(this, f12088c, j10, j11);
        }
    }

    static {
        try {
            Unsafe unsafeI = i();
            f12081g = unsafeI;
            f12082h = unsafeI.objectFieldOffset(Striped64.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            f12083i = unsafeI.objectFieldOffset(Striped64.class.getDeclaredField("c"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public static Unsafe i() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new a());
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    public final boolean e(long j10, long j11) {
        return f12081g.compareAndSwapLong(this, f12082h, j10, j11);
    }

    public final boolean g() {
        return f12081g.compareAndSwapInt(this, f12083i, 0, 1);
    }

    public abstract long h(long j10, long j11);

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r17, int[] r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Striped64.j(long, int[], boolean):void");
    }
}
