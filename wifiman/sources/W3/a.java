package W3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f23603a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23604b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23605c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23606d;

    public a(Dialog dialog, Rect rect) {
        this.f23603a = dialog;
        this.f23604b = rect.left;
        this.f23605c = rect.top;
        this.f23606d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f23604b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f23605c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f23606d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f23603a.onTouchEvent(motionEventObtain);
    }
}
