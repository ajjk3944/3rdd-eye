package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import ce.c;
import ce.d;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.internal.b;
import de.e;
import de.m;
import de.q;
import ee.a;
import ee.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f20709a = new m(new e(2));

    /* renamed from: b, reason: collision with root package name */
    public static final m f20710b = new m(new e(3));

    /* renamed from: c, reason: collision with root package name */
    public static final m f20711c = new m(new e(4));

    /* renamed from: d, reason: collision with root package name */
    public static final m f20712d = new m(new e(5));

    public static g a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i4 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i4 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new g(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) f20712d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(ce.a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(ce.a.class, ExecutorService.class), new q(ce.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            wb.e.f(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        de.a aVar = new de.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(15), hashSet3);
        q qVar3 = new q(ce.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(ce.b.class, ExecutorService.class), new q(ce.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            wb.e.f(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        de.a aVar2 = new de.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b(16), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            wb.e.f(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        de.a aVar3 = new de.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b(17), hashSet9);
        sh0 sh0VarA = de.a.a(new q(d.class, Executor.class));
        sh0VarA.f16017f = new b(18);
        return Arrays.asList(aVar, aVar2, aVar3, sh0VarA.c());
    }
}
