.class public final enum LRh/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LRh/k;

.field public static final enum FORCE_FLEXIBILITY:LRh/k;

.field public static final enum NOT_NULL:LRh/k;

.field public static final enum NULLABLE:LRh/k;


# direct methods
.method private static final synthetic $values()[LRh/k;
    .locals 3

    sget-object v0, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    sget-object v1, LRh/k;->NULLABLE:LRh/k;

    sget-object v2, LRh/k;->NOT_NULL:LRh/k;

    filled-new-array {v0, v1, v2}, [LRh/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LRh/k;

    const-string v1, "FORCE_FLEXIBILITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LRh/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    new-instance v0, LRh/k;

    const-string v1, "NULLABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LRh/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/k;->NULLABLE:LRh/k;

    new-instance v0, LRh/k;

    const-string v1, "NOT_NULL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LRh/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, LRh/k;->NOT_NULL:LRh/k;

    invoke-static {}, LRh/k;->$values()[LRh/k;

    move-result-object v0

    sput-object v0, LRh/k;->$VALUES:[LRh/k;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LRh/k;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LRh/k;
    .locals 1

    const-class v0, LRh/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LRh/k;

    return-object p0
.end method

.method public static values()[LRh/k;
    .locals 1

    sget-object v0, LRh/k;->$VALUES:[LRh/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRh/k;

    return-object v0
.end method
