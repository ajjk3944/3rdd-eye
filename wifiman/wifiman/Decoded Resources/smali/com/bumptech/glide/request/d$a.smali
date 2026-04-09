.class public final enum Lcom/bumptech/glide/request/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/request/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bumptech/glide/request/d$a;

.field public static final enum CLEARED:Lcom/bumptech/glide/request/d$a;

.field public static final enum FAILED:Lcom/bumptech/glide/request/d$a;

.field public static final enum PAUSED:Lcom/bumptech/glide/request/d$a;

.field public static final enum RUNNING:Lcom/bumptech/glide/request/d$a;

.field public static final enum SUCCESS:Lcom/bumptech/glide/request/d$a;


# instance fields
.field private final isComplete:Z


# direct methods
.method private static synthetic $values()[Lcom/bumptech/glide/request/d$a;
    .locals 5

    sget-object v0, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    sget-object v1, Lcom/bumptech/glide/request/d$a;->PAUSED:Lcom/bumptech/glide/request/d$a;

    sget-object v2, Lcom/bumptech/glide/request/d$a;->CLEARED:Lcom/bumptech/glide/request/d$a;

    sget-object v3, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    sget-object v4, Lcom/bumptech/glide/request/d$a;->FAILED:Lcom/bumptech/glide/request/d$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/bumptech/glide/request/d$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/bumptech/glide/request/d$a;

    const-string v1, "RUNNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/bumptech/glide/request/d$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/bumptech/glide/request/d$a;->RUNNING:Lcom/bumptech/glide/request/d$a;

    new-instance v0, Lcom/bumptech/glide/request/d$a;

    const-string v1, "PAUSED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/bumptech/glide/request/d$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/bumptech/glide/request/d$a;->PAUSED:Lcom/bumptech/glide/request/d$a;

    new-instance v0, Lcom/bumptech/glide/request/d$a;

    const-string v1, "CLEARED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2}, Lcom/bumptech/glide/request/d$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/bumptech/glide/request/d$a;->CLEARED:Lcom/bumptech/glide/request/d$a;

    new-instance v0, Lcom/bumptech/glide/request/d$a;

    const-string v1, "SUCCESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/bumptech/glide/request/d$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/bumptech/glide/request/d$a;->SUCCESS:Lcom/bumptech/glide/request/d$a;

    new-instance v0, Lcom/bumptech/glide/request/d$a;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/bumptech/glide/request/d$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/bumptech/glide/request/d$a;->FAILED:Lcom/bumptech/glide/request/d$a;

    invoke-static {}, Lcom/bumptech/glide/request/d$a;->$values()[Lcom/bumptech/glide/request/d$a;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/request/d$a;->$VALUES:[Lcom/bumptech/glide/request/d$a;

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

    iput-boolean p3, p0, Lcom/bumptech/glide/request/d$a;->isComplete:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/request/d$a;
    .locals 1

    const-class v0, Lcom/bumptech/glide/request/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/request/d$a;

    return-object p0
.end method

.method public static values()[Lcom/bumptech/glide/request/d$a;
    .locals 1

    sget-object v0, Lcom/bumptech/glide/request/d$a;->$VALUES:[Lcom/bumptech/glide/request/d$a;

    invoke-virtual {v0}, [Lcom/bumptech/glide/request/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bumptech/glide/request/d$a;

    return-object v0
.end method


# virtual methods
.method isComplete()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/request/d$a;->isComplete:Z

    return v0
.end method
