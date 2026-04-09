package H0;

import B0.g;
import C0.h;
import K6.C0768z;
import android.graphics.Typeface;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1970b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1972d;

    public a(Q1.f fVar, M6.h hVar, C0768z c0768z) {
        this.f1971c = hVar;
        this.f1972d = c0768z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1970b) {
            case 0:
                g.e eVar = ((h.a) this.f1971c).f810d;
                if (eVar != null) {
                    eVar.lambda$callbackSuccessAsync$0((Typeface) this.f1972d);
                    break;
                }
                break;
            default:
                M6.h hVar = (M6.h) this.f1971c;
                Q1.f fVar = hVar.f4242c;
                int width = fVar.getOrientation() == 0 ? fVar.getWidth() : fVar.getHeight();
                ((C0768z) this.f1972d).invoke(Integer.valueOf(width));
                hVar.f4241b = width;
                break;
        }
    }

    public a(h.a aVar, Typeface typeface) {
        this.f1971c = aVar;
        this.f1972d = typeface;
    }
}
