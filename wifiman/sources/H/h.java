package H;

import I.n1;
import L0.S;
import L0.T;
import Yg.s;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes.dex */
public final class h implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f7547a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7548b;

    /* renamed from: c, reason: collision with root package name */
    private final S f7549c;

    /* renamed from: d, reason: collision with root package name */
    private final s f7550d;

    public /* synthetic */ h(CharSequence charSequence, long j10, S s10, s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j10, s10, sVar);
    }

    public final boolean a(CharSequence charSequence) {
        return t.x(this.f7547a, charSequence);
    }

    public char b(int i10) {
        return this.f7547a.charAt(i10);
    }

    public final S c() {
        return this.f7549c;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    public final s d() {
        return this.f7550d;
    }

    public int e() {
        return this.f7547a.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return S.g(this.f7548b, hVar.f7548b) && AbstractC6492s.d(this.f7549c, hVar.f7549c) && AbstractC6492s.d(this.f7550d, hVar.f7550d) && a(hVar.f7547a);
    }

    public final long f() {
        return this.f7548b;
    }

    public final CharSequence g() {
        return this.f7547a;
    }

    public final boolean h() {
        return this.f7550d == null;
    }

    public int hashCode() {
        int iHashCode = ((this.f7547a.hashCode() * 31) + S.o(this.f7548b)) * 31;
        S s10 = this.f7549c;
        int iO = (iHashCode + (s10 != null ? S.o(s10.r()) : 0)) * 31;
        s sVar = this.f7550d;
        return iO + (sVar != null ? sVar.hashCode() : 0);
    }

    public final void i(char[] cArr, int i10, int i11, int i12) {
        n1.a(this.f7547a, cArr, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return e();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f7547a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f7547a.toString();
    }

    private h(CharSequence charSequence, long j10, S s10, s sVar) {
        this.f7547a = charSequence instanceof h ? ((h) charSequence).f7547a : charSequence;
        this.f7548b = T.c(j10, 0, charSequence.length());
        this.f7549c = s10 != null ? S.b(T.c(s10.r(), 0, charSequence.length())) : null;
        this.f7550d = sVar != null ? s.g(sVar, null, S.b(T.c(((S) sVar.j()).r(), 0, charSequence.length())), 1, null) : null;
    }

    public /* synthetic */ h(String str, long j10, S s10, s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? S.f11103b.a() : j10, (i10 & 4) != 0 ? null : s10, (i10 & 8) != 0 ? null : sVar, null);
    }
}
