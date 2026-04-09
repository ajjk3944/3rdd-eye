.class public final enum LBe/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LBe/z;

.field public static final enum FINISHED:LBe/z;

.field public static final enum LTR:LBe/z;

.field public static final enum NOT_STARTED:LBe/z;

.field public static final enum RTL:LBe/z;


# direct methods
.method private static final synthetic $values()[LBe/z;
    .locals 4

    sget-object v0, LBe/z;->RTL:LBe/z;

    sget-object v1, LBe/z;->LTR:LBe/z;

    sget-object v2, LBe/z;->NOT_STARTED:LBe/z;

    sget-object v3, LBe/z;->FINISHED:LBe/z;

    filled-new-array {v0, v1, v2, v3}, [LBe/z;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LBe/z;

    const-string v1, "RTL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBe/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/z;->RTL:LBe/z;

    new-instance v0, LBe/z;

    const-string v1, "LTR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LBe/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/z;->LTR:LBe/z;

    new-instance v0, LBe/z;

    const-string v1, "NOT_STARTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LBe/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/z;->NOT_STARTED:LBe/z;

    new-instance v0, LBe/z;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LBe/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/z;->FINISHED:LBe/z;

    invoke-static {}, LBe/z;->$values()[LBe/z;

    move-result-object v0

    sput-object v0, LBe/z;->$VALUES:[LBe/z;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LBe/z;->$ENTRIES:Lfh/a;

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

    sget-object v0, LBe/z;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LBe/z;
    .locals 1

    const-class v0, LBe/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBe/z;

    return-object p0
.end method

.method public static values()[LBe/z;
    .locals 1

    sget-object v0, LBe/z;->$VALUES:[LBe/z;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBe/z;

    return-object v0
.end method
