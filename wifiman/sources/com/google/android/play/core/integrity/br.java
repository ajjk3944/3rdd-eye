package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a, reason: collision with root package name */
    private final String f38074a;

    /* renamed from: b, reason: collision with root package name */
    private final y f38075b;

    br(String str, y yVar) {
        this.f38074a = str;
        this.f38075b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f38075b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f38074a;
    }
}
