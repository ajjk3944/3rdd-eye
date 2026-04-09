package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.recyclerview.widget.m f20856i = new androidx.recyclerview.widget.m(2);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20858b;

    /* renamed from: c, reason: collision with root package name */
    public l f20859c;

    /* renamed from: f, reason: collision with root package name */
    public final l f20862f;
    public k g;

    /* renamed from: h, reason: collision with root package name */
    public k f20863h;

    /* renamed from: d, reason: collision with root package name */
    public int f20860d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f20861e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f20857a = f20856i;

    public m(boolean z3) {
        this.f20858b = z3;
        this.f20862f = new l(z3);
    }

    public final l a(Object obj, boolean z3) {
        int iCompareTo;
        l lVar;
        l lVar2 = this.f20859c;
        androidx.recyclerview.widget.m mVar = f20856i;
        Comparator comparator = this.f20857a;
        if (lVar2 != null) {
            Comparable comparable = comparator == mVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lVar2.f20853f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lVar2;
                }
                l lVar3 = iCompareTo < 0 ? lVar2.f20849b : lVar2.f20850c;
                if (lVar3 == null) {
                    break;
                }
                lVar2 = lVar3;
            }
        } else {
            iCompareTo = 0;
        }
        l lVar4 = lVar2;
        if (!z3) {
            return null;
        }
        l lVar5 = this.f20862f;
        if (lVar4 != null) {
            lVar = new l(this.f20858b, lVar4, obj, lVar5, lVar5.f20852e);
            if (iCompareTo < 0) {
                lVar4.f20849b = lVar;
            } else {
                lVar4.f20850c = lVar;
            }
            b(lVar4, true);
        } else {
            if (comparator == mVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f20858b, lVar4, obj, lVar5, lVar5.f20852e);
            this.f20859c = lVar;
        }
        this.f20860d++;
        this.f20861e++;
        return lVar;
    }

    public final void b(l lVar, boolean z3) {
        while (lVar != null) {
            l lVar2 = lVar.f20849b;
            l lVar3 = lVar.f20850c;
            int i4 = lVar2 != null ? lVar2.f20855i : 0;
            int i10 = lVar3 != null ? lVar3.f20855i : 0;
            int i11 = i4 - i10;
            if (i11 == -2) {
                l lVar4 = lVar3.f20849b;
                l lVar5 = lVar3.f20850c;
                int i12 = (lVar4 != null ? lVar4.f20855i : 0) - (lVar5 != null ? lVar5.f20855i : 0);
                if (i12 == -1 || (i12 == 0 && !z3)) {
                    e(lVar);
                } else {
                    f(lVar3);
                    e(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i11 == 2) {
                l lVar6 = lVar2.f20849b;
                l lVar7 = lVar2.f20850c;
                int i13 = (lVar6 != null ? lVar6.f20855i : 0) - (lVar7 != null ? lVar7.f20855i : 0);
                if (i13 == 1 || (i13 == 0 && !z3)) {
                    f(lVar);
                } else {
                    e(lVar2);
                    f(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i11 == 0) {
                lVar.f20855i = i4 + 1;
                if (z3) {
                    return;
                }
            } else {
                lVar.f20855i = Math.max(i4, i10) + 1;
                if (!z3) {
                    return;
                }
            }
            lVar = lVar.f20848a;
        }
    }

    public final void c(l lVar, boolean z3) {
        l lVar2;
        l lVar3;
        int i4;
        if (z3) {
            l lVar4 = lVar.f20852e;
            lVar4.f20851d = lVar.f20851d;
            lVar.f20851d.f20852e = lVar4;
        }
        l lVar5 = lVar.f20849b;
        l lVar6 = lVar.f20850c;
        l lVar7 = lVar.f20848a;
        int i10 = 0;
        if (lVar5 == null || lVar6 == null) {
            if (lVar5 != null) {
                d(lVar, lVar5);
                lVar.f20849b = null;
            } else if (lVar6 != null) {
                d(lVar, lVar6);
                lVar.f20850c = null;
            } else {
                d(lVar, null);
            }
            b(lVar7, false);
            this.f20860d--;
            this.f20861e++;
            return;
        }
        if (lVar5.f20855i > lVar6.f20855i) {
            l lVar8 = lVar5.f20850c;
            while (true) {
                l lVar9 = lVar8;
                lVar3 = lVar5;
                lVar5 = lVar9;
                if (lVar5 == null) {
                    break;
                } else {
                    lVar8 = lVar5.f20850c;
                }
            }
        } else {
            l lVar10 = lVar6.f20849b;
            while (true) {
                lVar2 = lVar6;
                lVar6 = lVar10;
                if (lVar6 == null) {
                    break;
                } else {
                    lVar10 = lVar6.f20849b;
                }
            }
            lVar3 = lVar2;
        }
        c(lVar3, false);
        l lVar11 = lVar.f20849b;
        if (lVar11 != null) {
            i4 = lVar11.f20855i;
            lVar3.f20849b = lVar11;
            lVar11.f20848a = lVar3;
            lVar.f20849b = null;
        } else {
            i4 = 0;
        }
        l lVar12 = lVar.f20850c;
        if (lVar12 != null) {
            i10 = lVar12.f20855i;
            lVar3.f20850c = lVar12;
            lVar12.f20848a = lVar3;
            lVar.f20850c = null;
        }
        lVar3.f20855i = Math.max(i4, i10) + 1;
        d(lVar, lVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20859c = null;
        this.f20860d = 0;
        this.f20861e++;
        l lVar = this.f20862f;
        lVar.f20852e = lVar;
        lVar.f20851d = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVarA = null;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lVarA != null;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.f20848a;
        lVar.f20848a = null;
        if (lVar2 != null) {
            lVar2.f20848a = lVar3;
        }
        if (lVar3 == null) {
            this.f20859c = lVar2;
        } else if (lVar3.f20849b == lVar) {
            lVar3.f20849b = lVar2;
        } else {
            lVar3.f20850c = lVar2;
        }
    }

    public final void e(l lVar) {
        l lVar2 = lVar.f20849b;
        l lVar3 = lVar.f20850c;
        l lVar4 = lVar3.f20849b;
        l lVar5 = lVar3.f20850c;
        lVar.f20850c = lVar4;
        if (lVar4 != null) {
            lVar4.f20848a = lVar;
        }
        d(lVar, lVar3);
        lVar3.f20849b = lVar;
        lVar.f20848a = lVar3;
        int iMax = Math.max(lVar2 != null ? lVar2.f20855i : 0, lVar4 != null ? lVar4.f20855i : 0) + 1;
        lVar.f20855i = iMax;
        lVar3.f20855i = Math.max(iMax, lVar5 != null ? lVar5.f20855i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.g;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.g = kVar2;
        return kVar2;
    }

    public final void f(l lVar) {
        l lVar2 = lVar.f20849b;
        l lVar3 = lVar.f20850c;
        l lVar4 = lVar2.f20849b;
        l lVar5 = lVar2.f20850c;
        lVar.f20849b = lVar5;
        if (lVar5 != null) {
            lVar5.f20848a = lVar;
        }
        d(lVar, lVar2);
        lVar2.f20850c = lVar;
        lVar.f20848a = lVar2;
        int iMax = Math.max(lVar3 != null ? lVar3.f20855i : 0, lVar5 != null ? lVar5.f20855i : 0) + 1;
        lVar.f20855i = iMax;
        lVar2.f20855i = Math.max(iMax, lVar4 != null ? lVar4.f20855i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            return lVarA.f20854h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f20863h;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f20863h = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f20858b) {
            throw new NullPointerException("value == null");
        }
        l lVarA = a(obj, true);
        Object obj3 = lVarA.f20854h;
        lVarA.f20854h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            c(lVarA, true);
        }
        if (lVarA != null) {
            return lVarA.f20854h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20860d;
    }
}
