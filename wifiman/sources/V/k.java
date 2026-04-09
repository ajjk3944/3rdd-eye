package v;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.r;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import z.InterfaceC8687j;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final r f63316a = new r(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: b, reason: collision with root package name */
    private static final C8178b f63317b;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C8178b f63318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63319b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f63320c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f63321d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f63322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8178b c8178b, androidx.compose.ui.e eVar, q qVar, int i10, int i11) {
            super(2);
            this.f63318a = c8178b;
            this.f63319b = eVar;
            this.f63320c = qVar;
            this.f63321d = i10;
            this.f63322e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            k.a(this.f63318a, this.f63319b, this.f63320c, interfaceC3540l, L0.a(this.f63321d | 1), this.f63322e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f63323a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63324b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, InterfaceC6824a interfaceC6824a) {
            super(0);
            this.f63323a = z10;
            this.f63324b = interfaceC6824a;
        }

        public final void a() {
            if (this.f63323a) {
                this.f63324b.invoke();
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f63326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8178b f63327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63328d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f63329e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63330f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f63331g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f63332h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z10, C8178b c8178b, androidx.compose.ui.e eVar, q qVar, InterfaceC6824a interfaceC6824a, int i10, int i11) {
            super(2);
            this.f63325a = str;
            this.f63326b = z10;
            this.f63327c = c8178b;
            this.f63328d = eVar;
            this.f63329e = qVar;
            this.f63330f = interfaceC6824a;
            this.f63331g = i10;
            this.f63332h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            k.b(this.f63325a, this.f63326b, this.f63327c, this.f63328d, this.f63329e, this.f63330f, interfaceC3540l, L0.a(this.f63331g | 1), this.f63332h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.q f63333a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63335c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63336d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f63337e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f63338f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.window.q qVar, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, int i10, int i11) {
            super(2);
            this.f63333a = qVar;
            this.f63334b = interfaceC6824a;
            this.f63335c = eVar;
            this.f63336d = interfaceC6835l;
            this.f63337e = i10;
            this.f63338f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            k.c(this.f63333a, this.f63334b, this.f63335c, this.f63336d, interfaceC3540l, L0.a(this.f63337e | 1), this.f63338f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C8178b f63339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63340b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63341c;

        static final class a extends AbstractC6494u implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f63342a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8178b f63343b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6835l interfaceC6835l, C8178b c8178b) {
                super(3);
                this.f63342a = interfaceC6835l;
                this.f63343b = c8178b;
            }

            public final void a(InterfaceC8687j interfaceC8687j, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1156688164, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                }
                Object objF = interfaceC3540l.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new g();
                    interfaceC3540l.K(objF);
                }
                g gVar = (g) objF;
                InterfaceC6835l interfaceC6835l = this.f63342a;
                C8178b c8178b = this.f63343b;
                gVar.b();
                interfaceC6835l.invoke(gVar);
                gVar.a(c8178b, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C8178b c8178b, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l) {
            super(2);
            this.f63339a = c8178b;
            this.f63340b = eVar;
            this.f63341c = interfaceC6835l;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(795909757, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
            }
            C8178b c8178b = this.f63339a;
            k.a(c8178b, this.f63340b, b0.c.e(1156688164, true, new a(this.f63341c, c8178b), interfaceC3540l, 54), interfaceC3540l, 384, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.q f63344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f63345b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f63346c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C8178b f63347d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f63348e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f63349f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f63350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.window.q qVar, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, C8178b c8178b, InterfaceC6835l interfaceC6835l, int i10, int i11) {
            super(2);
            this.f63344a = qVar;
            this.f63345b = interfaceC6824a;
            this.f63346c = eVar;
            this.f63347d = c8178b;
            this.f63348e = interfaceC6835l;
            this.f63349f = i10;
            this.f63350g = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            k.d(this.f63344a, this.f63345b, this.f63346c, this.f63347d, this.f63348e, interfaceC3540l, L0.a(this.f63349f | 1), this.f63350g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static {
        C6733v0.a aVar = C6733v0.f52951b;
        f63317b = new C8178b(aVar.f(), aVar.a(), aVar.a(), C6733v0.k(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), C6733v0.k(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(v.C8178b r23, androidx.compose.ui.e r24, mh.q r25, T.InterfaceC3540l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.a(v.b, androidx.compose.ui.e, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r30, boolean r31, v.C8178b r32, androidx.compose.ui.e r33, mh.q r34, mh.InterfaceC6824a r35, T.InterfaceC3540l r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.b(java.lang.String, boolean, v.b, androidx.compose.ui.e, mh.q, mh.a, T.l, int, int):void");
    }

    public static final void c(androidx.compose.ui.window.q qVar, InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            d(qVar, interfaceC6824a, eVar, e(0, 0, interfaceC3540lR, 0, 3), interfaceC6835l, interfaceC3540lR, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(qVar, interfaceC6824a, eVar2, interfaceC6835l, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.window.q r16, mh.InterfaceC6824a r17, androidx.compose.ui.e r18, v.C8178b r19, mh.InterfaceC6835l r20, T.InterfaceC3540l r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.d(androidx.compose.ui.window.q, mh.a, androidx.compose.ui.e, v.b, mh.l, T.l, int, int):void");
    }

    public static final C8178b e(int i10, int i11, InterfaceC3540l interfaceC3540l, int i12, int i13) throws Resources.NotFoundException {
        int i14 = (i13 & 1) != 0 ? R.style.Widget.PopupMenu : i10;
        int i15 = (i13 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i11;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1689505294, i12, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        boolean zT = interfaceC3540l.T((Configuration) interfaceC3540l.t(AndroidCompositionLocals_androidKt.f())) | interfaceC3540l.T(context);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            C8178b c8178b = f63317b;
            long jH = h(context, i14, R.attr.colorBackground, c8178b.a());
            ColorStateList colorStateListI = i(context, i15, R.attr.textColorPrimary);
            long jG = g(colorStateListI, c8178b.e());
            long jF = f(colorStateListI, c8178b.c());
            objF = new C8178b(jH, jG, jG, jF, jF, null);
            interfaceC3540l.K(objF);
        }
        C8178b c8178b2 = (C8178b) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c8178b2;
    }

    private static final long f(ColorStateList colorStateList, long j10) {
        int iJ = AbstractC6737x0.j(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j10 : AbstractC6737x0.b(numValueOf.intValue());
    }

    private static final long g(ColorStateList colorStateList, long j10) {
        int iJ = AbstractC6737x0.j(j10);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j10 : AbstractC6737x0.b(numValueOf.intValue());
    }

    private static final long h(Context context, int i10, int i11, long j10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int iJ = AbstractC6737x0.j(j10);
        int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
        typedArrayObtainStyledAttributes.recycle();
        return color == iJ ? j10 : AbstractC6737x0.b(color);
    }

    private static final ColorStateList i(Context context, int i10, int i11) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
