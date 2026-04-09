package w2;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f36417e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36420c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.c f36421d;

    static {
        new b();
    }

    public b() {
        y2.c cVar = y2.c.f37319c;
        this.f36418a = true;
        this.f36419b = 1;
        this.f36420c = 1;
        this.f36421d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f36418a == bVar.f36418a && this.f36419b == bVar.f36419b && this.f36420c == bVar.f36420c && k.a(this.f36421d, bVar.f36421d);
    }

    public final int hashCode() {
        return this.f36421d.f37320a.hashCode() + ((((((1188757 + (this.f36418a ? 1231 : 1237)) * 31) + this.f36419b) * 31) + this.f36420c) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb2.append((Object) "None");
        sb2.append(", autoCorrect=");
        sb2.append(this.f36418a);
        sb2.append(", keyboardType=");
        int i4 = this.f36419b;
        sb2.append((Object) (i4 == 0 ? "Unspecified" : i4 == 1 ? "Text" : i4 == 2 ? "Ascii" : i4 == 3 ? "Number" : i4 == 4 ? "Phone" : i4 == 5 ? "Uri" : i4 == 6 ? "Email" : i4 == 7 ? "Password" : i4 == 8 ? "NumberPassword" : i4 == 9 ? "Decimal" : "Invalid"));
        sb2.append(", imeAction=");
        int i10 = this.f36420c;
        if (i10 == -1) {
            str = "Unspecified";
        } else if (i10 != 0) {
            str = i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f36421d);
        sb2.append(')');
        return sb2.toString();
    }
}
