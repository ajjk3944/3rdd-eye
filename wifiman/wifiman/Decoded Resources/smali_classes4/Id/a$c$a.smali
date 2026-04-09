.class public final LId/a$c$a;
.super LId/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LId/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LId/a$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LId/a$c$a;

    invoke-direct {v0}, LId/a$c$a;-><init>()V

    sput-object v0, LId/a$c$a;->a:LId/a$c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LId/a$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LId/a$c$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x5fc58280

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CloudApiOutage"

    return-object v0
.end method
