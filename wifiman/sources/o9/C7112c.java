package o9;

import Zg.AbstractC3689v;
import com.ui.common.semver.SemVer;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* renamed from: o9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7112c implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f55598b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f55599a;

    /* renamed from: o9.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7112c a(String preReleaseString) {
            String str;
            AbstractC6492s.i(preReleaseString, "preReleaseString");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (t.m0(preReleaseString)) {
                return null;
            }
            List<String> listQ0 = t.Q0(t.q1(preReleaseString).toString(), new String[]{"."}, false, 0, 6, null);
            for (String str2 : listQ0) {
                if (t.m0(str2)) {
                    str = "Pre-release identity contains an empty part.";
                } else {
                    C7111b c7111b = C7111b.f55594a;
                    if (c7111b.c().m(str2) && str2.length() > 1 && str2.charAt(0) == '0') {
                        str = "Pre-release part '" + str2 + "' is numeric but contains a leading zero.";
                    } else if (c7111b.b().m(str2)) {
                        str = null;
                    } else {
                        str = "Pre-release part '" + str2 + "' contains an invalid character.";
                    }
                }
                if (str != null) {
                    throw new SemVer.FormatException(((Object) str) + " (" + preReleaseString + ')');
                }
            }
            return new C7112c(listQ0, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ C7112c(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private final int a(String str, String str2) {
        Integer numQ = t.q(str);
        Integer numQ2 = t.q(str2);
        if (numQ != null && numQ2 == null) {
            return -1;
        }
        if (numQ != null || numQ2 == null) {
            return (numQ == null || numQ2 == null) ? str.compareTo(str2) : AbstractC6492s.k(numQ.intValue(), numQ2.intValue());
        }
        return 1;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7112c other) {
        AbstractC6492s.i(other, "other");
        int size = this.f55599a.size();
        int size2 = other.f55599a.size();
        int iMin = Math.min(size, size2);
        int i10 = 0;
        while (i10 < iMin) {
            int i11 = i10 + 1;
            int iA = a((String) this.f55599a.get(i10), (String) other.f55599a.get(i10));
            if (iA != 0) {
                return iA;
            }
            i10 = i11;
        }
        return AbstractC6492s.k(size, size2);
    }

    public boolean equals(Object obj) {
        C7112c c7112c = obj instanceof C7112c ? (C7112c) obj : null;
        return c7112c != null && compareTo(c7112c) == 0;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return AbstractC3689v.z0(this.f55599a, ".", null, null, 0, null, null, 62, null);
    }

    private C7112c(List list) {
        this.f55599a = list;
    }
}
