.class public final Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;
.super Lcom/ui/comm/v4/UiCommV4Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/UiCommV4Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BinmeSerialization"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u0008\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;",
        "Lcom/ui/comm/v4/UiCommV4Error;",
        "",
        "message",
        "Lcom/ui/binme/BinaryMessage$Error;",
        "cause",
        "<init>",
        "(Ljava/lang/String;Lcom/ui/binme/BinaryMessage$Error;)V",
        "a",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "b",
        "Lcom/ui/binme/BinaryMessage$Error;",
        "()Lcom/ui/binme/BinaryMessage$Error;",
        "ui-communication-v4_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/binme/BinaryMessage$Error;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/binme/BinaryMessage$Error;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/UiCommV4Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;->b:Lcom/ui/binme/BinaryMessage$Error;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/binme/BinaryMessage$Error;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;->b:Lcom/ui/binme/BinaryMessage$Error;

    return-object v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;->a()Lcom/ui/binme/BinaryMessage$Error;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Error$BinmeSerialization;->a:Ljava/lang/String;

    return-object v0
.end method
