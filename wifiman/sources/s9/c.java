package s9;

import java.net.URI;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* loaded from: classes3.dex */
public abstract class c implements InterfaceC7929a {

    public static final class a extends c implements InterfaceC7929a.b.InterfaceC2144a {

        /* renamed from: a, reason: collision with root package name */
        private final int f61423a;

        /* renamed from: b, reason: collision with root package name */
        private final d f61424b;

        public /* synthetic */ a(int i10, d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : dVar);
        }

        @Override // s9.InterfaceC7929a.b.InterfaceC2144a
        public int d() {
            return this.f61423a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f61423a == aVar.f61423a && AbstractC6492s.d(this.f61424b, aVar.f61424b);
        }

        @Override // s9.InterfaceC7929a
        public d getContentDescription() {
            return this.f61424b;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f61423a) * 31;
            d dVar = this.f61424b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "Res(resource=" + this.f61423a + ", contentDescription=" + this.f61424b + ")";
        }

        public a(int i10, d dVar) {
            super(null);
            this.f61423a = i10;
            this.f61424b = dVar;
        }
    }

    public static final class b extends c implements InterfaceC7929a.InterfaceC2142a.InterfaceC2143a {

        /* renamed from: a, reason: collision with root package name */
        private final URI f61425a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC7929a.b f61426b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC7929a.b f61427c;

        /* renamed from: d, reason: collision with root package name */
        private final d f61428d;

        public /* synthetic */ b(URI uri, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? null : dVar);
        }

        @Override // s9.InterfaceC7929a.InterfaceC2142a
        public InterfaceC7929a.b a() {
            return this.f61426b;
        }

        @Override // s9.InterfaceC7929a.InterfaceC2142a.InterfaceC2143a
        public URI b() {
            return this.f61425a;
        }

        @Override // s9.InterfaceC7929a.InterfaceC2142a
        public InterfaceC7929a.b c() {
            return this.f61427c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f61425a, bVar.f61425a) && AbstractC6492s.d(this.f61426b, bVar.f61426b) && AbstractC6492s.d(this.f61427c, bVar.f61427c) && AbstractC6492s.d(this.f61428d, bVar.f61428d);
        }

        @Override // s9.InterfaceC7929a
        public d getContentDescription() {
            return this.f61428d;
        }

        public int hashCode() {
            int iHashCode = this.f61425a.hashCode() * 31;
            InterfaceC7929a.b bVar = this.f61426b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            InterfaceC7929a.b bVar2 = this.f61427c;
            int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            d dVar = this.f61428d;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "Url(url=" + this.f61425a + ", fallback=" + this.f61426b + ", placeholder=" + this.f61427c + ", contentDescription=" + this.f61428d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URI url, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, d dVar) {
            super(null);
            AbstractC6492s.i(url, "url");
            this.f61425a = url;
            this.f61426b = bVar;
            this.f61427c = bVar2;
            this.f61428d = dVar;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
