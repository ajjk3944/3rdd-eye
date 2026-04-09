package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.e1;
import kotlinx.coroutines.flow.t0;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Ly8/s;", "invoke", "()V", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/t0;", "", "isCollecting", "Lkotlinx/coroutines/flow/t0;", "", "_appSetIdFlow", "getAppSetId", "()Ljava/lang/String;", "appSetId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAppSetIdDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAppSetIdDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,33:1\n214#2,5:34\n*S KotlinDebug\n*F\n+ 1 AndroidAppSetIdDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource\n*L\n23#1:34,5\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidAppSetIdDataSource {

    @NotNull
    private final t0 _appSetIdFlow;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final t0 isCollecting;

    public AndroidAppSetIdDataSource(@NotNull Context applicationContext) {
        p.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = e1.a(Boolean.FALSE);
        this._appSetIdFlow = e1.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(l tmp0, Object obj) {
        p.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Nullable
    public final String getAppSetId() {
        return (String) this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        t0 t0Var = this.isCollecting;
        do {
            value = t0Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!t0Var.h(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final l lVar = new l() { // from class: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.invoke.2
                {
                    super(1);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AppSetIdInfo) obj);
                    return s.f25199a;
                }

                public final void invoke(AppSetIdInfo appSetIdInfo2) {
                    String id = appSetIdInfo2.getId();
                    p.d(id, "it.id");
                    AndroidAppSetIdDataSource.this._appSetIdFlow.setValue(id);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AndroidAppSetIdDataSource.invoke$lambda$1(lVar, obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
