package Jh;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Jh.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3126u {
    Qh.u a(Zh.c cVar, boolean z10);

    Set b(Zh.c cVar);

    Qh.g c(a aVar);

    /* renamed from: Jh.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Zh.b f10203a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f10204b;

        /* renamed from: c, reason: collision with root package name */
        private final Qh.g f10205c;

        public a(Zh.b classId, byte[] bArr, Qh.g gVar) {
            AbstractC6492s.i(classId, "classId");
            this.f10203a = classId;
            this.f10204b = bArr;
            this.f10205c = gVar;
        }

        public final Zh.b a() {
            return this.f10203a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f10203a, aVar.f10203a) && AbstractC6492s.d(this.f10204b, aVar.f10204b) && AbstractC6492s.d(this.f10205c, aVar.f10205c);
        }

        public int hashCode() {
            int iHashCode = this.f10203a.hashCode() * 31;
            byte[] bArr = this.f10204b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            Qh.g gVar = this.f10205c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f10203a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f10204b) + ", outerClass=" + this.f10205c + ')';
        }

        public /* synthetic */ a(Zh.b bVar, byte[] bArr, Qh.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
