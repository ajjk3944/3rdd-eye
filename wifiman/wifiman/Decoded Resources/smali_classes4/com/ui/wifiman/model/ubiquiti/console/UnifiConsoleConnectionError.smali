.class public abstract Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00052\u00060\u0001j\u0002`\u0002:\u0005\u0006\u0007\u0008\t\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "<init>",
        "()V",
        "a",
        "IO",
        "RequestFailed",
        "Unauthorized",
        "UntrustedCertificate",
        "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$IO;",
        "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;",
        "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;",
        "Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;",
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
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;-><init>()V

    return-void
.end method
