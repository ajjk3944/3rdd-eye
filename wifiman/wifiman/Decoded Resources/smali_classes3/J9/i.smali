.class public final enum LJ9/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LJ9/i;

.field public static final enum BLUE_BORDER_SELECTED_TAB:LJ9/i;

.field public static final enum BLUE_SELECTED_TAB:LJ9/i;

.field public static final enum DARK_BACKGROUND:LJ9/i;

.field public static final enum DEFAULT:LJ9/i;


# direct methods
.method private static final synthetic $values()[LJ9/i;
    .locals 4

    sget-object v0, LJ9/i;->DEFAULT:LJ9/i;

    sget-object v1, LJ9/i;->DARK_BACKGROUND:LJ9/i;

    sget-object v2, LJ9/i;->BLUE_SELECTED_TAB:LJ9/i;

    sget-object v3, LJ9/i;->BLUE_BORDER_SELECTED_TAB:LJ9/i;

    filled-new-array {v0, v1, v2, v3}, [LJ9/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJ9/i;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJ9/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ9/i;->DEFAULT:LJ9/i;

    new-instance v0, LJ9/i;

    const-string v1, "DARK_BACKGROUND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJ9/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ9/i;->DARK_BACKGROUND:LJ9/i;

    new-instance v0, LJ9/i;

    const-string v1, "BLUE_SELECTED_TAB"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LJ9/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ9/i;->BLUE_SELECTED_TAB:LJ9/i;

    new-instance v0, LJ9/i;

    const-string v1, "BLUE_BORDER_SELECTED_TAB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LJ9/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ9/i;->BLUE_BORDER_SELECTED_TAB:LJ9/i;

    invoke-static {}, LJ9/i;->$values()[LJ9/i;

    move-result-object v0

    sput-object v0, LJ9/i;->$VALUES:[LJ9/i;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LJ9/i;->$ENTRIES:Lfh/a;

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

    sget-object v0, LJ9/i;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LJ9/i;
    .locals 1

    const-class v0, LJ9/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJ9/i;

    return-object p0
.end method

.method public static values()[LJ9/i;
    .locals 1

    sget-object v0, LJ9/i;->$VALUES:[LJ9/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJ9/i;

    return-object v0
.end method
