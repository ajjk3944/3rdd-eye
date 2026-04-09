.class public final enum LK/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LK/b;

.field public static final enum Delete:LK/b;

.field public static final enum Insert:LK/b;

.field public static final enum Replace:LK/b;


# direct methods
.method private static final synthetic $values()[LK/b;
    .locals 3

    sget-object v0, LK/b;->Insert:LK/b;

    sget-object v1, LK/b;->Delete:LK/b;

    sget-object v2, LK/b;->Replace:LK/b;

    filled-new-array {v0, v1, v2}, [LK/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LK/b;

    const-string v1, "Insert"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LK/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/b;->Insert:LK/b;

    new-instance v0, LK/b;

    const-string v1, "Delete"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LK/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/b;->Delete:LK/b;

    new-instance v0, LK/b;

    const-string v1, "Replace"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LK/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/b;->Replace:LK/b;

    invoke-static {}, LK/b;->$values()[LK/b;

    move-result-object v0

    sput-object v0, LK/b;->$VALUES:[LK/b;

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

.method public static valueOf(Ljava/lang/String;)LK/b;
    .locals 1

    const-class v0, LK/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LK/b;

    return-object p0
.end method

.method public static values()[LK/b;
    .locals 1

    sget-object v0, LK/b;->$VALUES:[LK/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LK/b;

    return-object v0
.end method
