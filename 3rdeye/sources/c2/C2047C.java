package c2;

import a2.InterfaceC1644a;
import android.annotation.SuppressLint;
import androidx.work.impl.WorkDatabase;
import b2.InterfaceC1843x;
import e2.InterfaceC4306b;

/* compiled from: WorkForegroundUpdater.java */
/* renamed from: c2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2047C {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4306b f18390a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1644a f18391b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1843x f18392c;

    static {
        androidx.work.m.g("WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public C2047C(WorkDatabase workDatabase, InterfaceC1644a interfaceC1644a, InterfaceC4306b interfaceC4306b) {
        this.f18391b = interfaceC1644a;
        this.f18390a = interfaceC4306b;
        this.f18392c = workDatabase.y();
    }
}
