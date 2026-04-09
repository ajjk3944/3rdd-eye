.class public final enum LHe/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LHe/q;

.field public static final enum HIDDEN:LHe/q;

.field public static final enum VISIBLE:LHe/q;


# direct methods
.method private static final synthetic $values()[LHe/q;
    .locals 2

    sget-object v0, LHe/q;->VISIBLE:LHe/q;

    sget-object v1, LHe/q;->HIDDEN:LHe/q;

    filled-new-array {v0, v1}, [LHe/q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LHe/q;

    const-string v1, "VISIBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LHe/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHe/q;->VISIBLE:LHe/q;

    new-instance v0, LHe/q;

    const-string v1, "HIDDEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LHe/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, LHe/q;->HIDDEN:LHe/q;

    invoke-static {}, LHe/q;->$values()[LHe/q;

    move-result-object v0

    sput-object v0, LHe/q;->$VALUES:[LHe/q;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LHe/q;->$ENTRIES:Lfh/a;

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

    sget-object v0, LHe/q;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LHe/q;
    .locals 1

    const-class v0, LHe/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LHe/q;

    return-object p0
.end method

.method public static values()[LHe/q;
    .locals 1

    sget-object v0, LHe/q;->$VALUES:[LHe/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LHe/q;

    return-object v0
.end method
