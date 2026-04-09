.class public final enum LI/G0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LI/G0;

.field public static final enum Deletion:LI/G0;

.field public static final enum Insertion:LI/G0;

.field public static final enum Replacement:LI/G0;

.field public static final enum Untransformed:LI/G0;


# direct methods
.method private static final synthetic $values()[LI/G0;
    .locals 4

    sget-object v0, LI/G0;->Untransformed:LI/G0;

    sget-object v1, LI/G0;->Insertion:LI/G0;

    sget-object v2, LI/G0;->Replacement:LI/G0;

    sget-object v3, LI/G0;->Deletion:LI/G0;

    filled-new-array {v0, v1, v2, v3}, [LI/G0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LI/G0;

    const-string v1, "Untransformed"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI/G0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/G0;->Untransformed:LI/G0;

    new-instance v0, LI/G0;

    const-string v1, "Insertion"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LI/G0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/G0;->Insertion:LI/G0;

    new-instance v0, LI/G0;

    const-string v1, "Replacement"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LI/G0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/G0;->Replacement:LI/G0;

    new-instance v0, LI/G0;

    const-string v1, "Deletion"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LI/G0;-><init>(Ljava/lang/String;I)V

    sput-object v0, LI/G0;->Deletion:LI/G0;

    invoke-static {}, LI/G0;->$values()[LI/G0;

    move-result-object v0

    sput-object v0, LI/G0;->$VALUES:[LI/G0;

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

.method public static valueOf(Ljava/lang/String;)LI/G0;
    .locals 1

    const-class v0, LI/G0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LI/G0;

    return-object p0
.end method

.method public static values()[LI/G0;
    .locals 1

    sget-object v0, LI/G0;->$VALUES:[LI/G0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LI/G0;

    return-object v0
.end method
