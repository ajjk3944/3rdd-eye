.class final enum LM/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LM/f;

.field public static final enum Cancel:LM/f;

.field public static final enum Drag:LM/f;

.field public static final enum Timeout:LM/f;

.field public static final enum Up:LM/f;


# direct methods
.method private static final synthetic $values()[LM/f;
    .locals 4

    sget-object v0, LM/f;->Up:LM/f;

    sget-object v1, LM/f;->Drag:LM/f;

    sget-object v2, LM/f;->Timeout:LM/f;

    sget-object v3, LM/f;->Cancel:LM/f;

    filled-new-array {v0, v1, v2, v3}, [LM/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LM/f;

    const-string v1, "Up"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LM/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM/f;->Up:LM/f;

    new-instance v0, LM/f;

    const-string v1, "Drag"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LM/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM/f;->Drag:LM/f;

    new-instance v0, LM/f;

    const-string v1, "Timeout"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LM/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM/f;->Timeout:LM/f;

    new-instance v0, LM/f;

    const-string v1, "Cancel"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LM/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LM/f;->Cancel:LM/f;

    invoke-static {}, LM/f;->$values()[LM/f;

    move-result-object v0

    sput-object v0, LM/f;->$VALUES:[LM/f;

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

.method public static valueOf(Ljava/lang/String;)LM/f;
    .locals 1

    const-class v0, LM/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LM/f;

    return-object p0
.end method

.method public static values()[LM/f;
    .locals 1

    sget-object v0, LM/f;->$VALUES:[LM/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LM/f;

    return-object v0
.end method
