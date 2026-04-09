package Mj;

import Mj.c;
import Mj.t;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f13438a;

    /* renamed from: b, reason: collision with root package name */
    static final t f13439b;

    /* renamed from: c, reason: collision with root package name */
    static final c f13440c;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            f13438a = null;
            f13439b = new t();
            f13440c = new c();
        } else if (property.equals("Dalvik")) {
            f13438a = new ExecutorC3306a();
            f13439b = new t.a();
            f13440c = new c.a();
        } else {
            f13438a = null;
            f13439b = new t.b();
            f13440c = new c.a();
        }
    }
}
