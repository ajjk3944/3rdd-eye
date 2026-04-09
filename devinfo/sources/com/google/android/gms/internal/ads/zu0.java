package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class zu0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public av0 f19182a;

    /* renamed from: b, reason: collision with root package name */
    public final l90 f19183b;

    public zu0(l90 l90Var) {
        this.f19183b = l90Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        av0 av0Var = this.f19182a;
        if (av0Var != null) {
            av0Var.f9424d = null;
            zu0 zu0Var = (zu0) ((ArrayDeque) av0Var.f9423c).poll();
            av0Var.f9424d = zu0Var;
            if (zu0Var != null) {
                zu0Var.executeOnExecutor((ThreadPoolExecutor) av0Var.f9422b, new Object[0]);
            }
        }
    }
}
