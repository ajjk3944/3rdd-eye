package com.ui.wmw.api.v1;

import Y6.w;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.ui.comm.v4.a;
import com.ui.wmw.WMWizard;
import gg.r;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import kotlin.text.C6510d;

/* loaded from: classes4.dex */
public final class n implements kg.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f45480a;

    public n(f fVar) {
        this.f45480a = fVar;
    }

    @Override // kg.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r apply(a.g it) {
        AbstractC6492s.i(it, "it");
        if (it.a().a().length == 0) {
            return gg.n.h();
        }
        f fVar = this.f45480a;
        byte[] bArrA = it.a().a();
        try {
            Y6.r rVar = fVar.f45434c;
            AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
            Object objC = w.a(rVar, O.l(Object.class)).e().c(new String(bArrA, C6510d.f52215b));
            if (objC != null) {
                return gg.n.o(objC);
            }
            throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
        } catch (JsonDataException e10) {
            throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
        } catch (JsonEncodingException e11) {
            throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
        }
    }
}
