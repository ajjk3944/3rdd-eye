package pc;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f31681b;

    public /* synthetic */ a(MaterialButton materialButton, int i4) {
        this.f31680a = i4;
        this.f31681b = materialButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31680a) {
            case 0:
                MaterialButton.a(this.f31681b);
                break;
            default:
                this.f31681b.requestFocus();
                break;
        }
    }
}
