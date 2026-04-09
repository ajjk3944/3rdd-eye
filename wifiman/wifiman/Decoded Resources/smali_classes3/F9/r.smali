.class public final enum LF9/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LF9/r;

.field public static final enum BLUE:LF9/r;

.field public static final enum DEFAULT:LF9/r;

.field public static final enum DEFAULT_WITH_BLUE_ICON:LF9/r;

.field public static final enum RED:LF9/r;


# direct methods
.method private static final synthetic $values()[LF9/r;
    .locals 4

    sget-object v0, LF9/r;->DEFAULT:LF9/r;

    sget-object v1, LF9/r;->DEFAULT_WITH_BLUE_ICON:LF9/r;

    sget-object v2, LF9/r;->BLUE:LF9/r;

    sget-object v3, LF9/r;->RED:LF9/r;

    filled-new-array {v0, v1, v2, v3}, [LF9/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF9/r;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF9/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF9/r;->DEFAULT:LF9/r;

    new-instance v0, LF9/r;

    const-string v1, "DEFAULT_WITH_BLUE_ICON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF9/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF9/r;->DEFAULT_WITH_BLUE_ICON:LF9/r;

    new-instance v0, LF9/r;

    const-string v1, "BLUE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LF9/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF9/r;->BLUE:LF9/r;

    new-instance v0, LF9/r;

    const-string/jumbo v1, "RED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LF9/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF9/r;->RED:LF9/r;

    invoke-static {}, LF9/r;->$values()[LF9/r;

    move-result-object v0

    sput-object v0, LF9/r;->$VALUES:[LF9/r;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LF9/r;->$ENTRIES:Lfh/a;

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

    sget-object v0, LF9/r;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF9/r;
    .locals 1

    const-class v0, LF9/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF9/r;

    return-object p0
.end method

.method public static values()[LF9/r;
    .locals 1

    sget-object v0, LF9/r;->$VALUES:[LF9/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF9/r;

    return-object v0
.end method
