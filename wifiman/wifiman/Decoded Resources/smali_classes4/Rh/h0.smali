.class public final enum LRh/h0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LRh/h0;

.field public static final enum FLEXIBLE_LOWER:LRh/h0;

.field public static final enum FLEXIBLE_UPPER:LRh/h0;

.field public static final enum INFLEXIBLE:LRh/h0;


# direct methods
.method private static final synthetic $values()[LRh/h0;
    .locals 3

    sget-object v0, LRh/h0;->FLEXIBLE_LOWER:LRh/h0;

    sget-object v1, LRh/h0;->FLEXIBLE_UPPER:LRh/h0;

    sget-object v2, LRh/h0;->INFLEXIBLE:LRh/h0;

    filled-new-array {v0, v1, v2}, [LRh/h0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LRh/h0;

    const-string v1, "FLEXIBLE_LOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRh/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/h0;->FLEXIBLE_LOWER:LRh/h0;

    new-instance v0, LRh/h0;

    const-string v1, "FLEXIBLE_UPPER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRh/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/h0;->FLEXIBLE_UPPER:LRh/h0;

    new-instance v0, LRh/h0;

    const-string v1, "INFLEXIBLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LRh/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/h0;->INFLEXIBLE:LRh/h0;

    invoke-static {}, LRh/h0;->$values()[LRh/h0;

    move-result-object v0

    sput-object v0, LRh/h0;->$VALUES:[LRh/h0;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LRh/h0;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LRh/h0;
    .locals 1

    const-class v0, LRh/h0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRh/h0;

    return-object p0
.end method

.method public static values()[LRh/h0;
    .locals 1

    sget-object v0, LRh/h0;->$VALUES:[LRh/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRh/h0;

    return-object v0
.end method
