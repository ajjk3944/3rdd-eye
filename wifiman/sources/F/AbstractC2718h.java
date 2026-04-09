package F;

import L0.C3174d;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import w.AbstractC8235B;
import y0.InterfaceC8567G;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2718h {

    /* renamed from: F.h$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5322a = new a();

        a() {
            super(1);
        }

        public final void a(L0.M m10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L0.M) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.h$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f5323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5324b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f5323a = interfaceC3551q0;
            this.f5324b = interfaceC6835l;
        }

        public final void a(L0.M m10) {
            this.f5323a.setValue(m10);
            this.f5324b.invoke(m10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L0.M) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.h$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3174d f5325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f5326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0.U f5327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5328d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5329e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5330f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5331g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5332h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5333i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f5334j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3174d c3174d, androidx.compose.ui.e eVar, L0.U u10, boolean z10, int i10, int i11, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, int i12, int i13) {
            super(2);
            this.f5325a = c3174d;
            this.f5326b = eVar;
            this.f5327c = u10;
            this.f5328d = z10;
            this.f5329e = i10;
            this.f5330f = i11;
            this.f5331g = interfaceC6835l;
            this.f5332h = interfaceC6835l2;
            this.f5333i = i12;
            this.f5334j = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2718h.a(this.f5325a, this.f5326b, this.f5327c, this.f5328d, this.f5329e, this.f5330f, this.f5331g, this.f5332h, interfaceC3540l, L0.a(this.f5333i | 1), this.f5334j);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: F.h$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f5335a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5336b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f5337c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5338d;

        /* renamed from: F.h$d$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f5339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f5340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f5339a = interfaceC3551q0;
                this.f5340b = interfaceC6835l;
            }

            public final void a(long j10) {
                L0.M m10 = (L0.M) this.f5339a.getValue();
                if (m10 != null) {
                    this.f5340b.invoke(Integer.valueOf(m10.x(j10)));
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6531g) obj).v());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3551q0 interfaceC3551q0, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f5337c = interfaceC3551q0;
            this.f5338d = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f5337c, this.f5338d, interfaceC5380e);
            dVar.f5336b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f5335a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f5336b;
                a aVar = new a(this.f5337c, this.f5338d);
                this.f5335a = 1;
                if (AbstractC8235B.k(interfaceC8567G, null, null, null, aVar, this, 7, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(L0.C3174d r24, androidx.compose.ui.e r25, L0.U r26, boolean r27, int r28, int r29, mh.InterfaceC6835l r30, mh.InterfaceC6835l r31, T.InterfaceC3540l r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC2718h.a(L0.d, androidx.compose.ui.e, L0.U, boolean, int, int, mh.l, mh.l, T.l, int, int):void");
    }
}
