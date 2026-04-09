package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    private final h f13394a;

    public c(h hVar) {
        super(hVar, null);
        this.f13394a = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f13394a;
        com.mbridge.msdk.config.component.load.downloader.c cVar2 = hVar.f13450a;
        h hVar2 = cVar.f13394a;
        com.mbridge.msdk.config.component.load.downloader.c cVar3 = hVar2.f13450a;
        return cVar2 == cVar3 ? hVar.f13451b - hVar2.f13451b : cVar3.ordinal() - cVar2.ordinal();
    }
}
