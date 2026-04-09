.class public final enum Leh/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Leh/a;

.field public static final enum COROUTINE_SUSPENDED:Leh/a;

.field public static final enum RESUMED:Leh/a;

.field public static final enum UNDECIDED:Leh/a;


# direct methods
.method private static final synthetic $values()[Leh/a;
    .locals 3

    sget-object v0, Leh/a;->COROUTINE_SUSPENDED:Leh/a;

    sget-object v1, Leh/a;->UNDECIDED:Leh/a;

    sget-object v2, Leh/a;->RESUMED:Leh/a;

    filled-new-array {v0, v1, v2}, [Leh/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leh/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leh/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/a;->COROUTINE_SUSPENDED:Leh/a;

    new-instance v0, Leh/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leh/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/a;->UNDECIDED:Leh/a;

    new-instance v0, Leh/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leh/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leh/a;->RESUMED:Leh/a;

    invoke-static {}, Leh/a;->$values()[Leh/a;

    move-result-object v0

    sput-object v0, Leh/a;->$VALUES:[Leh/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Leh/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Leh/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leh/a;
    .locals 1

    const-class v0, Leh/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leh/a;

    return-object p0
.end method

.method public static values()[Leh/a;
    .locals 1

    sget-object v0, Leh/a;->$VALUES:[Leh/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leh/a;

    return-object v0
.end method
