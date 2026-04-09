package aj;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class s {

    public static final class a implements Xi.f {

        /* renamed from: a, reason: collision with root package name */
        private final Yg.m f26376a;

        a(InterfaceC6824a interfaceC6824a) {
            this.f26376a = Yg.n.b(interfaceC6824a);
        }

        private final Xi.f b() {
            return (Xi.f) this.f26376a.getValue();
        }

        @Override // Xi.f
        public String a() {
            return b().a();
        }

        @Override // Xi.f
        public int d(String name) {
            AbstractC6492s.i(name, "name");
            return b().d(name);
        }

        @Override // Xi.f
        public int e() {
            return b().e();
        }

        @Override // Xi.f
        public String f(int i10) {
            return b().f(i10);
        }

        @Override // Xi.f
        public List g(int i10) {
            return b().g(i10);
        }

        @Override // Xi.f
        public Xi.m h() {
            return b().h();
        }

        @Override // Xi.f
        public Xi.f i(int i10) {
            return b().i(i10);
        }

        @Override // Xi.f
        public boolean j(int i10) {
            return b().j(i10);
        }
    }

    public static final InterfaceC3875i d(Yi.e eVar) {
        AbstractC6492s.i(eVar, "<this>");
        InterfaceC3875i interfaceC3875i = eVar instanceof InterfaceC3875i ? (InterfaceC3875i) eVar : null;
        if (interfaceC3875i != null) {
            return interfaceC3875i;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + O.b(eVar.getClass()));
    }

    public static final t e(Yi.f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        t tVar = fVar instanceof t ? (t) fVar : null;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + O.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f f(InterfaceC6824a interfaceC6824a) {
        return new a(interfaceC6824a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Yi.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Yi.f fVar) {
        e(fVar);
    }
}
