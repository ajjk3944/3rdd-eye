.class public final enum LT7/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LT7/b;

.field public static final enum DARK:LT7/b;

.field public static final enum LIGHT:LT7/b;

.field public static final enum SYSTEM:LT7/b;


# direct methods
.method private static final synthetic $values()[LT7/b;
    .locals 3

    sget-object v0, LT7/b;->LIGHT:LT7/b;

    sget-object v1, LT7/b;->DARK:LT7/b;

    sget-object v2, LT7/b;->SYSTEM:LT7/b;

    filled-new-array {v0, v1, v2}, [LT7/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LT7/b;

    const-string/jumbo v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LT7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT7/b;->LIGHT:LT7/b;

    new-instance v0, LT7/b;

    const-string v1, "DARK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LT7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT7/b;->DARK:LT7/b;

    new-instance v0, LT7/b;

    const-string/jumbo v1, "SYSTEM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LT7/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LT7/b;->SYSTEM:LT7/b;

    invoke-static {}, LT7/b;->$values()[LT7/b;

    move-result-object v0

    sput-object v0, LT7/b;->$VALUES:[LT7/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LT7/b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LT7/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LT7/b;
    .locals 1

    const-class v0, LT7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LT7/b;

    return-object p0
.end method

.method public static values()[LT7/b;
    .locals 1

    sget-object v0, LT7/b;->$VALUES:[LT7/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT7/b;

    return-object v0
.end method
