.class public final Li8/a$b$H;
.super Li8/a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "H"
.end annotation


# static fields
.field public static final a:Li8/a$b$H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/a$b$H;

    invoke-direct {v0}, Li8/a$b$H;-><init>()V

    sput-object v0, Li8/a$b$H;->a:Li8/a$b$H;

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
    instance-of p1, p1, Li8/a$b$H;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x5f98c316

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UbntCommunity"

    return-object v0
.end method
