package gh;

import androidx.appcompat.widget.AppCompatEditText;
import com.liuzh.deviceinfo.utilities.m;
import i0.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f24725b;

    public /* synthetic */ a(f fVar, int i4) {
        this.f24724a = i4;
        this.f24725b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f24724a;
        f fVar = this.f24725b;
        switch (i4) {
            case 0:
                AppCompatEditText appCompatEditText = (AppCompatEditText) fVar.f25417c;
                appCompatEditText.requestFocus();
                m.b(appCompatEditText);
                break;
            default:
                ((AppCompatEditText) fVar.f25417c).requestFocus();
                m.b((AppCompatEditText) fVar.f25417c);
                break;
        }
    }
}
