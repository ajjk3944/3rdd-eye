package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.g0;
import Bh.l0;
import Bh.s0;
import Dh.V;
import Zg.AbstractC3689v;
import com.google.ar.core.ImageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ji.C6343d;
import ji.InterfaceC6345f;
import mh.InterfaceC6824a;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import pi.AbstractC7335C;
import pi.E0;
import pi.G0;
import pi.N0;
import xi.C8544k;

/* renamed from: Dh.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2612s extends AbstractC2608n implements InterfaceC2515z {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC2515z f3493A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC2492b.a f3494B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC2515z f3495C;

    /* renamed from: D, reason: collision with root package name */
    protected Map f3496D;

    /* renamed from: e, reason: collision with root package name */
    private List f3497e;

    /* renamed from: f, reason: collision with root package name */
    private List f3498f;

    /* renamed from: g, reason: collision with root package name */
    private pi.S f3499g;

    /* renamed from: h, reason: collision with root package name */
    private List f3500h;

    /* renamed from: i, reason: collision with root package name */
    private b0 f3501i;

    /* renamed from: j, reason: collision with root package name */
    private b0 f3502j;

    /* renamed from: k, reason: collision with root package name */
    private Bh.D f3503k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC2510u f3504l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3505m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f3506n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3507o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3508p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3509q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3510r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3511s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3512t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3513u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3514v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3515w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3516x;

    /* renamed from: y, reason: collision with root package name */
    private Collection f3517y;

    /* renamed from: z, reason: collision with root package name */
    private volatile InterfaceC6824a f3518z;

    /* renamed from: Dh.s$a */
    class a implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G0 f3519a;

        a(G0 g02) {
            this.f3519a = g02;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            C8544k c8544k = new C8544k();
            Iterator it = AbstractC2612s.this.f().iterator();
            while (it.hasNext()) {
                c8544k.add(((InterfaceC2515z) it.next()).c(this.f3519a));
            }
            return c8544k;
        }
    }

    /* renamed from: Dh.s$b */
    static class b implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3521a;

        b(List list) {
            this.f3521a = list;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.f3521a;
        }
    }

    /* renamed from: Dh.s$c */
    public class c implements InterfaceC2515z.a {

        /* renamed from: a, reason: collision with root package name */
        protected E0 f3522a;

        /* renamed from: b, reason: collision with root package name */
        protected InterfaceC2503m f3523b;

        /* renamed from: c, reason: collision with root package name */
        protected Bh.D f3524c;

        /* renamed from: d, reason: collision with root package name */
        protected AbstractC2510u f3525d;

        /* renamed from: e, reason: collision with root package name */
        protected InterfaceC2515z f3526e;

        /* renamed from: f, reason: collision with root package name */
        protected InterfaceC2492b.a f3527f;

        /* renamed from: g, reason: collision with root package name */
        protected List f3528g;

        /* renamed from: h, reason: collision with root package name */
        protected List f3529h;

        /* renamed from: i, reason: collision with root package name */
        protected b0 f3530i;

        /* renamed from: j, reason: collision with root package name */
        protected b0 f3531j;

        /* renamed from: k, reason: collision with root package name */
        protected pi.S f3532k;

        /* renamed from: l, reason: collision with root package name */
        protected Zh.f f3533l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f3534m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f3535n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f3536o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f3537p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f3538q;

        /* renamed from: r, reason: collision with root package name */
        private List f3539r;

        /* renamed from: s, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f3540s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f3541t;

        /* renamed from: u, reason: collision with root package name */
        private Map f3542u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f3543v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f3544w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ AbstractC2612s f3545x;

        public c(AbstractC2612s abstractC2612s, E0 e02, InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, List list, List list2, b0 b0Var, pi.S s10, Zh.f fVar) {
            if (e02 == null) {
                v(0);
            }
            if (interfaceC2503m == null) {
                v(1);
            }
            if (d10 == null) {
                v(2);
            }
            if (abstractC2510u == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (s10 == null) {
                v(7);
            }
            this.f3545x = abstractC2612s;
            this.f3526e = null;
            this.f3531j = abstractC2612s.f3502j;
            this.f3534m = true;
            this.f3535n = false;
            this.f3536o = false;
            this.f3537p = false;
            this.f3538q = abstractC2612s.v0();
            this.f3539r = null;
            this.f3540s = null;
            this.f3541t = abstractC2612s.D0();
            this.f3542u = new LinkedHashMap();
            this.f3543v = null;
            this.f3544w = false;
            this.f3522a = e02;
            this.f3523b = interfaceC2503m;
            this.f3524c = d10;
            this.f3525d = abstractC2510u;
            this.f3527f = aVar;
            this.f3528g = list;
            this.f3529h = list2;
            this.f3530i = b0Var;
            this.f3532k = s10;
            this.f3533l = fVar;
        }

        private static /* synthetic */ void v(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case ImageFormat.RGBA_FP16 /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case ImageFormat.YUV_420_888 /* 35 */:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
            if (hVar == null) {
                v(35);
            }
            this.f3540s = hVar;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c m(boolean z10) {
            this.f3534m = z10;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c e(b0 b0Var) {
            this.f3531j = b0Var;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c b() {
            this.f3537p = true;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c c(b0 b0Var) {
            this.f3530i = b0Var;
            return this;
        }

        public c H(boolean z10) {
            this.f3543v = Boolean.valueOf(z10);
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c l() {
            this.f3541t = true;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c q() {
            this.f3538q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f3544w = z10;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c s(InterfaceC2492b.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f3527f = aVar;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c h(Bh.D d10) {
            if (d10 == null) {
                v(10);
            }
            this.f3524c = d10;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c n(Zh.f fVar) {
            if (fVar == null) {
                v(17);
            }
            this.f3533l = fVar;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c j(InterfaceC2492b interfaceC2492b) {
            this.f3526e = (InterfaceC2515z) interfaceC2492b;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c p(InterfaceC2503m interfaceC2503m) {
            if (interfaceC2503m == null) {
                v(8);
            }
            this.f3523b = interfaceC2503m;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c i() {
            this.f3536o = true;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c g(pi.S s10) {
            if (s10 == null) {
                v(23);
            }
            this.f3532k = s10;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c u() {
            this.f3535n = true;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c t(E0 e02) {
            if (e02 == null) {
                v(37);
            }
            this.f3522a = e02;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c o(List list) {
            if (list == null) {
                v(21);
            }
            this.f3539r = list;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c d(List list) {
            if (list == null) {
                v(19);
            }
            this.f3528g = list;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public c f(AbstractC2510u abstractC2510u) {
            if (abstractC2510u == null) {
                v(12);
            }
            this.f3525d = abstractC2510u;
            return this;
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z a() {
            return this.f3545x.M0(this);
        }

        @Override // Bh.InterfaceC2515z.a
        public InterfaceC2515z.a k(InterfaceC2491a.InterfaceC0071a interfaceC0071a, Object obj) {
            if (interfaceC0071a == null) {
                v(39);
            }
            this.f3542u.put(interfaceC0071a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC2612s(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var) {
        super(interfaceC2503m, hVar, fVar, g0Var);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
        if (aVar == null) {
            I(3);
        }
        if (g0Var == null) {
            I(4);
        }
        this.f3504l = AbstractC2509t.f1800i;
        this.f3505m = false;
        this.f3506n = false;
        this.f3507o = false;
        this.f3508p = false;
        this.f3509q = false;
        this.f3510r = false;
        this.f3511s = false;
        this.f3512t = false;
        this.f3513u = false;
        this.f3514v = false;
        this.f3515w = true;
        this.f3516x = false;
        this.f3517y = null;
        this.f3518z = null;
        this.f3495C = null;
        this.f3496D = null;
        this.f3493A = interfaceC2515z == null ? this : interfaceC2515z;
        this.f3494B = aVar;
    }

    private static /* synthetic */ void I(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private g0 N0(boolean z10, InterfaceC2515z interfaceC2515z) {
        g0 g0VarJ;
        if (z10) {
            if (interfaceC2515z == null) {
                interfaceC2515z = a();
            }
            g0VarJ = interfaceC2515z.j();
        } else {
            g0VarJ = g0.f1784a;
        }
        if (g0VarJ == null) {
            I(27);
        }
        return g0VarJ;
    }

    public static List O0(InterfaceC2515z interfaceC2515z, List list, G0 g02) {
        if (list == null) {
            I(28);
        }
        if (g02 == null) {
            I(29);
        }
        return P0(interfaceC2515z, list, g02, false, false, null);
    }

    public static List P0(InterfaceC2515z interfaceC2515z, List list, G0 g02, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            I(30);
        }
        if (g02 == null) {
            I(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            pi.S type = s0Var.getType();
            N0 n02 = N0.IN_VARIANCE;
            pi.S sP = g02.p(type, n02);
            pi.S sJ0 = s0Var.j0();
            pi.S sP2 = sJ0 == null ? null : g02.p(sJ0, n02);
            if (sP == null) {
                return null;
            }
            if ((sP != s0Var.getType() || sJ0 != sP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(V.K0(interfaceC2515z, z10 ? null : s0Var, s0Var.getIndex(), s0Var.getAnnotations(), s0Var.getName(), sP, s0Var.s0(), s0Var.Y(), s0Var.W(), sP2, z11 ? s0Var.j() : g0.f1784a, s0Var instanceof V.b ? new b(((V.b) s0Var).P0()) : null));
        }
        return arrayList;
    }

    private void T0() {
        InterfaceC6824a interfaceC6824a = this.f3518z;
        if (interfaceC6824a != null) {
            this.f3517y = (Collection) interfaceC6824a.invoke();
            this.f3518z = null;
        }
    }

    private void a1(boolean z10) {
        this.f3513u = z10;
    }

    private void b1(boolean z10) {
        this.f3512t = z10;
    }

    private void d1(InterfaceC2515z interfaceC2515z) {
        this.f3495C = interfaceC2515z;
    }

    @Override // Bh.InterfaceC2515z
    public boolean D0() {
        return this.f3513u;
    }

    @Override // Bh.C
    public boolean F0() {
        return this.f3511s;
    }

    @Override // Bh.InterfaceC2491a
    public boolean H() {
        return this.f3516x;
    }

    public InterfaceC2515z K0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        InterfaceC2515z interfaceC2515zA = v().p(interfaceC2503m).h(d10).f(abstractC2510u).s(aVar).m(z10).a();
        if (interfaceC2515zA == null) {
            I(26);
        }
        return interfaceC2515zA;
    }

    @Override // Bh.C
    public boolean L() {
        return this.f3510r;
    }

    protected abstract AbstractC2612s L0(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a aVar, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var);

    protected InterfaceC2515z M0(c cVar) {
        N n10;
        b0 b0Var;
        pi.S sP;
        if (cVar == null) {
            I(25);
        }
        boolean[] zArr = new boolean[1];
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarA = cVar.f3540s != null ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.j.a(getAnnotations(), cVar.f3540s) : getAnnotations();
        InterfaceC2503m interfaceC2503m = cVar.f3523b;
        InterfaceC2515z interfaceC2515z = cVar.f3526e;
        AbstractC2612s abstractC2612sL0 = L0(interfaceC2503m, interfaceC2515z, cVar.f3527f, cVar.f3533l, hVarA, N0(cVar.f3536o, interfaceC2515z));
        List typeParameters = cVar.f3539r == null ? getTypeParameters() : cVar.f3539r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0C = AbstractC7335C.c(typeParameters, cVar.f3522a, abstractC2612sL0, arrayList, zArr);
        if (g0C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f3529h.isEmpty()) {
            int i10 = 0;
            for (b0 b0Var2 : cVar.f3529h) {
                pi.S sP2 = g0C.p(b0Var2.getType(), N0.IN_VARIANCE);
                if (sP2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(bi.h.b(abstractC2612sL0, sP2, ((InterfaceC6345f) b0Var2.getValue()).a(), b0Var2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (sP2 != b0Var2.getType());
                i10 = i11;
            }
        }
        b0 b0Var3 = cVar.f3530i;
        if (b0Var3 != null) {
            pi.S sP3 = g0C.p(b0Var3.getType(), N0.IN_VARIANCE);
            if (sP3 == null) {
                return null;
            }
            N n11 = new N(abstractC2612sL0, new C6343d(abstractC2612sL0, sP3, cVar.f3530i.getValue()), cVar.f3530i.getAnnotations());
            zArr[0] = (sP3 != cVar.f3530i.getType()) | zArr[0];
            n10 = n11;
        } else {
            n10 = null;
        }
        b0 b0Var4 = cVar.f3531j;
        if (b0Var4 != null) {
            b0 b0VarC = b0Var4.c(g0C);
            if (b0VarC == null) {
                return null;
            }
            zArr[0] = zArr[0] | (b0VarC != cVar.f3531j);
            b0Var = b0VarC;
        } else {
            b0Var = null;
        }
        List listP0 = P0(abstractC2612sL0, cVar.f3528g, g0C, cVar.f3537p, cVar.f3536o, zArr);
        if (listP0 == null || (sP = g0C.p(cVar.f3532k, N0.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (sP != cVar.f3532k);
        zArr[0] = z10;
        if (!z10 && cVar.f3544w) {
            return this;
        }
        abstractC2612sL0.R0(n10, b0Var, arrayList2, arrayList, listP0, sP, cVar.f3524c, cVar.f3525d);
        abstractC2612sL0.f1(this.f3505m);
        abstractC2612sL0.c1(this.f3506n);
        abstractC2612sL0.X0(this.f3507o);
        abstractC2612sL0.e1(this.f3508p);
        abstractC2612sL0.i1(this.f3509q);
        abstractC2612sL0.h1(this.f3514v);
        abstractC2612sL0.W0(this.f3510r);
        abstractC2612sL0.V0(this.f3511s);
        abstractC2612sL0.Y0(this.f3515w);
        abstractC2612sL0.b1(cVar.f3538q);
        abstractC2612sL0.a1(cVar.f3541t);
        abstractC2612sL0.Z0(cVar.f3543v != null ? cVar.f3543v.booleanValue() : this.f3516x);
        if (!cVar.f3542u.isEmpty() || this.f3496D != null) {
            Map map = cVar.f3542u;
            Map map2 = this.f3496D;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC2612sL0.f3496D = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC2612sL0.f3496D = map;
            }
        }
        if (cVar.f3535n || a0() != null) {
            abstractC2612sL0.d1((a0() != null ? a0() : this).c(g0C));
        }
        if (cVar.f3534m && !a().f().isEmpty()) {
            if (cVar.f3522a.f()) {
                InterfaceC6824a interfaceC6824a = this.f3518z;
                if (interfaceC6824a != null) {
                    abstractC2612sL0.f3518z = interfaceC6824a;
                } else {
                    abstractC2612sL0.x0(f());
                }
            } else {
                abstractC2612sL0.f3518z = new a(g0C);
            }
        }
        return abstractC2612sL0;
    }

    @Override // Bh.InterfaceC2515z
    public boolean O() {
        return this.f3509q;
    }

    public boolean Q0() {
        return this.f3515w;
    }

    public AbstractC2612s R0(b0 b0Var, b0 b0Var2, List list, List list2, List list3, pi.S s10, Bh.D d10, AbstractC2510u abstractC2510u) {
        if (list == null) {
            I(5);
        }
        if (list2 == null) {
            I(6);
        }
        if (list3 == null) {
            I(7);
        }
        if (abstractC2510u == null) {
            I(8);
        }
        this.f3497e = AbstractC3689v.i1(list2);
        this.f3498f = AbstractC3689v.i1(list3);
        this.f3499g = s10;
        this.f3503k = d10;
        this.f3504l = abstractC2510u;
        this.f3501i = b0Var;
        this.f3502j = b0Var2;
        this.f3500h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            l0 l0Var = (l0) list2.get(i10);
            if (l0Var.getIndex() != i10) {
                throw new IllegalStateException(l0Var + " index is " + l0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            s0 s0Var = (s0) list3.get(i11);
            if (s0Var.getIndex() != i11) {
                throw new IllegalStateException(s0Var + "index is " + s0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected c S0(G0 g02) {
        if (g02 == null) {
            I(24);
        }
        return new c(this, g02.j(), b(), l(), getVisibility(), h(), i(), p0(), k0(), getReturnType(), null);
    }

    public void U0(InterfaceC2491a.InterfaceC0071a interfaceC0071a, Object obj) {
        if (this.f3496D == null) {
            this.f3496D = new LinkedHashMap();
        }
        this.f3496D.put(interfaceC0071a, obj);
    }

    public void V0(boolean z10) {
        this.f3511s = z10;
    }

    public void W0(boolean z10) {
        this.f3510r = z10;
    }

    public void X0(boolean z10) {
        this.f3507o = z10;
    }

    public void Y0(boolean z10) {
        this.f3515w = z10;
    }

    public void Z0(boolean z10) {
        this.f3516x = z10;
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    public InterfaceC2515z a() {
        InterfaceC2515z interfaceC2515z = this.f3493A;
        InterfaceC2515z interfaceC2515zA = interfaceC2515z == this ? this : interfaceC2515z.a();
        if (interfaceC2515zA == null) {
            I(20);
        }
        return interfaceC2515zA;
    }

    @Override // Bh.InterfaceC2515z
    public InterfaceC2515z a0() {
        return this.f3495C;
    }

    public void c1(boolean z10) {
        this.f3506n = z10;
    }

    @Override // Bh.InterfaceC2491a
    public b0 d0() {
        return this.f3502j;
    }

    @Override // Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a interfaceC0071a) {
        Map map = this.f3496D;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0071a);
    }

    public void e1(boolean z10) {
        this.f3508p = z10;
    }

    public Collection f() {
        T0();
        Collection collectionEmptyList = this.f3517y;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            I(14);
        }
        return collectionEmptyList;
    }

    public void f1(boolean z10) {
        this.f3505m = z10;
    }

    public void g1(pi.S s10) {
        if (s10 == null) {
            I(11);
        }
        this.f3499g = s10;
    }

    public pi.S getReturnType() {
        return this.f3499g;
    }

    @Override // Bh.InterfaceC2491a
    public List getTypeParameters() {
        List list = this.f3497e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = this.f3504l;
        if (abstractC2510u == null) {
            I(16);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2492b
    public InterfaceC2492b.a h() {
        InterfaceC2492b.a aVar = this.f3494B;
        if (aVar == null) {
            I(21);
        }
        return aVar;
    }

    public void h1(boolean z10) {
        this.f3514v = z10;
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        List list = this.f3498f;
        if (list == null) {
            I(19);
        }
        return list;
    }

    public void i1(boolean z10) {
        this.f3509q = z10;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return this.f3507o;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isInfix() {
        if (this.f3506n) {
            return true;
        }
        Iterator it = a().f().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2515z) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isInline() {
        return this.f3508p;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isOperator() {
        if (this.f3505m) {
            return true;
        }
        Iterator it = a().f().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2515z) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isSuspend() {
        return this.f3514v;
    }

    public void j1(AbstractC2510u abstractC2510u) {
        if (abstractC2510u == null) {
            I(10);
        }
        this.f3504l = abstractC2510u;
    }

    @Override // Bh.InterfaceC2491a
    public b0 k0() {
        return this.f3501i;
    }

    @Override // Bh.C
    public Bh.D l() {
        Bh.D d10 = this.f3503k;
        if (d10 == null) {
            I(15);
        }
        return d10;
    }

    @Override // Bh.InterfaceC2491a
    public List p0() {
        List list = this.f3500h;
        if (list == null) {
            I(13);
        }
        return list;
    }

    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.a(this, obj);
    }

    public InterfaceC2515z.a v() {
        c cVarS0 = S0(G0.f58062b);
        if (cVarS0 == null) {
            I(23);
        }
        return cVarS0;
    }

    @Override // Bh.InterfaceC2515z
    public boolean v0() {
        return this.f3512t;
    }

    public void x0(Collection collection) {
        if (collection == null) {
            I(17);
        }
        this.f3517y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2515z) it.next()).D0()) {
                this.f3513u = true;
                return;
            }
        }
    }

    @Override // Bh.InterfaceC2515z, Bh.i0
    public InterfaceC2515z c(G0 g02) {
        if (g02 == null) {
            I(22);
        }
        return g02.k() ? this : S0(g02).j(a()).i().K(true).a();
    }
}
