package wh;

import Bh.AbstractC2509t;
import Bh.InterfaceC2503m;
import Gh.AbstractC2914f;
import Xh.a;
import Yh.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import ni.C6963N;
import ni.C6981m;
import ni.InterfaceC6987s;
import wh.AbstractC8374n;

/* renamed from: wh.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8378p {

    /* renamed from: wh.p$a */
    public static final class a extends AbstractC8378p {

        /* renamed from: a, reason: collision with root package name */
        private final Field f65188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            AbstractC6492s.i(field, "field");
            this.f65188a = field;
        }

        @Override // wh.AbstractC8378p
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f65188a.getName();
            AbstractC6492s.h(name, "getName(...)");
            sb2.append(Jh.H.b(name));
            sb2.append("()");
            Class<?> type = this.f65188a.getType();
            AbstractC6492s.h(type, "getType(...)");
            sb2.append(AbstractC2914f.f(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f65188a;
        }
    }

    /* renamed from: wh.p$b */
    public static final class b extends AbstractC8378p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f65189a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f65190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            AbstractC6492s.i(getterMethod, "getterMethod");
            this.f65189a = getterMethod;
            this.f65190b = method;
        }

        @Override // wh.AbstractC8378p
        public String a() {
            return h1.d(this.f65189a);
        }

        public final Method b() {
            return this.f65189a;
        }

        public final Method c() {
            return this.f65190b;
        }
    }

    /* renamed from: wh.p$c */
    public static final class c extends AbstractC8378p {

        /* renamed from: a, reason: collision with root package name */
        private final Bh.Y f65191a;

        /* renamed from: b, reason: collision with root package name */
        private final Uh.n f65192b;

        /* renamed from: c, reason: collision with root package name */
        private final a.d f65193c;

        /* renamed from: d, reason: collision with root package name */
        private final Wh.c f65194d;

        /* renamed from: e, reason: collision with root package name */
        private final Wh.g f65195e;

        /* renamed from: f, reason: collision with root package name */
        private final String f65196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bh.Y descriptor, Uh.n proto, a.d signature, Wh.c nameResolver, Wh.g typeTable) {
            String str;
            super(null);
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(proto, "proto");
            AbstractC6492s.i(signature, "signature");
            AbstractC6492s.i(nameResolver, "nameResolver");
            AbstractC6492s.i(typeTable, "typeTable");
            this.f65191a = descriptor;
            this.f65192b = proto;
            this.f65193c = signature;
            this.f65194d = nameResolver;
            this.f65195e = typeTable;
            if (signature.M0()) {
                str = nameResolver.getString(signature.q0().S()) + nameResolver.getString(signature.q0().P());
            } else {
                d.a aVarD = Yh.i.d(Yh.i.f25057a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new Y0("No field signature for property: " + descriptor);
                }
                String strB = aVarD.b();
                str = Jh.H.b(strB) + c() + "()" + aVarD.c();
            }
            this.f65196f = str;
        }

        private final String c() {
            String string;
            InterfaceC2503m interfaceC2503mB = this.f65191a.b();
            AbstractC6492s.h(interfaceC2503mB, "getContainingDeclaration(...)");
            if (AbstractC6492s.d(this.f65191a.getVisibility(), AbstractC2509t.f1795d) && (interfaceC2503mB instanceof C6981m)) {
                Uh.c cVarE1 = ((C6981m) interfaceC2503mB).e1();
                h.f classModuleName = Xh.a.f24350i;
                AbstractC6492s.h(classModuleName, "classModuleName");
                Integer num = (Integer) Wh.e.a(cVarE1, classModuleName);
                if (num == null || (string = this.f65194d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + Zh.g.b(string);
            }
            if (!AbstractC6492s.d(this.f65191a.getVisibility(), AbstractC2509t.f1792a) || !(interfaceC2503mB instanceof Bh.M)) {
                return "";
            }
            Bh.Y y10 = this.f65191a;
            AbstractC6492s.g(y10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC6987s interfaceC6987sZ = ((C6963N) y10).Z();
            if (!(interfaceC6987sZ instanceof Sh.r)) {
                return "";
            }
            Sh.r rVar = (Sh.r) interfaceC6987sZ;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().b();
        }

        @Override // wh.AbstractC8378p
        public String a() {
            return this.f65196f;
        }

        public final Bh.Y b() {
            return this.f65191a;
        }

        public final Wh.c d() {
            return this.f65194d;
        }

        public final Uh.n e() {
            return this.f65192b;
        }

        public final a.d f() {
            return this.f65193c;
        }

        public final Wh.g g() {
            return this.f65195e;
        }
    }

    /* renamed from: wh.p$d */
    public static final class d extends AbstractC8378p {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8374n.e f65197a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC8374n.e f65198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC8374n.e getterSignature, AbstractC8374n.e eVar) {
            super(null);
            AbstractC6492s.i(getterSignature, "getterSignature");
            this.f65197a = getterSignature;
            this.f65198b = eVar;
        }

        @Override // wh.AbstractC8378p
        public String a() {
            return this.f65197a.a();
        }

        public final AbstractC8374n.e b() {
            return this.f65197a;
        }

        public final AbstractC8374n.e c() {
            return this.f65198b;
        }
    }

    public /* synthetic */ AbstractC8378p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC8378p() {
    }
}
