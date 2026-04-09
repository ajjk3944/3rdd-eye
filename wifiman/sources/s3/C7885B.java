package s3;

import android.app.Activity;
import android.content.Intent;

/* renamed from: s3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7885B extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f61174a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f61175b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f61176c;

    C7885B(Intent intent, Activity activity, int i10) {
        this.f61174a = intent;
        this.f61175b = activity;
        this.f61176c = i10;
    }

    @Override // s3.D
    public final void a() {
        Intent intent = this.f61174a;
        if (intent != null) {
            this.f61175b.startActivityForResult(intent, this.f61176c);
        }
    }
}
