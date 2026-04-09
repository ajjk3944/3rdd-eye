package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5924a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, Looper looper, Object obj) {
        super(looper);
        this.f5924a = i10;
        this.f5925b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0373, code lost:
    
        throw new java.lang.IllegalStateException(com.squareup.picasso.s.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.l.handleMessage(android.os.Message):void");
    }
}
