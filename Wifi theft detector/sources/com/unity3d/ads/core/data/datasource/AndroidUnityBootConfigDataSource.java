package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import i9.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.r;
import y8.s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", "key", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        p.e(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String key) {
        Object objB;
        p.e(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            final String str = key + '=';
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                p.d(stream, "stream");
                k.c(new BufferedReader(new InputStreamReader(stream, s9.c.f24341b), 8192), new l() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // l9.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return s.f25199a;
                    }

                    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
                    public final void invoke(@NotNull String line) {
                        p.e(line, "line");
                        if (r.J(line, str, false, 2, null)) {
                            Ref$ObjectRef<String> ref$ObjectRef2 = ref$ObjectRef;
                            ?? Substring = line.substring(str.length());
                            p.d(Substring, "this as java.lang.String).substring(startIndex)");
                            ref$ObjectRef2.element = Substring;
                        }
                    }
                });
                s sVar = s.f25199a;
                i9.b.a(stream, null);
                objB = Result.b((String) ref$ObjectRef.element);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        return (String) (Result.g(objB) ? null : objB);
    }
}
