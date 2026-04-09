.class public final enum LT/Y;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LT/Y;

.field public static final enum DEFERRED:LT/Y;

.field public static final enum IGNORED:LT/Y;

.field public static final enum IMMINENT:LT/Y;

.field public static final enum SCHEDULED:LT/Y;


# direct methods
.method private static final synthetic $values()[LT/Y;
    .locals 4

    sget-object v0, LT/Y;->IGNORED:LT/Y;

    sget-object v1, LT/Y;->SCHEDULED:LT/Y;

    sget-object v2, LT/Y;->DEFERRED:LT/Y;

    sget-object v3, LT/Y;->IMMINENT:LT/Y;

    filled-new-array {v0, v1, v2, v3}, [LT/Y;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT/Y;

    const-string v1, "IGNORED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LT/Y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/Y;->IGNORED:LT/Y;

    new-instance v0, LT/Y;

    const-string v1, "SCHEDULED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LT/Y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/Y;->SCHEDULED:LT/Y;

    new-instance v0, LT/Y;

    const-string v1, "DEFERRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LT/Y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/Y;->DEFERRED:LT/Y;

    new-instance v0, LT/Y;

    const-string v1, "IMMINENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LT/Y;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT/Y;->IMMINENT:LT/Y;

    invoke-static {}, LT/Y;->$values()[LT/Y;

    move-result-object v0

    sput-object v0, LT/Y;->$VALUES:[LT/Y;

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

.method public static valueOf(Ljava/lang/String;)LT/Y;
    .locals 1

    const-class v0, LT/Y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT/Y;

    return-object p0
.end method

.method public static values()[LT/Y;
    .locals 1

    sget-object v0, LT/Y;->$VALUES:[LT/Y;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT/Y;

    return-object v0
.end method
