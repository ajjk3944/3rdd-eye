package o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import zc.d2;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18584a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18585d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18586g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f18587r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f18588x;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18584a = i10;
        this.f18588x = obj;
        this.f18585d = obj2;
        this.f18586g = obj3;
        this.f18587r = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03c7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.run():void");
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10, boolean z10) {
        this.f18584a = i10;
        this.f18585d = obj;
        this.f18586g = obj2;
        this.f18587r = obj3;
        this.f18588x = obj4;
    }

    public e(d2 d2Var, AtomicReference atomicReference, String str, String str2) {
        this.f18584a = 5;
        this.f18585d = atomicReference;
        this.f18586g = str;
        this.f18587r = str2;
        Objects.requireNonNull(d2Var);
        this.f18588x = d2Var;
    }
}
