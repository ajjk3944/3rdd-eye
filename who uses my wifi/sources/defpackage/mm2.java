package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mm2 {
    public Context a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public int g;

    public mm2() {
        this.g = 0;
    }

    public b62 a() {
        aa3 aa3VarL = aa3.l(this.a, 6);
        aa3VarL.a();
        b62 b62Var = new b62();
        gi2.G("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        md2.f.execute(new jq3(this, b62Var, 29));
        gi2.G("loadNewJavascriptEngine: Promise created");
        b62Var.t(new xb4(this, b62Var, aa3VarL, 18, false), new t83(this, b62Var, aa3VarL, 17));
        return b62Var;
    }

    public mm2 b() {
        mm2 mm2Var = new mm2();
        mm2Var.a = this.a;
        mm2Var.b = (l83) this.b;
        mm2Var.c = (Bundle) this.c;
        mm2Var.e = (t83) this.e;
        mm2Var.f = (e03) this.f;
        return mm2Var;
    }

    public x52 c() {
        gi2.G("getEngine: Trying to acquire lock");
        Object obj = this.b;
        synchronized (obj) {
            try {
                gi2.G("getEngine: Lock acquired");
                gi2.G("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        gi2.G("refreshIfDestroyed: Lock acquired");
                        b62 b62Var = (b62) this.f;
                        if (b62Var != null && this.g == 0) {
                            b62Var.t(new z71(15, this), ts0.h);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gi2.G("refreshIfDestroyed: Lock released");
        b62 b62Var2 = (b62) this.f;
        if (b62Var2 != null && ((AtomicInteger) b62Var2.b).get() != -1) {
            int i = this.g;
            if (i == 0) {
                gi2.G("getEngine (NO_UPDATE): Lock released");
                return ((b62) this.f).w();
            }
            if (i != 1) {
                gi2.G("getEngine (UPDATING): Lock released");
                return ((b62) this.f).w();
            }
            this.g = 2;
            a();
            gi2.G("getEngine (PENDING_UPDATE): Lock released");
            return ((b62) this.f).w();
        }
        this.g = 2;
        this.f = a();
        gi2.G("getEngine (NULL or REJECTED): Lock released");
        return ((b62) this.f).w();
    }

    public /* synthetic */ mm2(mm2 mm2Var) {
        this.a = mm2Var.a;
        this.b = (l83) mm2Var.b;
        this.c = (Bundle) mm2Var.c;
        this.d = (i83) mm2Var.d;
        this.e = (t83) mm2Var.e;
        this.f = (e03) mm2Var.f;
        this.g = mm2Var.g;
    }
}
