package com.yandex.mobile.ads.impl;

import Y.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.l;
import b9.C1992A;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.mobile.ads.impl.oh;
import d0.s;
import d2.C4268c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import o0.b;
import v.C5658m;
import v.C5664t;
import w.C5688b;
import w.C5699m;
import w.C5704r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class A3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24057d;

    public /* synthetic */ A3(int i, Object obj, Object obj2) {
        this.f24055b = i;
        this.f24056c = obj;
        this.f24057d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f24055b) {
            case 0:
                ((oh.a) this.f24056c).d((Exception) this.f24057d);
                return;
            case 1:
                si.a((si) this.f24056c, (C4108f4) this.f24057d);
                return;
            case 2:
                s.c cVar = (s.c) this.f24057d;
                Objects.requireNonNull(cVar);
                ((H.g) this.f24056c).execute(new C.V(cVar, 22));
                return;
            case 3:
                ((InterfaceC1715t0.a) ((Map.Entry) this.f24056c).getKey()).a((c.a) this.f24057d);
                return;
            case 4:
                s.a aVar = (s.a) this.f24056c;
                c.a aVar2 = aVar.f37284b;
                c.a aVar3 = c.a.ACTIVE;
                b.a aVar4 = (b.a) this.f24057d;
                if (aVar2 == aVar3) {
                    d0.s sVar = d0.s.this;
                    A4.a<d0.w> aVarA = sVar.a();
                    I.j.g(aVarA, aVar4);
                    aVar4.a(new d0.r(0, aVar, aVarA), E.u.y());
                    aVar.f37285c.add(aVarA);
                    aVarA.addListener(new L(15, aVar, aVarA), sVar.f37265h);
                    return;
                }
                if (aVar2 == c.a.INACTIVE) {
                    aVar4.d(new IllegalStateException("BufferProvider is not active."));
                    return;
                }
                aVar4.d(new IllegalStateException("Unknown state: " + aVar.f37284b));
                return;
            case 5:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f24056c;
                A4.a<? extends l.a> aVar5 = (A4.a) this.f24057d;
                synchronized (constraintTrackingWorker.f16940c) {
                    try {
                        if (constraintTrackingWorker.f16941d) {
                            C4268c<l.a> future = constraintTrackingWorker.f16942e;
                            kotlin.jvm.internal.l.e(future, "future");
                            String str = f2.b.f37814a;
                            future.i(new l.a.b());
                        } else {
                            constraintTrackingWorker.f16942e.k(aVar5);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 6:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f24057d;
                com.google.firebase.messaging.a aVar6 = FirebaseMessaging.f23255l;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f24056c;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e4) {
                    taskCompletionSource.setException(e4);
                    return;
                }
            case 7:
                C5658m.b bVar = (C5658m.b) this.f24056c;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = bVar.f46778a;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    C5658m.c cVar2 = (C5658m.c) it.next();
                    if (cVar2.a((TotalCaptureResult) this.f24057d)) {
                        hashSet.add(cVar2);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 8:
                C5664t c5664t = (C5664t) this.f24056c;
                v.k0 k0Var = c5664t.f46894y;
                b.a aVar7 = (b.a) this.f24057d;
                if (k0Var == null) {
                    aVar7.b(Boolean.FALSE);
                    return;
                } else {
                    aVar7.b(Boolean.valueOf(c5664t.f46872b.d(C5664t.x(k0Var))));
                    return;
                }
            case 9:
                androidx.camera.core.impl.Z.a(((v.l0) this.f24056c).f46744e);
                androidx.camera.core.impl.X x10 = (androidx.camera.core.impl.X) this.f24057d;
                if (x10 != null) {
                    x10.b();
                    return;
                }
                return;
            case 10:
                ((C5688b.c) this.f24056c).f47115a.onConfigured((CameraCaptureSession) this.f24057d);
                return;
            case 11:
                ((C5699m.b) this.f24056c).f47146a.onClosed((CameraDevice) this.f24057d);
                return;
            default:
                ((C5704r.a) this.f24056c).f47154b.onCameraAvailable((String) this.f24057d);
                return;
        }
    }
}
