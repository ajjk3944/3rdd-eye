package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4926rh implements InterfaceC4952sh {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f41580a;

    public AbstractC4926rh(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f41580a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4952sh
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
