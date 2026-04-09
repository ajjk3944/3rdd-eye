package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import j$.util.Objects;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class J4 implements InterfaceC1615o0, InterfaceC1080e5, InterfaceC0801Wn {

    /* renamed from: e, reason: collision with root package name */
    public static final C2045w f9222e = new C2045w(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9223a;

    /* renamed from: b, reason: collision with root package name */
    public int f9224b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9225c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9226d;

    public /* synthetic */ J4(int i, Q6 q6, Q6 q62) {
        this.f9223a = 9;
        this.f9224b = i;
        this.f9225c = q6;
        this.f9226d = q62;
    }

    public static J4 e(String str, boolean z6) {
        return new J4(1, Boolean.valueOf(z6), str);
    }

    public static J4 m(long j6, String str) {
        return new J4(2, Long.valueOf(j6), str);
    }

    private final /* synthetic */ void q() {
    }

    public int a() {
        int i = this.f9224b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        int i = UN.f11644s0;
        ((D6) obj).h0(this.f9224b, (Q6) this.f9225c, (Q6) this.f9226d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1615o0
    /* renamed from: c */
    public void mo9c() {
        switch (this.f9223a) {
            case 1:
                break;
            default:
                byte[] bArr = Vt.f12097b;
                int length = bArr.length;
                ((C2036vr) this.f9226d).z(0, bArr);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    public byte d(C1458l5 c1458l5, int i) {
        byte[] bArr = (byte[]) this.f9225c;
        int i3 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i6 = 1761855727 % 1384724137;
        int i7 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i8 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i9 = 1694830070 % 1383960411;
        int i10 = i >>> i7;
        if (i10 != this.f9224b) {
            ((L2.w) this.f9226d).o(i10, bArr);
            this.f9224b = i10;
        }
        int i11 = i8 ^ i9;
        return (byte) (((c1458l5.b(i) ^ bArr[i % (i3 ^ i6)]) << i11) >> i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    /* renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC1080e5 mo14f() {
        return new J4((L2.w) this.f9226d);
    }

    public Object g(int i) {
        SparseArray sparseArray = (SparseArray) this.f9225c;
        if (this.f9224b == -1) {
            this.f9224b = 0;
        }
        while (true) {
            int i3 = this.f9224b;
            if (i3 <= 0 || i >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f9224b--;
        }
        while (this.f9224b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f9224b + 1)) {
            this.f9224b++;
        }
        return sparseArray.valueAt(this.f9224b);
    }

    public synchronized void h() {
        ((ExecutorService) ((A1.w) this.f9226d).f139b).execute(new RunnableC1883t(11, this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    public C1458l5 i(C1458l5 c1458l5, int i, int i3) {
        if (i < 0 || i > i3 || i3 > c1458l5.f15350a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i];
        int i6 = 0;
        while (i < i3) {
            bArr[i6] = d(c1458l5, i);
            i++;
            i6++;
        }
        return C1458l5.e(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r13 == r16) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r12 = new com.google.android.gms.internal.ads.C1561n0(r13, r6 + r8, -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        return com.google.android.gms.internal.ads.C1561n0.f15697d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r12;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1615o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.C1561n0 j(com.google.android.gms.internal.ads.InterfaceC2046w0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J4.j(com.google.android.gms.internal.ads.w0, long):com.google.android.gms.internal.ads.n0");
    }

    public void k(Object obj, Object obj2) {
        int i = this.f9224b + 1;
        Object[] objArr = (Object[]) this.f9225c;
        int length = objArr.length;
        int i3 = i + i;
        if (i3 > length) {
            this.f9225c = Arrays.copyOf(objArr, GB.d(length, i3));
        }
        C1476lN.g(obj, obj2);
        Object[] objArr2 = (Object[]) this.f9225c;
        int i6 = this.f9224b;
        int i7 = i6 + i6;
        objArr2[i7] = obj;
        objArr2[i7 + 1] = obj2;
        this.f9224b = i6 + 1;
    }

    public synchronized byte[] l(int i) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f9226d;
            if (i3 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i3);
            int length = bArr.length;
            if (length >= i) {
                this.f9224b -= length;
                arrayList.remove(i3);
                ((ArrayList) this.f9225c).remove(bArr);
                return bArr;
            }
            i3++;
        }
    }

    public void n(R7 r7) {
        synchronized (this.f9225c) {
            try {
                Iterator it = ((LinkedList) this.f9226d).iterator();
                while (it.hasNext()) {
                    R7 r72 = (R7) it.next();
                    p2.j jVar = p2.j.f22785C;
                    if (jVar.f22795h.i().p()) {
                        if (!jVar.f22795h.i().q() && !r7.equals(r72) && r72.f10860q.equals(r7.f10860q)) {
                            it.remove();
                            return;
                        }
                    } else if (!r7.equals(r72) && r72.f10858o.equals(r7.f10858o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(Set set) {
        if (A.f.y(set)) {
            int size = set.size() + this.f9224b;
            Object[] objArr = (Object[]) this.f9225c;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f9225c = Arrays.copyOf(objArr, GB.d(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void p(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f9225c).add(bArr);
                ArrayList arrayList = (ArrayList) this.f9226d;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f9222e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f9224b += length;
                t();
            }
        }
    }

    public long r(InterfaceC2046w0 interfaceC2046w0) {
        int iZ;
        A0 a02 = (A0) this.f9226d;
        C0 c02 = (C0) this.f9225c;
        while (interfaceC2046w0.n() < interfaceC2046w0.p() - 6) {
            int i = this.f9224b;
            long jN = interfaceC2046w0.n();
            C2036vr c2036vr = new C2036vr(17);
            int i3 = 0;
            interfaceC2046w0.v(0, 2, c2036vr.f17354a);
            if (c2036vr.r(0, ByteOrder.BIG_ENDIAN) != i) {
                interfaceC2046w0.i();
                interfaceC2046w0.r((int) (jN - interfaceC2046w0.o()));
            } else {
                byte[] bArr = c2036vr.f17354a;
                while (i3 < 15 && (iZ = interfaceC2046w0.z(2 + i3, 15 - i3, bArr)) != -1) {
                    i3 += iZ;
                }
                c2036vr.C(i3 + 2);
                interfaceC2046w0.i();
                interfaceC2046w0.r((int) (jN - interfaceC2046w0.o()));
                if (AbstractC0709Rg.i(c2036vr, c02, i, a02)) {
                    break;
                }
            }
            interfaceC2046w0.r(1);
        }
        if (interfaceC2046w0.n() < interfaceC2046w0.p() - 6) {
            return a02.f6910a;
        }
        interfaceC2046w0.r((int) (interfaceC2046w0.p() - interfaceC2046w0.n()));
        return c02.f7487j;
    }

    public C1465lC s() {
        return w(true);
    }

    public synchronized void t() {
        while (this.f9224b > 4096) {
            byte[] bArr = (byte[]) ((ArrayList) this.f9225c).remove(0);
            ((ArrayList) this.f9226d).remove(bArr);
            this.f9224b -= bArr.length;
        }
    }

    public void u(R7 r7) {
        synchronized (this.f9225c) {
            try {
                LinkedList linkedList = (LinkedList) this.f9226d;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    u2.k.c(sb.toString());
                    linkedList.remove(0);
                }
                int i = this.f9224b;
                this.f9224b = i + 1;
                r7.f10855l = i;
                r7.c();
                linkedList.add(r7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object v() {
        String str = (String) this.f9225c;
        Object obj = this.f9226d;
        F9 f9 = (F9) AbstractC2127xa.f17592a.get();
        if (f9 == null) {
            if (AbstractC2127xa.f17593b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = f9.f8065a;
        int i = this.f9224b - 1;
        if (i == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public C1465lC w(boolean z6) {
        MB mb;
        MB mb2;
        if (z6 && (mb2 = (MB) this.f9226d) != null) {
            throw mb2.a();
        }
        C1465lC c1465lCD = C1465lC.d(this.f9224b, (Object[]) this.f9225c, this);
        if (!z6 || (mb = (MB) this.f9226d) == null) {
            return c1465lCD;
        }
        throw mb.a();
    }

    public J4(int i, Object obj, String str) {
        this.f9223a = 7;
        this.f9225c = str;
        this.f9226d = obj;
        this.f9224b = i;
    }

    public J4(L2.w wVar) {
        this.f9223a = 4;
        this.f9224b = -1;
        this.f9225c = new byte[8];
        this.f9226d = wVar;
    }

    public J4(C0 c02, int i) {
        this.f9223a = 1;
        this.f9225c = c02;
        this.f9224b = i;
        this.f9226d = new A0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J4(int i, byte b5) {
        this(4);
        this.f9223a = i;
        switch (i) {
            case 5:
                this.f9225c = new Object();
                this.f9226d = new LinkedList();
                break;
            case 8:
                break;
            case 10:
                EO eo = EO.f7956j;
                this.f9225c = new SparseArray();
                this.f9226d = eo;
                this.f9224b = -1;
                break;
            default:
                this.f9225c = new ArrayList();
                this.f9226d = new ArrayList(64);
                this.f9224b = 0;
                break;
        }
    }

    public J4(int i, C2038vt c2038vt) {
        this.f9223a = 2;
        this.f9224b = i;
        this.f9225c = c2038vt;
        this.f9226d = new C2036vr();
    }

    public J4(int i, String str, int i3, ArrayList arrayList, byte[] bArr) {
        this.f9223a = 3;
        this.f9224b = i3;
        this.f9225c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f9226d = bArr;
    }

    public /* synthetic */ J4(A1.w wVar, byte[] bArr) {
        this.f9223a = 6;
        Objects.requireNonNull(wVar);
        this.f9226d = wVar;
        this.f9225c = bArr;
    }

    public J4(int i) {
        this.f9223a = 8;
        this.f9225c = new Object[i + i];
        this.f9224b = 0;
    }
}
