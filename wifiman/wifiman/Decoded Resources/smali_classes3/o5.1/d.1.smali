.class public final enum Lo5/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# static fields
.field private static final synthetic $VALUES:[Lo5/d;

.field public static final enum COLLECTION_DISABLED:Lo5/d;

.field public static final enum COLLECTION_DISABLED_REMOTE:Lo5/d;

.field public static final enum COLLECTION_ENABLED:Lo5/d;

.field public static final enum COLLECTION_SAMPLED:Lo5/d;

.field public static final enum COLLECTION_SDK_NOT_INSTALLED:Lo5/d;

.field public static final enum COLLECTION_UNKNOWN:Lo5/d;


# instance fields
.field private final number:I


# direct methods
.method private static final synthetic $values()[Lo5/d;
    .locals 6

    sget-object v0, Lo5/d;->COLLECTION_UNKNOWN:Lo5/d;

    sget-object v1, Lo5/d;->COLLECTION_SDK_NOT_INSTALLED:Lo5/d;

    sget-object v2, Lo5/d;->COLLECTION_ENABLED:Lo5/d;

    sget-object v3, Lo5/d;->COLLECTION_DISABLED:Lo5/d;

    sget-object v4, Lo5/d;->COLLECTION_DISABLED_REMOTE:Lo5/d;

    sget-object v5, Lo5/d;->COLLECTION_SAMPLED:Lo5/d;

    filled-new-array/range {v0 .. v5}, [Lo5/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_UNKNOWN:Lo5/d;

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_SDK_NOT_INSTALLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_SDK_NOT_INSTALLED:Lo5/d;

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_ENABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_ENABLED:Lo5/d;

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_DISABLED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_DISABLED:Lo5/d;

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_DISABLED_REMOTE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_DISABLED_REMOTE:Lo5/d;

    new-instance v0, Lo5/d;

    const-string v1, "COLLECTION_SAMPLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lo5/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo5/d;->COLLECTION_SAMPLED:Lo5/d;

    invoke-static {}, Lo5/d;->$values()[Lo5/d;

    move-result-object v0

    sput-object v0, Lo5/d;->$VALUES:[Lo5/d;

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

    iput p3, p0, Lo5/d;->number:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo5/d;
    .locals 1

    const-class v0, Lo5/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo5/d;

    return-object p0
.end method

.method public static values()[Lo5/d;
    .locals 1

    sget-object v0, Lo5/d;->$VALUES:[Lo5/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo5/d;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lo5/d;->number:I

    return v0
.end method
