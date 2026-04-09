package nk;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class g0 extends AbstractMap implements Serializable {
    public static final dv.h E = new dv.h(14);
    public e0 B;
    public e0 D;

    /* renamed from: r, reason: collision with root package name */
    public int f18390r = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f18391x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f18387a = E;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f18389g = new f0();

    /* renamed from: d, reason: collision with root package name */
    public f0[] f18388d = new f0[16];

    /* renamed from: y, reason: collision with root package name */
    public int f18392y = 12;

    public final f0 a(Object obj, boolean z10) {
        int iCompareTo;
        f0 f0Var;
        boolean z11;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0Var6;
        f0[] f0VarArr = this.f18388d;
        int iHashCode = obj.hashCode();
        int i10 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i11 = ((i10 >>> 7) ^ i10) ^ (i10 >>> 4);
        boolean z12 = true;
        int length = i11 & (f0VarArr.length - 1);
        f0 f0Var7 = f0VarArr[length];
        dv.h hVar = E;
        f0 f0Var8 = null;
        Comparator comparator = this.f18387a;
        if (f0Var7 != null) {
            Comparable comparable = comparator == hVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = f0Var7.f18381y;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return f0Var7;
                }
                f0 f0Var9 = iCompareTo < 0 ? f0Var7.f18377d : f0Var7.f18378g;
                if (f0Var9 == null) {
                    break;
                }
                f0Var7 = f0Var9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        f0 f0Var10 = this.f18389g;
        if (f0Var7 != null) {
            f0 f0Var11 = f0Var7;
            f0Var = new f0(f0Var11, obj, i11, f0Var10, f0Var10.f18380x);
            if (iCompareTo < 0) {
                f0Var11.f18377d = f0Var;
            } else {
                f0Var11.f18378g = f0Var;
            }
            b(f0Var11, true);
        } else {
            if (comparator == hVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            f0Var = new f0(f0Var7, obj, i11, f0Var10, f0Var10.f18380x);
            f0VarArr[length] = f0Var;
        }
        int i12 = this.f18390r;
        this.f18390r = i12 + 1;
        if (i12 > this.f18392y) {
            f0[] f0VarArr2 = this.f18388d;
            int length2 = f0VarArr2.length;
            int i13 = length2 * 2;
            f0[] f0VarArr3 = new f0[i13];
            androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l();
            androidx.datastore.preferences.protobuf.l lVar2 = new androidx.datastore.preferences.protobuf.l();
            int i14 = 0;
            while (i14 < length2) {
                f0 f0Var12 = f0VarArr2[i14];
                if (f0Var12 == null) {
                    z11 = z12;
                    f0Var3 = f0Var8;
                } else {
                    f0 f0Var13 = f0Var8;
                    for (f0 f0Var14 = f0Var12; f0Var14 != null; f0Var14 = f0Var14.f18377d) {
                        f0Var14.f18376a = f0Var13;
                        f0Var13 = f0Var14;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (f0Var13 != null) {
                            z11 = z12;
                            f0 f0Var15 = f0Var13.f18376a;
                            f0Var13.f18376a = f0Var8;
                            f0 f0Var16 = f0Var13.f18378g;
                            while (true) {
                                f0 f0Var17 = f0Var16;
                                f0Var2 = f0Var15;
                                f0Var15 = f0Var17;
                                if (f0Var15 == null) {
                                    break;
                                }
                                f0Var15.f18376a = f0Var2;
                                f0Var16 = f0Var15.f18377d;
                            }
                        } else {
                            f0 f0Var18 = f0Var13;
                            f0Var13 = f0Var8;
                            f0Var2 = f0Var18;
                            z11 = z12;
                        }
                        if (f0Var13 == null) {
                            break;
                        }
                        if ((f0Var13.B & length2) == 0) {
                            i15++;
                        } else {
                            i16++;
                        }
                        f0Var13 = f0Var2;
                        z12 = z11;
                        f0Var8 = null;
                    }
                    lVar.f1311a = ((Integer.highestOneBit(i15) * 2) - 1) - i15;
                    lVar.f1313c = 0;
                    lVar.f1312b = 0;
                    f0Var3 = null;
                    lVar.f1314d = null;
                    lVar2.f1311a = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    lVar2.f1313c = 0;
                    lVar2.f1312b = 0;
                    lVar2.f1314d = null;
                    f0 f0Var19 = null;
                    while (f0Var12 != null) {
                        f0Var12.f18376a = f0Var19;
                        f0 f0Var20 = f0Var12;
                        f0Var12 = f0Var12.f18377d;
                        f0Var19 = f0Var20;
                    }
                    while (true) {
                        if (f0Var19 != null) {
                            f0 f0Var21 = f0Var19.f18376a;
                            f0Var19.f18376a = null;
                            f0 f0Var22 = f0Var19.f18378g;
                            while (true) {
                                f0 f0Var23 = f0Var22;
                                f0Var4 = f0Var21;
                                f0Var21 = f0Var23;
                                if (f0Var21 == null) {
                                    break;
                                }
                                f0Var21.f18376a = f0Var4;
                                f0Var22 = f0Var21.f18377d;
                            }
                        } else {
                            f0Var4 = f0Var19;
                            f0Var19 = null;
                        }
                        if (f0Var19 == null) {
                            break;
                        }
                        if ((f0Var19.B & length2) == 0) {
                            lVar.a(f0Var19);
                        } else {
                            lVar2.a(f0Var19);
                        }
                        f0Var19 = f0Var4;
                    }
                    if (i15 > 0) {
                        f0Var5 = (f0) lVar.f1314d;
                        if (f0Var5.f18376a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        f0Var5 = null;
                    }
                    f0VarArr3[i14] = f0Var5;
                    int i17 = i14 + length2;
                    if (i16 > 0) {
                        f0Var6 = (f0) lVar2.f1314d;
                        if (f0Var6.f18376a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        f0Var6 = null;
                    }
                    f0VarArr3[i17] = f0Var6;
                }
                i14++;
                f0Var8 = f0Var3;
                z12 = z11;
            }
            this.f18388d = f0VarArr3;
            this.f18392y = (i13 / 4) + (i13 / 2);
        }
        this.f18391x++;
        return f0Var;
    }

    public final void b(f0 f0Var, boolean z10) {
        while (f0Var != null) {
            f0 f0Var2 = f0Var.f18377d;
            f0 f0Var3 = f0Var.f18378g;
            int i10 = f0Var2 != null ? f0Var2.E : 0;
            int i11 = f0Var3 != null ? f0Var3.E : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                f0 f0Var4 = f0Var3.f18377d;
                f0 f0Var5 = f0Var3.f18378g;
                int i13 = (f0Var4 != null ? f0Var4.E : 0) - (f0Var5 != null ? f0Var5.E : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    f(f0Var3);
                }
                e(f0Var);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                f0 f0Var6 = f0Var2.f18377d;
                f0 f0Var7 = f0Var2.f18378g;
                int i14 = (f0Var6 != null ? f0Var6.E : 0) - (f0Var7 != null ? f0Var7.E : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    e(f0Var2);
                }
                f(f0Var);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                f0Var.E = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                f0Var.E = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            f0Var = f0Var.f18376a;
        }
    }

    public final void c(f0 f0Var, boolean z10) {
        f0 f0Var2;
        f0 f0Var3;
        int i10;
        if (z10) {
            f0 f0Var4 = f0Var.f18380x;
            f0Var4.f18379r = f0Var.f18379r;
            f0Var.f18379r.f18380x = f0Var4;
            f0Var.f18380x = null;
            f0Var.f18379r = null;
        }
        f0 f0Var5 = f0Var.f18377d;
        f0 f0Var6 = f0Var.f18378g;
        f0 f0Var7 = f0Var.f18376a;
        int i11 = 0;
        if (f0Var5 == null || f0Var6 == null) {
            if (f0Var5 != null) {
                d(f0Var, f0Var5);
                f0Var.f18377d = null;
            } else if (f0Var6 != null) {
                d(f0Var, f0Var6);
                f0Var.f18378g = null;
            } else {
                d(f0Var, null);
            }
            b(f0Var7, false);
            this.f18390r--;
            this.f18391x++;
            return;
        }
        if (f0Var5.E > f0Var6.E) {
            f0 f0Var8 = f0Var5.f18378g;
            while (true) {
                f0 f0Var9 = f0Var8;
                f0Var3 = f0Var5;
                f0Var5 = f0Var9;
                if (f0Var5 == null) {
                    break;
                } else {
                    f0Var8 = f0Var5.f18378g;
                }
            }
        } else {
            f0 f0Var10 = f0Var6.f18377d;
            while (true) {
                f0Var2 = f0Var6;
                f0Var6 = f0Var10;
                if (f0Var6 == null) {
                    break;
                } else {
                    f0Var10 = f0Var6.f18377d;
                }
            }
            f0Var3 = f0Var2;
        }
        c(f0Var3, false);
        f0 f0Var11 = f0Var.f18377d;
        if (f0Var11 != null) {
            i10 = f0Var11.E;
            f0Var3.f18377d = f0Var11;
            f0Var11.f18376a = f0Var3;
            f0Var.f18377d = null;
        } else {
            i10 = 0;
        }
        f0 f0Var12 = f0Var.f18378g;
        if (f0Var12 != null) {
            i11 = f0Var12.E;
            f0Var3.f18378g = f0Var12;
            f0Var12.f18376a = f0Var3;
            f0Var.f18378g = null;
        }
        f0Var3.E = Math.max(i10, i11) + 1;
        d(f0Var, f0Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f18388d, (Object) null);
        this.f18390r = 0;
        this.f18391x++;
        f0 f0Var = this.f18389g;
        f0 f0Var2 = f0Var.f18379r;
        while (f0Var2 != f0Var) {
            f0 f0Var3 = f0Var2.f18379r;
            f0Var2.f18380x = null;
            f0Var2.f18379r = null;
            f0Var2 = f0Var3;
        }
        f0Var.f18380x = f0Var;
        f0Var.f18379r = f0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        f0 f0VarA = null;
        if (obj != null) {
            try {
                f0VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return f0VarA != null;
    }

    public final void d(f0 f0Var, f0 f0Var2) {
        f0 f0Var3 = f0Var.f18376a;
        f0Var.f18376a = null;
        if (f0Var2 != null) {
            f0Var2.f18376a = f0Var3;
        }
        if (f0Var3 == null) {
            int i10 = f0Var.B;
            this.f18388d[i10 & (r0.length - 1)] = f0Var2;
        } else if (f0Var3.f18377d == f0Var) {
            f0Var3.f18377d = f0Var2;
        } else {
            f0Var3.f18378g = f0Var2;
        }
    }

    public final void e(f0 f0Var) {
        f0 f0Var2 = f0Var.f18377d;
        f0 f0Var3 = f0Var.f18378g;
        f0 f0Var4 = f0Var3.f18377d;
        f0 f0Var5 = f0Var3.f18378g;
        f0Var.f18378g = f0Var4;
        if (f0Var4 != null) {
            f0Var4.f18376a = f0Var;
        }
        d(f0Var, f0Var3);
        f0Var3.f18377d = f0Var;
        f0Var.f18376a = f0Var3;
        int iMax = Math.max(f0Var2 != null ? f0Var2.E : 0, f0Var4 != null ? f0Var4.E : 0) + 1;
        f0Var.E = iMax;
        f0Var3.E = Math.max(iMax, f0Var5 != null ? f0Var5.E : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e0 e0Var = this.B;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, 0);
        this.B = e0Var2;
        return e0Var2;
    }

    public final void f(f0 f0Var) {
        f0 f0Var2 = f0Var.f18377d;
        f0 f0Var3 = f0Var.f18378g;
        f0 f0Var4 = f0Var2.f18377d;
        f0 f0Var5 = f0Var2.f18378g;
        f0Var.f18377d = f0Var5;
        if (f0Var5 != null) {
            f0Var5.f18376a = f0Var;
        }
        d(f0Var, f0Var2);
        f0Var2.f18378g = f0Var;
        f0Var.f18376a = f0Var2;
        int iMax = Math.max(f0Var3 != null ? f0Var3.E : 0, f0Var5 != null ? f0Var5.E : 0) + 1;
        f0Var.E = iMax;
        f0Var2.E = Math.max(iMax, f0Var4 != null ? f0Var4.E : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        f0 f0VarA;
        if (obj != null) {
            try {
                f0VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            f0VarA = null;
        }
        if (f0VarA != null) {
            return f0VarA.D;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        e0 e0Var = this.D;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, 1);
        this.D = e0Var2;
        return e0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        f0 f0VarA = a(obj, true);
        Object obj3 = f0VarA.D;
        f0VarA.D = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f0 f0VarA;
        if (obj != null) {
            try {
                f0VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            f0VarA = null;
        }
        if (f0VarA != null) {
            c(f0VarA, true);
        }
        if (f0VarA != null) {
            return f0VarA.D;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18390r;
    }
}
