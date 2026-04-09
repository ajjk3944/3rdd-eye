package com.vungle.ads.internal.downloader;

import J4.e;
import U9.C1606c;
import U9.E;
import U9.F;
import U9.t;
import U9.x;
import com.vungle.ads.C4055m;
import com.vungle.ads.V;
import com.vungle.ads.internal.downloader.a;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.f;
import com.vungle.ads.internal.task.h;
import com.vungle.ads.internal.util.k;
import com.vungle.ads.internal.util.l;
import ia.n;
import ia.q;
import io.appmetrica.analytics.impl.Oo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;

/* compiled from: AssetDownloader.kt */
/* loaded from: classes2.dex */
public final class b implements d {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final a Companion = new a(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final String TAG = "AssetDownloader";
    private static final int TIMEOUT = 30;
    private final i downloadExecutor;
    private x okHttpClient;
    private final l pathProvider;
    private final List<c> transitioning;

    /* compiled from: AssetDownloader.kt */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: AssetDownloader.kt */
    /* renamed from: com.vungle.ads.internal.downloader.b$b, reason: collision with other inner class name */
    public static final class C0378b extends h {
        final /* synthetic */ com.vungle.ads.internal.downloader.a $downloadListener;
        final /* synthetic */ c $downloadRequest;

        public C0378b(c cVar, com.vungle.ads.internal.downloader.a aVar) {
            this.$downloadRequest = cVar;
            this.$downloadListener = aVar;
        }

        @Override // com.vungle.ads.internal.task.h
        public int getPriority() {
            return this.$downloadRequest.getPriority();
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            b.this.launchRequest(this.$downloadRequest, this.$downloadListener);
        }
    }

    public b(i downloadExecutor, l pathProvider) {
        kotlin.jvm.internal.l.f(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.transitioning = new ArrayList();
        x.a aVar = new x.a();
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.l.f(unit, "unit");
        aVar.f12793u = V9.b.b(30L);
        kotlin.jvm.internal.l.f(unit, "unit");
        aVar.f12792t = V9.b.b(30L);
        aVar.f12783k = null;
        aVar.f12781h = true;
        aVar.i = true;
        f fVar = f.INSTANCE;
        if (fVar.isCleverCacheEnabled()) {
            long cleverCacheDiskSize = fVar.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = fVar.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            kotlin.jvm.internal.l.e(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (jMin > 0) {
                aVar.f12783k = new C1606c(pathProvider.getCleverCacheDir(), jMin);
            } else {
                k.Companion.w(TAG, "cache disk capacity size <=0, no clever cache active.");
            }
        }
        this.okHttpClient = new x(aVar);
    }

    private final boolean checkSpaceAvailable() {
        l lVar = this.pathProvider;
        String absolutePath = lVar.getVungleDir().getAbsolutePath();
        kotlin.jvm.internal.l.e(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = lVar.getAvailableBytes(absolutePath);
        if (availableBytes >= 20971520) {
            return true;
        }
        C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 126, Oo.d(availableBytes, "Insufficient space "), (String) null, (String) null, (String) null, 28, (Object) null);
        return false;
    }

    private final F decodeGzipIfNeeded(E e4) {
        F f10 = e4.f12568h;
        if (!GZIP.equalsIgnoreCase(E.c(e4, CONTENT_ENCODING)) || f10 == null) {
            return f10;
        }
        return new Z9.g(E.c(e4, CONTENT_TYPE), -1L, q.c(new n(f10.source())));
    }

    private final void deliverError(c cVar, com.vungle.ads.internal.downloader.a aVar, a.C0372a c0372a) {
        if (aVar != null) {
            aVar.onError(c0372a, cVar);
        }
    }

    private final void deliverSuccess(File file, c cVar, com.vungle.ads.internal.downloader.a aVar) {
        k.Companion.d(TAG, "On success " + cVar);
        if (aVar != null) {
            aVar.onSuccess(file, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: download$lambda-0, reason: not valid java name */
    public static final void m40download$lambda0(b this$0, c cVar, com.vungle.ads.internal.downloader.a aVar) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.deliverError(cVar, aVar, new a.C0372a(-1, new V("Cannot complete " + cVar + " : Out of Memory"), a.C0372a.b.Companion.getINTERNAL_ERROR()));
    }

    private final boolean isValidUrl(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        t tVarA = null;
        try {
            t.a aVar = new t.a();
            aVar.c(null, str);
            tVarA = aVar.a();
        } catch (IllegalArgumentException unused) {
        }
        return tVarA != null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequest(com.vungle.ads.internal.downloader.c r35, com.vungle.ads.internal.downloader.a r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.b.launchRequest(com.vungle.ads.internal.downloader.c, com.vungle.ads.internal.downloader.a):void");
    }

    @Override // com.vungle.ads.internal.downloader.d
    public void cancel(c cVar) {
        if (cVar == null || cVar.isCancelled()) {
            return;
        }
        cVar.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.d
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((c) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.d
    public void download(c cVar, com.vungle.ads.internal.downloader.a aVar) {
        if (cVar == null) {
            return;
        }
        this.transitioning.add(cVar);
        this.downloadExecutor.execute(new C0378b(cVar, aVar), new e(this, cVar, aVar, 12));
    }
}
