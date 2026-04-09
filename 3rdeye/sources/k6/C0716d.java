package K6;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: BaseDivViewExtensions.kt */
/* renamed from: K6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716d extends kotlin.jvm.internal.m implements p9.p<View, MotionEvent, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I6.q f3426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f3427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0716d(I6.q qVar, GestureDetector gestureDetector) {
        super(2);
        this.f3426g = qVar;
        this.f3427h = gestureDetector;
    }

    @Override // p9.p
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        View v10 = view;
        MotionEvent event = motionEvent;
        kotlin.jvm.internal.l.f(v10, "v");
        kotlin.jvm.internal.l.f(event, "event");
        I6.q qVar = this.f3426g;
        if (qVar != null) {
            qVar.invoke(v10, event);
        }
        GestureDetector gestureDetector = this.f3427h;
        return Boolean.valueOf(gestureDetector != null ? gestureDetector.onTouchEvent(event) : false);
    }
}
