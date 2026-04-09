.class public final LE0/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/c0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE0/G;JLE0/u;ZZ)V
    .locals 0

    invoke-virtual/range {p1 .. p6}, LE0/G;->x0(JLE0/u;ZZ)V

    return-void
.end method

.method public b()I
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    return v0
.end method

.method public c(LE0/G;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public d(Landroidx/compose/ui/e$c;)Z
    .locals 9

    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz p1, :cond_7

    instance-of v5, p1, LE0/s0;

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    check-cast p1, LE0/s0;

    invoke-interface {p1}, LE0/s0;->I0()Z

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, p1, LE0/m;

    if-eqz v5, :cond_6

    move-object v5, p1

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    move v7, v4

    :goto_1
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v1

    if-eqz v8, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_1

    move-object p1, v5

    goto :goto_2

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LV/b;

    new-array v8, v0, [Landroidx/compose/ui/e$c;

    invoke-direct {v3, v8, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {v3, p1}, LV/b;->b(Ljava/lang/Object;)Z

    move-object p1, v2

    :cond_3
    invoke-virtual {v3, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_1

    :cond_5
    if-ne v7, v6, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v3}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_7
    return v4
.end method
