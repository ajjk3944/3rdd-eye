package z9;

import java.util.List;
import kotlin.jvm.internal.t;
import kotlinx.serialization.descriptors.f;

/* loaded from: classes4.dex */
public abstract class h {

    public static final class a implements kotlinx.serialization.descriptors.f {

        /* renamed from: a, reason: collision with root package name */
        public final y8.h f25449a;

        public a(l9.a aVar) {
            this.f25449a = kotlin.b.b(aVar);
        }

        public final kotlinx.serialization.descriptors.f a() {
            return (kotlinx.serialization.descriptors.f) this.f25449a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean b() {
            return f.a.c(this);
        }

        @Override // kotlinx.serialization.descriptors.f
        public int c(String name) {
            kotlin.jvm.internal.p.e(name, "name");
            return a().c(name);
        }

        @Override // kotlinx.serialization.descriptors.f
        public int d() {
            return a().d();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String e(int i10) {
            return a().e(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List f(int i10) {
            return a().f(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.f g(int i10) {
            return a().g(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public List getAnnotations() {
            return f.a.a(this);
        }

        @Override // kotlinx.serialization.descriptors.f
        public kotlinx.serialization.descriptors.h getKind() {
            return a().getKind();
        }

        @Override // kotlinx.serialization.descriptors.f
        public String h() {
            return a().h();
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean i(int i10) {
            return a().i(i10);
        }

        @Override // kotlinx.serialization.descriptors.f
        public boolean isInline() {
            return f.a.b(this);
        }
    }

    public static final e d(y9.e eVar) {
        kotlin.jvm.internal.p.e(eVar, "<this>");
        e eVar2 = eVar instanceof e ? (e) eVar : null;
        if (eVar2 != null) {
            return eVar2;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + t.b(eVar.getClass()));
    }

    public static final i e(y9.f fVar) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        i iVar = fVar instanceof i ? (i) fVar : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + t.b(fVar.getClass()));
    }

    public static final kotlinx.serialization.descriptors.f f(l9.a aVar) {
        return new a(aVar);
    }

    public static final void g(y9.e eVar) {
        d(eVar);
    }

    public static final void h(y9.f fVar) {
        e(fVar);
    }
}
