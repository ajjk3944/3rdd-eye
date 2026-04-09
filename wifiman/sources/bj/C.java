package bj;

import Yg.AbstractC3658b;
import Yg.AbstractC3659c;
import Yg.C3657a;
import aj.AbstractC3866G;
import aj.C3861B;
import aj.C3864E;
import aj.C3869c;
import aj.C3873g;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4118a f33392a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33393b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33394c;

    /* renamed from: d, reason: collision with root package name */
    private int f33395d;

    static final class a extends kotlin.coroutines.jvm.internal.k implements mh.q {

        /* renamed from: b, reason: collision with root package name */
        int f33396b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f33397c;

        a(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f33396b;
            if (i10 == 0) {
                Yg.v.b(obj);
                AbstractC3659c abstractC3659c = (AbstractC3659c) this.f33397c;
                byte bF = C.this.f33392a.F();
                if (bF == 1) {
                    return C.this.j(true);
                }
                if (bF == 0) {
                    return C.this.j(false);
                }
                if (bF != 6) {
                    if (bF == 8) {
                        return C.this.f();
                    }
                    AbstractC4118a.z(C.this.f33392a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                C c10 = C.this;
                this.f33396b = 1;
                obj = c10.i(abstractC3659c, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return (aj.j) obj;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(AbstractC3659c abstractC3659c, Yg.J j10, InterfaceC5380e interfaceC5380e) {
            a aVar = C.this.new a(interfaceC5380e);
            aVar.f33397c = abstractC3659c;
            return aVar.invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33399a;

        /* renamed from: b, reason: collision with root package name */
        Object f33400b;

        /* renamed from: c, reason: collision with root package name */
        Object f33401c;

        /* renamed from: d, reason: collision with root package name */
        Object f33402d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33403e;

        /* renamed from: g, reason: collision with root package name */
        int f33405g;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33403e = obj;
            this.f33405g |= PduHandle.NONE;
            return C.this.i(null, this);
        }
    }

    public C(C3873g configuration, AbstractC4118a lexer) {
        AbstractC6492s.i(configuration, "configuration");
        AbstractC6492s.i(lexer, "lexer");
        this.f33392a = lexer;
        this.f33393b = configuration.q();
        this.f33394c = configuration.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aj.j f() {
        byte bK = this.f33392a.k();
        if (this.f33392a.F() == 4) {
            AbstractC4118a.z(this.f33392a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f33392a.f()) {
            arrayList.add(e());
            bK = this.f33392a.k();
            if (bK != 4) {
                AbstractC4118a abstractC4118a = this.f33392a;
                boolean z10 = bK == 9;
                int i10 = abstractC4118a.f33431a;
                if (!z10) {
                    AbstractC4118a.z(abstractC4118a, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bK == 8) {
            this.f33392a.l((byte) 9);
        } else if (bK == 4) {
            if (!this.f33394c) {
                r.f(this.f33392a, "array");
                throw new KotlinNothingValueException();
            }
            this.f33392a.l((byte) 9);
        }
        return new C3869c(arrayList);
    }

    private final aj.j g() {
        return (aj.j) AbstractC3658b.b(new C3657a(new a(null)), Yg.J.f24997a);
    }

    private final aj.j h() {
        byte bL = this.f33392a.l((byte) 6);
        if (this.f33392a.F() == 4) {
            AbstractC4118a.z(this.f33392a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f33392a.f()) {
                break;
            }
            String strS = this.f33393b ? this.f33392a.s() : this.f33392a.q();
            this.f33392a.l((byte) 5);
            linkedHashMap.put(strS, e());
            bL = this.f33392a.k();
            if (bL != 4) {
                if (bL != 7) {
                    AbstractC4118a.z(this.f33392a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bL == 6) {
            this.f33392a.l((byte) 7);
        } else if (bL == 4) {
            if (!this.f33394c) {
                r.g(this.f33392a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f33392a.l((byte) 7);
        }
        return new C3864E(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(Yg.AbstractC3659c r21, dh.InterfaceC5380e r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.C.i(Yg.c, dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3866G j(boolean z10) {
        String strS = (this.f33393b || !z10) ? this.f33392a.s() : this.f33392a.q();
        return (z10 || !AbstractC6492s.d(strS, "null")) ? new aj.x(strS, z10, null, 4, null) : C3861B.INSTANCE;
    }

    public final aj.j e() {
        byte bF = this.f33392a.F();
        if (bF == 1) {
            return j(true);
        }
        if (bF == 0) {
            return j(false);
        }
        if (bF == 6) {
            int i10 = this.f33395d + 1;
            this.f33395d = i10;
            this.f33395d--;
            return i10 == 200 ? g() : h();
        }
        if (bF == 8) {
            return f();
        }
        AbstractC4118a.z(this.f33392a, "Cannot read Json element because of unexpected " + AbstractC4119b.c(bF), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
