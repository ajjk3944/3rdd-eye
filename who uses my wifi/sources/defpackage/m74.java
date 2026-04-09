package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m74 extends RelativeLayout {
    public final mq1 f;
    public boolean g;

    public m74(Context context, String str, String str2, String str3) {
        super(context);
        mq1 mq1Var = new mq1(context);
        mq1Var.c = str;
        this.f = mq1Var;
        mq1Var.e = str2;
        mq1Var.d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            return false;
        }
        this.f.a(motionEvent);
        return false;
    }
}
