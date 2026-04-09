package H;

import H.l;
import L0.T;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import c0.AbstractC4174c;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class m {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7565a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f7566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j10) {
            super(0);
            this.f7565a = str;
            this.f7566b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return new l(this.f7565a, this.f7566b, (DefaultConstructorMarker) null);
        }
    }

    public static final void a(l lVar) {
        f fVarR = lVar.r();
        try {
            g.a(fVarR, 0, fVarR.d());
            g.b(fVarR);
            lVar.d(fVarR);
        } finally {
            lVar.f();
        }
    }

    public static final l b(String str, long j10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            j10 = T.a(str.length());
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1125389485, i10, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:620)");
        }
        Object[] objArr = new Object[0];
        l.b bVar = l.b.f7563a;
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(str)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.j(j10)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(str, j10);
            interfaceC3540l.K(objF);
        }
        l lVar = (l) AbstractC4174c.e(objArr, bVar, null, (InterfaceC6824a) objF, interfaceC3540l, 48, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return lVar;
    }
}
