package J9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f9912a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f9913b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.b f9914c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9915d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9916e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9917f;

    public a(int i10, s9.d dVar, s9.b bVar, boolean z10, String str, String str2) {
        this.f9912a = i10;
        this.f9913b = dVar;
        this.f9914c = bVar;
        this.f9915d = z10;
        this.f9916e = str;
        this.f9917f = str2;
    }

    public final s9.b a() {
        return this.f9914c;
    }

    public final String b() {
        return this.f9917f;
    }

    public final int c() {
        return this.f9912a;
    }

    public final boolean d() {
        return this.f9915d;
    }

    public final String e() {
        return this.f9916e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9912a == aVar.f9912a && AbstractC6492s.d(this.f9913b, aVar.f9913b) && AbstractC6492s.d(this.f9914c, aVar.f9914c) && this.f9915d == aVar.f9915d && AbstractC6492s.d(this.f9916e, aVar.f9916e) && AbstractC6492s.d(this.f9917f, aVar.f9917f);
    }

    public final s9.d f() {
        return this.f9913b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f9912a) * 31;
        s9.d dVar = this.f9913b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.b bVar = this.f9914c;
        int iHashCode3 = (((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f9915d)) * 31;
        String str = this.f9916e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9917f;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UiTab(id=" + this.f9912a + ", title=" + this.f9913b + ", icon=" + this.f9914c + ", selected=" + this.f9915d + ", testAutomationId=" + this.f9916e + ", iconContentDescription=" + this.f9917f + ")";
    }

    public /* synthetic */ a(int i10, s9.d dVar, s9.b bVar, boolean z10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : str, (i11 & 32) == 0 ? str2 : null);
    }
}
