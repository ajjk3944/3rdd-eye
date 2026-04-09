package B;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import c0.InterfaceC4176e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* renamed from: B.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2454s {

    /* renamed from: B.s$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2455t f1007a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1008b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2455t interfaceC2455t, int i10, Object obj) {
            super(2);
            this.f1007a = interfaceC2455t;
            this.f1008b = i10;
            this.f1009c = obj;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.f1007a.h(this.f1008b, this.f1009c, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: B.s$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2455t f1010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1012c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f1013d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1014e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2455t interfaceC2455t, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f1010a = interfaceC2455t;
            this.f1011b = obj;
            this.f1012c = i10;
            this.f1013d = obj2;
            this.f1014e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC2454s.a(this.f1010a, this.f1011b, this.f1012c, this.f1013d, interfaceC3540l, L0.a(this.f1014e | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC2455t interfaceC2455t, Object obj, int i10, Object obj2, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.T(interfaceC2455t) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.T(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3540lR.i(i10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(obj2) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((InterfaceC4176e) obj).d(obj2, b0.c.e(980966366, true, new a(interfaceC2455t, i10, obj2), interfaceC3540lR, 54), interfaceC3540lR, 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(interfaceC2455t, obj, i10, obj2, i11));
        }
    }
}
