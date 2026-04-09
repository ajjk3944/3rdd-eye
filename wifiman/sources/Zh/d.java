package Zh;

import Zg.AbstractC3682n;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f25408e = f.n("<root>");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f25409f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    private static final InterfaceC6835l f25410g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f25411a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f25412b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f25413c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f25414d;

    static class a implements InterfaceC6835l {
        a() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.g(str);
        }
    }

    d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f25411a = str;
        this.f25412b = cVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
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
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
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
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void d() {
        int iLastIndexOf = this.f25411a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f25414d = f.g(this.f25411a.substring(iLastIndexOf + 1));
            this.f25413c = new d(this.f25411a.substring(0, iLastIndexOf));
        } else {
            this.f25414d = f.g(this.f25411a);
            this.f25413c = c.f25405c.j();
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.b(), c.f25405c.j(), fVar);
    }

    public String b() {
        String str = this.f25411a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strB = fVar.b();
        } else {
            strB = this.f25411a + "." + fVar.b();
        }
        return new d(strB, this, fVar);
    }

    public boolean e() {
        return this.f25411a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f25411a.equals(((d) obj).f25411a);
    }

    public boolean f() {
        return this.f25412b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f25413c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f25413c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    public List h() {
        List listEmptyList = e() ? Collections.emptyList() : AbstractC3682n.N0(f25409f.split(this.f25411a), f25410g);
        if (listEmptyList == null) {
            a(14);
        }
        return listEmptyList;
    }

    public int hashCode() {
        return this.f25411a.hashCode();
    }

    public f i() {
        f fVar = this.f25414d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f25414d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public f j() {
        if (e()) {
            f fVar = f25408e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f25411a.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.f25411a.length();
        }
        String strB = fVar.b();
        return iIndexOf == strB.length() && this.f25411a.regionMatches(0, strB, 0, iIndexOf);
    }

    public c l() {
        c cVar = this.f25412b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f25412b = cVar2;
        return cVar2;
    }

    public String toString() {
        String strB = e() ? f25408e.b() : this.f25411a;
        if (strB == null) {
            a(18);
        }
        return strB;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f25411a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f25411a = str;
        this.f25413c = dVar;
        this.f25414d = fVar;
    }
}
