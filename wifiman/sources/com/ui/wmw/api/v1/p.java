package com.ui.wmw.api.v1;

import com.ui.comm.v4.a;
import com.ui.wmw.WMWizard;
import gg.r;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class p implements kg.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.f f45482a;

    public p(a.f fVar) {
        this.f45482a = fVar;
    }

    @Override // kg.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r apply(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (!(error instanceof TimeoutException)) {
            return gg.n.i(error);
        }
        return gg.n.i(new WMWizard.Error.Session.RequestTimeout("Request [" + this.f45482a.h() + "] didn't received any response in 60000"));
    }
}
