package xa;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ya.g f37041a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37042b;

    public h(Context context, String str, String str2, String str3) {
        super(context);
        ya.g gVar = new ya.g(context);
        gVar.f37452c = str;
        this.f37041a = gVar;
        gVar.f37454e = str2;
        gVar.f37453d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f37042b) {
            return false;
        }
        this.f37041a.a(motionEvent);
        return false;
    }
}
