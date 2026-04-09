package l2;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14648e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14651c;

    /* renamed from: d, reason: collision with root package name */
    public final n2.b f14652d;

    static {
        new b();
    }

    public b() {
        n2.b bVar = n2.b.f17378g;
        this.f14649a = true;
        this.f14650b = 1;
        this.f14651c = 1;
        this.f14652d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14649a == bVar.f14649a && this.f14650b == bVar.f14650b && this.f14651c == bVar.f14651c && l.a(this.f14652d, bVar.f14652d);
    }

    public final int hashCode() {
        return this.f14652d.f17379a.hashCode() + c7.a.C(this.f14651c, c7.a.C(this.f14650b, g.b(c7.a.C(0, Boolean.hashCode(false) * 31, 31), this.f14649a, 31), 31), 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb2.append((Object) "None");
        sb2.append(", autoCorrect=");
        sb2.append(this.f14649a);
        sb2.append(", keyboardType=");
        int i10 = this.f14650b;
        sb2.append((Object) (i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? "Decimal" : "Invalid"));
        sb2.append(", imeAction=");
        int i11 = this.f14651c;
        if (i11 == -1) {
            str = "Unspecified";
        } else if (i11 != 0) {
            str = i11 == 1 ? "Default" : i11 == 2 ? "Go" : i11 == 3 ? "Search" : i11 == 4 ? "Send" : i11 == 5 ? "Previous" : i11 == 6 ? "Next" : i11 == 7 ? "Done" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f14652d);
        sb2.append(')');
        return sb2.toString();
    }
}
