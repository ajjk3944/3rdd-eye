package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class EventBus {

    /* renamed from: o, reason: collision with root package name */
    private static volatile EventBus f14480o;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14492k;

    /* renamed from: n, reason: collision with root package name */
    static ExecutorService f14479n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: p, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f14481p = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f14482a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f14483b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f14484c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f14485d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f14486e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private String f14487f = "onEvent";

    /* renamed from: g, reason: collision with root package name */
    private final HandlerPoster f14488g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: h, reason: collision with root package name */
    private final BackgroundPoster f14489h = new BackgroundPoster(this);

    /* renamed from: i, reason: collision with root package name */
    private final AsyncPoster f14490i = new AsyncPoster(this);

    /* renamed from: j, reason: collision with root package name */
    private final SubscriberMethodFinder f14491j = new SubscriberMethodFinder();

    /* renamed from: l, reason: collision with root package name */
    private boolean f14493l = true;

    /* renamed from: m, reason: collision with root package name */
    private Map<String, Object> f14494m = new ConcurrentHashMap();

    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14497a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f14497a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14497a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14497a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14497a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class BooleanWrapper {

        /* renamed from: a, reason: collision with root package name */
        boolean f14498a;
    }

    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Iterator<SubscriberMethod> it = this.f14491j.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f14481p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f14480o == null) {
            synchronized (EventBus.class) {
                try {
                    if (f14480o == null) {
                        f14480o = new EventBus();
                    }
                } finally {
                }
            }
        }
        return f14480o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z10) {
        if (this.f14492k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.f14493l = z10;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f14484c) {
            obj = this.f14484c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f14485d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f14486e.get();
        if (booleanWrapper.f14498a) {
            return;
        }
        boolean z10 = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f14498a = true;
        while (!list.isEmpty()) {
            try {
                a(list.remove(0), z10);
            } finally {
                booleanWrapper.f14498a = false;
            }
        }
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f14484c) {
            this.f14484c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, this.f14487f, false);
    }

    public void registerSticky(Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, this.f14487f, true);
    }

    public void release() {
        if (f14480o != null) {
            f14480o = null;
            f14479n = null;
            Map<Class<?>, List<Class<?>>> map = f14481p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f14482a;
            if (map2 != null && map2.size() > 0) {
                this.f14482a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f14483b;
            if (map3 != null && map3.size() > 0) {
                this.f14483b.clear();
            }
            Map<Class<?>, Object> map4 = this.f14484c;
            if (map4 != null && map4.size() > 0) {
                this.f14484c.clear();
            }
            Map<String, Object> map5 = this.f14494m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f14494m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f14484c) {
            objRemove = this.f14484c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length == 0) {
                throw new IllegalArgumentException("Provide at least one event class");
            }
            List<Class<?>> list = this.f14483b.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f14483b.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void register(String str, Object obj) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Map<String, Object> map = this.f14494m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f14494m.get(str));
        }
        this.f14494m.put(str, obj);
        a(obj, this.f14487f, false);
    }

    public void registerSticky(Object obj, String str) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f14487f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f14484c) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f14484c.get(cls))) {
                    return false;
                }
                this.f14484c.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.f14491j.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f14511c) {
                    a(obj, subscriberMethod, z10);
                } else if (clsArr != null) {
                    int length = clsArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        if (clsArr[i10] == subscriberMethod.f14511c) {
                            a(obj, subscriberMethod, z10);
                            break;
                        }
                        i10++;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void register(Object obj, String str) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f14487f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f14483b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f14483b.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) throws IllegalAccessException, Error, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj2;
        this.f14492k = true;
        Class<?> cls = subscriberMethod.f14511c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f14482a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f14482a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f14509a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f14483b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f14483b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z10) {
            synchronized (this.f14484c) {
                obj2 = this.f14484c.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f14494m;
            if (map != null && map.containsKey(str)) {
                Object objRemove = this.f14494m.remove(str);
                List<Class<?>> list = this.f14483b.get(objRemove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(objRemove, it.next());
                    }
                    this.f14483b.remove(objRemove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f14482a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).f14515a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Object obj, boolean z10) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listA = a(cls);
                int size = listA.size();
                boolean z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    Class<?> cls2 = listA.get(i10);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f14482a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            a(it.next(), obj, z10);
                        }
                        z11 = true;
                    }
                }
                if (z11) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        int i10 = AnonymousClass3.f14497a[subscription.f14516b.f14510b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f14488g.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f14489h.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f14490i.enqueue(subscription, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + subscription.f14516b.f14510b);
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f14481p;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f14481p.put(cls, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public void a(PendingPost pendingPost) {
        Object obj = pendingPost.f14504a;
        Subscription subscription = pendingPost.f14505b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    public void a(Subscription subscription, Object obj) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        try {
            subscription.f14516b.f14509a.invoke(subscription.f14515a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f14515a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f14493l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f14515a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f14515a));
        }
    }
}
