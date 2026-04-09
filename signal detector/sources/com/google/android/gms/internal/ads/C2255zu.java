package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2255zu implements BD, c3.c, YA, XJ, InterfaceC2121xL, InterfaceC0801Wn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17989a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17990b;

    public C2255zu() {
        this.f17989a = 6;
    }

    @Override // c3.c
    public /* synthetic */ void a(Exception exc) {
        C1431kf c1431kf = (C1431kf) this.f17990b;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((Cw) c1431kf.f15175d).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f17989a) {
            case 9:
                ((D6) obj).f0((C1161fd) this.f17990b);
                break;
            case 10:
                ((CO) obj).l((TP) this.f17990b);
                break;
            default:
                ((CO) obj).e((HN) this.f17990b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.XJ
    public Object c(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            Provider provider = Security.getProvider(strArr[i3]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((InterfaceC0877aK) this.f17990b).d(str, (Provider) obj);
            } catch (Exception e6) {
                if (exc == null) {
                    exc = e6;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        switch (this.f17989a) {
            case 1:
                ((Su) this.f17990b).a();
                return;
            case 2:
                Ev ev = (Ev) this.f17990b;
                synchronized (ev) {
                    try {
                        ev.f8034m.set(false);
                        if (obj != null) {
                            ev.f8032k.a();
                            ev.f8038q.set(true);
                            ev.b(obj);
                        }
                        if (obj == null || ev.f8028f == null) {
                            ev.c(obj == null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((C1894tA) this.f17990b).c();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.YA
    public Iterator e(C1448kw c1448kw, CharSequence charSequence) {
        return new VA(charSequence, new C1014cu(((OA) this.f17990b).f10167c.matcher(charSequence)), 1);
    }

    public void g(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z6 = true;
            while (it.hasNext()) {
                if (!z6) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z6 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            AB ab = (AB) this.f17990b;
            if (ab == null) {
                ab = new AB();
                this.f17990b = ab;
            }
            GB gbM = (GB) ab.get(obj);
            if (gbM == null) {
                gbM = RB.m(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                AB ab2 = (AB) this.f17990b;
                if (ab2 == null) {
                    ab2 = new AB();
                    this.f17990b = ab2;
                }
                ab2.put(obj, gbM);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                C1476lN.g(obj, next);
                gbM.c(next);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public boolean k(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC2121xL[]) this.f17990b)[i].k(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public GL m(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC2121xL interfaceC2121xL = ((InterfaceC2121xL[]) this.f17990b)[i];
            if (interfaceC2121xL.k(cls)) {
                return interfaceC2121xL.m(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        switch (this.f17989a) {
            case 1:
                return;
            case 2:
                Ev ev = (Ev) this.f17990b;
                synchronized (ev) {
                    try {
                        ev.f8034m.set(false);
                        if ((th instanceof Bv) && ((Bv) th).f7465a == 0) {
                            throw null;
                        }
                        ev.c(true);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                C1894tA c1894tA = (C1894tA) this.f17990b;
                c1894tA.b(th);
                c1894tA.c();
                return;
        }
    }

    public /* synthetic */ C2255zu(int i, Object obj) {
        this.f17989a = i;
        this.f17990b = obj;
    }

    public /* synthetic */ C2255zu(BO bo, HN hn) {
        this.f17989a = 11;
        this.f17990b = hn;
    }

    public /* synthetic */ C2255zu(BO bo, TP tp, CN cn) {
        this.f17989a = 10;
        this.f17990b = tp;
    }

    public C2255zu(C1948uA c1948uA, C1894tA c1894tA) {
        this.f17989a = 4;
        this.f17990b = c1894tA;
        Objects.requireNonNull(c1948uA);
    }

    private final void f(Throwable th) {
    }
}
