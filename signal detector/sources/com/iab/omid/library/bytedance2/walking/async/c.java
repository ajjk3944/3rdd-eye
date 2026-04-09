package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f18739a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f18740b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f18741c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f18742d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f18739a = linkedBlockingQueue;
        this.f18740b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f18741c.poll();
        this.f18742d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f18740b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f18741c.add(bVar);
        if (this.f18742d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f18742d = null;
        a();
    }
}
