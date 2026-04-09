package com.vungle.ads.internal.load;

import a6.C1652a;
import com.vungle.ads.C4055m;
import com.vungle.ads.K;
import com.vungle.ads.internal.downloader.a;
import com.vungle.ads.internal.downloader.c;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.k;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;

/* compiled from: MraidJsLoader.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final int MRAID_AVAILABLE = 13;
    public static final int MRAID_DOWNLOADED = 10;
    public static final int MRAID_DOWNLOAD_FAILED = 12;
    public static final int MRAID_INVALID_ENDPOINT = 11;
    private static final String TAG = "MraidJsLoader";
    public static final e INSTANCE = new e();
    private static final AtomicBoolean isDownloading = new AtomicBoolean(false);
    private static final CopyOnWriteArrayList<a> listeners = new CopyOnWriteArrayList<>();

    /* compiled from: MraidJsLoader.kt */
    public interface a {
        void onDownloadResult(int i);
    }

    /* compiled from: MraidJsLoader.kt */
    public static final class b implements com.vungle.ads.internal.downloader.a {
        final /* synthetic */ i $executor;
        final /* synthetic */ File $jsPath;
        final /* synthetic */ File $mraidJsFile;

        public b(i iVar, File file, File file2) {
            this.$executor = iVar;
            this.$jsPath = file;
            this.$mraidJsFile = file2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onError$lambda-0, reason: not valid java name */
        public static final void m79onError$lambda0(a.C0372a c0372a, com.vungle.ads.internal.downloader.c downloadRequest, File jsPath) {
            l.f(downloadRequest, "$downloadRequest");
            l.f(jsPath, "$jsPath");
            try {
                try {
                    StringBuilder sb = new StringBuilder("download mraid js error: ");
                    sb.append(c0372a != null ? Integer.valueOf(c0372a.getServerCode()) : null);
                    sb.append(". Failed to load asset ");
                    sb.append(downloadRequest.getAsset().getServerPath());
                    String string = sb.toString();
                    k.Companion.d(e.TAG, string);
                    new K(string).logErrorNoReturnValue$vungle_ads_release();
                    com.vungle.ads.internal.util.f.deleteContents(jsPath);
                    e.INSTANCE.notifyListeners(12);
                } catch (Exception e4) {
                    k.Companion.e(e.TAG, "Failed to delete js assets", e4);
                    e.INSTANCE.notifyListeners(12);
                }
            } catch (Throwable th) {
                e.INSTANCE.notifyListeners(12);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onSuccess$lambda-1, reason: not valid java name */
        public static final void m80onSuccess$lambda1(File file, File mraidJsFile, File jsPath) {
            l.f(file, "$file");
            l.f(mraidJsFile, "$mraidJsFile");
            l.f(jsPath, "$jsPath");
            try {
                if (file.exists() && file.length() > 0) {
                    e.INSTANCE.notifyListeners(10);
                    return;
                }
                C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 131, "Mraid js downloaded but write failure: " + mraidJsFile.getAbsolutePath(), (String) null, (String) null, (String) null, 28, (Object) null);
                com.vungle.ads.internal.util.f.deleteContents(jsPath);
                e.INSTANCE.notifyListeners(12);
            } catch (Exception e4) {
                k.Companion.e(e.TAG, "Failed to delete js assets", e4);
                e.INSTANCE.notifyListeners(12);
            }
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onError(a.C0372a c0372a, com.vungle.ads.internal.downloader.c downloadRequest) {
            l.f(downloadRequest, "downloadRequest");
            this.$executor.execute(new Z.e(c0372a, downloadRequest, this.$jsPath, 8));
        }

        @Override // com.vungle.ads.internal.downloader.a
        public void onSuccess(File file, com.vungle.ads.internal.downloader.c downloadRequest) {
            l.f(file, "file");
            l.f(downloadRequest, "downloadRequest");
            this.$executor.execute(new J4.f(file, this.$mraidJsFile, this.$jsPath, 7));
        }
    }

    private e() {
    }

    public static /* synthetic */ void downloadJs$default(e eVar, com.vungle.ads.internal.util.l lVar, com.vungle.ads.internal.downloader.d dVar, i iVar, a aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            aVar = null;
        }
        eVar.downloadJs(lVar, dVar, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadJs$lambda-1, reason: not valid java name */
    public static final void m78downloadJs$lambda1(a aVar, com.vungle.ads.internal.util.l pathProvider, com.vungle.ads.internal.downloader.d downloader, i executor) {
        l.f(pathProvider, "$pathProvider");
        l.f(downloader, "$downloader");
        l.f(executor, "$executor");
        if (aVar != null) {
            try {
                listeners.add(aVar);
            } catch (Exception e4) {
                k.Companion.e(TAG, "Failed to download mraid js", e4);
                return;
            }
        }
        if (isDownloading.getAndSet(true)) {
            k.Companion.w(TAG, "mraid js is downloading, waiting for the previous request.");
            return;
        }
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        String mraidEndpoint = fVar.getMraidEndpoint();
        if (mraidEndpoint != null && mraidEndpoint.length() != 0) {
            File file = new File(pathProvider.getJsAssetDir(fVar.getMraidJsVersion()), com.vungle.ads.internal.g.MRAID_JS_FILE_NAME);
            if (file.exists()) {
                k.Companion.w(TAG, "mraid js already downloaded");
                INSTANCE.notifyListeners(13);
                return;
            }
            File jsDir = pathProvider.getJsDir();
            com.vungle.ads.internal.util.f.deleteContents(jsDir);
            String absolutePath = file.getAbsolutePath();
            l.e(absolutePath, "mraidJsFile.absolutePath");
            downloader.download(new com.vungle.ads.internal.downloader.c(c.a.HIGH, new C1652a(com.vungle.ads.internal.g.MRAID_JS_FILE_NAME, mraidEndpoint + "/mraid.min.js", absolutePath, C1652a.EnumC0211a.ASSET, true), null, null, null, 28, null), new b(executor, jsDir, file));
            return;
        }
        INSTANCE.notifyListeners(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners(int i) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onDownloadResult(i);
        }
        listeners.clear();
        isDownloading.set(false);
    }

    public final void downloadJs(com.vungle.ads.internal.util.l pathProvider, com.vungle.ads.internal.downloader.d downloader, i executor, a aVar) {
        l.f(pathProvider, "pathProvider");
        l.f(downloader, "downloader");
        l.f(executor, "executor");
        executor.execute(new D3.a(aVar, pathProvider, downloader, executor, 5));
    }
}
