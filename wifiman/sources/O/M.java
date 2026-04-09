package o;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f54910a;

    /* renamed from: b, reason: collision with root package name */
    public int f54911b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == M.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ M(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String f(M m10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return m10.e(charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public final boolean a(Object obj) {
        return b(obj) >= 0;
    }

    public final int b(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f54910a;
            int i11 = this.f54911b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f54910a;
        int i12 = this.f54911b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean c() {
        return this.f54911b == 0;
    }

    public final boolean d() {
        return this.f54911b != 0;
    }

    public final String e(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f54910a;
        int i11 = this.f54911b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (interfaceC6835l == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) interfaceC6835l.invoke(obj));
            }
            i12++;
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof M) {
            M m10 = (M) obj;
            int i10 = m10.f54911b;
            int i11 = this.f54911b;
            if (i10 == i11) {
                Object[] objArr = this.f54910a;
                Object[] objArr2 = m10.f54910a;
                C7974i c7974iS = AbstractC7978m.s(0, i11);
                int i12 = c7974iS.i();
                int iJ = c7974iS.j();
                if (i12 > iJ) {
                    return true;
                }
                while (AbstractC6492s.d(objArr[i12], objArr2[i12])) {
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

    public int hashCode() {
        Object[] objArr = this.f54910a;
        int i10 = this.f54911b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return f(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    private M(int i10) {
        this.f54910a = i10 == 0 ? N.f54913a : new Object[i10];
    }
}
