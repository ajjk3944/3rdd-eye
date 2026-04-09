.class final enum Ljavax/jmdns/impl/constants/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljavax/jmdns/impl/constants/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ljavax/jmdns/impl/constants/g$b;

.field public static final enum announced:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum announcing:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum canceled:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum canceling:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum closed:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum closing:Ljavax/jmdns/impl/constants/g$b;

.field public static final enum probing:Ljavax/jmdns/impl/constants/g$b;


# direct methods
.method private static synthetic $values()[Ljavax/jmdns/impl/constants/g$b;
    .locals 7

    sget-object v0, Ljavax/jmdns/impl/constants/g$b;->probing:Ljavax/jmdns/impl/constants/g$b;

    sget-object v1, Ljavax/jmdns/impl/constants/g$b;->announcing:Ljavax/jmdns/impl/constants/g$b;

    sget-object v2, Ljavax/jmdns/impl/constants/g$b;->announced:Ljavax/jmdns/impl/constants/g$b;

    sget-object v3, Ljavax/jmdns/impl/constants/g$b;->canceling:Ljavax/jmdns/impl/constants/g$b;

    sget-object v4, Ljavax/jmdns/impl/constants/g$b;->canceled:Ljavax/jmdns/impl/constants/g$b;

    sget-object v5, Ljavax/jmdns/impl/constants/g$b;->closing:Ljavax/jmdns/impl/constants/g$b;

    sget-object v6, Ljavax/jmdns/impl/constants/g$b;->closed:Ljavax/jmdns/impl/constants/g$b;

    filled-new-array/range {v0 .. v6}, [Ljavax/jmdns/impl/constants/g$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "probing"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->probing:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "announcing"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->announcing:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "announced"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->announced:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "canceling"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->canceling:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "canceled"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->canceled:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "closing"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->closing:Ljavax/jmdns/impl/constants/g$b;

    new-instance v0, Ljavax/jmdns/impl/constants/g$b;

    const-string v1, "closed"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ljavax/jmdns/impl/constants/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->closed:Ljavax/jmdns/impl/constants/g$b;

    invoke-static {}, Ljavax/jmdns/impl/constants/g$b;->$values()[Ljavax/jmdns/impl/constants/g$b;

    move-result-object v0

    sput-object v0, Ljavax/jmdns/impl/constants/g$b;->$VALUES:[Ljavax/jmdns/impl/constants/g$b;

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

.method public static valueOf(Ljava/lang/String;)Ljavax/jmdns/impl/constants/g$b;
    .locals 1

    const-class v0, Ljavax/jmdns/impl/constants/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljavax/jmdns/impl/constants/g$b;

    return-object p0
.end method

.method public static values()[Ljavax/jmdns/impl/constants/g$b;
    .locals 1

    sget-object v0, Ljavax/jmdns/impl/constants/g$b;->$VALUES:[Ljavax/jmdns/impl/constants/g$b;

    invoke-virtual {v0}, [Ljavax/jmdns/impl/constants/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljavax/jmdns/impl/constants/g$b;

    return-object v0
.end method
