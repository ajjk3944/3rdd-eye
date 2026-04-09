.class public final LU/d$B;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "B"
.end annotation


# static fields
.field public static final c:LU/d$B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$B;

    invoke-direct {v0}, LU/d$B;-><init>()V

    sput-object v0, LU/d$B;->c:LU/d$B;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, LU/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 5

    const/4 p2, 0x0

    invoke-static {p2}, LU/d$q;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LU/e;->b(I)I

    move-result p1

    invoke-virtual {p3}, LT/e1;->e0()I

    move-result p2

    invoke-virtual {p3}, LT/e1;->c0()I

    move-result v0

    invoke-virtual {p3, v0}, LT/e1;->d1(I)I

    move-result v1

    invoke-virtual {p3, v0}, LT/e1;->c1(I)I

    move-result v0

    sub-int v2, v0, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-static {p3}, LT/e1;->k(LT/e1;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {p3, v1}, LT/e1;->d(LT/e1;I)I

    move-result v3

    aget-object v2, v2, v3

    instance-of v3, v2, LT/T0;

    if-eqz v3, :cond_0

    sub-int v3, p2, v1

    check-cast v2, LT/T0;

    invoke-virtual {v2}, LT/T0;->b()LT/S0;

    move-result-object v2

    const/4 v4, -0x1

    invoke-interface {p4, v2, v3, v4, v4}, LT/R0;->c(LT/S0;III)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, LT/K0;

    if-eqz v3, :cond_1

    check-cast v2, LT/K0;

    invoke-virtual {v2}, LT/K0;->x()V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p3, p1}, LT/e1;->k1(I)V

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

    const-string p1, "count"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
