.class public final LU/d$o;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# static fields
.field public static final c:LU/d$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$o;

    invoke-direct {v0}, LU/d$o;-><init>()V

    sput-object v0, LU/d$o;->c:LU/d$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {p0, v2, v3, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 1

    const/4 p2, 0x1

    invoke-static {p2}, LU/d$t;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LT/b1;

    const/4 p4, 0x0

    invoke-static {p4}, LU/d$t;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/d;

    invoke-virtual {p3}, LT/e1;->I()V

    invoke-virtual {p1, p2}, LT/d;->d(LT/b1;)I

    move-result p1

    invoke-virtual {p3, p2, p1, p4}, LT/e1;->v0(LT/b1;IZ)Ljava/util/List;

    invoke-virtual {p3}, LT/e1;->U()V

    return-void
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "anchor"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "from"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
