package E7;

import B7.d;
import B7.e;
import C.S;
import D7.f;
import F3.m;
import F3.s;
import F3.t;
import H6.C0671h;
import N7.U3;
import T1.r;
import W.b0;
import a9.InterfaceC1676a;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C1687f;
import androidx.camera.core.impl.C1689g;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1678a0;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import b2.C1834o;
import b9.C1992A;
import b9.l;
import c0.C2039k;
import c9.C2097r;
import com.android.billingclient.api.BillingResult;
import d0.D;
import d0.InterfaceC4256C;
import d0.y;
import d1.C4261a;
import d1.C4263c;
import d1.C4265e;
import d1.g;
import g.C4353a;
import i6.C4458a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p9.InterfaceC5480a;
import t4.C5606d;
import w1.k;
import z7.c;

/* compiled from: InMemoryDivStateCache.kt */
/* loaded from: classes.dex */
public final class b implements A3.b, InterfaceC1678a0, f {

    /* renamed from: b, reason: collision with root package name */
    public Object f1475b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1476c;

    public b(BillingResult billingResult, ArrayList arrayList) {
        this.f1475b = arrayList;
        this.f1476c = billingResult;
    }

    @Override // D7.f
    public c a() {
        return (A3.c) this.f1476c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public boolean b(int i) {
        return k(i) != null;
    }

    @Override // D7.f
    public B7.f c() {
        return (e) this.f1475b;
    }

    @Override // D7.f
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // androidx.camera.core.impl.InterfaceC1678a0
    public InterfaceC1680b0 f(int i) {
        return k(i);
    }

    public boolean g() {
        synchronized (this) {
            if (((AtomicBoolean) this.f1476c).get()) {
                return false;
            }
            ((AtomicInteger) this.f1475b).incrementAndGet();
            return true;
        }
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        C5606d c5606d = new C5606d(6);
        d dVar = new d(8);
        F3.a aVar = F3.e.f1606a;
        if (aVar != null) {
            return new m(c5606d, dVar, aVar, (s) ((t) this.f1475b).get(), (InterfaceC1676a) this.f1476c);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public boolean h(C1834o c1834o) {
        boolean zContainsKey;
        synchronized (this.f1475b) {
            zContainsKey = ((LinkedHashMap) this.f1476c).containsKey(c1834o);
        }
        return zContainsKey;
    }

    public void i() throws IOException {
        String str = (String) this.f1475b;
        try {
            T4.e eVar = (T4.e) this.f1476c;
            eVar.getClass();
            new File(eVar.f12285c, str).createNewFile();
        } catch (IOException e4) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e4);
        }
    }

    public KeyListener j(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C4261a) this.f1476c).f37321a.getClass();
        if (keyListener instanceof C4265e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C4265e(keyListener);
    }

    public InterfaceC1680b0 k(int i) {
        HashMap map = (HashMap) this.f1476c;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? ((InterfaceC1678a0) this.f1475b).f(i) : (InterfaceC1680b0) map.get(Integer.valueOf(i));
    }

    public String l(String str, String str2) {
        return (String) ((Map) this.f1475b).get(new l(str, str2));
    }

    public void m(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1475b).getContext().obtainStyledAttributes(attributeSet, C4353a.i, i, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            q(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public C4263c n(InputConnection inputConnection, EditorInfo editorInfo) {
        C4261a c4261a = (C4261a) this.f1476c;
        if (inputConnection == null) {
            c4261a.getClass();
            inputConnection = null;
        } else {
            C4261a.C0436a c0436a = c4261a.f37321a;
            c0436a.getClass();
            if (!(inputConnection instanceof C4263c)) {
                inputConnection = new C4263c(c0436a.f37322a, inputConnection, editorInfo);
            }
        }
        return (C4263c) inputConnection;
    }

    public r o(C1834o c1834o) {
        r rVar;
        synchronized (this.f1475b) {
            rVar = (r) ((LinkedHashMap) this.f1476c).remove(c1834o);
        }
        return rVar;
    }

    public List p(String workSpecId) {
        List listG0;
        kotlin.jvm.internal.l.f(workSpecId, "workSpecId");
        synchronized (this.f1475b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1476c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.l.b(((C1834o) entry.getKey()).f17128a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f1476c).remove((C1834o) it.next());
                }
                listG0 = C2097r.G0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listG0;
    }

    public void q(boolean z10) {
        g gVar = ((C4261a) this.f1476c).f37321a.f37323b;
        if (gVar.f37342d != z10) {
            if (gVar.f37341c != null) {
                androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
                g.a aVar = gVar.f37341c;
                cVarA.getClass();
                A2.l.p(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = cVarA.f15715a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    cVarA.f15716b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f37342d = z10;
            if (z10) {
                g.a(gVar.f37340b, androidx.emoji2.text.c.a().b());
            }
        }
    }

    public r r(C1834o c1834o) {
        r rVar;
        synchronized (this.f1475b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1476c;
                Object rVar2 = linkedHashMap.get(c1834o);
                if (rVar2 == null) {
                    rVar2 = new r(c1834o);
                    linkedHashMap.put(c1834o, rVar2);
                }
                rVar = (r) rVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public void s() {
        synchronized (this) {
            ((AtomicInteger) this.f1475b).decrementAndGet();
            if (((AtomicInteger) this.f1475b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public void t(U3 u32, C4458a tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        if (tag.equals(((C0671h) this.f1475b).f2144a) && ((C0671h) this.f1475b).f2145b == u32) {
            return;
        }
        this.f1475b = new C0671h(u32, tag);
        Iterator it = ((ArrayList) this.f1476c).iterator();
        while (it.hasNext()) {
            ((p9.l) it.next()).invoke((C0671h) this.f1475b);
        }
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f1475b = obj;
        this.f1476c = obj2;
    }

    public b(int i) {
        switch (i) {
            case 3:
                this.f1475b = new C0671h(null, C4458a.f38454b);
                this.f1476c = new ArrayList();
                break;
            case 4:
                J5.a aVar = new J5.a();
                this.f1475b = aVar;
                this.f1476c = new A3.c(aVar, 2);
                break;
            case 5:
            default:
                this.f1475b = Collections.synchronizedMap(new LinkedHashMap());
                this.f1476c = Collections.synchronizedMap(new LinkedHashMap());
                break;
            case 6:
                this.f1475b = new Object();
                this.f1476c = new LinkedHashMap();
                break;
        }
    }

    public b(K7.a aVar, c cVar) {
        this.f1475b = aVar;
        this.f1476c = cVar;
        new H7.e((InterfaceC5480a) new A6.g(this, 3));
    }

    public b(k.e eVar) {
        this.f1475b = new AtomicInteger(0);
        this.f1476c = new AtomicBoolean(false);
    }

    public b(EditText editText) {
        this.f1475b = editText;
        this.f1476c = new C4261a(editText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public b(I i, InterfaceC1678a0 interfaceC1678a0, C0 c02) {
        Range<Integer> rangeC;
        this.f1475b = interfaceC1678a0;
        ArrayList arrayListF = c02.f(ExtraSupportedQualityQuirk.class);
        if (arrayListF.isEmpty()) {
            return;
        }
        ?? map = 0;
        InterfaceC4256C interfaceC4256CK = null;
        map = 0;
        map = 0;
        A2.l.q(null, arrayListF.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListF.get(0)).getClass();
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            if ("1".equals(i.d()) && !interfaceC1678a0.b(4)) {
                InterfaceC1680b0 interfaceC1680b0F = interfaceC1678a0.f(1);
                InterfaceC1680b0.c cVar = (interfaceC1680b0F == null || interfaceC1680b0F.d().isEmpty()) ? null : interfaceC1680b0F.d().get(0);
                if (cVar != null) {
                    try {
                        interfaceC4256CK = f0.c.k(D.k(C2039k.d(cVar)), null);
                    } catch (y e4) {
                        S.h("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e4);
                    }
                    if (interfaceC4256CK != null) {
                        rangeC = interfaceC4256CK.c();
                    } else {
                        rangeC = b0.f13236b;
                    }
                    Range<Integer> range = rangeC;
                    Size size = M.c.f4113d;
                    C1687f c1687fE = InterfaceC1680b0.b.e(interfaceC1680b0F.a(), interfaceC1680b0F.b(), interfaceC1680b0F.c(), Collections.singletonList(new C1689g(cVar.d(), cVar.h(), C2039k.c(cVar.b(), cVar.a(), cVar.a(), cVar.e(), cVar.e(), size.getWidth(), cVar.j(), size.getHeight(), cVar.g(), range), cVar.e(), size.getWidth(), size.getHeight(), cVar.i(), cVar.a(), cVar.c(), cVar.f())));
                    map = new HashMap();
                    map.put(4, c1687fE);
                    Size size2 = new Size(cVar.j(), cVar.g());
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        map.put(1, c1687fE);
                    }
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != 0) {
            this.f1476c = new HashMap((Map) map);
        }
    }
}
