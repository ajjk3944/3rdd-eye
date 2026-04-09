.class public final Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;
.super Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConnectionTimedOut"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;",
        "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;",
        "",
        "millis",
        "<init>",
        "(J)V",
        "",
        "a",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device timed out since no response come in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;->a:Ljava/lang/String;

    return-object v0
.end method
