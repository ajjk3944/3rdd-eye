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
    private final BlockingQueue<Runnable> f12314a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f12315b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f12316c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f12317d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f12314a = linkedBlockingQueue;
        this.f12315b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f12316c.poll();
        this.f12317d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f12315b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f12316c.add(bVar);
        if (this.f12317d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f12317d = null;
        a();
    }
}
