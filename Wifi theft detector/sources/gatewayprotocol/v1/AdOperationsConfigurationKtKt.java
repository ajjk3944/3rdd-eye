package gatewayprotocol.v1;

import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdOperationsConfigurationKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "-initializeadOperationsConfiguration", "(Ll9/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adOperationsConfiguration", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;Ll9/l;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdOperationsConfigurationKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdOperationsConfigurationKt.kt\ngatewayprotocol/v1/AdOperationsConfigurationKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes4.dex */
public final class AdOperationsConfigurationKtKt {
    @JvmName(name = "-initializeadOperationsConfiguration")
    @NotNull
    /* renamed from: -initializeadOperationsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration m391initializeadOperationsConfiguration(@NotNull l block) {
        p.e(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(@NotNull NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, @NotNull l block) {
        p.e(adOperationsConfiguration, "<this>");
        p.e(block, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder = adOperationsConfiguration.toBuilder();
        p.d(builder, "this.toBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
