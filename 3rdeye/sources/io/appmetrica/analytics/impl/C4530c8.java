package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4530c8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40614a;

    /* renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f40615b;

    /* renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f40616c;

    /* renamed from: d, reason: collision with root package name */
    public C4478a8 f40617d;

    public C4530c8(boolean z10) {
        this.f40614a = z10;
    }

    public final void a(int i) {
        C4478a8 c4478a8 = this.f40617d;
        String str = c4478a8 == null ? null : c4478a8.f40511c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f40615b;
        if (deferredDeeplinkListener != null) {
            if (i == 0) {
                throw null;
            }
            int i10 = i - 1;
            deferredDeeplinkListener.onError(i10 != 0 ? i10 != 1 ? i10 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f40615b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f40616c;
        if (deferredDeeplinkParametersListener != null) {
            if (i == 0) {
                throw null;
            }
            int i11 = i - 1;
            deferredDeeplinkParametersListener.onError(i11 != 0 ? i11 != 1 ? i11 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f40616c = null;
        }
    }

    public final void a() {
        C4478a8 c4478a8 = this.f40617d;
        if (c4478a8 != null) {
            String str = c4478a8.f40510b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f40615b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f40615b = null;
                }
                if (!AbstractC4623fo.a(this.f40617d.f40509a)) {
                    Map<String, String> map = this.f40617d.f40509a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f40616c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f40616c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f40617d.f40511c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f40616c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f40616c = null;
                    return;
                }
                return;
            }
            if (c4478a8.f40511c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
