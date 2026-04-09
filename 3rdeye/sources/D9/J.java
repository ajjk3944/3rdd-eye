package D9;

import A9.C0583j;
import A9.InterfaceC0594o0;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: StateFlow.kt */
/* loaded from: classes3.dex */
public final class J<T> extends E9.b<K> implements y<T>, InterfaceC0644f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1159f = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f1160e;

    /* compiled from: StateFlow.kt */
    @h9.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    public static final class a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public J f1161l;

        /* renamed from: m, reason: collision with root package name */
        public InterfaceC0645g f1162m;

        /* renamed from: n, reason: collision with root package name */
        public K f1163n;

        /* renamed from: o, reason: collision with root package name */
        public InterfaceC0594o0 f1164o;

        /* renamed from: p, reason: collision with root package name */
        public Object f1165p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f1166q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ J<T> f1167r;

        /* renamed from: s, reason: collision with root package name */
        public int f1168s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J<T> j4, InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
            this.f1167r = j4;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f1166q = obj;
            this.f1168s |= RecyclerView.UNDEFINED_DURATION;
            return this.f1167r.b(null, this);
        }
    }

    public J(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F9.y] */
    @Override // D9.y
    public final boolean a(T t10, T t11) {
        ?? r02 = E9.c.f1489b;
        if (t10 == null) {
            t10 = r02;
        }
        if (t11 == null) {
            t11 = r02;
        }
        return g(t10, t11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (((D9.M) r14).b(r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00a8, B:47:0x00ae], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:47:0x00ae, B:45:0x00a8], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:47:0x00ae, B:55:0x00c9], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0034, B:37:0x0092, B:39:0x009a, B:42:0x00a1, B:43:0x00a5, B:45:0x00a8, B:55:0x00c9, B:58:0x00d9, B:59:0x00f3, B:65:0x0105, B:68:0x010e, B:62:0x00fa, B:64:0x0100, B:47:0x00ae, B:51:0x00b5, B:21:0x004d, B:24:0x0058, B:36:0x0083), top: B:75:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d8 -> B:37:0x0092). Please report as a decompilation issue!!! */
    @Override // D9.InterfaceC0644f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(D9.InterfaceC0645g<? super T> r14, f9.InterfaceC4347e<?> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.J.b(D9.g, f9.e):java.lang.Object");
    }

    @Override // E9.b
    public final E9.d d() {
        return new K();
    }

    @Override // E9.b
    public final E9.d[] e() {
        return new K[2];
    }

    @Override // D9.x, D9.InterfaceC0645g
    public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        setValue(t10);
        return C1992A.f18074a;
    }

    public final boolean g(Object obj, Object obj2) {
        int i;
        Object obj3;
        F9.y yVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1159f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l.b(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.b(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f1160e;
            if ((i10 & 1) != 0) {
                this.f1160e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f1160e = i11;
            Object obj5 = this.f1485b;
            C1992A c1992a = C1992A.f18074a;
            while (true) {
                K[] kArr = (K[]) obj5;
                if (kArr != null) {
                    for (K k10 : kArr) {
                        if (k10 != null) {
                            AtomicReference<Object> atomicReference = k10.f1169a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (yVar = E.f1153c)) {
                                    F9.y yVar2 = E.f1152b;
                                    if (obj6 != yVar2) {
                                        while (!atomicReference.compareAndSet(obj6, yVar2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        ((C0583j) obj6).resumeWith(C1992A.f18074a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, yVar)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f1160e;
                    if (i == i11) {
                        this.f1160e = i11 + 1;
                        return true;
                    }
                    obj3 = this.f1485b;
                    C1992A c1992a2 = C1992A.f18074a;
                }
                obj5 = obj3;
                i11 = i;
            }
        }
    }

    @Override // D9.y, D9.I
    public final T getValue() {
        F9.y yVar = E9.c.f1489b;
        T t10 = (T) f1159f.get(this);
        if (t10 == yVar) {
            return null;
        }
        return t10;
    }

    @Override // D9.y
    public final void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) E9.c.f1489b;
        }
        g(null, t10);
    }
}
