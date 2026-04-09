package Zb;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25264d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f25265a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25266b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25267c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, boolean z10, boolean z11) {
        this.f25265a = i10;
        this.f25266b = z10;
        this.f25267c = z11;
    }

    public final boolean a() {
        return this.f25267c;
    }

    public final int b() {
        return this.f25265a;
    }

    public final boolean c() {
        return this.f25266b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25265a == cVar.f25265a && this.f25266b == cVar.f25266b && this.f25267c == cVar.f25267c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f25265a) * 31) + Boolean.hashCode(this.f25266b)) * 31) + Boolean.hashCode(this.f25267c);
    }

    public String toString() {
        return "RoomSpeedtestSettings(id=" + this.f25265a + ", uispReportingEnabled=" + this.f25266b + ", advancedTestEnabled=" + this.f25267c + ")";
    }

    public /* synthetic */ c(int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, z10, z11);
    }
}
