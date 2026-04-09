.class public final enum LLi/H;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LLi/H;

.field public static final enum START:LLi/H;

.field public static final enum STOP:LLi/H;

.field public static final enum STOP_AND_RESET_REPLAY_CACHE:LLi/H;


# direct methods
.method private static final synthetic $values()[LLi/H;
    .locals 3

    sget-object v0, LLi/H;->START:LLi/H;

    sget-object v1, LLi/H;->STOP:LLi/H;

    sget-object v2, LLi/H;->STOP_AND_RESET_REPLAY_CACHE:LLi/H;

    filled-new-array {v0, v1, v2}, [LLi/H;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LLi/H;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLi/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLi/H;->START:LLi/H;

    new-instance v0, LLi/H;

    const-string v1, "STOP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LLi/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLi/H;->STOP:LLi/H;

    new-instance v0, LLi/H;

    const-string v1, "STOP_AND_RESET_REPLAY_CACHE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LLi/H;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLi/H;->STOP_AND_RESET_REPLAY_CACHE:LLi/H;

    invoke-static {}, LLi/H;->$values()[LLi/H;

    move-result-object v0

    sput-object v0, LLi/H;->$VALUES:[LLi/H;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LLi/H;->$ENTRIES:Lfh/a;

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

    sget-object v0, LLi/H;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLi/H;
    .locals 1

    const-class v0, LLi/H;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLi/H;

    return-object p0
.end method

.method public static values()[LLi/H;
    .locals 1

    sget-object v0, LLi/H;->$VALUES:[LLi/H;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLi/H;

    return-object v0
.end method
