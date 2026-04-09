package cc;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3657a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f3658d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3659g;

    public k(Intent intent, Activity activity, int i10) {
        this.f3657a = intent;
        this.f3658d = activity;
        this.f3659g = i10;
    }

    @Override // cc.m
    public final void a() {
        Intent intent = this.f3657a;
        if (intent != null) {
            this.f3658d.startActivityForResult(intent, this.f3659g);
        }
    }
}
