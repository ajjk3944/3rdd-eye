package i4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {
    public static final E.h i = new E.h(14);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20620b;

    /* renamed from: c, reason: collision with root package name */
    public n f20621c;

    /* renamed from: f, reason: collision with root package name */
    public final n f20624f;

    /* renamed from: g, reason: collision with root package name */
    public m f20625g;

    /* renamed from: h, reason: collision with root package name */
    public m f20626h;

    /* renamed from: d, reason: collision with root package name */
    public int f20622d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f20623e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f20619a = i;

    public o(boolean z6) {
        this.f20620b = z6;
        this.f20624f = new n(z6);
    }

    public final n a(Object obj, boolean z6) {
        int iCompareTo;
        n nVar;
        n nVar2 = this.f20621c;
        E.h hVar = i;
        Comparator comparator = this.f20619a;
        if (nVar2 != null) {
            Comparable comparable = comparator == hVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f20616f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return nVar2;
                }
                n nVar3 = iCompareTo < 0 ? nVar2.f20612b : nVar2.f20613c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            iCompareTo = 0;
        }
        n nVar4 = nVar2;
        if (!z6) {
            return null;
        }
        n nVar5 = this.f20624f;
        if (nVar4 != null) {
            nVar = new n(this.f20620b, nVar4, obj, nVar5, nVar5.f20615e);
            if (iCompareTo < 0) {
                nVar4.f20612b = nVar;
            } else {
                nVar4.f20613c = nVar;
            }
            b(nVar4, true);
        } else {
            if (comparator == hVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.f20620b, nVar4, obj, nVar5, nVar5.f20615e);
            this.f20621c = nVar;
        }
        this.f20622d++;
        this.f20623e++;
        return nVar;
    }

    public final void b(n nVar, boolean z6) {
        while (nVar != null) {
            n nVar2 = nVar.f20612b;
            n nVar3 = nVar.f20613c;
            int i3 = nVar2 != null ? nVar2.i : 0;
            int i6 = nVar3 != null ? nVar3.i : 0;
            int i7 = i3 - i6;
            if (i7 == -2) {
                n nVar4 = nVar3.f20612b;
                n nVar5 = nVar3.f20613c;
                int i8 = (nVar4 != null ? nVar4.i : 0) - (nVar5 != null ? nVar5.i : 0);
                if (i8 == -1 || (i8 == 0 && !z6)) {
                    e(nVar);
                } else {
                    f(nVar3);
                    e(nVar);
                }
                if (z6) {
                    return;
                }
            } else if (i7 == 2) {
                n nVar6 = nVar2.f20612b;
                n nVar7 = nVar2.f20613c;
                int i9 = (nVar6 != null ? nVar6.i : 0) - (nVar7 != null ? nVar7.i : 0);
                if (i9 == 1 || (i9 == 0 && !z6)) {
                    f(nVar);
                } else {
                    e(nVar2);
                    f(nVar);
                }
                if (z6) {
                    return;
                }
            } else if (i7 == 0) {
                nVar.i = i3 + 1;
                if (z6) {
                    return;
                }
            } else {
                nVar.i = Math.max(i3, i6) + 1;
                if (!z6) {
                    return;
                }
            }
            nVar = nVar.f20611a;
        }
    }

    public final void c(n nVar, boolean z6) {
        n nVar2;
        n nVar3;
        int i3;
        if (z6) {
            n nVar4 = nVar.f20615e;
            nVar4.f20614d = nVar.f20614d;
            nVar.f20614d.f20615e = nVar4;
        }
        n nVar5 = nVar.f20612b;
        n nVar6 = nVar.f20613c;
        n nVar7 = nVar.f20611a;
        int i6 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                d(nVar, nVar5);
                nVar.f20612b = null;
            } else if (nVar6 != null) {
                d(nVar, nVar6);
                nVar.f20613c = null;
            } else {
                d(nVar, null);
            }
            b(nVar7, false);
            this.f20622d--;
            this.f20623e++;
            return;
        }
        if (nVar5.i > nVar6.i) {
            n nVar8 = nVar5.f20613c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                } else {
                    nVar8 = nVar5.f20613c;
                }
            }
        } else {
            n nVar10 = nVar6.f20612b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                } else {
                    nVar10 = nVar6.f20612b;
                }
            }
            nVar3 = nVar2;
        }
        c(nVar3, false);
        n nVar11 = nVar.f20612b;
        if (nVar11 != null) {
            i3 = nVar11.i;
            nVar3.f20612b = nVar11;
            nVar11.f20611a = nVar3;
            nVar.f20612b = null;
        } else {
            i3 = 0;
        }
        n nVar12 = nVar.f20613c;
        if (nVar12 != null) {
            i6 = nVar12.i;
            nVar3.f20613c = nVar12;
            nVar12.f20611a = nVar3;
            nVar.f20613c = null;
        }
        nVar3.i = Math.max(i3, i6) + 1;
        d(nVar, nVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20621c = null;
        this.f20622d = 0;
        this.f20623e++;
        n nVar = this.f20624f;
        nVar.f20615e = nVar;
        nVar.f20614d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVarA = null;
        if (obj != null) {
            try {
                nVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVarA != null;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f20611a;
        nVar.f20611a = null;
        if (nVar2 != null) {
            nVar2.f20611a = nVar3;
        }
        if (nVar3 == null) {
            this.f20621c = nVar2;
        } else if (nVar3.f20612b == nVar) {
            nVar3.f20612b = nVar2;
        } else {
            nVar3.f20613c = nVar2;
        }
    }

    public final void e(n nVar) {
        n nVar2 = nVar.f20612b;
        n nVar3 = nVar.f20613c;
        n nVar4 = nVar3.f20612b;
        n nVar5 = nVar3.f20613c;
        nVar.f20613c = nVar4;
        if (nVar4 != null) {
            nVar4.f20611a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f20612b = nVar;
        nVar.f20611a = nVar3;
        int iMax = Math.max(nVar2 != null ? nVar2.i : 0, nVar4 != null ? nVar4.i : 0) + 1;
        nVar.i = iMax;
        nVar3.i = Math.max(iMax, nVar5 != null ? nVar5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.f20625g;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.f20625g = mVar2;
        return mVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f20612b;
        n nVar3 = nVar.f20613c;
        n nVar4 = nVar2.f20612b;
        n nVar5 = nVar2.f20613c;
        nVar.f20612b = nVar5;
        if (nVar5 != null) {
            nVar5.f20611a = nVar;
        }
        d(nVar, nVar2);
        nVar2.f20613c = nVar;
        nVar.f20611a = nVar2;
        int iMax = Math.max(nVar3 != null ? nVar3.i : 0, nVar5 != null ? nVar5.i : 0) + 1;
        nVar.i = iMax;
        nVar2.i = Math.max(iMax, nVar4 != null ? nVar4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        n nVarA;
        if (obj != null) {
            try {
                nVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            nVarA = null;
        }
        if (nVarA != null) {
            return nVarA.f20618h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f20626h;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f20626h = mVar2;
        return mVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f20620b) {
            throw new NullPointerException("value == null");
        }
        n nVarA = a(obj, true);
        Object obj3 = nVarA.f20618h;
        nVarA.f20618h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n nVarA;
        if (obj != null) {
            try {
                nVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            nVarA = null;
        }
        if (nVarA != null) {
            c(nVarA, true);
        }
        if (nVarA != null) {
            return nVarA.f20618h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20622d;
    }
}
