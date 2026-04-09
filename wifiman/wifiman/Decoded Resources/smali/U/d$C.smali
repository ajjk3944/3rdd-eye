.class public final LU/d$C;
.super LU/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "C"
.end annotation


# static fields
.field public static final c:LU/d$C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU/d$C;

    invoke-direct {v0}, LU/d$C;-><init>()V

    sput-object v0, LU/d$C;->c:LU/d$C;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LU/d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a(LU/e;LT/f;LT/e1;LT/R0;)V
    .locals 2

    const/4 p2, 0x0

    invoke-static {p2}, LU/d$t;->a(I)I

    move-result v0

    invoke-interface {p1, v0}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, LU/d$t;->a(I)I

    move-result v1

    invoke-interface {p1, v1}, LU/e;->a(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/d;

    invoke-static {p2}, LU/d$q;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, LU/e;->b(I)I

    move-result p1

    instance-of p2, v0, LT/T0;

    if-eqz p2, :cond_0

    move-object p2, v0

    check-cast p2, LT/T0;

    invoke-virtual {p2}, LT/T0;->b()LT/S0;

    move-result-object p2

    invoke-interface {p4, p2}, LT/R0;->e(LT/S0;)V

    :cond_0
    invoke-virtual {p3, v1}, LT/e1;->F(LT/d;)I

    move-result p2

    invoke-virtual {p3, p2, p1, v0}, LT/e1;->R0(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LT/T0;

    if-eqz v1, :cond_2

    invoke-virtual {p3}, LT/e1;->e0()I

    move-result v1

    invoke-virtual {p3, p2, p1}, LT/e1;->a1(II)I

    move-result p1

    sub-int/2addr v1, p1

    check-cast v0, LT/T0;

    invoke-virtual {v0}, LT/T0;->a()LT/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LT/d;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p3, p1}, LT/e1;->F(LT/d;)I

    move-result p1

    invoke-virtual {p3}, LT/e1;->e0()I

    move-result p2

    invoke-virtual {p3, p1}, LT/e1;->b1(I)I

    move-result p3

    sub-int/2addr p2, p3

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    move p2, p1

    :goto_0
    invoke-virtual {v0}, LT/T0;->b()LT/S0;

    move-result-object p3

    invoke-interface {p4, p3, v1, p1, p2}, LT/R0;->c(LT/S0;III)V

    goto :goto_1

    :cond_2
    instance-of p1, v0, LT/K0;

    if-eqz p1, :cond_3

    check-cast v0, LT/K0;

    invoke-virtual {v0}, LT/K0;->x()V

    :cond_3
    :goto_1
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

    const-string p1, "groupSlotIndex"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LU/d;->e(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "value"

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, LU/d$t;->a(I)I

    move-result v0

    invoke-static {p1, v0}, LU/d$t;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "anchor"

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, LU/d;->f(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
