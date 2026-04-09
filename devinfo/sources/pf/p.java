package pf;

import android.content.Context;
import com.google.android.gms.internal.play_billing.m1;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31880b;

    public /* synthetic */ p(Context context, int i4) {
        this.f31879a = i4;
        this.f31880b = context;
    }

    @Override // mk.a
    public final Object invoke() throws IOException {
        switch (this.f31879a) {
            case 0:
                File fileI = m1.i(this.f31880b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(fileI);
                return fileI;
            default:
                File fileI2 = m1.i(this.f31880b, "firebaseSessions/sessionDataStore.data");
                q.b(fileI2);
                return fileI2;
        }
    }
}
