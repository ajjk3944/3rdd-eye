package s7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.vungle.ads.v;
import i9.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "OMInjector";

    @NotNull
    private AtomicReference<String> cachedOMSDKJS;

    @NotNull
    private AtomicReference<String> cachedOMSessionJS;

    @NotNull
    private final Context context;

    @NotNull
    private final Handler uiHandler;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public b(@NotNull Context context) {
        p.e(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(v.omid_session_client_v1_5_7);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m622init$lambda2(b this$0) {
        Object objB;
        p.e(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!h6.a.b()) {
                h6.a.a(this$0.context);
            }
            objB = Result.b(s.f25199a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.vungle.ads.internal.util.p.Companion.e("OMSDK", "error: " + thE.getLocalizedMessage());
        }
    }

    private final String loadJsFromRaw(@RawRes int i10) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(i10);
            p.d(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, s9.c.f24341b), 8192);
            try {
                String strE = k.e(bufferedReader);
                i9.b.a(bufferedReader, null);
                objB = Result.b(strE);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        return (String) (Result.g(objB) ? null : objB);
    }

    private final File writeToFile(String str, File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (str == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            i9.b.a(fileWriter, null);
            return file;
        } finally {
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(v.omsdk_v1_5_7);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: s7.a
            @Override // java.lang.Runnable
            public final void run() {
                b.m622init$lambda2(this.f24305a);
            }
        });
    }

    @WorkerThread
    @NotNull
    public final List<File> injectJsFiles$vungle_ads_release(@NotNull File dir) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, com.vungle.ads.internal.b.OM_SDK_JS);
        if (!file.exists()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, com.vungle.ads.internal.b.OM_SESSION_JS);
        if (!file2.exists()) {
            com.vungle.ads.internal.util.p.Companion.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }
}
