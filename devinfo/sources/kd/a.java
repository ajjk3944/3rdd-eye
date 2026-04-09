package kd;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f28142b;

    public /* synthetic */ a(p pVar, int i4) {
        this.f28141a = i4;
        this.f28142b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f28141a) {
            case 0:
                d dVar = (d) this.f28142b;
                dVar.s(dVar.t());
                break;
            default:
                l lVar = (l) this.f28142b;
                lVar.f28166l = z3;
                lVar.p();
                if (!z3) {
                    lVar.s(false);
                    lVar.f28167m = false;
                    break;
                }
                break;
        }
    }
}
