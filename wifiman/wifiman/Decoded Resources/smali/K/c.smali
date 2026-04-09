.class public final enum LK/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LK/c;

.field public static final enum ClearHistory:LK/c;

.field public static final enum MergeIfPossible:LK/c;

.field public static final enum NeverMerge:LK/c;


# direct methods
.method private static final synthetic $values()[LK/c;
    .locals 3

    sget-object v0, LK/c;->MergeIfPossible:LK/c;

    sget-object v1, LK/c;->ClearHistory:LK/c;

    sget-object v2, LK/c;->NeverMerge:LK/c;

    filled-new-array {v0, v1, v2}, [LK/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LK/c;

    const-string v1, "MergeIfPossible"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LK/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/c;->MergeIfPossible:LK/c;

    new-instance v0, LK/c;

    const-string v1, "ClearHistory"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LK/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/c;->ClearHistory:LK/c;

    new-instance v0, LK/c;

    const-string v1, "NeverMerge"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LK/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LK/c;->NeverMerge:LK/c;

    invoke-static {}, LK/c;->$values()[LK/c;

    move-result-object v0

    sput-object v0, LK/c;->$VALUES:[LK/c;

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

.method public static valueOf(Ljava/lang/String;)LK/c;
    .locals 1

    const-class v0, LK/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LK/c;

    return-object p0
.end method

.method public static values()[LK/c;
    .locals 1

    sget-object v0, LK/c;->$VALUES:[LK/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LK/c;

    return-object v0
.end method
