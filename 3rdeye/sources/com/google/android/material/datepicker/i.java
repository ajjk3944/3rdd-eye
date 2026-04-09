package com.google.android.material.datepicker;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f22809c;

    public i(j jVar, int i) {
        this.f22809c = jVar;
        this.f22808b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22809c.f22817k.smoothScrollToPosition(this.f22808b);
    }
}
