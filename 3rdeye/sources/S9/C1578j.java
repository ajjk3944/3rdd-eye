package S9;

import R9.C1565b;
import b9.C1992A;
import b9.C1994a;
import b9.C1996c;
import c9.C2087h;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ArrayPools.kt */
/* renamed from: S9.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1578j {

    /* renamed from: a, reason: collision with root package name */
    public int f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12089b;

    public C1578j(R9.g gVar, AbstractC1569a abstractC1569a) {
        this.f12089b = abstractC1569a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:23:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(S9.C1578j r12, b9.AbstractC1995b r13, h9.AbstractC4424a r14) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.C1578j.a(S9.j, b9.b, h9.a):java.lang.Object");
    }

    public R9.i b() {
        R9.i zVar;
        Object obj;
        Object objInvoke;
        AbstractC1569a abstractC1569a = (AbstractC1569a) this.f12089b;
        byte bW = abstractC1569a.w();
        if (bW == 1) {
            return d(true);
        }
        if (bW == 0) {
            return d(false);
        }
        if (bW != 6) {
            if (bW == 8) {
                return c();
            }
            AbstractC1569a.s(abstractC1569a, "Cannot begin reading element, unexpected token: " + ((int) bW), 0, 6);
            throw null;
        }
        int i = this.f12088a + 1;
        this.f12088a = i;
        if (i == 200) {
            J j4 = new J(this, null);
            C1992A c1992a = C1992A.f18074a;
            g9.a aVar = C1994a.f18077a;
            C1996c c1996c = new C1996c();
            c1996c.f18078b = j4;
            c1996c.f18079c = c1992a;
            c1996c.f18080d = c1996c;
            g9.a aVar2 = C1994a.f18077a;
            c1996c.f18081e = aVar2;
            while (true) {
                obj = c1996c.f18081e;
                InterfaceC4347e<? super R9.i> interfaceC4347e = c1996c.f18080d;
                if (interfaceC4347e == null) {
                    break;
                }
                if (kotlin.jvm.internal.l.b(aVar2, obj)) {
                    try {
                        J j10 = c1996c.f18078b;
                        C1992A c1992a2 = c1996c.f18079c;
                        if (androidx.work.s.n(j10)) {
                            kotlin.jvm.internal.z.b(3, j10);
                            objInvoke = j10.invoke(c1996c, c1992a2, interfaceC4347e);
                        } else {
                            kotlin.jvm.internal.l.f(j10, "<this>");
                            InterfaceC4350h context = interfaceC4347e.getContext();
                            InterfaceC4347e<? super R9.i> dVar = context == C4351i.f37871b ? new g9.d(interfaceC4347e) : new g9.e(interfaceC4347e, context);
                            kotlin.jvm.internal.z.b(3, j10);
                            objInvoke = j10.invoke(c1996c, c1992a2, dVar);
                        }
                        if (objInvoke != g9.a.COROUTINE_SUSPENDED) {
                            interfaceC4347e.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        interfaceC4347e.resumeWith(b9.n.a(th));
                    }
                } else {
                    c1996c.f18081e = aVar2;
                    interfaceC4347e.resumeWith(obj);
                }
            }
            b9.n.b(obj);
            zVar = (R9.i) obj;
        } else {
            byte bH = abstractC1569a.h((byte) 6);
            if (abstractC1569a.w() == 4) {
                AbstractC1569a.s(abstractC1569a, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!abstractC1569a.c()) {
                    break;
                }
                String strK = abstractC1569a.k();
                abstractC1569a.h((byte) 5);
                linkedHashMap.put(strK, b());
                bH = abstractC1569a.g();
                if (bH != 4) {
                    if (bH != 7) {
                        AbstractC1569a.s(abstractC1569a, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (bH == 6) {
                abstractC1569a.h((byte) 7);
            } else if (bH == 4) {
                AbstractC1569a.s(abstractC1569a, "Unexpected trailing comma", 0, 6);
                throw null;
            }
            zVar = new R9.z(linkedHashMap);
        }
        this.f12088a--;
        return zVar;
    }

    public C1565b c() {
        AbstractC1569a abstractC1569a = (AbstractC1569a) this.f12089b;
        byte bG = abstractC1569a.g();
        if (abstractC1569a.w() == 4) {
            AbstractC1569a.s(abstractC1569a, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractC1569a.c()) {
            arrayList.add(b());
            bG = abstractC1569a.g();
            if (bG != 4) {
                boolean z10 = bG == 9;
                int i = abstractC1569a.f12066a;
                if (!z10) {
                    AbstractC1569a.s(abstractC1569a, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            abstractC1569a.h((byte) 9);
        } else if (bG == 4) {
            AbstractC1569a.s(abstractC1569a, "Unexpected trailing comma", 0, 6);
            throw null;
        }
        return new C1565b(arrayList);
    }

    public R9.C d(boolean z10) {
        AbstractC1569a abstractC1569a = (AbstractC1569a) this.f12089b;
        String strM = !z10 ? abstractC1569a.m() : abstractC1569a.k();
        return (z10 || !kotlin.jvm.internal.l.b(strM, "null")) ? new R9.u(strM, z10, null) : R9.x.INSTANCE;
    }

    public void e(byte[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        synchronized (this) {
            try {
                int i = this.f12088a;
                if (array.length + i < C1575g.f12085a) {
                    this.f12088a = i + (array.length / 2);
                    ((C2087h) this.f12089b).e(array);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] f(int i) {
        byte[] bArr;
        synchronized (this) {
            C2087h c2087h = (C2087h) this.f12089b;
            bArr = null;
            byte[] bArr2 = (byte[]) (c2087h.isEmpty() ? null : c2087h.o());
            if (bArr2 != null) {
                this.f12088a -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public C1578j() {
        this.f12089b = new C2087h();
    }
}
