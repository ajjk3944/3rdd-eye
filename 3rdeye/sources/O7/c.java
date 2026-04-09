package o7;

import L0.I;
import L0.S;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* compiled from: NestedHorizontalScrollCompanion.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f44873a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44874b;

    /* renamed from: c, reason: collision with root package name */
    public final float f44875c;

    /* renamed from: d, reason: collision with root package name */
    public float f44876d;

    /* renamed from: e, reason: collision with root package name */
    public float f44877e;

    public c(ViewGroup viewGroup, float f10) {
        this.f44873a = viewGroup;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.d.t(viewGroup, true);
        this.f44875c = f10;
    }

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f44876d = motionEvent.getX();
            this.f44877e = motionEvent.getY();
            return;
        }
        ViewGroup viewGroup = this.f44873a;
        if (action != 1) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.f44876d);
                float fAbs2 = Math.abs(motionEvent.getY() - this.f44877e);
                if (this.f44874b || fAbs < this.f44875c || fAbs <= fAbs2) {
                    return;
                }
                this.f44874b = true;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.d.y(viewGroup, 1);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f44874b = false;
        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
        I.d.z(viewGroup);
    }
}
