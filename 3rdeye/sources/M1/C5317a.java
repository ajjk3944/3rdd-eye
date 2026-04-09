package m1;

import B2.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5317a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f44035f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C5317a f44036g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f44037a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f44038b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f44039c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f44040d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final HandlerC0497a f44041e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: m1.a$a, reason: collision with other inner class name */
    public class HandlerC0497a extends Handler {
        public HandlerC0497a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            C5317a c5317a = C5317a.this;
            while (true) {
                synchronized (c5317a.f44038b) {
                    try {
                        size = c5317a.f44040d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        c5317a.f44040d.toArray(bVarArr);
                        c5317a.f44040d.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i = 0; i < size; i++) {
                    b bVar = bVarArr[i];
                    int size2 = bVar.f44044b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        c cVar = bVar.f44044b.get(i10);
                        if (!cVar.f44048d) {
                            cVar.f44046b.onReceive(c5317a.f44037a, bVar.f44043a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: m1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f44043a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f44044b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f44043a = intent;
            this.f44044b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: m1.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f44045a;

        /* renamed from: b, reason: collision with root package name */
        public final l.a f44046b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f44047c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f44048d;

        public c(l.a aVar, IntentFilter intentFilter) {
            this.f44045a = intentFilter;
            this.f44046b = aVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f44046b);
            sb.append(" filter=");
            sb.append(this.f44045a);
            if (this.f44048d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C5317a(Context context) {
        this.f44037a = context;
        this.f44041e = new HandlerC0497a(context.getMainLooper());
    }

    public static C5317a a(ContextWrapper contextWrapper) {
        C5317a c5317a;
        synchronized (f44035f) {
            try {
                if (f44036g == null) {
                    f44036g = new C5317a(contextWrapper.getApplicationContext());
                }
                c5317a = f44036g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5317a;
    }

    public final void b(l.a aVar, IntentFilter intentFilter) {
        synchronized (this.f44038b) {
            try {
                c cVar = new c(aVar, intentFilter);
                ArrayList<c> arrayList = this.f44038b.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f44038b.put(aVar, arrayList);
                }
                arrayList.add(cVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<c> arrayList2 = this.f44039c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f44039c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList<c> arrayList;
        synchronized (this.f44038b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f44037a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList2 = this.f44039c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        c cVar = arrayList2.get(i);
                        if (z10) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f44045a);
                        }
                        if (cVar.f44047c) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = cVar.f44045a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(iMatch));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cVar);
                                cVar.f44047c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z10) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            ((c) arrayList3.get(i10)).f44047c = false;
                        }
                        this.f44040d.add(new b(intent, arrayList3));
                        if (!this.f44041e.hasMessages(1)) {
                            this.f44041e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(l.a aVar) {
        synchronized (this.f44038b) {
            try {
                ArrayList<c> arrayListRemove = this.f44038b.remove(aVar);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f44048d = true;
                    for (int i = 0; i < cVar.f44045a.countActions(); i++) {
                        String action = cVar.f44045a.getAction(i);
                        ArrayList<c> arrayList = this.f44039c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f44046b == aVar) {
                                    cVar2.f44048d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f44039c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
