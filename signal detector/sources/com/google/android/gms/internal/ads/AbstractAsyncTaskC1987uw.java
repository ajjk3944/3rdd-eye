package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.gms.internal.ads.uw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC1987uw extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C2041vw f17191a;

    /* renamed from: b, reason: collision with root package name */
    public final C1879sw f17192b;

    public AbstractAsyncTaskC1987uw(C1879sw c1879sw) {
        this.f17192b = c1879sw;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C2041vw c2041vw = this.f17191a;
        if (c2041vw != null) {
            c2041vw.f17371d = null;
            AbstractAsyncTaskC1987uw abstractAsyncTaskC1987uw = (AbstractAsyncTaskC1987uw) ((ArrayDeque) c2041vw.f17370c).poll();
            c2041vw.f17371d = abstractAsyncTaskC1987uw;
            if (abstractAsyncTaskC1987uw != null) {
                abstractAsyncTaskC1987uw.executeOnExecutor((ThreadPoolExecutor) c2041vw.f17369b, new Object[0]);
            }
        }
    }
}
