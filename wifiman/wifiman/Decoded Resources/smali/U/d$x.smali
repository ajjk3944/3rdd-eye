.class public final LU/d$x;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "x"
.end annotation


# static fields
.field public static final c:LU/d$x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$x;

    invoke-direct {v0}, LU/d$x;-><init>()V

    sput-object v0, LU/d$x;->c:LU/d$x;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v2, v0, v2, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 0

    const/4 p3, 0x0

    invoke-static {p3}, LU/d$q;->a(I)I

    move-result p3

    invoke-interface {p1, p3}, LU/e;->b(I)I

    move-result p3

    const/4 p4, 0x1

    invoke-static {p4}, LU/d$q;->a(I)I

    move-result p4

    invoke-interface {p1, p4}, LU/e;->b(I)I

    move-result p1

    invoke-interface {p2, p3, p1}, LT/f;->a(II)V

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

    const-string p1, "removeIndex"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$q;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$q;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "count"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
