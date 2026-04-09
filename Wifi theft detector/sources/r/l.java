package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24126a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f24127b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24128c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24129d;

    public l() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f24129d;
        if (i11 != 0 && i10 <= this.f24127b[i11 - 1]) {
            h(i10, obj);
            return;
        }
        if (this.f24126a && i11 >= this.f24127b.length) {
            m.e(this);
        }
        int i12 = this.f24129d;
        if (i12 >= this.f24127b.length) {
            int iE = s.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24127b, iE);
            p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f24127b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24128c, iE);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24128c = objArrCopyOf;
        }
        this.f24127b[i12] = i10;
        this.f24128c[i12] = obj;
        this.f24129d = i12 + 1;
    }

    public void b() {
        int i10 = this.f24129d;
        Object[] objArr = this.f24128c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24129d = 0;
        this.f24126a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f24127b = (int[]) this.f24127b.clone();
        lVar.f24128c = (Object[]) this.f24128c.clone();
        return lVar;
    }

    public Object d(int i10) {
        return m.c(this, i10);
    }

    public Object e(int i10, Object obj) {
        return m.d(this, i10, obj);
    }

    public int f(Object obj) {
        if (this.f24126a) {
            m.e(this);
        }
        int i10 = this.f24129d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24128c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int g(int i10) {
        if (this.f24126a) {
            m.e(this);
        }
        return this.f24127b[i10];
    }

    public void h(int i10, Object obj) {
        int iA = s.a.a(this.f24127b, this.f24129d, i10);
        if (iA >= 0) {
            this.f24128c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f24129d && this.f24128c[i11] == m.f24130a) {
            this.f24127b[i11] = i10;
            this.f24128c[i11] = obj;
            return;
        }
        if (this.f24126a && this.f24129d >= this.f24127b.length) {
            m.e(this);
            i11 = ~s.a.a(this.f24127b, this.f24129d, i10);
        }
        int i12 = this.f24129d;
        if (i12 >= this.f24127b.length) {
            int iE = s.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24127b, iE);
            p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f24127b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24128c, iE);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24128c = objArrCopyOf;
        }
        int i13 = this.f24129d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f24127b;
            int i14 = i11 + 1;
            z8.m.e(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f24128c;
            z8.m.g(objArr, objArr, i14, i11, this.f24129d);
        }
        this.f24127b[i11] = i10;
        this.f24128c[i11] = obj;
        this.f24129d++;
    }

    public int i() {
        if (this.f24126a) {
            m.e(this);
        }
        return this.f24129d;
    }

    public Object j(int i10) {
        if (this.f24126a) {
            m.e(this);
        }
        return this.f24128c[i10];
    }

    public String toString() {
        if (i() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24129d * 28);
        sb.append('{');
        int i10 = this.f24129d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(g(i11));
            sb.append('=');
            Object objJ = j(i11);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p.d(string, "buffer.toString()");
        return string;
    }

    public l(int i10) {
        if (i10 == 0) {
            this.f24127b = s.a.f24185a;
            this.f24128c = s.a.f24187c;
        } else {
            int iE = s.a.e(i10);
            this.f24127b = new int[iE];
            this.f24128c = new Object[iE];
        }
    }

    public /* synthetic */ l(int i10, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
