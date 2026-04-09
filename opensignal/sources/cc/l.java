package cc;

import android.content.Intent;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3660a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3661d;

    public l(Intent intent, bc.f fVar) {
        this.f3660a = intent;
        this.f3661d = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bc.f, java.lang.Object] */
    @Override // cc.m
    public final void a() {
        Intent intent = this.f3660a;
        if (intent != null) {
            this.f3661d.g(2, intent);
        }
    }
}
