package If;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import s9.d;
import z.Y;

/* loaded from: classes4.dex */
public abstract class P {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9152a;

        static {
            int[] iArr = new int[EnumC3021a.values().length];
            try {
                iArr[EnumC3021a.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3021a.REQUIREMENTS_NOT_MET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3021a.DISCOVERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3021a.ADOPTION_READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3021a.ADOPTION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3021a.CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3021a.CONNECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3021a.FW_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3021a.FW_UPDATE_PROGRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3021a.COMPLIANCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f9152a = iArr;
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6824a {
        b(Object obj) {
            super(0, obj, AbstractC3022b.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void a() {
            ((AbstractC3022b) this.receiver).o0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC3021a f9153a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3022b f9154b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC3022b f9155a;

            /* renamed from: If.P$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0378a extends C6490p implements InterfaceC6824a {
                C0378a(Object obj) {
                    super(0, obj, AbstractC3022b.class, "onCloseClicked", "onCloseClicked()V", 0);
                }

                public final void a() {
                    ((AbstractC3022b) this.receiver).p0();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return Yg.J.f24997a;
                }
            }

            a(AbstractC3022b abstractC3022b) {
                this.f9155a = abstractC3022b;
            }

            public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1362419642, i10, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupUi.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupUi.kt:104)");
                }
                s9.b bVarG = N9.b.f16117a.s().g(new d.b(AbstractC6780c.f53557p4));
                AbstractC3022b abstractC3022b = this.f9155a;
                interfaceC3540l.U(2031813261);
                boolean zT = interfaceC3540l.T(abstractC3022b);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0378a(abstractC3022b);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                L9.z.c(bVarG, null, 0L, false, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 0, 14);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        c(EnumC3021a enumC3021a, AbstractC3022b abstractC3022b) {
            this.f9153a = enumC3021a;
            this.f9154b = abstractC3022b;
        }

        public final void a(Y ModalToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ModalToolbar, "$this$ModalToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1680735558, i10, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupUi.<anonymous>.<anonymous> (WmwStatusPopupUi.kt:102)");
            }
            if (this.f9153a != EnumC3021a.FW_UPDATE_PROGRESS) {
                L9.L.b(null, b0.c.e(-1362419642, true, new a(this.f9154b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0341  */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(If.AbstractC3022b r29, T.InterfaceC3540l r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 2210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: If.P.d(If.b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(EnumC3021a enumC3021a, AbstractC3022b abstractC3022b) {
        if (enumC3021a == EnumC3021a.CONNECTED) {
            abstractC3022b.q0();
        } else {
            abstractC3022b.o0();
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(AbstractC3022b abstractC3022b) {
        abstractC3022b.o0();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(AbstractC3022b abstractC3022b, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        d(abstractC3022b, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
