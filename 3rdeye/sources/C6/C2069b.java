package c6;

import C2.h;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.internal.util.f;
import com.vungle.ads.internal.util.k;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: OMInjector.kt */
/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2069b {
    public static final a Companion = new a(null);
    private static final String OM_SDK_JS = "omsdk.js";
    private static final String OM_SESSION_JS = "omsdk-session.js";
    private final AtomicReference<Context> contextRef;
    private final Handler uiHandler;

    /* compiled from: OMInjector.kt */
    /* renamed from: c6.b$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public C2069b(Context context) {
        l.f(context, "context");
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-0, reason: not valid java name */
    public static final void m2init$lambda0(C2069b this$0) {
        l.f(this$0, "this$0");
        try {
            if (F5.a.f1654a.f1655a) {
                return;
            }
            F5.a.a(this$0.contextRef.get());
        } catch (NoClassDefFoundError e4) {
            k.Companion.e("OMSDK", "error: " + e4.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            f.INSTANCE.closeQuietly(fileWriter);
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            f.INSTANCE.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public final void init() {
        this.uiHandler.post(new h(this, 13));
    }

    public final List<File> injectJsFiles(File dir) throws IOException {
        l.f(dir, "dir");
        ArrayList arrayList = new ArrayList();
        C2071d c2071d = C2071d.INSTANCE;
        arrayList.add(writeToFile(c2071d.getOM_JS$vungle_ads_release(), new File(dir, OM_SDK_JS)));
        arrayList.add(writeToFile(c2071d.getOM_SESSION_JS$vungle_ads_release(), new File(dir, OM_SESSION_JS)));
        return arrayList;
    }
}
