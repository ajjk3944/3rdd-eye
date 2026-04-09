package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21014a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21015b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f21016c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f21017d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21014a = linkedBlockingQueue;
        this.f21015b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f21016c.poll();
        this.f21017d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f21015b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f21016c.add(bVar);
        if (this.f21017d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f21017d = null;
        a();
    }
}
