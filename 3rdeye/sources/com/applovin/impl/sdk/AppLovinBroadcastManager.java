package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f20972a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f20973b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayList f20974c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f20975d = new a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f20976a;

        /* renamed from: b, reason: collision with root package name */
        final Map f20977b;

        /* renamed from: c, reason: collision with root package name */
        final List f20978c;

        public b(Intent intent, Map map, List list) {
            this.f20976a = intent;
            this.f20977b = map;
            this.f20978c = list;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f20979a;

        /* renamed from: b, reason: collision with root package name */
        final Receiver f20980b;

        /* renamed from: c, reason: collision with root package name */
        boolean f20981c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20982d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.f20979a = intentFilter;
            this.f20980b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f20972a) {
                try {
                    ArrayList arrayList = f20974c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                if (bVar != null) {
                    for (c cVar : bVar.f20978c) {
                        if (cVar != null && !cVar.f20982d) {
                            cVar.f20980b.onReceive(bVar.f20976a, bVar.f20977b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f20972a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    Map map2 = f20973b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f20972a) {
            try {
                List listA = a(intent);
                if (listA == null) {
                    return false;
                }
                f20974c.add(new b(intent, map, listA));
                Handler handler = f20975d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f20982d) {
                cVar.f20980b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f20972a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.f20982d = true;
                    Iterator<String> itActionsIterator = cVar.f20979a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f20973b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).f20980b == receiver) {
                                    cVar.f20982d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f20973b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f20972a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) f20973b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (c cVar : list) {
                    if (!cVar.f20981c && cVar.f20979a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.f20981c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f20981c = false;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
