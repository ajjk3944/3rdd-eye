package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import bf.c;
import bf.g;
import bf.q;
import bf.u;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ye.a;
import ye.b;
import ye.d;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final q f5810a = new q(new g(2));

    /* renamed from: b, reason: collision with root package name */
    public static final q f5811b = new q(new g(3));

    /* renamed from: c, reason: collision with root package name */
    public static final q f5812c = new q(new g(4));

    /* renamed from: d, reason: collision with root package name */
    public static final q f5813d = new q(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u uVar = new u(a.class, ScheduledExecutorService.class);
        u[] uVarArr = {new u(a.class, ExecutorService.class), new u(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            b4.f(uVar2, "Null interface");
        }
        Collections.addAll(hashSet, uVarArr);
        c cVar = new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ab.c(20), hashSet3);
        u uVar3 = new u(b.class, ScheduledExecutorService.class);
        u[] uVarArr2 = {new u(b.class, ExecutorService.class), new u(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(uVar3);
        for (u uVar4 : uVarArr2) {
            b4.f(uVar4, "Null interface");
        }
        Collections.addAll(hashSet4, uVarArr2);
        c cVar2 = new c(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ab.c(21), hashSet6);
        u uVar5 = new u(ye.c.class, ScheduledExecutorService.class);
        u[] uVarArr3 = {new u(ye.c.class, ExecutorService.class), new u(ye.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(uVar5);
        for (u uVar6 : uVarArr3) {
            b4.f(uVar6, "Null interface");
        }
        Collections.addAll(hashSet7, uVarArr3);
        c cVar3 = new c(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new ab.c(22), hashSet9);
        bf.b bVarA = c.a(new u(d.class, Executor.class));
        bVarA.f2701f = new ab.c(23);
        return Arrays.asList(cVar, cVar2, cVar3, bVarA.b());
    }
}
