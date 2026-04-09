package eg;

import gg.y;
import ig.AbstractC6152a;
import java.util.concurrent.Callable;
import kg.n;

/* renamed from: eg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5465a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile n f46420a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f46421b;

    static Object a(n nVar, Object obj) {
        try {
            return nVar.apply(obj);
        } catch (Throwable th2) {
            throw AbstractC6152a.a(th2);
        }
    }

    static y b(n nVar, Callable callable) {
        y yVar = (y) a(nVar, callable);
        if (yVar != null) {
            return yVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static y c(Callable callable) {
        try {
            y yVar = (y) callable.call();
            if (yVar != null) {
                return yVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw AbstractC6152a.a(th2);
        }
    }

    public static y d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        n nVar = f46420a;
        return nVar == null ? c(callable) : b(nVar, callable);
    }

    public static y e(y yVar) {
        if (yVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        n nVar = f46421b;
        return nVar == null ? yVar : (y) a(nVar, yVar);
    }
}
