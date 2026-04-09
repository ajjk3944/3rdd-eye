.class public final enum Lqd/d$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lqd/d$b;

.field public static final enum DOWNLOAD:Lqd/d$b;

.field public static final enum DOWNLOAD_SETUP:Lqd/d$b;

.field public static final enum END:Lqd/d$b;

.field public static final enum EVALUATION:Lqd/d$b;

.field public static final enum RESULT_REPORT:Lqd/d$b;

.field public static final enum RESULT_SAVE:Lqd/d$b;

.field public static final enum RESULT_UPDATE_WITH_REPORT:Lqd/d$b;

.field public static final enum UPLOAD:Lqd/d$b;

.field public static final enum UPLOAD_SETUP:Lqd/d$b;


# direct methods
.method private static final synthetic $values()[Lqd/d$b;
    .locals 9

    sget-object v0, Lqd/d$b;->EVALUATION:Lqd/d$b;

    sget-object v1, Lqd/d$b;->DOWNLOAD_SETUP:Lqd/d$b;

    sget-object v2, Lqd/d$b;->DOWNLOAD:Lqd/d$b;

    sget-object v3, Lqd/d$b;->UPLOAD_SETUP:Lqd/d$b;

    sget-object v4, Lqd/d$b;->UPLOAD:Lqd/d$b;

    sget-object v5, Lqd/d$b;->RESULT_SAVE:Lqd/d$b;

    sget-object v6, Lqd/d$b;->RESULT_REPORT:Lqd/d$b;

    sget-object v7, Lqd/d$b;->RESULT_UPDATE_WITH_REPORT:Lqd/d$b;

    sget-object v8, Lqd/d$b;->END:Lqd/d$b;

    filled-new-array/range {v0 .. v8}, [Lqd/d$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqd/d$b;

    const-string v1, "EVALUATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->EVALUATION:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "DOWNLOAD_SETUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->DOWNLOAD_SETUP:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->DOWNLOAD:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "UPLOAD_SETUP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->UPLOAD_SETUP:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "UPLOAD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->UPLOAD:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "RESULT_SAVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->RESULT_SAVE:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "RESULT_REPORT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->RESULT_REPORT:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "RESULT_UPDATE_WITH_REPORT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->RESULT_UPDATE_WITH_REPORT:Lqd/d$b;

    new-instance v0, Lqd/d$b;

    const-string v1, "END"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lqd/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/d$b;->END:Lqd/d$b;

    invoke-static {}, Lqd/d$b;->$values()[Lqd/d$b;

    move-result-object v0

    sput-object v0, Lqd/d$b;->$VALUES:[Lqd/d$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lqd/d$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lqd/d$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/d$b;
    .locals 1

    const-class v0, Lqd/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/d$b;

    return-object p0
.end method

.method public static values()[Lqd/d$b;
    .locals 1

    sget-object v0, Lqd/d$b;->$VALUES:[Lqd/d$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/d$b;

    return-object v0
.end method
