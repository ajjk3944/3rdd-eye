.class public final enum LCd/n$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCd/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LCd/n$b;

.field public static final enum DOWNLOAD:LCd/n$b;

.field public static final enum DOWNLOAD_SETUP:LCd/n$b;

.field public static final enum END:LCd/n$b;

.field public static final enum EVALUATION:LCd/n$b;

.field public static final enum RESULT_REPORT:LCd/n$b;

.field public static final enum RESULT_SAVE:LCd/n$b;

.field public static final enum RESULT_UPDATE_WITH_REPORT:LCd/n$b;

.field public static final enum UPLOAD:LCd/n$b;

.field public static final enum UPLOAD_SETUP:LCd/n$b;


# direct methods
.method private static final synthetic $values()[LCd/n$b;
    .locals 9

    sget-object v0, LCd/n$b;->EVALUATION:LCd/n$b;

    sget-object v1, LCd/n$b;->DOWNLOAD_SETUP:LCd/n$b;

    sget-object v2, LCd/n$b;->DOWNLOAD:LCd/n$b;

    sget-object v3, LCd/n$b;->UPLOAD_SETUP:LCd/n$b;

    sget-object v4, LCd/n$b;->UPLOAD:LCd/n$b;

    sget-object v5, LCd/n$b;->RESULT_SAVE:LCd/n$b;

    sget-object v6, LCd/n$b;->RESULT_REPORT:LCd/n$b;

    sget-object v7, LCd/n$b;->RESULT_UPDATE_WITH_REPORT:LCd/n$b;

    sget-object v8, LCd/n$b;->END:LCd/n$b;

    filled-new-array/range {v0 .. v8}, [LCd/n$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LCd/n$b;

    const-string v1, "EVALUATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->EVALUATION:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "DOWNLOAD_SETUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->DOWNLOAD_SETUP:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->DOWNLOAD:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "UPLOAD_SETUP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->UPLOAD_SETUP:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "UPLOAD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->UPLOAD:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "RESULT_SAVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->RESULT_SAVE:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "RESULT_REPORT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->RESULT_REPORT:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "RESULT_UPDATE_WITH_REPORT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->RESULT_UPDATE_WITH_REPORT:LCd/n$b;

    new-instance v0, LCd/n$b;

    const-string v1, "END"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LCd/n$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LCd/n$b;->END:LCd/n$b;

    invoke-static {}, LCd/n$b;->$values()[LCd/n$b;

    move-result-object v0

    sput-object v0, LCd/n$b;->$VALUES:[LCd/n$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LCd/n$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LCd/n$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LCd/n$b;
    .locals 1

    const-class v0, LCd/n$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LCd/n$b;

    return-object p0
.end method

.method public static values()[LCd/n$b;
    .locals 1

    sget-object v0, LCd/n$b;->$VALUES:[LCd/n$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCd/n$b;

    return-object v0
.end method
