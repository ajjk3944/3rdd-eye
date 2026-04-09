package zg;

import gg.x;
import hg.InterfaceC6043c;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: zg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC8757j {
    COMPLETE;

    /* renamed from: zg.j$a */
    static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC6043c f67283a;

        a(InterfaceC6043c interfaceC6043c) {
            this.f67283a = interfaceC6043c;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f67283a + "]";
        }
    }

    /* renamed from: zg.j$b */
    static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f67284a;

        b(Throwable th2) {
            this.f67284a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f67284a, ((b) obj).f67284a);
            }
            return false;
        }

        public int hashCode() {
            return this.f67284a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f67284a + "]";
        }
    }

    /* renamed from: zg.j$c */
    static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.c f67285a;

        c(Dj.c cVar) {
            this.f67285a = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f67285a + "]";
        }
    }

    public static <T> boolean accept(Object obj, Dj.b bVar) {
        if (obj == COMPLETE) {
            bVar.a();
            return true;
        }
        if (obj instanceof b) {
            bVar.onError(((b) obj).f67284a);
            return true;
        }
        bVar.h(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Dj.b bVar) {
        if (obj == COMPLETE) {
            bVar.a();
            return true;
        }
        if (obj instanceof b) {
            bVar.onError(((b) obj).f67284a);
            return true;
        }
        if (obj instanceof c) {
            bVar.j(((c) obj).f67285a);
            return false;
        }
        bVar.h(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(InterfaceC6043c interfaceC6043c) {
        return new a(interfaceC6043c);
    }

    public static Object error(Throwable th2) {
        return new b(th2);
    }

    public static InterfaceC6043c getDisposable(Object obj) {
        return ((a) obj).f67283a;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f67284a;
    }

    public static Dj.c getSubscription(Object obj) {
        return ((c) obj).f67285a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(Dj.c cVar) {
        return new c(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, x xVar) {
        if (obj == COMPLETE) {
            xVar.a();
            return true;
        }
        if (obj instanceof b) {
            xVar.onError(((b) obj).f67284a);
            return true;
        }
        xVar.h(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, x xVar) {
        if (obj == COMPLETE) {
            xVar.a();
            return true;
        }
        if (obj instanceof b) {
            xVar.onError(((b) obj).f67284a);
            return true;
        }
        if (obj instanceof a) {
            xVar.c(((a) obj).f67283a);
            return false;
        }
        xVar.h(obj);
        return false;
    }
}
