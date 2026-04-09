.class public abstract Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;
.super Ljava/lang/RuntimeException;
.source "SourceFile"

# interfaces
.implements LWc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;,
        Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;,
        Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "LWc/d;",
        "<init>",
        "()V",
        "HostAlreadyAdded",
        "HostNotFound",
        "Unknown",
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostAlreadyAdded;",
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$HostNotFound;",
        "Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error$Unknown;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager$Error;-><init>()V

    return-void
.end method
