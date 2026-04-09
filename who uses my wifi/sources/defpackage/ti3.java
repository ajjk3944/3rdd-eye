package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ti3 implements si3 {
    public final String a;
    public final String b;
    public final gi3 c;
    public final fr1 d;
    public final fk3 e;

    public ti3(String str, String str2, fr1 fr1Var, gi3 gi3Var, fk3 fk3Var) {
        this.a = str;
        this.b = str2;
        this.d = fr1Var;
        this.c = gi3Var;
        this.e = fk3Var;
    }

    public abstract void a(Method method, fr1 fr1Var);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        fk3 fk3Var = this.e;
        try {
            fk3Var.a();
            Method methodB = this.c.b(this.a, this.b);
            if (methodB != null) {
                a(methodB, this.d);
            }
            fk3Var.c();
            return null;
        } finally {
        }
    }
}
