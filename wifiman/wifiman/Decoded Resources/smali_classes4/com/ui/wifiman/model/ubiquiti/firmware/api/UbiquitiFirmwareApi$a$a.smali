.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;
.super Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;)V
    .locals 2

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$a$a;->a:Ljava/lang/String;

    return-object v0
.end method
