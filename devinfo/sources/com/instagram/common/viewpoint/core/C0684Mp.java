package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0684Mp extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1645kM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0684Mp(C1645kM c1645kM, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1645kM;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A05();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            WU.A00(th3, this);
        }
    }
}
