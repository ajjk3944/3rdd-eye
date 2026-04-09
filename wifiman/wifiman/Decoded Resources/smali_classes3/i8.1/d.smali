.class public final Li8/d;
.super Li8/a$b;
.source "SourceFile"


# static fields
.field public static final a:Li8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/d;

    invoke-direct {v0}, Li8/d;-><init>()V

    sput-object v0, Li8/d;->a:Li8/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li8/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Li8/d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x600994b5

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "TeleportQuickActionExplanationAdd"

    return-object v0
.end method
