.class public final enum LRh/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LRh/i;

.field public static final enum MUTABLE:LRh/i;

.field public static final enum READ_ONLY:LRh/i;


# direct methods
.method private static final synthetic $values()[LRh/i;
    .locals 2

    sget-object v0, LRh/i;->READ_ONLY:LRh/i;

    sget-object v1, LRh/i;->MUTABLE:LRh/i;

    filled-new-array {v0, v1}, [LRh/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LRh/i;

    const-string v1, "READ_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRh/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/i;->READ_ONLY:LRh/i;

    new-instance v0, LRh/i;

    const-string v1, "MUTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRh/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/i;->MUTABLE:LRh/i;

    invoke-static {}, LRh/i;->$values()[LRh/i;

    move-result-object v0

    sput-object v0, LRh/i;->$VALUES:[LRh/i;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LRh/i;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LRh/i;
    .locals 1

    const-class v0, LRh/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRh/i;

    return-object p0
.end method

.method public static values()[LRh/i;
    .locals 1

    sget-object v0, LRh/i;->$VALUES:[LRh/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRh/i;

    return-object v0
.end method
