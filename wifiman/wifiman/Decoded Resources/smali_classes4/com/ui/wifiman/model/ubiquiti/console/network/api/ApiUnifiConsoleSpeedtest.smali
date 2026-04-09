.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleRequestCmd;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleRequestCmd;

    const-string v1, "speedtest"

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleRequestCmd;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
