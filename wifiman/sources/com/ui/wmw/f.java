package com.ui.wmw;

import com.ui.btle.v2.BTLEv2$Error;
import com.ui.wmw.WMWizard;
import gg.AbstractC5912b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45486a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return AbstractC5912b.D(f.d(error));
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45487a;

        b(boolean z10) {
            this.f45487a = z10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            Throwable thD = f.d(error);
            return (this.f45487a && (thD instanceof WMWizard.Error.Connection.Btle)) ? gg.i.j0() : gg.i.k0(thD);
        }
    }

    public static final AbstractC5912b b(AbstractC5912b abstractC5912b) {
        AbstractC6492s.i(abstractC5912b, "<this>");
        AbstractC5912b abstractC5912bO = abstractC5912b.O(a.f45486a);
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    public static final gg.i c(gg.i iVar, boolean z10) {
        AbstractC6492s.i(iVar, "<this>");
        gg.i iVarF1 = iVar.f1(new b(z10));
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        return iVarF1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable d(Throwable th2) {
        Throwable protocol;
        if (th2 instanceof BTLEv2$Error.Connection) {
            protocol = new WMWizard.Error.Connection.Btle("BTLE Connection failed", th2);
        } else {
            if (!(th2 instanceof BTLEv2$Error.Protocol)) {
                return th2;
            }
            protocol = new WMWizard.Error.Connection.Protocol("BTLE Protocol error", th2);
        }
        return protocol;
    }

    public static /* synthetic */ gg.i e(gg.i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(iVar, z10);
    }
}
