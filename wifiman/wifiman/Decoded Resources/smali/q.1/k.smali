.class public final enum Lq/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lq/k;

.field public static final enum PostExit:Lq/k;

.field public static final enum PreEnter:Lq/k;

.field public static final enum Visible:Lq/k;


# direct methods
.method private static final synthetic $values()[Lq/k;
    .locals 3

    sget-object v0, Lq/k;->PreEnter:Lq/k;

    sget-object v1, Lq/k;->Visible:Lq/k;

    sget-object v2, Lq/k;->PostExit:Lq/k;

    filled-new-array {v0, v1, v2}, [Lq/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq/k;

    const-string v1, "PreEnter"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq/k;->PreEnter:Lq/k;

    new-instance v0, Lq/k;

    const-string v1, "Visible"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq/k;->Visible:Lq/k;

    new-instance v0, Lq/k;

    const-string v1, "PostExit"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq/k;->PostExit:Lq/k;

    invoke-static {}, Lq/k;->$values()[Lq/k;

    move-result-object v0

    sput-object v0, Lq/k;->$VALUES:[Lq/k;

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

.method public static valueOf(Ljava/lang/String;)Lq/k;
    .locals 1

    const-class v0, Lq/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq/k;

    return-object p0
.end method

.method public static values()[Lq/k;
    .locals 1

    sget-object v0, Lq/k;->$VALUES:[Lq/k;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq/k;

    return-object v0
.end method
