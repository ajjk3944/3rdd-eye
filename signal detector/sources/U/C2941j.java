package u;

import d5.AbstractC2281i;
import java.util.Arrays;
import q0.C2792e;
import v.AbstractC2959a;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2941j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f23706a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f23707b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f23708c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f23709d;

    public C2941j() {
        int i;
        int i3 = 4;
        while (true) {
            i = 40;
            if (i3 >= 32) {
                break;
            }
            int i6 = (1 << i3) - 12;
            if (40 <= i6) {
                i = i6;
                break;
            }
            i3++;
        }
        int i7 = i / 4;
        this.f23707b = new int[i7];
        this.f23708c = new Object[i7];
    }

    public final void a(int i, Object obj) {
        int i3 = this.f23709d;
        if (i3 != 0 && i <= this.f23707b[i3 - 1]) {
            f(i, obj);
            return;
        }
        if (this.f23706a && i3 >= this.f23707b.length) {
            AbstractC2939h.a(this);
        }
        int i6 = this.f23709d;
        if (i6 >= this.f23707b.length) {
            int i7 = (i6 + 1) * 4;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f23707b, i10);
            q5.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f23707b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23708c, i10);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23708c = objArrCopyOf;
        }
        this.f23707b[i6] = i;
        this.f23708c[i6] = obj;
        this.f23709d = i6 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2941j clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        q5.i.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2941j c2941j = (C2941j) objClone;
        c2941j.f23707b = (int[]) this.f23707b.clone();
        c2941j.f23708c = (Object[]) this.f23708c.clone();
        return c2941j;
    }

    public final boolean c(C2792e c2792e) {
        if (this.f23706a) {
            AbstractC2939h.a(this);
        }
        int i = this.f23709d;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                i3 = -1;
                break;
            }
            if (this.f23708c[i3] == c2792e) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    public final Object d(int i) {
        Object obj;
        int iA = AbstractC2959a.a(this.f23707b, this.f23709d, i);
        if (iA < 0 || (obj = this.f23708c[iA]) == AbstractC2939h.f23702b) {
            return null;
        }
        return obj;
    }

    public final int e(int i) {
        if (this.f23706a) {
            AbstractC2939h.a(this);
        }
        return this.f23707b[i];
    }

    public final void f(int i, Object obj) {
        int iA = AbstractC2959a.a(this.f23707b, this.f23709d, i);
        if (iA >= 0) {
            this.f23708c[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i6 = this.f23709d;
        if (i3 < i6) {
            Object[] objArr = this.f23708c;
            if (objArr[i3] == AbstractC2939h.f23702b) {
                this.f23707b[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f23706a && i6 >= this.f23707b.length) {
            AbstractC2939h.a(this);
            i3 = ~AbstractC2959a.a(this.f23707b, this.f23709d, i);
        }
        int i7 = this.f23709d;
        if (i7 >= this.f23707b.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f23707b, i11);
            q5.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f23707b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23708c, i11);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23708c = objArrCopyOf;
        }
        int i12 = this.f23709d;
        if (i12 - i3 != 0) {
            int[] iArr = this.f23707b;
            int i13 = i3 + 1;
            AbstractC2281i.R(i13, i3, i12, iArr, iArr);
            Object[] objArr2 = this.f23708c;
            AbstractC2281i.S(i13, i3, this.f23709d, objArr2, objArr2);
        }
        this.f23707b[i3] = i;
        this.f23708c[i3] = obj;
        this.f23709d++;
    }

    public final int g() {
        if (this.f23706a) {
            AbstractC2939h.a(this);
        }
        return this.f23709d;
    }

    public final Object h(int i) {
        if (this.f23706a) {
            AbstractC2939h.a(this);
        }
        return this.f23708c[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f23709d * 28);
        sb.append('{');
        int i = this.f23709d;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(e(i3));
            sb.append('=');
            Object objH = h(i3);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        q5.i.d(string, "buffer.toString()");
        return string;
    }
}
