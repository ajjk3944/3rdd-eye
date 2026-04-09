.class public final enum Lni/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lni/r;

.field public static final enum STABLE:Lni/r;

.field public static final enum UNSTABLE:Lni/r;


# direct methods
.method private static final synthetic $values()[Lni/r;
    .locals 2

    sget-object v0, Lni/r;->STABLE:Lni/r;

    sget-object v1, Lni/r;->UNSTABLE:Lni/r;

    filled-new-array {v0, v1}, [Lni/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lni/r;

    const-string v1, "STABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lni/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lni/r;->STABLE:Lni/r;

    new-instance v0, Lni/r;

    const-string v1, "UNSTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lni/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lni/r;->UNSTABLE:Lni/r;

    invoke-static {}, Lni/r;->$values()[Lni/r;

    move-result-object v0

    sput-object v0, Lni/r;->$VALUES:[Lni/r;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lni/r;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Lni/r;
    .locals 1

    const-class v0, Lni/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lni/r;

    return-object p0
.end method

.method public static values()[Lni/r;
    .locals 1

    sget-object v0, Lni/r;->$VALUES:[Lni/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lni/r;

    return-object v0
.end method
