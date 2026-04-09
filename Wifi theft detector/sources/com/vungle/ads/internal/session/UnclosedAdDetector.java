package com.vungle.ads.internal.session;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.util.q;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.b;
import kotlinx.serialization.f;
import l9.l;
import org.jetbrains.annotations.NotNull;
import q7.k;
import y8.s;
import z8.r;
import z9.c;

/* loaded from: classes3.dex */
public final class UnclosedAdDetector {

    @NotNull
    private static final String FILENAME = "unclosed_ad";

    @NotNull
    private final Context context;

    @NotNull
    private final com.vungle.ads.internal.executor.a executors;

    @NotNull
    private File file;

    @NotNull
    private final q pathProvider;
    private boolean ready;

    @NotNull
    private final String sessionId;

    @NotNull
    private final CopyOnWriteArrayList<k> unclosedAdList;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final z9.a json = z9.k.b(null, new l() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull c Json) {
            p.e(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public UnclosedAdDetector(@NotNull Context context, @NotNull String sessionId, @NotNull com.vungle.ads.internal.executor.a executors, @NotNull q pathProvider) {
        Object objB;
        boolean zH;
        p.e(context, "context");
        p.e(sessionId, "sessionId");
        p.e(executors, "executors");
        p.e(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zH = true;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thE.getMessage());
            }
            zH = Result.h(objB);
        }
        this.ready = zH;
    }

    private final /* synthetic */ <T> T decodeJson(String str) {
        z9.a aVar = json;
        aa.c cVarA = aVar.a();
        p.j(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        b bVarB = f.b(cVarA, null);
        p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) aVar.b(bVarB, str);
    }

    private final List<k> readUnclosedAdFromFile() {
        return !this.ready ? r.j() : (List) new com.vungle.ads.internal.executor.b(this.executors.getIoExecutor().submit(new Callable() { // from class: u7.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m347readUnclosedAdFromFile$lambda4(this.f24544a);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m347readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        p.e(this$0, "this$0");
        try {
            String string = com.vungle.ads.internal.util.i.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                z9.a aVar = json;
                b bVarB = f.b(aVar.a(), t.n(List.class, r9.q.f24180c.a(t.m(k.class))));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) aVar.b(bVarB, string);
            }
            return new ArrayList();
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m348retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        p.e(this$0, "this$0");
        try {
            com.vungle.ads.internal.util.i.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<k> list) {
        if (this.ready) {
            try {
                z9.a aVar = json;
                b bVarB = f.b(aVar.a(), t.n(List.class, r9.q.f24180c.a(t.m(k.class))));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strC = aVar.c(bVarB, list);
                this.executors.getIoExecutor().execute(new Runnable() { // from class: u7.c
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        UnclosedAdDetector.m349writeUnclosedAdToFile$lambda5(this.f24546a, strC);
                    }
                });
            } catch (Throwable th) {
                com.vungle.ads.internal.util.p.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m349writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        p.e(this$0, "this$0");
        p.e(jsonContent, "$jsonContent");
        com.vungle.ads.internal.util.i.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(@NotNull k ad) {
        p.e(ad, "ad");
        if (this.ready) {
            ad.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final com.vungle.ads.internal.executor.a getExecutors() {
        return this.executors;
    }

    @NotNull
    public final q getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(@NotNull k ad) {
        p.e(ad, "ad");
        if (this.ready && this.unclosedAdList.contains(ad)) {
            this.unclosedAdList.remove(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    @NotNull
    public final List<k> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<k> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIoExecutor().execute(new Runnable() { // from class: u7.b
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m348retrieveUnclosedAd$lambda3(this.f24545a);
            }
        });
        return arrayList;
    }
}
