package R3;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class i extends h {
    @Override // R3.h, S3.i
    public final void D2(Bundle bundle) {
        super.D2(bundle);
        int i = bundle.getInt("error.code", -2);
        c3.f fVar = this.f3416c;
        if (i != 0) {
            fVar.a(new K2.j(bundle.getInt("error.code", -2)));
        } else {
            fVar.b(null);
        }
    }
}
