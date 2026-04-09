package defpackage;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class gs1 implements Callable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ gs1(Context context, Context context2) {
        this.a = 5;
        this.c = context;
        this.b = context2;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0442  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.util.concurrent.ExecutionException, defpackage.r13, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs1.call():java.lang.Object");
    }

    public /* synthetic */ gs1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public gs1(ug0 ug0Var, Context context) {
        this.a = 3;
        this.c = context;
        Objects.requireNonNull(ug0Var);
        this.b = ug0Var;
    }
}
