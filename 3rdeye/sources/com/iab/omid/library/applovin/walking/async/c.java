package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f23637a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f23638b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f23639c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f23640d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f23637a = linkedBlockingQueue;
        this.f23638b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f23639c.poll();
        this.f23640d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f23638b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f23639c.add(bVar);
        if (this.f23640d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f23640d = null;
        a();
    }
}
