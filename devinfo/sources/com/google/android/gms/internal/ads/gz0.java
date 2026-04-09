package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gz0 {

    /* renamed from: a, reason: collision with root package name */
    public long f11660a;

    /* renamed from: b, reason: collision with root package name */
    public long f11661b;

    /* renamed from: c, reason: collision with root package name */
    public long f11662c;

    /* renamed from: d, reason: collision with root package name */
    public long f11663d;

    /* renamed from: e, reason: collision with root package name */
    public double f11664e;

    /* renamed from: f, reason: collision with root package name */
    public double f11665f;
    public double g;

    /* renamed from: h, reason: collision with root package name */
    public float f11666h;

    /* renamed from: i, reason: collision with root package name */
    public float f11667i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f11668k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11660a++;
            this.g = 0.0d;
            this.f11664e = motionEvent.getRawX();
            this.f11665f = motionEvent.getRawY();
            this.f11666h = motionEvent.getX();
            this.f11667i = motionEvent.getY();
            this.j = motionEvent.getRawX();
            this.f11668k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f11662c++;
            this.g = Math.hypot(motionEvent.getRawX() - this.f11664e, motionEvent.getRawY() - this.f11665f) + this.g;
            this.f11664e = motionEvent.getRawX();
            this.f11665f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f11663d++;
            return;
        }
        this.f11661b += motionEvent.getHistorySize() + 1;
        this.g = Math.hypot(motionEvent.getRawX() - this.f11664e, motionEvent.getRawY() - this.f11665f) + this.g;
        this.f11664e = motionEvent.getRawX();
        this.f11665f = motionEvent.getRawY();
    }
}
