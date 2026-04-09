package com.yandex.mobile.ads.impl;

import c9.C2092m;
import d9.C4284b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4155m2 {

    /* renamed from: a, reason: collision with root package name */
    private final dm0 f30159a;

    /* renamed from: b, reason: collision with root package name */
    private final xi1 f30160b;

    /* renamed from: c, reason: collision with root package name */
    private C4148l2 f30161c;

    public /* synthetic */ C4155m2(dm0 dm0Var) {
        this(dm0Var, new xi1());
    }

    public final C4148l2 a() {
        C4148l2 c4148l2 = this.f30161c;
        if (c4148l2 != null) {
            return c4148l2;
        }
        bm0 playlist = this.f30159a.a();
        this.f30160b.getClass();
        kotlin.jvm.internal.l.f(playlist, "playlist");
        C4284b c4284bU = E.u.u();
        zs zsVarC = playlist.c();
        if (zsVarC != null) {
            c4284bU.add(zsVarC);
        }
        List<yi1> listA = playlist.a();
        ArrayList arrayList = new ArrayList(C2092m.T(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((yi1) it.next()).a());
        }
        c4284bU.addAll(arrayList);
        zs zsVarB = playlist.b();
        if (zsVarB != null) {
            c4284bU.add(zsVarB);
        }
        C4148l2 c4148l22 = new C4148l2(E.u.m(c4284bU));
        this.f30161c = c4148l22;
        return c4148l22;
    }

    public C4155m2(dm0 instreamAdPlaylistHolder, xi1 playlistAdBreaksProvider) {
        kotlin.jvm.internal.l.f(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        kotlin.jvm.internal.l.f(playlistAdBreaksProvider, "playlistAdBreaksProvider");
        this.f30159a = instreamAdPlaylistHolder;
        this.f30160b = playlistAdBreaksProvider;
    }
}
