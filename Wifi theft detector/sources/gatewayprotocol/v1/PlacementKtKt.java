package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/PlacementKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "-initializeplacement", "(Ll9/l;)Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "placement", "copy", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;Ll9/l;)Lgatewayprotocol/v1/InitializationResponseOuterClass$Placement;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlacementKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlacementKt.kt\ngatewayprotocol/v1/PlacementKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes4.dex */
public final class PlacementKtKt {
    @JvmName(name = "-initializeplacement")
    @NotNull
    /* renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m432initializeplacement(@NotNull l block) {
        p.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.Placement copy(@NotNull InitializationResponseOuterClass.Placement placement, @NotNull l block) {
        p.e(placement, "<this>");
        p.e(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        p.d(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
