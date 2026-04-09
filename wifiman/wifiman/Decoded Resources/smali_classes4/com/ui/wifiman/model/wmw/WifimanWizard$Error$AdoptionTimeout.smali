.class public final Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;
.super Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AdoptionTimeout"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u00c6\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0006\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;",
        "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;",
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
        "b",
        "Ljava/lang/String;",
        "getMessage",
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;

    const-string v0, "Failed to adopt the device in expected time range"

    sput-object v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x26dd3b3d

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AdoptionTimeout"

    return-object v0
.end method
