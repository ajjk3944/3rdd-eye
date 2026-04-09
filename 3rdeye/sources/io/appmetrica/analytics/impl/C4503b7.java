package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

@DoNotInline
/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4503b7 implements InterfaceC4477a7 {

    /* renamed from: a, reason: collision with root package name */
    private final Ug f40580a;

    public C4503b7(Ug ug) {
        this.f40580a = ug;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4477a7
    public File a(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), this.f40580a.a(str));
    }
}
