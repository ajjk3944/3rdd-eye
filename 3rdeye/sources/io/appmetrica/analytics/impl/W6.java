package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class W6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final U6 f40317a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f40318b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f40319c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f40320d = new HashSet();

    public W6(U6 u62) {
        this.f40317a = u62;
        this.f40318b = ((V6) u62).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (AbstractC4623fo.a(bool) || this.f40318b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f40318b = Boolean.valueOf(zEquals);
                ((V6) this.f40317a).f40280a.c(zEquals).b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.f40318b;
        return bool == null ? !this.f40319c.isEmpty() || this.f40320d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        try {
            bool = this.f40318b;
        } finally {
        }
        return bool == null ? this.f40320d.isEmpty() && this.f40319c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f40318b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f40320d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (AbstractC4623fo.a(bool) || (!this.f40320d.contains(str) && !this.f40319c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f40320d.add(str);
                    this.f40319c.remove(str);
                } else {
                    this.f40319c.add(str);
                    this.f40320d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
