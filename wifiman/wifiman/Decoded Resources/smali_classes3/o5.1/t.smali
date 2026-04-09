.class public final enum Lo5/t;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# static fields
.field private static final synthetic $VALUES:[Lo5/t;

.field public static final enum LOG_ENVIRONMENT_AUTOPUSH:Lo5/t;

.field public static final enum LOG_ENVIRONMENT_PROD:Lo5/t;

.field public static final enum LOG_ENVIRONMENT_STAGING:Lo5/t;

.field public static final enum LOG_ENVIRONMENT_UNKNOWN:Lo5/t;


# instance fields
.field private final number:I


# direct methods
.method private static final synthetic $values()[Lo5/t;
    .locals 4

    sget-object v0, Lo5/t;->LOG_ENVIRONMENT_UNKNOWN:Lo5/t;

    sget-object v1, Lo5/t;->LOG_ENVIRONMENT_AUTOPUSH:Lo5/t;

    sget-object v2, Lo5/t;->LOG_ENVIRONMENT_STAGING:Lo5/t;

    sget-object v3, Lo5/t;->LOG_ENVIRONMENT_PROD:Lo5/t;

    filled-new-array {v0, v1, v2, v3}, [Lo5/t;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo5/t;

    const-string/jumbo v1, "LOG_ENVIRONMENT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/t;->LOG_ENVIRONMENT_UNKNOWN:Lo5/t;

    new-instance v0, Lo5/t;

    const-string/jumbo v1, "LOG_ENVIRONMENT_AUTOPUSH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lo5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/t;->LOG_ENVIRONMENT_AUTOPUSH:Lo5/t;

    new-instance v0, Lo5/t;

    const-string/jumbo v1, "LOG_ENVIRONMENT_STAGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lo5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/t;->LOG_ENVIRONMENT_STAGING:Lo5/t;

    new-instance v0, Lo5/t;

    const-string/jumbo v1, "LOG_ENVIRONMENT_PROD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lo5/t;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/t;->LOG_ENVIRONMENT_PROD:Lo5/t;

    invoke-static {}, Lo5/t;->$values()[Lo5/t;

    move-result-object v0

    sput-object v0, Lo5/t;->$VALUES:[Lo5/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lo5/t;->number:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo5/t;
    .locals 1

    const-class v0, Lo5/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo5/t;

    return-object p0
.end method

.method public static values()[Lo5/t;
    .locals 1

    sget-object v0, Lo5/t;->$VALUES:[Lo5/t;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo5/t;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lo5/t;->number:I

    return v0
.end method
