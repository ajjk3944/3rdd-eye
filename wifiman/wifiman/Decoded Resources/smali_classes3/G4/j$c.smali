.class final enum LG4/j$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LG4/j$c;

.field public static final enum IDLE:LG4/j$c;

.field public static final enum QUEUED:LG4/j$c;

.field public static final enum QUEUING:LG4/j$c;

.field public static final enum RUNNING:LG4/j$c;


# direct methods
.method private static synthetic $values()[LG4/j$c;
    .locals 4

    sget-object v0, LG4/j$c;->IDLE:LG4/j$c;

    sget-object v1, LG4/j$c;->QUEUING:LG4/j$c;

    sget-object v2, LG4/j$c;->QUEUED:LG4/j$c;

    sget-object v3, LG4/j$c;->RUNNING:LG4/j$c;

    filled-new-array {v0, v1, v2, v3}, [LG4/j$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LG4/j$c;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG4/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG4/j$c;->IDLE:LG4/j$c;

    new-instance v0, LG4/j$c;

    const-string/jumbo v1, "QUEUING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LG4/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG4/j$c;->QUEUING:LG4/j$c;

    new-instance v0, LG4/j$c;

    const-string/jumbo v1, "QUEUED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LG4/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG4/j$c;->QUEUED:LG4/j$c;

    new-instance v0, LG4/j$c;

    const-string/jumbo v1, "RUNNING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LG4/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG4/j$c;->RUNNING:LG4/j$c;

    invoke-static {}, LG4/j$c;->$values()[LG4/j$c;

    move-result-object v0

    sput-object v0, LG4/j$c;->$VALUES:[LG4/j$c;

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

.method public static valueOf(Ljava/lang/String;)LG4/j$c;
    .locals 1

    const-class v0, LG4/j$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LG4/j$c;

    return-object p0
.end method

.method public static values()[LG4/j$c;
    .locals 1

    sget-object v0, LG4/j$c;->$VALUES:[LG4/j$c;

    invoke-virtual {v0}, [LG4/j$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LG4/j$c;

    return-object v0
.end method
