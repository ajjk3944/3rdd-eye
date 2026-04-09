package qs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final g f21027e = g.g("<root>");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f21028f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    public static final d f21029g = new d();

    /* renamed from: a, reason: collision with root package name */
    public final String f21030a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f21031b;

    /* renamed from: c, reason: collision with root package name */
    public transient e f21032c;

    /* renamed from: d, reason: collision with root package name */
    public transient g f21033d;

    public e(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f21030a = str;
        this.f21031b = cVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "toSafe";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final e b(g gVar) {
        String strB;
        if (gVar == null) {
            a(9);
            throw null;
        }
        String str = this.f21030a;
        if (str.isEmpty()) {
            strB = gVar.b();
        } else {
            strB = str + "." + gVar.b();
        }
        return new e(strB, this, gVar);
    }

    public final void c() {
        String str = this.f21030a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f21033d = g.d(str.substring(iLastIndexOf + 1));
            this.f21032c = new e(str.substring(0, iLastIndexOf));
        } else {
            this.f21033d = g.d(str);
            this.f21032c = c.f21024c.i();
        }
    }

    public final boolean d() {
        if (this.f21031b != null) {
            return true;
        }
        String str = this.f21030a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.f21030a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f21028f.split(str);
            br.l.e(strArrSplit, "<this>");
            br.l.e(f21029g, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(g.d(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f21030a.equals(((e) obj).f21030a);
    }

    public final g f() {
        g gVar = this.f21033d;
        if (gVar != null) {
            if (gVar != null) {
                return gVar;
            }
            a(10);
            throw null;
        }
        if (this.f21030a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        g gVar2 = this.f21033d;
        if (gVar2 != null) {
            return gVar2;
        }
        a(11);
        throw null;
    }

    public final c g() {
        c cVar = this.f21031b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f21031b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f21030a.hashCode();
    }

    public final String toString() {
        String strB = this.f21030a;
        if (strB.isEmpty()) {
            strB = f21027e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(17);
        throw null;
    }

    public e(String str) {
        if (str != null) {
            this.f21030a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public e(String str, e eVar, g gVar) {
        if (str != null) {
            this.f21030a = str;
            this.f21032c = eVar;
            this.f21033d = gVar;
            return;
        }
        a(3);
        throw null;
    }
}
