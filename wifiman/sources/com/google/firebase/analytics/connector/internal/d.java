package com.google.firebase.analytics.connector.internal;

import D4.a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    Set f38620a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f38621b;

    /* renamed from: c, reason: collision with root package name */
    private J3.a f38622c;

    /* renamed from: d, reason: collision with root package name */
    private c f38623d;

    public d(J3.a aVar, a.b bVar) {
        this.f38621b = bVar;
        this.f38622c = aVar;
        c cVar = new c(this);
        this.f38623d = cVar;
        this.f38622c.b(cVar);
        this.f38620a = new HashSet();
    }
}
