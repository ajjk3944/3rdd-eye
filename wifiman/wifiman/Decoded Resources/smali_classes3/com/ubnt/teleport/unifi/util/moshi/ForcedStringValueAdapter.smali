.class public final Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValueAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValueAdapter;",
        "",
        "<init>",
        "()V",
        "LY6/o;",
        "writer",
        "",
        "string",
        "LYg/J;",
        "toJson",
        "(LY6/o;Ljava/lang/String;)V",
        "LY6/k;",
        "reader",
        "LY6/h;",
        "delegate",
        "fromJson",
        "(LY6/k;LY6/h;)Ljava/lang/String;",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(LY6/k;LY6/h;)Ljava/lang/String;
    .locals 1
    .annotation runtime LY6/f;
    .end annotation

    .annotation runtime Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY6/k;",
            "LY6/h<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string/jumbo v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY6/k;->o0()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "delegate.toJson(data)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toJson(LY6/o;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValue;
        .end annotation
    .end param
    .annotation runtime LY6/u;
    .end annotation

    const-string/jumbo v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-virtual {v0, p2}, Lej/e;->S0(Ljava/lang/String;)Lej/e;

    move-result-object p2

    invoke-virtual {p1, p2}, LY6/o;->p0(Lej/g;)LY6/o;

    return-void
.end method
