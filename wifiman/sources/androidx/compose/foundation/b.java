package androidx.compose.foundation;

import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6713l0;
import m0.c1;
import m0.i1;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f27773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f27774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1 f27775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var) {
            super(1);
            this.f27773a = f10;
            this.f27774b = abstractC6713l0;
            this.f27775c = i1Var;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    /* renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    public static final class C1036b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f27776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f27777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1036b(long j10, i1 i1Var) {
            super(1);
            this.f27776a = j10;
            this.f27777b = i1Var;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC6713l0 abstractC6713l0, i1 i1Var, float f10) {
        return eVar.b0(new BackgroundElement(0L, abstractC6713l0, f10, i1Var, AbstractC3964z0.b() ? new a(f10, abstractC6713l0, i1Var) : AbstractC3964z0.a(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, AbstractC6713l0 abstractC6713l0, i1 i1Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i1Var = c1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(eVar, abstractC6713l0, i1Var, f10);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, long j10, i1 i1Var) {
        return eVar.b0(new BackgroundElement(j10, null, 1.0f, i1Var, AbstractC3964z0.b() ? new C1036b(j10, i1Var) : AbstractC3964z0.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, long j10, i1 i1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i1Var = c1.a();
        }
        return c(eVar, j10, i1Var);
    }
}
