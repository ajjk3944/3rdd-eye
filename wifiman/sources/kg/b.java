package Kg;

import Lg.o;
import f.AbstractC5487d;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile b f10778a;

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicReference f10779b = new AtomicReference();

        public static b a() {
            if (f10778a == null) {
                synchronized (a.class) {
                    try {
                        if (f10778a == null) {
                            f10778a = b();
                        }
                    } finally {
                    }
                }
            }
            return f10778a;
        }

        protected static b b() {
            AbstractC5487d.a(f10779b.get());
            return new o();
        }
    }

    InetAddress[] a();
}
