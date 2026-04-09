.class public final enum LKi/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LKi/a;

.field public static final enum DROP_LATEST:LKi/a;

.field public static final enum DROP_OLDEST:LKi/a;

.field public static final enum SUSPEND:LKi/a;


# direct methods
.method private static final synthetic $values()[LKi/a;
    .locals 3

    sget-object v0, LKi/a;->SUSPEND:LKi/a;

    sget-object v1, LKi/a;->DROP_OLDEST:LKi/a;

    sget-object v2, LKi/a;->DROP_LATEST:LKi/a;

    filled-new-array {v0, v1, v2}, [LKi/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LKi/a;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LKi/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKi/a;->SUSPEND:LKi/a;

    new-instance v0, LKi/a;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LKi/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKi/a;->DROP_OLDEST:LKi/a;

    new-instance v0, LKi/a;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LKi/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LKi/a;->DROP_LATEST:LKi/a;

    invoke-static {}, LKi/a;->$values()[LKi/a;

    move-result-object v0

    sput-object v0, LKi/a;->$VALUES:[LKi/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LKi/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LKi/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LKi/a;
    .locals 1

    const-class v0, LKi/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LKi/a;

    return-object p0
.end method

.method public static values()[LKi/a;
    .locals 1

    sget-object v0, LKi/a;->$VALUES:[LKi/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKi/a;

    return-object v0
.end method
