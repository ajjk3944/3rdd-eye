.class public final Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;
.super Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unknown"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;",
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;",
        "",
        "a",
        "Ljava/lang/Throwable;",
        "getCause",
        "()Ljava/lang/Throwable;",
        "cause",
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
.field private final a:Ljava/lang/Throwable;


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;->a:Ljava/lang/Throwable;

    return-object v0
.end method
