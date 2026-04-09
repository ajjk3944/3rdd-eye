.class public final enum Lcom/ui/wifiman/model/speedtest/internet/f$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/internet/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum DOWNLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum DOWNLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum END:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum RESULT_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum RESULT_SAVE:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum RESULT_UPDATE_WITH_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum SERVER_EVALUATION:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum SERVER_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum SERVER_WAKEUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum TOKEN_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum UPLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

.field public static final enum UPLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/speedtest/internet/f$b;
    .locals 12

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->TOKEN_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v2, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_EVALUATION:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v3, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_WAKEUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v4, Lcom/ui/wifiman/model/speedtest/internet/f$b;->DOWNLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v5, Lcom/ui/wifiman/model/speedtest/internet/f$b;->DOWNLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v6, Lcom/ui/wifiman/model/speedtest/internet/f$b;->UPLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v7, Lcom/ui/wifiman/model/speedtest/internet/f$b;->UPLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v8, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_SAVE:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v9, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v10, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_UPDATE_WITH_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    sget-object v11, Lcom/ui/wifiman/model/speedtest/internet/f$b;->END:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    filled-new-array/range {v0 .. v11}, [Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "TOKEN_FETCH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->TOKEN_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "SERVER_FETCH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_FETCH:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "SERVER_EVALUATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_EVALUATION:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "SERVER_WAKEUP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->SERVER_WAKEUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "DOWNLOAD_INTERNET_SETUP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->DOWNLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "DOWNLOAD_INTERNET"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->DOWNLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "UPLOAD_INTERNET_SETUP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->UPLOAD_INTERNET_SETUP:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "UPLOAD_INTERNET"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->UPLOAD_INTERNET:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "RESULT_SAVE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_SAVE:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "RESULT_REPORT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "RESULT_UPDATE_WITH_REPORT"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->RESULT_UPDATE_WITH_REPORT:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    const-string v1, "END"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/speedtest/internet/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->END:Lcom/ui/wifiman/model/speedtest/internet/f$b;

    invoke-static {}, Lcom/ui/wifiman/model/speedtest/internet/f$b;->$values()[Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->$VALUES:[Lcom/ui/wifiman/model/speedtest/internet/f$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/speedtest/internet/f$b;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/speedtest/internet/f$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/speedtest/internet/f$b;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/internet/f$b;->$VALUES:[Lcom/ui/wifiman/model/speedtest/internet/f$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/speedtest/internet/f$b;

    return-object v0
.end method
