.class public final enum La6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[La6/a;

.field public static final enum Center:La6/a;

.field public static final enum Start:La6/a;


# instance fields
.field private final skipFirstEntity:Z


# direct methods
.method private static final synthetic $values()[La6/a;
    .locals 2

    sget-object v0, La6/a;->Start:La6/a;

    sget-object v1, La6/a;->Center:La6/a;

    filled-new-array {v0, v1}, [La6/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La6/a;

    const-string/jumbo v1, "Start"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, La6/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, La6/a;->Start:La6/a;

    new-instance v0, La6/a;

    const-string v1, "Center"

    invoke-direct {v0, v1, v3, v2}, La6/a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, La6/a;->Center:La6/a;

    invoke-static {}, La6/a;->$values()[La6/a;

    move-result-object v0

    sput-object v0, La6/a;->$VALUES:[La6/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, La6/a;->skipFirstEntity:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La6/a;
    .locals 1

    const-class v0, La6/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La6/a;

    return-object p0
.end method

.method public static values()[La6/a;
    .locals 1

    sget-object v0, La6/a;->$VALUES:[La6/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La6/a;

    return-object v0
.end method


# virtual methods
.method public final getSkipFirstEntity$core_release()Z
    .locals 1

    iget-boolean v0, p0, La6/a;->skipFirstEntity:Z

    return v0
.end method
