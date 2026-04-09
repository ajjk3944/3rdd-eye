package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.w30;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class t30 {

    /* renamed from: h, reason: collision with root package name */
    public static final lq1 f33396h = new lq1(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f33397a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet<c> f33398b;

    /* renamed from: c, reason: collision with root package name */
    private int f33399c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33400d;

    /* renamed from: e, reason: collision with root package name */
    private int f33401e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33402f;

    /* renamed from: g, reason: collision with root package name */
    private List<r30> f33403g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r30 f33404a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f33405b;

        /* renamed from: c, reason: collision with root package name */
        public final List<r30> f33406c;

        public a(r30 r30Var, boolean z10, ArrayList arrayList, Exception exc) {
            this.f33404a = r30Var;
            this.f33405b = z10;
            this.f33406c = arrayList;
        }
    }

    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final HandlerThread f33407a;

        /* renamed from: b, reason: collision with root package name */
        private final nk2 f33408b;

        /* renamed from: c, reason: collision with root package name */
        private final x30 f33409c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f33410d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList<r30> f33411e;

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, d> f33412f;

        /* renamed from: g, reason: collision with root package name */
        private int f33413g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f33414h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private int f33415j;

        /* renamed from: k, reason: collision with root package name */
        private int f33416k;

        public b(HandlerThread handlerThread, kz kzVar, lz lzVar, Handler handler, boolean z10) {
            super(handlerThread.getLooper());
            this.f33407a = handlerThread;
            this.f33408b = kzVar;
            this.f33409c = lzVar;
            this.f33410d = handler;
            this.i = 3;
            this.f33415j = 5;
            this.f33414h = z10;
            this.f33411e = new ArrayList<>();
            this.f33412f = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(r30 r30Var, r30 r30Var2) {
            long j4 = r30Var.f32444c;
            long j10 = r30Var2.f32444c;
            int i = s82.f32899a;
            if (j4 < j10) {
                return -1;
            }
            return j4 == j10 ? 0 : 1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            s30 s30VarA = null;
            int i = 7;
            i = 0;
            int i10 = 0;
            switch (message.what) {
                case 0:
                    this.f33413g = message.arg1;
                    try {
                        ((kz) this.f33408b).b();
                        s30VarA = ((kz) this.f33408b).a(0, 1, 2, 5, 7);
                    } catch (IOException e4) {
                        rs0.a("DownloadManager", "Failed to load index.", e4);
                        this.f33411e.clear();
                    } finally {
                        s82.a((Closeable) s30VarA);
                    }
                    while (true) {
                        kz.a aVar = (kz.a) s30VarA;
                        if (!aVar.a(aVar.b() + 1)) {
                            this.f33410d.obtainMessage(0, new ArrayList(this.f33411e)).sendToTarget();
                            b();
                            i10 = 1;
                            this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                            return;
                        }
                        this.f33411e.add(((kz.a) s30VarA).a());
                    }
                case 1:
                    this.f33414h = message.arg1 != 0;
                    b();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 2:
                    this.f33413g = message.arg1;
                    b();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i11 = message.arg1;
                    if (str == null) {
                        for (int i12 = 0; i12 < this.f33411e.size(); i12++) {
                            a(this.f33411e.get(i12), i11);
                        }
                        try {
                            ((kz) this.f33408b).a(i11);
                        } catch (IOException e10) {
                            rs0.a("DownloadManager", "Failed to set manual stop reason", e10);
                        }
                    } else {
                        r30 r30VarA = a(str, false);
                        if (r30VarA != null) {
                            a(r30VarA, i11);
                        } else {
                            try {
                                ((kz) this.f33408b).a(i11, str);
                            } catch (IOException e11) {
                                rs0.a("DownloadManager", "Failed to set manual stop reason: ".concat(str), e11);
                            }
                        }
                    }
                    b();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 4:
                    this.i = message.arg1;
                    b();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 5:
                    this.f33415j = message.arg1;
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 6:
                    v30 v30Var = (v30) message.obj;
                    int i13 = message.arg1;
                    r30 r30VarA2 = a(v30Var.f34313b, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (r30VarA2 != null) {
                        int i14 = r30VarA2.f32443b;
                        long j4 = (i14 == 5 || i14 == 3 || i14 == 4) ? jCurrentTimeMillis : r30VarA2.f32444c;
                        if (i14 != 5 && i14 != 7) {
                            i = i13 != 0 ? 1 : 0;
                        }
                        a(new r30(r30VarA2.f32442a.a(v30Var), i, j4, jCurrentTimeMillis, -1L, i13, 0, new u30()));
                    } else {
                        a(new r30(v30Var, i13 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i13, 0, new u30()));
                    }
                    b();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    r30 r30VarA3 = a(str2, true);
                    if (r30VarA3 == null) {
                        rs0.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        a(r30VarA3, 5, 0);
                        b();
                    }
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 8:
                    a();
                    i10 = 1;
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.f33417b.f34313b;
                    this.f33412f.remove(str3);
                    boolean z10 = dVar.f33420e;
                    if (!z10) {
                        int i15 = this.f33416k - 1;
                        this.f33416k = i15;
                        if (i15 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.f33423h) {
                        b();
                    } else {
                        Exception exc = dVar.i;
                        if (exc != null) {
                            rs0.a("DownloadManager", "Task failed: " + dVar.f33417b + ", " + z10, exc);
                        }
                        r30 r30VarA4 = a(str3, false);
                        r30VarA4.getClass();
                        int i16 = r30VarA4.f32443b;
                        if (i16 != 2) {
                            if (i16 != 5 && i16 != 7) {
                                throw new IllegalStateException();
                            }
                            if (!z10) {
                                throw new IllegalStateException();
                            }
                            if (i16 == 7) {
                                int i17 = r30VarA4.f32447f;
                                a(r30VarA4, i17 == 0 ? 0 : 1, i17);
                                b();
                            } else {
                                this.f33411e.remove(a(r30VarA4.f32442a.f34313b));
                                try {
                                    ((kz) this.f33408b).c(r30VarA4.f32442a.f34313b);
                                } catch (IOException unused) {
                                    rs0.b("DownloadManager", "Failed to remove from database");
                                }
                                this.f33410d.obtainMessage(2, new a(r30VarA4, true, new ArrayList(this.f33411e), null)).sendToTarget();
                            }
                        } else {
                            if (z10) {
                                throw new IllegalStateException();
                            }
                            r30 r30Var = new r30(r30VarA4.f32442a, exc == null ? 3 : 4, r30VarA4.f32444c, System.currentTimeMillis(), r30VarA4.f32446e, r30VarA4.f32447f, exc == null ? 0 : 1, r30VarA4.f32449h);
                            this.f33411e.remove(a(r30Var.f32442a.f34313b));
                            try {
                                ((kz) this.f33408b).a(r30Var);
                            } catch (IOException e12) {
                                rs0.a("DownloadManager", "Failed to update index.", e12);
                            }
                            this.f33410d.obtainMessage(2, new a(r30Var, false, new ArrayList(this.f33411e), exc)).sendToTarget();
                        }
                        b();
                    }
                    this.f33410d.obtainMessage(1, i10, this.f33412f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i18 = message.arg1;
                    int i19 = message.arg2;
                    int i20 = s82.f32899a;
                    long j10 = ((i18 & 4294967295L) << 32) | (4294967295L & i19);
                    r30 r30VarA5 = a(dVar2.f33417b.f34313b, false);
                    r30VarA5.getClass();
                    if (j10 == r30VarA5.f32446e || j10 == -1) {
                        return;
                    }
                    a(new r30(r30VarA5.f32442a, r30VarA5.f32443b, r30VarA5.f32444c, System.currentTimeMillis(), j10, r30VarA5.f32447f, r30VarA5.f32448g, r30VarA5.f32449h));
                    return;
                case 11:
                    for (int i21 = 0; i21 < this.f33411e.size(); i21++) {
                        r30 r30Var2 = this.f33411e.get(i21);
                        if (r30Var2.f32443b == 2) {
                            try {
                                ((kz) this.f33408b).a(r30Var2);
                            } catch (IOException e13) {
                                rs0.a("DownloadManager", "Failed to update index.", e13);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f33412f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        ((kz) this.f33408b).b();
                    } catch (IOException e14) {
                        rs0.a("DownloadManager", "Failed to update index.", e14);
                    }
                    this.f33411e.clear();
                    this.f33407a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private r30 a(String str, boolean z10) {
            int iA = a(str);
            if (iA != -1) {
                return this.f33411e.get(iA);
            }
            if (!z10) {
                return null;
            }
            try {
                return ((kz) this.f33408b).b(str);
            } catch (IOException e4) {
                rs0.a("DownloadManager", "Failed to load download: " + str, e4);
                return null;
            }
        }

        private void b() {
            int i = 0;
            for (int i10 = 0; i10 < this.f33411e.size(); i10++) {
                r30 r30Var = this.f33411e.get(i10);
                d dVar = this.f33412f.get(r30Var.f32442a.f34313b);
                int i11 = r30Var.f32443b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            dVar.getClass();
                            if (dVar.f33420e) {
                                throw new IllegalStateException();
                            }
                            if (this.f33414h || this.f33413g != 0 || i >= this.i) {
                                a(r30Var, 0, 0);
                                dVar.a(false);
                            }
                        } else {
                            if (i11 != 5 && i11 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar == null) {
                                d dVar2 = new d(r30Var.f32442a, ((lz) this.f33409c).a(r30Var.f32442a), r30Var.f32449h, true, this.f33415j, this, 0);
                                this.f33412f.put(r30Var.f32442a.f34313b, dVar2);
                                dVar2.start();
                            } else if (!dVar.f33420e) {
                                dVar.a(false);
                            }
                        }
                    } else if (dVar != null) {
                        if (dVar.f33420e) {
                            throw new IllegalStateException();
                        }
                        dVar.a(false);
                    }
                } else if (dVar != null) {
                    if (dVar.f33420e) {
                        throw new IllegalStateException();
                    }
                    dVar.a(false);
                } else if (this.f33414h || this.f33413g != 0 || this.f33416k >= this.i) {
                    dVar = null;
                } else {
                    r30 r30VarA = a(r30Var, 2, 0);
                    d dVar3 = new d(r30VarA.f32442a, ((lz) this.f33409c).a(r30VarA.f32442a), r30VarA.f32449h, false, this.f33415j, this, 0);
                    this.f33412f.put(r30VarA.f32442a.f34313b, dVar3);
                    int i12 = this.f33416k;
                    this.f33416k = i12 + 1;
                    if (i12 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.f33420e) {
                    i++;
                }
            }
        }

        private int a(String str) {
            for (int i = 0; i < this.f33411e.size(); i++) {
                if (this.f33411e.get(i).f32442a.f34313b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private r30 a(r30 r30Var) {
            int i = r30Var.f32443b;
            if (i != 3 && i != 4) {
                int iA = a(r30Var.f32442a.f34313b);
                if (iA == -1) {
                    this.f33411e.add(r30Var);
                    Collections.sort(this.f33411e, new S2(1));
                } else {
                    boolean z10 = r30Var.f32444c != this.f33411e.get(iA).f32444c;
                    this.f33411e.set(iA, r30Var);
                    if (z10) {
                        Collections.sort(this.f33411e, new S2(1));
                    }
                }
                try {
                    ((kz) this.f33408b).a(r30Var);
                } catch (IOException e4) {
                    rs0.a("DownloadManager", "Failed to update index.", e4);
                }
                this.f33410d.obtainMessage(2, new a(r30Var, false, new ArrayList(this.f33411e), null)).sendToTarget();
                return r30Var;
            }
            throw new IllegalStateException();
        }

        private r30 a(r30 r30Var, int i, int i10) {
            if (i != 3 && i != 4) {
                return a(new r30(r30Var.f32442a, i, r30Var.f32444c, System.currentTimeMillis(), r30Var.f32446e, i10, 0, r30Var.f32449h));
            }
            throw new IllegalStateException();
        }

        private void a() {
            ArrayList arrayList = new ArrayList();
            try {
                s30 s30VarA = ((kz) this.f33408b).a(3, 4);
                while (true) {
                    try {
                        kz.a aVar = (kz.a) s30VarA;
                        if (!aVar.a(aVar.b() + 1)) {
                            break;
                        } else {
                            arrayList.add(((kz.a) s30VarA).a());
                        }
                    } finally {
                    }
                }
                ((kz.a) s30VarA).close();
            } catch (IOException unused) {
                rs0.b("DownloadManager", "Failed to load downloads.");
            }
            for (int i = 0; i < this.f33411e.size(); i++) {
                ArrayList<r30> arrayList2 = this.f33411e;
                r30 r30Var = arrayList2.get(i);
                arrayList2.set(i, new r30(r30Var.f32442a, 5, r30Var.f32444c, System.currentTimeMillis(), r30Var.f32446e, 0, 0, r30Var.f32449h));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ArrayList<r30> arrayList3 = this.f33411e;
                r30 r30Var2 = (r30) arrayList.get(i10);
                arrayList3.add(new r30(r30Var2.f32442a, 5, r30Var2.f32444c, System.currentTimeMillis(), r30Var2.f32446e, 0, 0, r30Var2.f32449h));
            }
            Collections.sort(this.f33411e, new S2(1));
            try {
                ((kz) this.f33408b).c();
            } catch (IOException e4) {
                rs0.a("DownloadManager", "Failed to update index.", e4);
            }
            ArrayList arrayList4 = new ArrayList(this.f33411e);
            for (int i11 = 0; i11 < this.f33411e.size(); i11++) {
                this.f33410d.obtainMessage(2, new a(this.f33411e.get(i11), false, arrayList4, null)).sendToTarget();
            }
            b();
        }

        private void a(r30 r30Var, int i) {
            if (i == 0) {
                if (r30Var.f32443b == 1) {
                    a(r30Var, 0, 0);
                }
            } else if (i != r30Var.f32447f) {
                int i10 = r30Var.f32443b;
                if (i10 == 0 || i10 == 2) {
                    i10 = 1;
                }
                a(new r30(r30Var.f32442a, i10, r30Var.f32444c, System.currentTimeMillis(), r30Var.f32446e, i, 0, r30Var.f32449h));
            }
        }
    }

    public interface c {
        void a(t30 t30Var, r30 r30Var);
    }

    public static class d extends Thread implements w30.a {

        /* renamed from: b, reason: collision with root package name */
        private final v30 f33417b;

        /* renamed from: c, reason: collision with root package name */
        private final w30 f33418c;

        /* renamed from: d, reason: collision with root package name */
        private final u30 f33419d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f33420e;

        /* renamed from: f, reason: collision with root package name */
        private final int f33421f;

        /* renamed from: g, reason: collision with root package name */
        private volatile b f33422g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f33423h;
        private Exception i;

        /* renamed from: j, reason: collision with root package name */
        private long f33424j;

        public /* synthetic */ d(v30 v30Var, w30 w30Var, u30 u30Var, boolean z10, int i, b bVar, int i10) {
            this(v30Var, w30Var, u30Var, z10, i, bVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            try {
                if (this.f33420e) {
                    this.f33418c.remove();
                } else {
                    long j4 = -1;
                    int i = 0;
                    while (!this.f33423h) {
                        try {
                            this.f33418c.a(this);
                            break;
                        } catch (IOException e4) {
                            if (!this.f33423h) {
                                long j10 = this.f33419d.f33897a;
                                if (j10 != j4) {
                                    i = 0;
                                    j4 = j10;
                                }
                                int i10 = i + 1;
                                if (i10 > this.f33421f) {
                                    throw e4;
                                }
                                Thread.sleep(Math.min(i * 1000, 5000));
                                i = i10;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e10) {
                this.i = e10;
            }
            b bVar = this.f33422g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private d(v30 v30Var, w30 w30Var, u30 u30Var, boolean z10, int i, b bVar) {
            this.f33417b = v30Var;
            this.f33418c = w30Var;
            this.f33419d = u30Var;
            this.f33420e = z10;
            this.f33421f = i;
            this.f33422g = bVar;
            this.f33424j = -1L;
        }

        public final void a(boolean z10) {
            if (z10) {
                this.f33422g = null;
            }
            if (this.f33423h) {
                return;
            }
            this.f33423h = true;
            this.f33418c.cancel();
            interrupt();
        }

        public final void a(long j4, long j10, float f10) {
            this.f33419d.f33897a = j10;
            this.f33419d.f33898b = f10;
            if (j4 != this.f33424j) {
                this.f33424j = j4;
                b bVar = this.f33422g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j4 >> 32), (int) j4, this).sendToTarget();
                }
            }
        }
    }

    public t30(Context context, kz kzVar, lz lzVar) {
        context.getApplicationContext();
        this.f33400d = true;
        this.f33403g = Collections.EMPTY_LIST;
        this.f33398b = new CopyOnWriteArraySet<>();
        Handler handlerB = s82.b(new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.M3
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f24195b.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, kzVar, lzVar, handlerB, this.f33400d);
        this.f33397a = bVar;
        int iC = new mq1(context, new K0(this, 8)).c();
        this.f33401e = iC;
        this.f33399c = 1;
        bVar.obtainMessage(0, iC, 0).sendToTarget();
    }

    private boolean b() {
        boolean z10;
        if (this.f33400d || this.f33401e == 0) {
            z10 = false;
        } else {
            for (int i = 0; i < this.f33403g.size(); i++) {
                if (this.f33403g.get(i).f32443b == 0) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        boolean z11 = this.f33402f != z10;
        this.f33402f = z10;
        return z11;
    }

    public final void a(v30 v30Var) {
        this.f33399c++;
        this.f33397a.obtainMessage(6, 0, 0, v30Var).sendToTarget();
    }

    public final void a(dj2 dj2Var) {
        this.f33398b.add(dj2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f33403g = Collections.unmodifiableList((List) message.obj);
            boolean zB = b();
            Iterator<c> it = this.f33398b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (zB) {
                Iterator<c> it2 = this.f33398b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else if (i == 1) {
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = this.f33399c - i10;
            this.f33399c = i12;
            if (i11 == 0 && i12 == 0) {
                Iterator<c> it3 = this.f33398b.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        } else if (i == 2) {
            a aVar = (a) message.obj;
            this.f33403g = Collections.unmodifiableList(aVar.f33406c);
            r30 r30Var = aVar.f33404a;
            boolean zB2 = b();
            if (aVar.f33405b) {
                Iterator<c> it4 = this.f33398b.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            } else {
                Iterator<c> it5 = this.f33398b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, r30Var);
                }
            }
            if (zB2) {
                Iterator<c> it6 = this.f33398b.iterator();
                while (it6.hasNext()) {
                    it6.next().getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mq1 mq1Var, int i) {
        mq1Var.getClass();
        if (this.f33401e != i) {
            this.f33401e = i;
            this.f33399c++;
            this.f33397a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zB = b();
        Iterator<c> it = this.f33398b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (zB) {
            Iterator<c> it2 = this.f33398b.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final void a(String str) {
        this.f33399c++;
        this.f33397a.obtainMessage(7, str).sendToTarget();
    }

    public final void a(c cVar) {
        this.f33398b.remove(cVar);
    }

    public final void a() {
        if (this.f33400d) {
            this.f33400d = false;
            this.f33399c++;
            this.f33397a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zB = b();
            Iterator<c> it = this.f33398b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (zB) {
                Iterator<c> it2 = this.f33398b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }
    }
}
