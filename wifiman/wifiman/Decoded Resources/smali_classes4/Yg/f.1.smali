.class public final enum LYg/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LYg/f;

.field public static final enum ERROR:LYg/f;

.field public static final enum HIDDEN:LYg/f;

.field public static final enum WARNING:LYg/f;


# direct methods
.method private static final synthetic $values()[LYg/f;
    .locals 3

    sget-object v0, LYg/f;->WARNING:LYg/f;

    sget-object v1, LYg/f;->ERROR:LYg/f;

    sget-object v2, LYg/f;->HIDDEN:LYg/f;

    filled-new-array {v0, v1, v2}, [LYg/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYg/f;

    const-string v1, "WARNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYg/f;->WARNING:LYg/f;

    new-instance v0, LYg/f;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYg/f;->ERROR:LYg/f;

    new-instance v0, LYg/f;

    const-string v1, "HIDDEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LYg/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYg/f;->HIDDEN:LYg/f;

    invoke-static {}, LYg/f;->$values()[LYg/f;

    move-result-object v0

    sput-object v0, LYg/f;->$VALUES:[LYg/f;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LYg/f;->$ENTRIES:Lfh/a;

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

    sget-object v0, LYg/f;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYg/f;
    .locals 1

    const-class v0, LYg/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYg/f;

    return-object p0
.end method

.method public static values()[LYg/f;
    .locals 1

    sget-object v0, LYg/f;->$VALUES:[LYg/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYg/f;

    return-object v0
.end method
