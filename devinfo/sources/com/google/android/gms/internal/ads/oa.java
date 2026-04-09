package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class oa implements r1, kb, rd0 {

    /* renamed from: e, reason: collision with root package name */
    public static final v f14615e = new v(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14616a;

    /* renamed from: b, reason: collision with root package name */
    public int f14617b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14618c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14619d;

    public /* synthetic */ oa(int i4, ye yeVar, ye yeVar2) {
        this.f14616a = 9;
        this.f14617b = i4;
        this.f14618c = yeVar;
        this.f14619d = yeVar2;
    }

    public static oa d(String str, boolean z3) {
        return new oa(str, Boolean.valueOf(z3), 1);
    }

    public static oa l(long j, String str) {
        return new oa(str, Long.valueOf(j), 2);
    }

    @Override // com.google.android.gms.internal.ads.r1
    public void a() {
        switch (this.f14616a) {
            case 1:
                break;
            default:
                byte[] bArr = bq0.f9769b;
                int length = bArr.length;
                ((sk0) this.f14619d).z(0, bArr);
                break;
        }
    }

    public int b() {
        int i4 = this.f14617b;
        if (i4 != 2) {
            return i4 != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public /* synthetic */ void mo160c(Object obj) {
        int i4 = it1.f12446e0;
        ((ke) obj).U1(this.f14617b, (ye) this.f14618c, (ye) this.f14619d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r13 == r16) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r12 = new com.google.android.gms.internal.ads.q1(r13, r6 + r8, -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        return com.google.android.gms.internal.ads.q1.f15184d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r12;
     */
    @Override // com.google.android.gms.internal.ads.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.q1 e(com.google.android.gms.internal.ads.y1 r25, long r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa.e(com.google.android.gms.internal.ads.y1, long):com.google.android.gms.internal.ads.q1");
    }

    @Override // com.google.android.gms.internal.ads.kb
    public byte f(rb rbVar, int i4) {
        byte[] bArr = (byte[]) this.f14618c;
        int i10 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i11 = 1761855727 % 1384724137;
        int i12 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i13 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i14 = 1694830070 % 1383960411;
        int i15 = i4 >>> i12;
        if (i15 != this.f14617b) {
            ((lb) this.f14619d).h(i15, bArr);
            this.f14617b = i15;
        }
        int i16 = i13 ^ i14;
        return (byte) (((rbVar.b(i4) ^ bArr[i4 % (i10 ^ i11)]) << i16) >> i16);
    }

    public Object g(int i4) {
        SparseArray sparseArray = (SparseArray) this.f14618c;
        if (this.f14617b == -1) {
            this.f14617b = 0;
        }
        while (true) {
            int i10 = this.f14617b;
            if (i10 <= 0 || i4 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f14617b--;
        }
        while (this.f14617b < sparseArray.size() - 1 && i4 >= sparseArray.keyAt(this.f14617b + 1)) {
            this.f14617b++;
        }
        return sparseArray.valueAt(this.f14617b);
    }

    public synchronized void h() {
        ((ExecutorService) ((m8.s) this.f14619d).f28984c).execute(new s(10, this));
    }

    public void i(Object obj, Object obj2) {
        int i4 = this.f14617b + 1;
        Object[] objArr = (Object[]) this.f14618c;
        int length = objArr.length;
        int i10 = i4 + i4;
        if (i10 > length) {
            this.f14618c = Arrays.copyOf(objArr, s41.d(length, i10));
        }
        yr1.h(obj, obj2);
        Object[] objArr2 = (Object[]) this.f14618c;
        int i11 = this.f14617b;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f14617b = i11 + 1;
    }

    public synchronized byte[] j(int i4) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f14619d;
            if (i10 >= arrayList.size()) {
                return new byte[i4];
            }
            byte[] bArr = (byte[]) arrayList.get(i10);
            int length = bArr.length;
            if (length >= i4) {
                this.f14617b -= length;
                arrayList.remove(i10);
                ((ArrayList) this.f14618c).remove(bArr);
                return bArr;
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb
    public rb k(rb rbVar, int i4, int i10) {
        if (i4 < 0 || i4 > i10 || i10 > rbVar.f15610a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i10 - i4];
        int i11 = 0;
        while (i4 < i10) {
            bArr[i11] = f(rbVar, i4);
            i4++;
            i11++;
        }
        return rb.e(bArr);
    }

    public void m(ch chVar) {
        synchronized (this.f14618c) {
            try {
                Iterator it = ((LinkedList) this.f14619d).iterator();
                while (it.hasNext()) {
                    ch chVar2 = (ch) it.next();
                    ua.j jVar = ua.j.C;
                    if (jVar.f35265h.i().p()) {
                        if (!jVar.f35265h.i().q() && !chVar.equals(chVar2) && chVar2.f10132q.equals(chVar.f10132q)) {
                            it.remove();
                            return;
                        }
                    } else if (!chVar.equals(chVar2) && chVar2.f10130o.equals(chVar.f10130o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(Set set) {
        if (set instanceof Collection) {
            int size = set.size() + this.f14617b;
            Object[] objArr = (Object[]) this.f14618c;
            int length = objArr.length;
            int i4 = size + size;
            if (i4 > length) {
                this.f14618c = Arrays.copyOf(objArr, s41.d(length, i4));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void o(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f14618c).add(bArr);
                ArrayList arrayList = (ArrayList) this.f14619d;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f14615e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f14617b += length;
                s();
            }
        }
    }

    public long q(y1 y1Var) {
        int iP1;
        c2 c2Var = (c2) this.f14619d;
        e2 e2Var = (e2) this.f14618c;
        while (y1Var.F1() < y1Var.H1() - 6) {
            int i4 = this.f14617b;
            long jF1 = y1Var.F1();
            sk0 sk0Var = new sk0(17);
            int i10 = 0;
            y1Var.M1(0, 2, sk0Var.f16446a);
            if (sk0Var.r(0, ByteOrder.BIG_ENDIAN) != i4) {
                y1Var.B1();
                y1Var.J1((int) (jF1 - y1Var.G1()));
            } else {
                byte[] bArr = sk0Var.f16446a;
                while (i10 < 15 && (iP1 = y1Var.P1(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += iP1;
                }
                sk0Var.C(i10 + 2);
                y1Var.B1();
                y1Var.J1((int) (jF1 - y1Var.G1()));
                if (ls.j(sk0Var, e2Var, i4, c2Var)) {
                    break;
                }
            }
            y1Var.J1(1);
        }
        if (y1Var.F1() < y1Var.H1() - 6) {
            return c2Var.f9923a;
        }
        y1Var.J1((int) (y1Var.H1() - y1Var.F1()));
        return e2Var.j;
    }

    public z51 r() {
        return v(true);
    }

    public synchronized void s() {
        while (this.f14617b > 4096) {
            byte[] bArr = (byte[]) ((ArrayList) this.f14618c).remove(0);
            ((ArrayList) this.f14619d).remove(bArr);
            this.f14617b -= bArr.length;
        }
    }

    public void t(ch chVar) {
        synchronized (this.f14618c) {
            try {
                LinkedList linkedList = (LinkedList) this.f14619d;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    za.i.c(sb2.toString());
                    linkedList.remove(0);
                }
                int i4 = this.f14617b;
                this.f14617b = i4 + 1;
                chVar.f10127l = i4;
                chVar.c();
                linkedList.add(chVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object u() {
        String str = (String) this.f14618c;
        Object obj = this.f14619d;
        qk qkVar = (qk) im.f12376a.get();
        if (qkVar == null) {
            if (im.f12377b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = qkVar.f15353a;
        int i4 = this.f14617b - 1;
        if (i4 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i4 == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        if (i4 != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public z51 v(boolean z3) {
        y41 y41Var;
        y41 y41Var2;
        if (z3 && (y41Var2 = (y41) this.f14619d) != null) {
            throw y41Var2.a();
        }
        z51 z51VarD = z51.d(this.f14617b, (Object[]) this.f14618c, this);
        if (!z3 || (y41Var = (y41) this.f14619d) == null) {
            return z51VarD;
        }
        throw y41Var.a();
    }

    @Override // com.google.android.gms.internal.ads.kb
    public /* bridge */ /* synthetic */ kb zzc() {
        return new oa((lb) this.f14619d);
    }

    public oa(e2 e2Var, int i4) {
        this.f14616a = 1;
        this.f14618c = e2Var;
        this.f14617b = i4;
        this.f14619d = new c2();
    }

    public oa(lb lbVar) {
        this.f14616a = 4;
        this.f14617b = -1;
        this.f14618c = new byte[8];
        this.f14619d = lbVar;
    }

    public oa(String str, Object obj, int i4) {
        this.f14616a = 7;
        this.f14618c = str;
        this.f14619d = obj;
        this.f14617b = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oa(byte b10, int i4) {
        this(4);
        this.f14616a = i4;
        switch (i4) {
            case 5:
                this.f14618c = new Object();
                this.f14619d = new LinkedList();
                break;
            case 8:
                break;
            case 10:
                uu1 uu1Var = uu1.j;
                this.f14618c = new SparseArray();
                this.f14619d = uu1Var;
                this.f14617b = -1;
                break;
            default:
                this.f14618c = new ArrayList();
                this.f14619d = new ArrayList(64);
                this.f14617b = 0;
                break;
        }
    }

    public oa(int i4, zo0 zo0Var) {
        this.f14616a = 2;
        this.f14617b = i4;
        this.f14618c = zo0Var;
        this.f14619d = new sk0();
    }

    public oa(int i4, String str, int i10, ArrayList arrayList, byte[] bArr) {
        this.f14616a = 3;
        this.f14617b = i10;
        this.f14618c = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.f14619d = bArr;
    }

    public /* synthetic */ oa(m8.s sVar, byte[] bArr) {
        this.f14616a = 6;
        Objects.requireNonNull(sVar);
        this.f14619d = sVar;
        this.f14618c = bArr;
    }

    public oa(int i4) {
        this.f14616a = 8;
        this.f14618c = new Object[i4 + i4];
        this.f14617b = 0;
    }

    private final /* synthetic */ void p() {
    }
}
