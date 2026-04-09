package h7;

import java.io.EOFException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10178a;

    /* renamed from: b, reason: collision with root package name */
    public int f10179b;

    /* renamed from: c, reason: collision with root package name */
    public int f10180c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10181d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10182e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10183f;

    public p(int i10) {
        this.f10178a = i10;
        switch (i10) {
            case 2:
                this.f10182e = new ka.e(1);
                this.f10183f = new a5.v(0, new byte[65025]);
                this.f10179b = -1;
                break;
            default:
                this.f10182e = new ka.e(0);
                this.f10183f = new fb.f(0, new byte[65025]);
                this.f10179b = -1;
                break;
        }
    }

    public static q b(ArrayDeque arrayDeque, int i10, boolean z10) {
        q qVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            qVar = (q) it.next();
            if (qVar.f10186a == i10 && qVar.f10188c == z10) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            q qVar2 = (q) it.next();
            if (z10) {
                qVar2.f10187b--;
            } else {
                qVar2.f10187b++;
            }
        }
        return qVar;
    }

    public int a(int i10) {
        int i11;
        int i12;
        switch (this.f10178a) {
            case 1:
                int i13 = 0;
                this.f10180c = 0;
                do {
                    int i14 = this.f10180c;
                    int i15 = i10 + i14;
                    ka.e eVar = (ka.e) this.f10182e;
                    if (i15 < eVar.f14241c) {
                        int[] iArr = eVar.f14244f;
                        this.f10180c = i14 + 1;
                        i11 = iArr[i15];
                        i13 += i11;
                    }
                    return i13;
                } while (i11 == 255);
                return i13;
            default:
                int i16 = 0;
                this.f10180c = 0;
                do {
                    int i17 = this.f10180c;
                    int i18 = i10 + i17;
                    ka.e eVar2 = (ka.e) this.f10182e;
                    if (i18 < eVar2.f14241c) {
                        int[] iArr2 = eVar2.f14244f;
                        this.f10180c = i17 + 1;
                        i12 = iArr2[i18];
                        i16 += i12;
                    }
                    return i16;
                } while (i12 == 255);
                return i16;
        }
    }

    public boolean c(ca.l lVar) {
        int i10;
        ka.e eVar = (ka.e) this.f10182e;
        fb.f fVar = (fb.f) this.f10183f;
        qb.b.j(lVar != null);
        if (this.f10181d) {
            this.f10181d = false;
            fVar.v(0);
        }
        while (!this.f10181d) {
            if (this.f10179b < 0) {
                if (eVar.c(lVar, -1L) && eVar.a(lVar, true)) {
                    int iA = eVar.f14242d;
                    if ((eVar.f14239a & 1) == 1 && fVar.f8802c == 0) {
                        iA += a(0);
                        i10 = this.f10180c;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.m(iA);
                        this.f10179b = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f10179b);
            int i11 = this.f10179b + this.f10180c;
            if (iA2 > 0) {
                fVar.b(fVar.f8802c + iA2);
                try {
                    lVar.readFully(fVar.f8800a, fVar.f8802c, iA2);
                    fVar.x(fVar.f8802c + iA2);
                    this.f10181d = eVar.f14244f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == eVar.f14241c) {
                i11 = -1;
            }
            this.f10179b = i11;
        }
        return true;
    }

    public boolean d(u5.l lVar) {
        int i10;
        ka.e eVar = (ka.e) this.f10182e;
        a5.v vVar = (a5.v) this.f10183f;
        a5.a.i(lVar != null);
        if (this.f10181d) {
            this.f10181d = false;
            vVar.B(0);
        }
        while (!this.f10181d) {
            if (this.f10179b < 0) {
                if (eVar.d(lVar, -1L) && eVar.b(lVar, true)) {
                    int iA = eVar.f14242d;
                    if ((eVar.f14239a & 1) == 1 && vVar.f167c == 0) {
                        iA += a(0);
                        i10 = this.f10180c;
                    } else {
                        i10 = 0;
                    }
                    try {
                        lVar.m(iA);
                        this.f10179b = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f10179b);
            int i11 = this.f10179b + this.f10180c;
            if (iA2 > 0) {
                vVar.b(vVar.f167c + iA2);
                try {
                    lVar.readFully(vVar.f165a, vVar.f167c, iA2);
                    vVar.D(vVar.f167c + iA2);
                    this.f10181d = eVar.f14244f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == eVar.f14241c) {
                i11 = -1;
            }
            this.f10179b = i11;
        }
        return true;
    }

    public p(zj.c cVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i10;
        o oVar;
        int i11;
        this.f10178a = 0;
        this.f10182e = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f10183f = cVar;
        int size = ((List) cVar.f27442d).size();
        this.f10179b = size;
        int size2 = ((List) cVar.f27443g).size();
        this.f10180c = size2;
        this.f10181d = true;
        o oVar2 = arrayList.isEmpty() ? null : (o) arrayList.get(0);
        if (oVar2 == null || oVar2.f10172a != 0 || oVar2.f10173b != 0) {
            arrayList.add(0, new o(0, 0, 0));
        }
        arrayList.add(new o(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar3 = (o) it.next();
            for (int i12 = 0; i12 < oVar3.f10174c; i12++) {
                int i13 = oVar3.f10172a + i12;
                int i14 = oVar3.f10173b + i12;
                int i15 = cVar.b(i13, i14) ? 1 : 2;
                iArr[i13] = (i14 << 4) | i15;
                iArr2[i14] = (i13 << 4) | i15;
            }
        }
        if (this.f10181d) {
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                o oVar4 = (o) it2.next();
                while (true) {
                    i10 = oVar4.f10172a;
                    if (i16 < i10) {
                        if (iArr[i16] == 0) {
                            int size3 = arrayList.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 < size3) {
                                    oVar = (o) arrayList.get(i17);
                                    while (true) {
                                        i11 = oVar.f10173b;
                                        if (i18 < i11) {
                                            if (iArr2[i18] == 0 && cVar.c(i16, i18)) {
                                                int i19 = cVar.b(i16, i18) ? 8 : 4;
                                                iArr[i16] = (i18 << 4) | i19;
                                                iArr2[i18] = i19 | (i16 << 4);
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                i18 = oVar.f10174c + i11;
                                i17++;
                            }
                        }
                        i16++;
                    }
                }
                i16 = oVar4.f10174c + i10;
            }
        }
    }
}
