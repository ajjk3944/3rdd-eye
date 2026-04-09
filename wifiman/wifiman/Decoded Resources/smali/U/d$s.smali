.class public final LU/d$s;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation


# static fields
.field public static final c:LU/d$s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$s;

    invoke-direct {v0}, LU/d$s;-><init>()V

    sput-object v0, LU/d$s;->c:LU/d$s;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 1

    const/4 p3, 0x0

    invoke-static {p3}, LU/d$q;->a(I)I

    move-result p3

    invoke-interface {p1, p3}, LU/e;->b(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-static {p4}, LU/d$q;->a(I)I

    move-result p4

    invoke-interface {p1, p4}, LU/e;->b(I)I

    move-result p4

    const/4 v0, 0x2

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LU/e;->b(I)I

    move-result p1

    invoke-interface {p2, p3, p4, p1}, LT/f;->f(III)V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "from"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "to"

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "count"

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
