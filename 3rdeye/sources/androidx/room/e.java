package androidx.room;

import A9.C0575f;
import A9.E;
import D9.C;
import F9.C0663f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import b9.C1992A;
import b9.n;
import c9.C2078B;
import c9.C2079C;
import c9.C2097r;
import c9.C2101v;
import d9.C4289g;
import f9.InterfaceC4347e;
import h9.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;
import p9.p;
import w1.u;

/* compiled from: MultiInstanceInvalidationClient.android.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f16801a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.c f16802b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f16803c;

    /* renamed from: d, reason: collision with root package name */
    public final E f16804d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16805e;

    /* renamed from: f, reason: collision with root package name */
    public int f16806f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.room.b f16807g;

    /* renamed from: h, reason: collision with root package name */
    public final C f16808h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final a f16809j;

    /* renamed from: k, reason: collision with root package name */
    public final c f16810k;

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class a extends a.AbstractBinderC0262a {

        /* compiled from: MultiInstanceInvalidationClient.android.kt */
        @h9.e(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        public static final class C0265a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public Set f16812l;

            /* renamed from: m, reason: collision with root package name */
            public int f16813m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String[] f16814n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f16815o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0265a(String[] strArr, e eVar, InterfaceC4347e<? super C0265a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f16814n = strArr;
                this.f16815o = eVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0265a(this.f16814n, this.f16815o, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((C0265a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                Set<String> tables;
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f16813m;
                e eVar = this.f16815o;
                if (i == 0) {
                    n.b(obj);
                    String[] strArr = this.f16814n;
                    Set setE = C2079C.e(Arrays.copyOf(strArr, strArr.length));
                    C c10 = eVar.f16808h;
                    this.f16812l = setE;
                    this.f16813m = 1;
                    if (c10.emit(setE, this) == aVar) {
                        return aVar;
                    }
                    tables = setE;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tables = this.f16812l;
                    n.b(obj);
                }
                androidx.room.c cVar = eVar.f16802b;
                l.f(tables, "tables");
                ReentrantLock reentrantLock = cVar.f16793e;
                reentrantLock.lock();
                try {
                    List<f> listG0 = C2097r.G0(cVar.f16792d.values());
                    reentrantLock.unlock();
                    for (f fVar : listG0) {
                        c.a aVar2 = fVar.f16818a;
                        aVar2.getClass();
                        if (!(aVar2 instanceof b)) {
                            String[] strArr2 = fVar.f16820c;
                            int length = strArr2.length;
                            Set<String> setA = C2101v.f18583b;
                            if (length != 0) {
                                if (length != 1) {
                                    C4289g c4289g = new C4289g();
                                    for (String str : tables) {
                                        int length2 = strArr2.length;
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < length2) {
                                                String str2 = strArr2[i10];
                                                if (y9.n.U(str2, str, true)) {
                                                    c4289g.add(str2);
                                                    break;
                                                }
                                                i10++;
                                            }
                                        }
                                    }
                                    setA = C2079C.a(c4289g);
                                } else {
                                    Set set = tables;
                                    if (!(set instanceof Collection) || !set.isEmpty()) {
                                        Iterator it = set.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (y9.n.U((String) it.next(), strArr2[0], true)) {
                                                setA = fVar.f16821d;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!setA.isEmpty()) {
                                fVar.f16818a.a(setA);
                            }
                        }
                    }
                    return C1992A.f18074a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, androidx.room.a.f16784e8);
        }

        @Override // androidx.room.a
        public final void c(String[] tables) {
            l.f(tables, "tables");
            e eVar = e.this;
            C0575f.e(eVar.f16804d, null, null, new C0265a(tables, eVar, null), 3);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class b extends c.a {
        public b(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.a
        public final void a(Set<String> tables) {
            l.f(tables, "tables");
            e eVar = e.this;
            if (eVar.f16805e.get()) {
                return;
            }
            try {
                androidx.room.b bVar = eVar.f16807g;
                if (bVar != null) {
                    bVar.p(eVar.f16806f, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e4) {
                Log.w("ROOM", "Cannot broadcast invalidation", e4);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class c implements ServiceConnection {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v9, types: [androidx.room.b] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder service) {
            b.a.C0264a c0264a;
            l.f(name, "name");
            l.f(service, "service");
            int i = b.a.f16787b;
            IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(androidx.room.b.f16786f8);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.b)) {
                b.a.C0264a c0264a2 = new b.a.C0264a();
                c0264a2.f16788b = service;
                c0264a = c0264a2;
            } else {
                c0264a = (androidx.room.b) iInterfaceQueryLocalInterface;
            }
            e eVar = e.this;
            eVar.f16807g = c0264a;
            try {
                eVar.f16806f = c0264a.e(eVar.f16809j, eVar.f16801a);
            } catch (RemoteException e4) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e4);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            l.f(name, "name");
            e.this.f16807g = null;
        }
    }

    public e(Context context, String name, androidx.room.c cVar) {
        l.f(context, "context");
        l.f(name, "name");
        this.f16801a = name;
        this.f16802b = cVar;
        this.f16803c = context.getApplicationContext();
        C0663f c0663f = cVar.f16789a.f47232a;
        if (c0663f == null) {
            l.l("coroutineScope");
            throw null;
        }
        this.f16804d = c0663f;
        this.f16805e = new AtomicBoolean(true);
        this.f16808h = D9.E.a(0, C9.a.SUSPEND);
        this.i = new b(cVar.f16790b);
        this.f16809j = new a();
        this.f16810k = new c();
    }

    public final void a(Intent serviceIntent) {
        l.f(serviceIntent, "serviceIntent");
        if (this.f16805e.compareAndSet(true, false)) {
            this.f16803c.bindService(serviceIntent, this.f16810k, 1);
            androidx.room.c cVar = this.f16802b;
            b observer = this.i;
            l.f(observer, "observer");
            u uVar = cVar.f16791c;
            uVar.getClass();
            String[] strArr = observer.f16798a;
            C4289g c4289g = new C4289g();
            for (String str : strArr) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                l.e(lowerCase, "toLowerCase(...)");
                Set set = (Set) uVar.f47286c.get(lowerCase);
                if (set != null) {
                    c4289g.addAll(set);
                } else {
                    c4289g.add(str);
                }
            }
            String[] strArr2 = (String[]) C2079C.a(c4289g).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                String str2 = strArr2[i];
                LinkedHashMap linkedHashMap = uVar.f47289f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                l.e(lowerCase2, "toLowerCase(...)");
                Integer num = (Integer) linkedHashMap.get(lowerCase2);
                if (num == null) {
                    throw new IllegalArgumentException("There is no table with name ".concat(str2));
                }
                iArr[i] = num.intValue();
            }
            f fVar = new f(observer, iArr, strArr2);
            ReentrantLock reentrantLock = cVar.f16793e;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap2 = cVar.f16792d;
            try {
                f fVar2 = linkedHashMap2.containsKey(observer) ? (f) C2078B.n(linkedHashMap2, observer) : (f) linkedHashMap2.put(observer, fVar);
                reentrantLock.unlock();
                if (fVar2 == null) {
                    w1.f fVar3 = uVar.f47291h;
                    fVar3.getClass();
                    ReentrantLock reentrantLock2 = fVar3.f47221a;
                    reentrantLock2.lock();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArr[i10];
                            long[] jArr = fVar3.f47222b;
                            long j4 = jArr[i11];
                            jArr[i11] = 1 + j4;
                            if (j4 == 0) {
                                fVar3.f47224d = true;
                            }
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
