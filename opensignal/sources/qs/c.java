package qs;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f21024c = new c("");

    /* renamed from: a, reason: collision with root package name */
    public final e f21025a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f21026b;

    public c(String str) {
        if (str != null) {
            this.f21025a = new e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "toUnsafe";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "parent";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static c j(g gVar) {
        if (gVar != null) {
            return new c(new e(gVar.b(), f21024c.i(), gVar));
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.f21025a.f21030a;
        if (str != null) {
            return str;
        }
        e.a(4);
        throw null;
    }

    public final c c(g gVar) {
        if (gVar != null) {
            return new c(this.f21025a.b(gVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f21025a.f21030a.isEmpty();
    }

    public final c e() {
        c cVar = this.f21026b;
        if (cVar != null) {
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        e eVar = this.f21025a;
        e eVar2 = eVar.f21032c;
        if (eVar2 == null) {
            if (eVar.f21030a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            eVar.c();
            eVar2 = eVar.f21032c;
            if (eVar2 == null) {
                e.a(8);
                throw null;
            }
        }
        c cVar2 = new c(eVar2);
        this.f21026b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f21025a.equals(((c) obj).f21025a);
    }

    public final g f() {
        g gVarF = this.f21025a.f();
        if (gVarF != null) {
            return gVarF;
        }
        a(9);
        throw null;
    }

    public final g g() {
        e eVar = this.f21025a;
        if (eVar.f21030a.isEmpty()) {
            g gVar = e.f21027e;
            if (gVar != null) {
                return gVar;
            }
            e.a(12);
            throw null;
        }
        g gVarF = eVar.f();
        if (gVarF != null) {
            return gVarF;
        }
        e.a(13);
        throw null;
    }

    public final boolean h(g gVar) {
        if (gVar == null) {
            a(12);
            throw null;
        }
        String str = this.f21025a.f21030a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = gVar.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f21025a.f21030a.hashCode();
    }

    public final e i() {
        e eVar = this.f21025a;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f21025a.toString();
    }

    public c(e eVar) {
        this.f21025a = eVar;
    }

    public c(e eVar, c cVar) {
        this.f21025a = eVar;
        this.f21026b = cVar;
    }
}
