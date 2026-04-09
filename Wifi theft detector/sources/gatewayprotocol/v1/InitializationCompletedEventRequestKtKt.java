package gatewayprotocol.v1;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/InitializationCompletedEventRequestKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "-initializeinitializationCompletedEventRequest", "(Ll9/l;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", "copy", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;Ll9/l;)Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInitializationCompletedEventRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationCompletedEventRequestKt.kt\ngatewayprotocol/v1/InitializationCompletedEventRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes4.dex */
public final class InitializationCompletedEventRequestKtKt {
    @JvmName(name = "-initializeinitializationCompletedEventRequest")
    @NotNull
    /* renamed from: -initializeinitializationCompletedEventRequest, reason: not valid java name */
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest m419initializeinitializationCompletedEventRequest(@NotNull l block) {
        p.e(block, "block");
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builderNewBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        InitializationCompletedEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest copy(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest, @NotNull l block) {
        p.e(initializationCompletedEventRequest, "<this>");
        p.e(block, "block");
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder = initializationCompletedEventRequest.toBuilder();
        p.d(builder, "this.toBuilder()");
        InitializationCompletedEventRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        p.e(initializationCompletedEventRequestOrBuilder, "<this>");
        if (initializationCompletedEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder initializationCompletedEventRequestOrBuilder) {
        p.e(initializationCompletedEventRequestOrBuilder, "<this>");
        if (initializationCompletedEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return initializationCompletedEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
