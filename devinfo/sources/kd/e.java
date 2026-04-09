package kd;

import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i4) {
        super(oVar);
        this.f28156e = i4;
    }

    @Override // kd.p
    public void q() {
        switch (this.f28156e) {
            case 0:
                o oVar = this.f28196b;
                oVar.f28187o = null;
                CheckableImageButton checkableImageButton = oVar.g;
                checkableImageButton.setOnLongClickListener(null);
                z3.t(checkableImageButton, null);
                break;
        }
    }
}
