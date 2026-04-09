package s3;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC4279h;

/* loaded from: classes.dex */
final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f61177a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4279h f61178b;

    C(Intent intent, InterfaceC4279h interfaceC4279h, int i10) {
        this.f61177a = intent;
        this.f61178b = interfaceC4279h;
    }

    @Override // s3.D
    public final void a() {
        Intent intent = this.f61177a;
        if (intent != null) {
            this.f61178b.startActivityForResult(intent, 2);
        }
    }
}
