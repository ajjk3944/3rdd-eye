package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C5135a;
import p9.InterfaceC5480a;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5135a extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5138d f42537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5135a(C5138d c5138d) {
        super(0);
        this.f42537a = c5138d;
    }

    public static final void a(C5138d c5138d) {
        ((C5155v) c5138d.f42544b).a("AndroidApiScreenshotCaptor");
    }

    @Override // p9.InterfaceC5480a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C5138d c5138d = this.f42537a;
        return new Activity.ScreenCaptureCallback() { // from class: O8.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5135a.a(c5138d);
            }
        };
    }
}
