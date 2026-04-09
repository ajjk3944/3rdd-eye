package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "-initializeadPlayerConfigRequest", "(Ll9/l;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "copy", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;Ll9/l;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdPlayerConfigRequestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdPlayerConfigRequestKt.kt\ngatewayprotocol/v1/AdPlayerConfigRequestKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n1#2:353\n*E\n"})
/* loaded from: classes4.dex */
public final class AdPlayerConfigRequestKtKt {
    @JvmName(name = "-initializeadPlayerConfigRequest")
    @NotNull
    /* renamed from: -initializeadPlayerConfigRequest, reason: not valid java name */
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m392initializeadPlayerConfigRequest(@NotNull l block) {
        p.e(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builderNewBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, @NotNull l block) {
        p.e(adPlayerConfigRequest, "<this>");
        p.e(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder = adPlayerConfigRequest.toBuilder();
        p.d(builder, "this.toBuilder()");
        AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder adPlayerConfigRequestOrBuilder) {
        p.e(adPlayerConfigRequestOrBuilder, "<this>");
        if (adPlayerConfigRequestOrBuilder.hasMediationInfo()) {
            return adPlayerConfigRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
