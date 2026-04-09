.class public final enum Lgc/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lgc/b;

.field public static final enum LATENCY:Lgc/b;

.field public static final enum SIGNAL:Lgc/b;

.field public static final enum THROUGHPUT:Lgc/b;


# direct methods
.method private static final synthetic $values()[Lgc/b;
    .locals 3

    sget-object v0, Lgc/b;->SIGNAL:Lgc/b;

    sget-object v1, Lgc/b;->THROUGHPUT:Lgc/b;

    sget-object v2, Lgc/b;->LATENCY:Lgc/b;

    filled-new-array {v0, v1, v2}, [Lgc/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgc/b;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgc/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc/b;->SIGNAL:Lgc/b;

    new-instance v0, Lgc/b;

    const-string/jumbo v1, "THROUGHPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgc/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc/b;->THROUGHPUT:Lgc/b;

    new-instance v0, Lgc/b;

    const-string/jumbo v1, "LATENCY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgc/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgc/b;->LATENCY:Lgc/b;

    invoke-static {}, Lgc/b;->$values()[Lgc/b;

    move-result-object v0

    sput-object v0, Lgc/b;->$VALUES:[Lgc/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lgc/b;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lgc/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgc/b;
    .locals 1

    const-class v0, Lgc/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgc/b;

    return-object p0
.end method

.method public static values()[Lgc/b;
    .locals 1

    sget-object v0, Lgc/b;->$VALUES:[Lgc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgc/b;

    return-object v0
.end method
