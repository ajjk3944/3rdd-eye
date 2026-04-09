package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f15332a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f15333b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f15334c;

    public class a implements a.InterfaceC0267a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f15335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0267a f15336b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0267a interfaceC0267a) {
            this.f15335a = aVar;
            this.f15336b = interfaceC0267a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0267a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                b.this.f15333b.remove(Long.valueOf(this.f15335a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.f15334c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0267a interfaceC0267a = this.f15336b;
            if (interfaceC0267a != null) {
                interfaceC0267a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f15332a = c.b();
        } else {
            if (i10 == 0) {
                this.f15332a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f15332a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f15332a.allowCoreThreadTimeOut(true);
        }
        this.f15333b = new HashMap<>();
        this.f15334c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f15332a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0267a interfaceC0267a) {
        a(aVar, interfaceC0267a);
        this.f15332a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0267a interfaceC0267a) {
        this.f15333b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0267a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f15333b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f15333b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f15332a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f15332a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f15332a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f15332a.allowCoreThreadTimeOut(true);
        }
        this.f15333b = new HashMap<>();
        this.f15334c = new WeakReference<>(context);
    }
}
