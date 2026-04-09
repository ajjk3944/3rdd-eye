package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import r.AbstractServiceConnectionC2868k;
import r.C2867j;

/* loaded from: classes.dex */
public final class P9 extends AbstractServiceConnectionC2868k {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10326b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Context f10327c;

    /* renamed from: d, reason: collision with root package name */
    public C0784Vn f10328d;

    /* renamed from: e, reason: collision with root package name */
    public c1.g f10329e;

    /* renamed from: f, reason: collision with root package name */
    public C2867j f10330f;

    @Override // r.AbstractServiceConnectionC2868k
    public final void a(C2867j c2867j) {
        this.f10330f = c2867j;
        try {
            ((b.b) c2867j.f23316a).d1();
        } catch (RemoteException unused) {
        }
        this.f10329e = c2867j.b(new O9(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10330f = null;
        this.f10329e = null;
    }
}
