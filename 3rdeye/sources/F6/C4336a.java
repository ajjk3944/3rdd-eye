package f6;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import a6.m;
import android.content.Context;
import b9.C1992A;
import com.vungle.ads.internal.k;
import com.vungle.ads.internal.util.f;
import com.vungle.ads.internal.util.l;
import com.yandex.mobile.ads.impl.L;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import w9.k;

/* compiled from: UnclosedAdDetector.kt */
/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4336a {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final com.vungle.ads.internal.executor.a executors;
    private File file;
    private final l pathProvider;
    private final String sessionId;
    private final CopyOnWriteArrayList<m> unclosedAdList;
    public static final b Companion = new b(null);
    private static final AbstractC1564a json = t.a(C0453a.INSTANCE);

    /* compiled from: UnclosedAdDetector.kt */
    /* renamed from: f6.a$a, reason: collision with other inner class name */
    public static final class C0453a extends kotlin.jvm.internal.m implements p9.l<C1568e, C1992A> {
        public static final C0453a INSTANCE = new C0453a();

        public C0453a() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
            Json.f11794d = true;
        }
    }

    /* compiled from: UnclosedAdDetector.kt */
    /* renamed from: f6.a$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        private b() {
        }
    }

    public C4336a(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, l pathProvider) throws IOException {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        kotlin.jvm.internal.l.f(executors, "executors");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        File file = this.file;
        if (file == null || file.exists()) {
            return;
        }
        this.file.createNewFile();
    }

    private final <T> T decodeJson(String str) {
        json.getClass();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    private final List<m> readUnclosedAdFromFile() {
        return (List) new com.vungle.ads.internal.executor.b(this.executors.getIoExecutor().submit(new k(this, 2))).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readUnclosedAdFromFile$lambda-2, reason: not valid java name */
    public static final List m136readUnclosedAdFromFile$lambda2(C4336a this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        try {
            String string = f.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                AbstractC1564a abstractC1564a = json;
                T9.a aVar = abstractC1564a.f11782b;
                int i = w9.k.f47593c;
                w9.k kVarA = k.a.a(x.b(m.class));
                e eVarA = x.a(List.class);
                List listSingletonList = Collections.singletonList(kVarA);
                x.f43661a.getClass();
                return (List) abstractC1564a.a(u.L(aVar, new A(eVarA, listSingletonList, false)), string);
            }
            return new ArrayList();
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e4.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrieveUnclosedAd$lambda-1, reason: not valid java name */
    public static final void m137retrieveUnclosedAd$lambda1(C4336a this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        try {
            f.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e4) {
            com.vungle.ads.internal.util.k.Companion.e("UnclosedAdDetector", "Fail to delete file " + e4.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<m> list) {
        try {
            AbstractC1564a abstractC1564a = json;
            T9.a aVar = abstractC1564a.f11782b;
            int i = w9.k.f47593c;
            w9.k kVarA = k.a.a(x.b(m.class));
            e eVarA = x.a(List.class);
            List listSingletonList = Collections.singletonList(kVarA);
            x.f43661a.getClass();
            this.executors.getIoExecutor().execute(new L(16, this, abstractC1564a.b(u.L(aVar, new A(eVarA, listSingletonList, false)), list)));
        } catch (Throwable th) {
            com.vungle.ads.internal.util.k.Companion.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeUnclosedAdToFile$lambda-3, reason: not valid java name */
    public static final void m138writeUnclosedAdToFile$lambda3(C4336a this$0, String jsonContent) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(jsonContent, "$jsonContent");
        f.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(m ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        ad.setSessionId(this.sessionId);
        this.unclosedAdList.add(ad);
        writeUnclosedAdToFile(this.unclosedAdList);
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.executor.a getExecutors() {
        return this.executors;
    }

    public final l getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(m ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        if (this.unclosedAdList.contains(ad)) {
            this.unclosedAdList.remove(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<m> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        List<m> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIoExecutor().execute(new com.vungle.ads.internal.util.a(this, 2));
        return arrayList;
    }
}
