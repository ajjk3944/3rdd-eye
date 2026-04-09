.class public final enum LOh/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LOh/c;

.field public static final enum FLEXIBLE_LOWER_BOUND:LOh/c;

.field public static final enum FLEXIBLE_UPPER_BOUND:LOh/c;

.field public static final enum INFLEXIBLE:LOh/c;


# direct methods
.method private static final synthetic $values()[LOh/c;
    .locals 3

    sget-object v0, LOh/c;->INFLEXIBLE:LOh/c;

    sget-object v1, LOh/c;->FLEXIBLE_UPPER_BOUND:LOh/c;

    sget-object v2, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    filled-new-array {v0, v1, v2}, [LOh/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LOh/c;

    const-string v1, "INFLEXIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LOh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOh/c;->INFLEXIBLE:LOh/c;

    new-instance v0, LOh/c;

    const-string v1, "FLEXIBLE_UPPER_BOUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LOh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOh/c;->FLEXIBLE_UPPER_BOUND:LOh/c;

    new-instance v0, LOh/c;

    const-string v1, "FLEXIBLE_LOWER_BOUND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LOh/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    invoke-static {}, LOh/c;->$values()[LOh/c;

    move-result-object v0

    sput-object v0, LOh/c;->$VALUES:[LOh/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LOh/c;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LOh/c;
    .locals 1

    const-class v0, LOh/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LOh/c;

    return-object p0
.end method

.method public static values()[LOh/c;
    .locals 1

    sget-object v0, LOh/c;->$VALUES:[LOh/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOh/c;

    return-object v0
.end method
