package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gu1 {
    public final jt1 a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public gu1(jt1 jt1Var, String str, String str2, Class... clsArr) {
        this.a = jt1Var;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        jt1Var.b.submit(new fu1(0, this));
    }
}
