.class public final Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/wifi/WifiMcs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InvalidWifiMcs"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;",
        "Ljava/lang/IllegalArgumentException;",
        "Lkotlin/IllegalArgumentException;",
        "Lcom/ubnt/usurvey/wifi/WifiMcs$c;",
        "modulation",
        "Lcom/ubnt/usurvey/wifi/WifiMcs$a;",
        "coding",
        "<init>",
        "(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V",
        "a",
        "Lcom/ubnt/usurvey/wifi/WifiMcs$c;",
        "b",
        "Lcom/ubnt/usurvey/wifi/WifiMcs$a;",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "common-domain_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field private final b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;


# direct methods
.method public constructor <init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V
    .locals 1

    const-string/jumbo v0, "modulation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "coding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    iput-object p2, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    iget-object v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Invalid MCS "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " combination"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
