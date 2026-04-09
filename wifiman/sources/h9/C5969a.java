package h9;

import Zg.AbstractC3689v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.AbstractC6507a;
import kotlin.text.p;
import kotlin.text.t;

/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5969a implements Comparable, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f48521a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f48518b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final p f48519c = new p("^([0-9A-Fa-f]{2}){6}$");

    /* renamed from: d, reason: collision with root package name */
    private static final p f48520d = new p('[' + AbstractC3689v.z0(AbstractC3689v.o(":", "\\-", "\\."), "", null, null, 0, null, null, 62, null) + ']');
    public static final Parcelable.Creator<C5969a> CREATOR = new C1794a();

    /* renamed from: h9.a$a, reason: collision with other inner class name */
    public static final class C1794a implements Parcelable.Creator {
        C1794a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5969a createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new C5969a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5969a[] newArray(int i10) {
            return new C5969a[i10];
        }
    }

    /* renamed from: h9.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(byte b10) {
            return new String(new char[]{Character.forDigit((b10 >> 4) & 15, 16), Character.forDigit(b10 & 15, 16)});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(byte[] bArr, String str) {
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArr) {
                stringBuffer.append(b(b10));
            }
            String string = stringBuffer.toString();
            AbstractC6492s.h(string, "hexStringBuffer.toString()");
            String strZ0 = AbstractC3689v.z0(t.s1(string, 2), str, null, null, 0, null, null, 62, null);
            Locale US = Locale.US;
            AbstractC6492s.h(US, "US");
            String upperCase = strZ0.toUpperCase(US);
            AbstractC6492s.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }

        private final String f(String str) {
            String strN = C5969a.f48520d.n(str, "");
            if (C5969a.f48519c.m(strN)) {
                return strN;
            }
            return null;
        }

        public final C5969a d(byte[] input) {
            AbstractC6492s.i(input, "input");
            if (input.length != 6) {
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(input, input.length);
            AbstractC6492s.h(bArrCopyOf, "copyOf(this, size)");
            return new C5969a(bArrCopyOf);
        }

        public final C5969a e(String input) {
            AbstractC6492s.i(input, "input");
            String strF = f(input);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (strF == null) {
                return null;
            }
            return new C5969a(strF, defaultConstructorMarker);
        }

        private b() {
        }
    }

    public /* synthetic */ C5969a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5969a other) {
        AbstractC6492s.i(other, "other");
        return d("").compareTo(other.d(""));
    }

    public final String d(String separator) {
        AbstractC6492s.i(separator, "separator");
        return f48518b.c(this.f48521a, separator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5969a) && Arrays.equals(this.f48521a, ((C5969a) obj).f48521a);
    }

    public final byte[] g() {
        byte[] bArr = this.f48521a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6492s.h(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f48521a);
    }

    public String toString() {
        return d(":");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC6492s.i(dest, "dest");
        dest.writeByteArray(this.f48521a);
    }

    protected C5969a(byte[] addr) {
        AbstractC6492s.i(addr, "addr");
        this.f48521a = addr;
        if (addr.length != 6) {
            throw new IllegalArgumentException("invalid hw address size");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C5969a(String str) {
        byte[] bArr = new byte[6];
        int i10 = 0;
        for (Object obj : t.s1(str, 2)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            bArr[i10] = (byte) Integer.parseInt((String) obj, AbstractC6507a.a(16));
            i10 = i11;
        }
        this(bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5969a(C5969a address) {
        this(address.f48521a);
        AbstractC6492s.i(address, "address");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5969a(Parcel parcel) {
        AbstractC6492s.i(parcel, "parcel");
        byte[] bArrCreateByteArray = parcel.createByteArray();
        AbstractC6492s.f(bArrCreateByteArray);
        AbstractC6492s.h(bArrCreateByteArray, "parcel.createByteArray()!!");
        this(bArrCreateByteArray);
    }
}
