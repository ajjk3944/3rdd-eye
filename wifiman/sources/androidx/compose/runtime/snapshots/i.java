package androidx.compose.runtime.snapshots;

import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import d0.AbstractC5269a;
import d0.AbstractC5274f;
import dh.InterfaceC5380e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import nh.InterfaceC6944a;
import zi.AbstractC8782l;
import zi.AbstractC8783m;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC6944a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f28640e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f28641f = new i(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    private final long f28642a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28643b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28644c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f28645d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f28641f;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f28646b;

        /* renamed from: c, reason: collision with root package name */
        int f28647c;

        /* renamed from: d, reason: collision with root package name */
        int f28648d;

        /* renamed from: e, reason: collision with root package name */
        int f28649e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f28650f;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = i.this.new b(interfaceC5380e);
            bVar.f28650f = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8782l abstractC8782l, InterfaceC5380e interfaceC5380e) {
            return ((b) create(abstractC8782l, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    private i(long j10, long j11, int i10, int[] iArr) {
        this.f28642a = j10;
        this.f28643b = j11;
        this.f28644c = i10;
        this.f28645d = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC8783m.b(new b(null)).iterator();
    }

    public final i j(i iVar) {
        i iVarK;
        i iVar2 = f28641f;
        if (iVar == iVar2) {
            return this;
        }
        if (this == iVar2) {
            return iVar2;
        }
        int i10 = iVar.f28644c;
        int i11 = this.f28644c;
        if (i10 == i11) {
            int[] iArr = iVar.f28645d;
            int[] iArr2 = this.f28645d;
            if (iArr == iArr2) {
                return new i(this.f28642a & (~iVar.f28642a), this.f28643b & (~iVar.f28643b), i11, iArr2);
            }
        }
        int[] iArr3 = iVar.f28645d;
        if (iArr3 != null) {
            iVarK = this;
            for (int i12 : iArr3) {
                iVarK = iVarK.k(i12);
            }
        } else {
            iVarK = this;
        }
        if (iVar.f28643b != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((iVar.f28643b & (1 << i13)) != 0) {
                    iVarK = iVarK.k(iVar.f28644c + i13);
                }
            }
        }
        if (iVar.f28642a != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((iVar.f28642a & (1 << i14)) != 0) {
                    iVarK = iVarK.k(i14 + 64 + iVar.f28644c);
                }
            }
        }
        return iVarK;
    }

    public final i k(int i10) {
        int[] iArr;
        int iA;
        int i11 = this.f28644c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f28643b;
            if ((j11 & j10) != 0) {
                return new i(this.f28642a, j11 & (~j10), i11, this.f28645d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f28642a;
            if ((j13 & j12) != 0) {
                return new i(j13 & (~j12), this.f28643b, i11, this.f28645d);
            }
        } else if (i12 < 0 && (iArr = this.f28645d) != null && (iA = AbstractC5274f.a(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new i(this.f28642a, this.f28643b, this.f28644c, null);
            }
            int[] iArr2 = new int[i13];
            if (iA > 0) {
                AbstractC3682n.k(iArr, iArr2, 0, 0, iA);
            }
            if (iA < i13) {
                AbstractC3682n.k(iArr, iArr2, iA, iA + 1, length);
            }
            return new i(this.f28642a, this.f28643b, this.f28644c, iArr2);
        }
        return this;
    }

    public final boolean q(int i10) {
        int[] iArr;
        int i11 = i10 - this.f28644c;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f28643b) != 0;
        }
        if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f28642a) != 0;
        }
        if (i11 <= 0 && (iArr = this.f28645d) != null) {
            return AbstractC5274f.a(iArr, i10) >= 0;
        }
        return false;
    }

    public final int s(int i10) {
        int[] iArr = this.f28645d;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f28643b;
        if (j10 != 0) {
            return this.f28644c + Long.numberOfTrailingZeros(j10);
        }
        long j11 = this.f28642a;
        return j11 != 0 ? this.f28644c + 64 + Long.numberOfTrailingZeros(j11) : i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb2.append(AbstractC5269a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final i u(i iVar) {
        i iVarV;
        i iVar2 = f28641f;
        if (iVar == iVar2) {
            return this;
        }
        if (this == iVar2) {
            return iVar;
        }
        int i10 = iVar.f28644c;
        int i11 = this.f28644c;
        if (i10 == i11) {
            int[] iArr = iVar.f28645d;
            int[] iArr2 = this.f28645d;
            if (iArr == iArr2) {
                return new i(this.f28642a | iVar.f28642a, this.f28643b | iVar.f28643b, i11, iArr2);
            }
        }
        int i12 = 0;
        if (this.f28645d == null) {
            int[] iArr3 = this.f28645d;
            if (iArr3 != null) {
                for (int i13 : iArr3) {
                    iVar = iVar.v(i13);
                }
            }
            if (this.f28643b != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if ((this.f28643b & (1 << i14)) != 0) {
                        iVar = iVar.v(this.f28644c + i14);
                    }
                }
            }
            if (this.f28642a != 0) {
                while (i12 < 64) {
                    if ((this.f28642a & (1 << i12)) != 0) {
                        iVar = iVar.v(i12 + 64 + this.f28644c);
                    }
                    i12++;
                }
            }
            return iVar;
        }
        int[] iArr4 = iVar.f28645d;
        if (iArr4 != null) {
            iVarV = this;
            for (int i15 : iArr4) {
                iVarV = iVarV.v(i15);
            }
        } else {
            iVarV = this;
        }
        if (iVar.f28643b != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((iVar.f28643b & (1 << i16)) != 0) {
                    iVarV = iVarV.v(iVar.f28644c + i16);
                }
            }
        }
        if (iVar.f28642a != 0) {
            while (i12 < 64) {
                if ((iVar.f28642a & (1 << i12)) != 0) {
                    iVarV = iVarV.v(i12 + 64 + iVar.f28644c);
                }
                i12++;
            }
        }
        return iVarV;
    }

    public final i v(int i10) {
        int i11;
        int[] iArrH1;
        int i12 = this.f28644c;
        int i13 = i10 - i12;
        long j10 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            long j12 = this.f28643b;
            if ((j12 & j11) == 0) {
                return new i(this.f28642a, j12 | j11, i12, this.f28645d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j13 = 1 << (i13 - 64);
            long j14 = this.f28642a;
            if ((j14 & j13) == 0) {
                return new i(j14 | j13, this.f28643b, i12, this.f28645d);
            }
        } else if (i13 < 128) {
            int[] iArr = this.f28645d;
            if (iArr == null) {
                return new i(this.f28642a, this.f28643b, i12, new int[]{i10});
            }
            int iA = AbstractC5274f.a(iArr, i10);
            if (iA < 0) {
                int i14 = -(iA + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                AbstractC3682n.k(iArr, iArr2, 0, 0, i14);
                AbstractC3682n.k(iArr, iArr2, i14 + 1, i14, length);
                iArr2[i14] = i10;
                return new i(this.f28642a, this.f28643b, this.f28644c, iArr2);
            }
        } else if (!q(i10)) {
            long j15 = this.f28642a;
            long j16 = this.f28643b;
            int i15 = this.f28644c;
            int i16 = ((i10 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i15 >= i16) {
                    i11 = i15;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f28645d;
                        if (iArr3 != null) {
                            for (int i17 : iArr3) {
                                arrayList.add(Integer.valueOf(i17));
                            }
                        }
                    }
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((1 << i18) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i18 + i15));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    i11 = i16;
                    j17 = j10;
                    break;
                }
                i15 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArrH1 = AbstractC3689v.h1(arrayList)) == null) {
                iArrH1 = this.f28645d;
            }
            return new i(j18, j17, i11, iArrH1).v(i10);
        }
        return this;
    }
}
