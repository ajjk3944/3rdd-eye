package com.google.firebase.concurrent;

import A9.I;
import B4.f;
import B4.g;
import B4.i;
import F3.h;
import H4.b;
import H4.c;
import H4.d;
import I4.a;
import I4.n;
import I4.q;
import I4.s;
import J4.k;
import J4.l;
import J4.m;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n<ScheduledExecutorService> f23245a = new n<>(new q(1));

    /* renamed from: b, reason: collision with root package name */
    public static final n<ScheduledExecutorService> f23246b = new n<>(new k());

    /* renamed from: c, reason: collision with root package name */
    public static final n<ScheduledExecutorService> f23247c = new n<>(new l(0));

    /* renamed from: d, reason: collision with root package name */
    public static final n<ScheduledExecutorService> f23248d = new n<>(new m(0));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        int i = 5;
        s sVar = new s(H4.a.class, ScheduledExecutorService.class);
        s[] sVarArr = {new s(H4.a.class, ExecutorService.class), new s(H4.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            I.l(sVar2, "Null interface");
        }
        Collections.addAll(hashSet, sVarArr);
        a aVar = new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i(4), hashSet3);
        s sVar3 = new s(b.class, ScheduledExecutorService.class);
        s[] sVarArr2 = {new s(b.class, ExecutorService.class), new s(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(sVar3);
        for (s sVar4 : sVarArr2) {
            I.l(sVar4, "Null interface");
        }
        Collections.addAll(hashSet4, sVarArr2);
        a aVar2 = new a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new h(4), hashSet6);
        s sVar5 = new s(c.class, ScheduledExecutorService.class);
        s[] sVarArr3 = {new s(c.class, ExecutorService.class), new s(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(sVar5);
        for (s sVar6 : sVarArr3) {
            I.l(sVar6, "Null interface");
        }
        Collections.addAll(hashSet7, sVarArr3);
        a aVar3 = new a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new f(5), hashSet9);
        a.C0043a c0043aA = a.a(new s(d.class, Executor.class));
        c0043aA.f2445f = new g(i);
        return Arrays.asList(aVar, aVar2, aVar3, c0043aA.b());
    }
}
