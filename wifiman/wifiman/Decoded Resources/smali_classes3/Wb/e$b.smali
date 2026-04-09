.class public final enum LWb/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LWb/e$b;

.field public static final enum LATENCY:LWb/e$b;

.field public static final enum SIGNAL:LWb/e$b;

.field public static final enum THROUGHPUT:LWb/e$b;


# direct methods
.method private static final synthetic $values()[LWb/e$b;
    .locals 3

    sget-object v0, LWb/e$b;->SIGNAL:LWb/e$b;

    sget-object v1, LWb/e$b;->THROUGHPUT:LWb/e$b;

    sget-object v2, LWb/e$b;->LATENCY:LWb/e$b;

    filled-new-array {v0, v1, v2}, [LWb/e$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LWb/e$b;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWb/e$b;->SIGNAL:LWb/e$b;

    new-instance v0, LWb/e$b;

    const-string/jumbo v1, "THROUGHPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWb/e$b;->THROUGHPUT:LWb/e$b;

    new-instance v0, LWb/e$b;

    const-string/jumbo v1, "LATENCY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LWb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWb/e$b;->LATENCY:LWb/e$b;

    invoke-static {}, LWb/e$b;->$values()[LWb/e$b;

    move-result-object v0

    sput-object v0, LWb/e$b;->$VALUES:[LWb/e$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LWb/e$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LWb/e$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWb/e$b;
    .locals 1

    const-class v0, LWb/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWb/e$b;

    return-object p0
.end method

.method public static values()[LWb/e$b;
    .locals 1

    sget-object v0, LWb/e$b;->$VALUES:[LWb/e$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWb/e$b;

    return-object v0
.end method
