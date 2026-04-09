package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.C7974i;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7020k {

    /* renamed from: a, reason: collision with root package name */
    public int[] f54978a;

    /* renamed from: b, reason: collision with root package name */
    public int f54979b;

    public /* synthetic */ AbstractC7020k(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String e(AbstractC7020k abstractC7020k, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        return abstractC7020k.d(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public final int a(int i10) {
        if (i10 >= 0 && i10 < this.f54979b) {
            return this.f54978a[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f54979b - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int b() {
        return this.f54979b;
    }

    public final boolean c() {
        return this.f54979b == 0;
    }

    public final String d(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f54978a;
        int i11 = this.f54979b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
            i12++;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC7020k) {
            AbstractC7020k abstractC7020k = (AbstractC7020k) obj;
            int i10 = abstractC7020k.f54979b;
            int i11 = this.f54979b;
            if (i10 == i11) {
                int[] iArr = this.f54978a;
                int[] iArr2 = abstractC7020k.f54978a;
                C7974i c7974iS = AbstractC7978m.s(0, i11);
                int i12 = c7974iS.i();
                int iJ = c7974iS.j();
                if (i12 > iJ) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == iJ) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f() {
        if (c()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f54978a[this.f54979b - 1];
    }

    public int hashCode() {
        int[] iArr = this.f54978a;
        int i10 = this.f54979b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC7020k(int i10) {
        this.f54978a = i10 == 0 ? AbstractC7025p.a() : new int[i10];
    }
}
