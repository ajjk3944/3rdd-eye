package D9;

import P7.C1484a;
import Q9.C1523c0;
import Q9.C1541l0;
import Q9.C1555t;
import Q9.C1557u;
import Q9.InterfaceC1543m0;
import Q9.S;
import V5.a;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C1835p;
import b2.C1837r;
import b2.InterfaceC1836q;
import c9.C2092m;
import com.yandex.mobile.ads.impl.e20;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m0.C5308a;
import v6.C5681a;
import v6.InterfaceC5682b;
import w6.C5739c;
import w6.InterfaceC5740d;
import w9.InterfaceC5748c;

/* compiled from: Share.kt */
/* loaded from: classes3.dex */
public final class G implements InterfaceC1543m0, InterfaceC1836q, a7.k, InterfaceC5740d, A3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1156b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1157c;

    public /* synthetic */ G(Object obj, Object obj2) {
        this.f1156b = obj;
        this.f1157c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D9.G f(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            D9.G r2 = new D9.G     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L42
            r0.release()     // Catch: java.io.IOException -> L42
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.io.IOException -> L47
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.G.f(android.content.Context):D9.G");
    }

    @Override // b2.InterfaceC1836q
    public void a(C1835p c1835p) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1156b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1837r) this.f1157c).j(c1835p);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.m, p9.p] */
    @Override // Q9.InterfaceC1543m0
    public Object b(InterfaceC5748c interfaceC5748c, ArrayList arrayList) {
        Object objA;
        Object obj = ((C1557u) this.f1157c).get(E.u.C(interfaceC5748c));
        kotlin.jvm.internal.l.e(obj, "get(key)");
        C1523c0 c1523c0 = (C1523c0) obj;
        Object objA2 = c1523c0.f11477a.get();
        if (objA2 == null) {
            objA2 = c1523c0.a(new C1555t(0));
        }
        C1541l0 c1541l0 = (C1541l0) objA2;
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new S((w9.j) it.next()));
        }
        ConcurrentHashMap<List<S>, b9.m<M9.b<T>>> concurrentHashMap = c1541l0.f11503a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                objA = (M9.b) ((kotlin.jvm.internal.m) this.f1156b).invoke(interfaceC5748c, arrayList);
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            b9.m mVar = new b9.m(objA);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, mVar);
            obj2 = objPutIfAbsent == null ? mVar : objPutIfAbsent;
        }
        return ((b9.m) obj2).f18085b;
    }

    @Override // b2.InterfaceC1836q
    public ArrayList c(String str) throws IOException {
        w1.o oVarD = w1.o.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1156b;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // a7.k
    public a7.g d(String str, ArrayList arrayList) {
        try {
            return ((a7.q) this.f1156b).d(str, arrayList);
        } catch (a7.r unused) {
            return ((a7.k) ((H7.e) this.f1157c).f2291b).d(str, arrayList);
        }
    }

    @Override // a7.k
    public a7.g e(String str, ArrayList arrayList) {
        try {
            return ((a7.q) this.f1156b).e(str, arrayList);
        } catch (a7.r unused) {
            return ((a7.k) ((H7.e) this.f1157c).f2291b).e(str, arrayList);
        }
    }

    public Object g(Object obj, w9.i property) {
        kotlin.jvm.internal.l.f(property, "property");
        return this.f1157c;
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return new z3.j((Context) ((A3.c) this.f1156b).f36c, (z3.i) ((F3.t) this.f1157c).get());
    }

    public void h(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C5308a) this.f1157c)) {
            ((C5308a) this.f1157c).put(new h3.k(cls, cls2, cls3), list);
        }
    }

    @Override // w6.InterfaceC5740d
    public /* synthetic */ Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    public void i() throws IOException {
        try {
            ((FileLock) this.f1157c).release();
            ((FileChannel) this.f1156b).close();
        } catch (IOException e4) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e4);
        }
    }

    public void j(Object obj, w9.i property, Object obj2) {
        kotlin.jvm.internal.l.f(property, "property");
        if (kotlin.jvm.internal.l.b(this.f1157c, obj2)) {
            return;
        }
        this.f1157c = obj2;
        ((a.C0185a) this.f1156b).invoke();
    }

    @Override // w6.InterfaceC5740d
    public w6.e loadImage(String imageUrl, C5739c c5739c) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        Iterator it = ((List) this.f1157c).iterator();
        while (it.hasNext()) {
            imageUrl = ((InterfaceC5682b) it.next()).a(imageUrl);
        }
        return ((B0.f) this.f1156b).loadImage(imageUrl, c5739c);
    }

    @Override // w6.InterfaceC5740d
    public w6.e loadImageBytes(String imageUrl, C5739c c5739c) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        Iterator it = ((List) this.f1157c).iterator();
        while (it.hasNext()) {
            imageUrl = ((InterfaceC5682b) it.next()).a(imageUrl);
        }
        return ((B0.f) this.f1156b).loadImageBytes(imageUrl, c5739c);
    }

    public G(C1484a c1484a) {
        this.f1156b = c1484a.f10717d;
        this.f1157c = c1484a.f10719f;
    }

    public G() {
        this.f1156b = new AtomicReference();
        this.f1157c = new C5308a();
    }

    public G(e20 providedImageLoader) {
        kotlin.jvm.internal.l.f(providedImageLoader, "providedImageLoader");
        this.f1156b = new B0.f(providedImageLoader);
        this.f1157c = E.u.G(new C5681a());
    }

    public G(WorkDatabase_Impl workDatabase_Impl) {
        this.f1156b = workDatabase_Impl;
        this.f1157c = new C1837r(workDatabase_Impl);
    }

    public G(Object obj, a.C0185a c0185a) {
        this.f1156b = c0185a;
        this.f1157c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G(p9.p compute) {
        kotlin.jvm.internal.l.f(compute, "compute");
        this.f1156b = (kotlin.jvm.internal.m) compute;
        this.f1157c = new C1557u();
    }
}
