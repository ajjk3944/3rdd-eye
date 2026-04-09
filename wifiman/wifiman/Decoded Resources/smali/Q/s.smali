.class final enum LQ/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LQ/s;

.field public static final enum BottomBar:LQ/s;

.field public static final enum Fab:LQ/s;

.field public static final enum MainContent:LQ/s;

.field public static final enum Snackbar:LQ/s;

.field public static final enum TopBar:LQ/s;


# direct methods
.method private static final synthetic $values()[LQ/s;
    .locals 5

    sget-object v0, LQ/s;->TopBar:LQ/s;

    sget-object v1, LQ/s;->MainContent:LQ/s;

    sget-object v2, LQ/s;->Snackbar:LQ/s;

    sget-object v3, LQ/s;->Fab:LQ/s;

    sget-object v4, LQ/s;->BottomBar:LQ/s;

    filled-new-array {v0, v1, v2, v3, v4}, [LQ/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LQ/s;

    const-string v1, "TopBar"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LQ/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ/s;->TopBar:LQ/s;

    new-instance v0, LQ/s;

    const-string v1, "MainContent"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LQ/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ/s;->MainContent:LQ/s;

    new-instance v0, LQ/s;

    const-string v1, "Snackbar"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LQ/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ/s;->Snackbar:LQ/s;

    new-instance v0, LQ/s;

    const-string v1, "Fab"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LQ/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ/s;->Fab:LQ/s;

    new-instance v0, LQ/s;

    const-string v1, "BottomBar"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LQ/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ/s;->BottomBar:LQ/s;

    invoke-static {}, LQ/s;->$values()[LQ/s;

    move-result-object v0

    sput-object v0, LQ/s;->$VALUES:[LQ/s;

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

.method public static valueOf(Ljava/lang/String;)LQ/s;
    .locals 1

    const-class v0, LQ/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQ/s;

    return-object p0
.end method

.method public static values()[LQ/s;
    .locals 1

    sget-object v0, LQ/s;->$VALUES:[LQ/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ/s;

    return-object v0
.end method
