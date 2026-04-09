package s2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import t2.C2925i;

/* loaded from: classes.dex */
public final class h extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C2925i f23483a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23484b;

    public h(Context context, String str, String str2, String str3) {
        super(context);
        C2925i c2925i = new C2925i(context);
        c2925i.f23616c = str;
        this.f23483a = c2925i;
        c2925i.f23618e = str2;
        c2925i.f23617d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23484b) {
            return false;
        }
        this.f23483a.a(motionEvent);
        return false;
    }
}
