.class public final enum LI/p1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LI/p1;

.field public static final enum End:LI/p1;

.field public static final enum Start:LI/p1;


# direct methods
.method private static final synthetic $values()[LI/p1;
    .locals 2

    sget-object v0, LI/p1;->Start:LI/p1;

    sget-object v1, LI/p1;->End:LI/p1;

    filled-new-array {v0, v1}, [LI/p1;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LI/p1;

    const-string v1, "Start"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI/p1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/p1;->Start:LI/p1;

    new-instance v0, LI/p1;

    const-string v1, "End"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LI/p1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/p1;->End:LI/p1;

    invoke-static {}, LI/p1;->$values()[LI/p1;

    move-result-object v0

    sput-object v0, LI/p1;->$VALUES:[LI/p1;

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

.method public static valueOf(Ljava/lang/String;)LI/p1;
    .locals 1

    const-class v0, LI/p1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI/p1;

    return-object p0
.end method

.method public static values()[LI/p1;
    .locals 1

    sget-object v0, LI/p1;->$VALUES:[LI/p1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI/p1;

    return-object v0
.end method
