.class public final enum LW7/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LW7/e;

.field public static final enum EXCELLENT:LW7/e;

.field public static final enum FAIR:LW7/e;

.field public static final enum GOOD:LW7/e;

.field public static final enum POOR:LW7/e;


# direct methods
.method private static final synthetic $values()[LW7/e;
    .locals 4

    sget-object v0, LW7/e;->POOR:LW7/e;

    sget-object v1, LW7/e;->FAIR:LW7/e;

    sget-object v2, LW7/e;->GOOD:LW7/e;

    sget-object v3, LW7/e;->EXCELLENT:LW7/e;

    filled-new-array {v0, v1, v2, v3}, [LW7/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW7/e;

    const-string/jumbo v1, "POOR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW7/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/e;->POOR:LW7/e;

    new-instance v0, LW7/e;

    const-string/jumbo v1, "FAIR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW7/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/e;->FAIR:LW7/e;

    new-instance v0, LW7/e;

    const-string/jumbo v1, "GOOD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LW7/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/e;->GOOD:LW7/e;

    new-instance v0, LW7/e;

    const-string/jumbo v1, "EXCELLENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LW7/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/e;->EXCELLENT:LW7/e;

    invoke-static {}, LW7/e;->$values()[LW7/e;

    move-result-object v0

    sput-object v0, LW7/e;->$VALUES:[LW7/e;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LW7/e;->$ENTRIES:Lfh/a;

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

    sget-object v0, LW7/e;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW7/e;
    .locals 1

    const-class v0, LW7/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW7/e;

    return-object p0
.end method

.method public static values()[LW7/e;
    .locals 1

    sget-object v0, LW7/e;->$VALUES:[LW7/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW7/e;

    return-object v0
.end method
