.class public final enum Lcom/ui/wifiman/model/speedtest/Speedtest$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum RESULT_PROCESSING:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum SETUP:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

.field public static final enum UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/speedtest/Speedtest$e;
    .locals 8

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->SETUP:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v1, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v2, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v3, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v4, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v5, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v6, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->RESULT_PROCESSING:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    sget-object v7, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    filled-new-array/range {v0 .. v7}, [Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "SETUP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->SETUP:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "LATENCY_CHECK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->LATENCY_CHECK:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "DOWNLOAD_INIT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->DOWNLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "UPLOAD_INIT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD_INIT:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "UPLOAD"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->UPLOAD:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "RESULT_PROCESSING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->RESULT_PROCESSING:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    const-string v1, "END"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->END:Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    invoke-static {}, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->$values()[Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->$VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/speedtest/Speedtest$e;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/speedtest/Speedtest$e;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/Speedtest$e;->$VALUES:[Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    return-object v0
.end method
