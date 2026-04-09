package com.ui.wmw.api.v1;

import com.ui.comm.v4.a;
import com.ui.wmw.WMWizard;
import e9.InterfaceC5429a;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class o implements kg.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.f f45481a;

    public o(a.f fVar) {
        this.f45481a = fVar;
    }

    @Override // kg.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a.g apply(C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        InterfaceC5429a interfaceC5429a = (InterfaceC5429a) c6556a.a();
        if (interfaceC5429a == null || !(interfaceC5429a instanceof a.g)) {
            throw new WMWizard.Error.Session.InvalidResponse.Type("Http response was expected for request " + this.f45481a + ", but " + interfaceC5429a + " received", null, 2, null);
        }
        a.g gVar = (a.g) interfaceC5429a;
        if (gVar.g() == 200) {
            return gVar;
        }
        throw new WMWizard.Error.Session.RequestFailed("HTTP request " + this.f45481a + " failed with status code " + gVar.g(), null, 2, null);
    }
}
