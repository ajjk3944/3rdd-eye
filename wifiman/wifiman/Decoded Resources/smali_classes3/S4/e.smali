.class final enum LS4/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LS4/e;

.field public static final enum IGNORE_CACHE_EXPIRATION:LS4/e;

.field public static final enum SKIP_CACHE_LOOKUP:LS4/e;

.field public static final enum USE_CACHE:LS4/e;


# direct methods
.method private static synthetic $values()[LS4/e;
    .locals 3

    sget-object v0, LS4/e;->USE_CACHE:LS4/e;

    sget-object v1, LS4/e;->SKIP_CACHE_LOOKUP:LS4/e;

    sget-object v2, LS4/e;->IGNORE_CACHE_EXPIRATION:LS4/e;

    filled-new-array {v0, v1, v2}, [LS4/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS4/e;

    const-string/jumbo v1, "USE_CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LS4/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS4/e;->USE_CACHE:LS4/e;

    new-instance v0, LS4/e;

    const-string/jumbo v1, "SKIP_CACHE_LOOKUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LS4/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS4/e;->SKIP_CACHE_LOOKUP:LS4/e;

    new-instance v0, LS4/e;

    const-string/jumbo v1, "IGNORE_CACHE_EXPIRATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LS4/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LS4/e;->IGNORE_CACHE_EXPIRATION:LS4/e;

    invoke-static {}, LS4/e;->$values()[LS4/e;

    move-result-object v0

    sput-object v0, LS4/e;->$VALUES:[LS4/e;

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

.method public static valueOf(Ljava/lang/String;)LS4/e;
    .locals 1

    const-class v0, LS4/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS4/e;

    return-object p0
.end method

.method public static values()[LS4/e;
    .locals 1

    sget-object v0, LS4/e;->$VALUES:[LS4/e;

    invoke-virtual {v0}, [LS4/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS4/e;

    return-object v0
.end method
