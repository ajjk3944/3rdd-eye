.class public final enum LFd/B;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LFd/B;

.field public static final enum REACHABLE:LFd/B;

.field public static final enum UNREACHABLE:LFd/B;

.field public static final enum UNSTABLE:LFd/B;


# direct methods
.method private static final synthetic $values()[LFd/B;
    .locals 3

    sget-object v0, LFd/B;->REACHABLE:LFd/B;

    sget-object v1, LFd/B;->UNSTABLE:LFd/B;

    sget-object v2, LFd/B;->UNREACHABLE:LFd/B;

    filled-new-array {v0, v1, v2}, [LFd/B;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LFd/B;

    const-string v1, "REACHABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LFd/B;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFd/B;->REACHABLE:LFd/B;

    new-instance v0, LFd/B;

    const-string v1, "UNSTABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LFd/B;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFd/B;->UNSTABLE:LFd/B;

    new-instance v0, LFd/B;

    const-string v1, "UNREACHABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LFd/B;-><init>(Ljava/lang/String;I)V

    sput-object v0, LFd/B;->UNREACHABLE:LFd/B;

    invoke-static {}, LFd/B;->$values()[LFd/B;

    move-result-object v0

    sput-object v0, LFd/B;->$VALUES:[LFd/B;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LFd/B;->$ENTRIES:Lfh/a;

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

    sget-object v0, LFd/B;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LFd/B;
    .locals 1

    const-class v0, LFd/B;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LFd/B;

    return-object p0
.end method

.method public static values()[LFd/B;
    .locals 1

    sget-object v0, LFd/B;->$VALUES:[LFd/B;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LFd/B;

    return-object v0
.end method
