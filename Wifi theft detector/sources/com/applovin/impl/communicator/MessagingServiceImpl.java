package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f5683a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5684b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5685c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f5686d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.f5686d) {
            try {
                Queue queue = (Queue) this.f5685c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f5686d) {
                try {
                    Queue queue = (Queue) this.f5685c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.f5685c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c(final CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = a();
        this.f5683a = scheduledThreadPoolExecutorA;
        scheduledThreadPoolExecutorA.execute(new Runnable() { // from class: com.applovin.impl.communicator.b
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinBroadcastManager.sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f5684b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f5683a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.a
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return MessagingServiceImpl.a(runnable);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
