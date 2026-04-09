package gatewayprotocol.v1;

import gatewayprotocol.v1.HeaderBiddingAdMarkupKt;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import l9.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\b\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupKt$Dsl;", "Ly8/s;", "Lkotlin/ExtensionFunctionType;", "block", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "-initializeheaderBiddingAdMarkup", "(Ll9/l;)Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "headerBiddingAdMarkup", "copy", "(Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Ll9/l;)Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeaderBiddingAdMarkupKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderBiddingAdMarkupKt.kt\ngatewayprotocol/v1/HeaderBiddingAdMarkupKtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes4.dex */
public final class HeaderBiddingAdMarkupKtKt {
    @JvmName(name = "-initializeheaderBiddingAdMarkup")
    @NotNull
    /* renamed from: -initializeheaderBiddingAdMarkup, reason: not valid java name */
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup m417initializeheaderBiddingAdMarkup(@NotNull l block) {
        p.e(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.INSTANCE;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builderNewBuilder = HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder();
        p.d(builderNewBuilder, "newBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(@NotNull HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, @NotNull l block) {
        p.e(headerBiddingAdMarkup, "<this>");
        p.e(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.INSTANCE;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder = headerBiddingAdMarkup.toBuilder();
        p.d(builder, "this.toBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
