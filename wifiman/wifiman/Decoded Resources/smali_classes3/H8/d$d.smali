.class final enum LH8/d$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LH8/d$d;

.field public static final enum DONE:LH8/d$d;

.field public static final enum IN_PROGRESS:LH8/d$d;

.field public static final enum NO_ACCOUNT:LH8/d$d;

.field public static final enum UNAUTHORIZED:LH8/d$d;


# direct methods
.method private static final synthetic $values()[LH8/d$d;
    .locals 4

    sget-object v0, LH8/d$d;->NO_ACCOUNT:LH8/d$d;

    sget-object v1, LH8/d$d;->IN_PROGRESS:LH8/d$d;

    sget-object v2, LH8/d$d;->DONE:LH8/d$d;

    sget-object v3, LH8/d$d;->UNAUTHORIZED:LH8/d$d;

    filled-new-array {v0, v1, v2, v3}, [LH8/d$d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LH8/d$d;

    const-string/jumbo v1, "NO_ACCOUNT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LH8/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH8/d$d;->NO_ACCOUNT:LH8/d$d;

    new-instance v0, LH8/d$d;

    const-string/jumbo v1, "IN_PROGRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LH8/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH8/d$d;->IN_PROGRESS:LH8/d$d;

    new-instance v0, LH8/d$d;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LH8/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH8/d$d;->DONE:LH8/d$d;

    new-instance v0, LH8/d$d;

    const-string/jumbo v1, "UNAUTHORIZED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LH8/d$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LH8/d$d;->UNAUTHORIZED:LH8/d$d;

    invoke-static {}, LH8/d$d;->$values()[LH8/d$d;

    move-result-object v0

    sput-object v0, LH8/d$d;->$VALUES:[LH8/d$d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LH8/d$d;->$ENTRIES:Lfh/a;

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

    sget-object v0, LH8/d$d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH8/d$d;
    .locals 1

    const-class v0, LH8/d$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH8/d$d;

    return-object p0
.end method

.method public static values()[LH8/d$d;
    .locals 1

    sget-object v0, LH8/d$d;->$VALUES:[LH8/d$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH8/d$d;

    return-object v0
.end method
