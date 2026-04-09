package ys;

import g4.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26415a;

    public b(String str) {
        if (str != null) {
            this.f26415a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
            case j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b b(qs.b bVar) {
        qs.c cVarG = bVar.g();
        String strReplace = bVar.h().b().replace('.', '$');
        if (cVarG.d()) {
            return new b(strReplace);
        }
        return new b(cVarG.b().replace('.', '/') + "/" + strReplace);
    }

    public static b c(qs.c cVar) {
        if (cVar != null) {
            return new b(cVar.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static b d(String str) {
        if (str != null) {
            return new b(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.f26415a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f26415a.equals(((b) obj).f26415a);
    }

    public final int hashCode() {
        return this.f26415a.hashCode();
    }

    public final String toString() {
        return this.f26415a;
    }
}
