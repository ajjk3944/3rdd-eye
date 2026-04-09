.class public final Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;
.super Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
.source "SourceFile"

# interfaces
.implements LWc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoMainConsole"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c6\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;",
        "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;",
        "LWc/d;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoMainConsole;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x6c55d39a

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NoMainConsole"

    return-object v0
.end method
