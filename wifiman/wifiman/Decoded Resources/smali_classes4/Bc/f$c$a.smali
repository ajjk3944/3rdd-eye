.class public final LBc/f$c$a;
.super LBc/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBc/f$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LBc/f$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc/f$c$a;

    invoke-direct {v0}, LBc/f$c$a;-><init>()V

    sput-object v0, LBc/f$c$a;->a:LBc/f$c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LBc/f$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LBc/f$c$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x74cbe41c

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Fulfilled"

    return-object v0
.end method
