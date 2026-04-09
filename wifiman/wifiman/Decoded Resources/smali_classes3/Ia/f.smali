.class public final enum LIa/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LIa/f;

.field public static final enum FINISHED:LIa/f;

.field public static final enum IDLE:LIa/f;

.field public static final enum LATENCY_CHECK:LIa/f;

.field public static final enum SERVER_FETCH:LIa/f;


# direct methods
.method private static final synthetic $values()[LIa/f;
    .locals 4

    sget-object v0, LIa/f;->IDLE:LIa/f;

    sget-object v1, LIa/f;->SERVER_FETCH:LIa/f;

    sget-object v2, LIa/f;->LATENCY_CHECK:LIa/f;

    sget-object v3, LIa/f;->FINISHED:LIa/f;

    filled-new-array {v0, v1, v2, v3}, [LIa/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LIa/f;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIa/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIa/f;->IDLE:LIa/f;

    new-instance v0, LIa/f;

    const-string/jumbo v1, "SERVER_FETCH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIa/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIa/f;->SERVER_FETCH:LIa/f;

    new-instance v0, LIa/f;

    const-string/jumbo v1, "LATENCY_CHECK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LIa/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIa/f;->LATENCY_CHECK:LIa/f;

    new-instance v0, LIa/f;

    const-string/jumbo v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LIa/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIa/f;->FINISHED:LIa/f;

    invoke-static {}, LIa/f;->$values()[LIa/f;

    move-result-object v0

    sput-object v0, LIa/f;->$VALUES:[LIa/f;

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

.method public static valueOf(Ljava/lang/String;)LIa/f;
    .locals 1

    const-class v0, LIa/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIa/f;

    return-object p0
.end method

.method public static values()[LIa/f;
    .locals 1

    sget-object v0, LIa/f;->$VALUES:[LIa/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIa/f;

    return-object v0
.end method
