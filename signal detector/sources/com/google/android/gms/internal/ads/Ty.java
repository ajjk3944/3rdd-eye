package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class Ty {

    /* renamed from: a, reason: collision with root package name */
    public long f11515a;

    /* renamed from: b, reason: collision with root package name */
    public long f11516b;

    /* renamed from: c, reason: collision with root package name */
    public long f11517c;

    /* renamed from: d, reason: collision with root package name */
    public long f11518d;

    /* renamed from: e, reason: collision with root package name */
    public double f11519e;

    /* renamed from: f, reason: collision with root package name */
    public double f11520f;

    /* renamed from: g, reason: collision with root package name */
    public double f11521g;

    /* renamed from: h, reason: collision with root package name */
    public float f11522h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f11523j;

    /* renamed from: k, reason: collision with root package name */
    public float f11524k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11515a++;
            this.f11521g = 0.0d;
            this.f11519e = motionEvent.getRawX();
            this.f11520f = motionEvent.getRawY();
            this.f11522h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f11523j = motionEvent.getRawX();
            this.f11524k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f11517c++;
            this.f11521g = Math.hypot(motionEvent.getRawX() - this.f11519e, motionEvent.getRawY() - this.f11520f) + this.f11521g;
            this.f11519e = motionEvent.getRawX();
            this.f11520f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f11518d++;
            return;
        }
        this.f11516b += motionEvent.getHistorySize() + 1;
        this.f11521g = Math.hypot(motionEvent.getRawX() - this.f11519e, motionEvent.getRawY() - this.f11520f) + this.f11521g;
        this.f11519e = motionEvent.getRawX();
        this.f11520f = motionEvent.getRawY();
    }
}
