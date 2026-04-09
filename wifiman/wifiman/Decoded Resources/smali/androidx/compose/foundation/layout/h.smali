.class final Landroidx/compose/foundation/layout/h;
.super Landroidx/compose/foundation/layout/j;
.source "SourceFile"


# instance fields
.field private n:Lz/J;

.field private o:Z


# direct methods
.method public constructor <init>(Lz/J;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/layout/j;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/h;->n:Lz/J;

    iput-boolean p2, p0, Landroidx/compose/foundation/layout/h;->o:Z

    return-void
.end method


# virtual methods
.method public D2(Landroidx/compose/ui/layout/m;LC0/B;J)J
    .locals 1

    iget-object p1, p0, Landroidx/compose/foundation/layout/h;->n:Lz/J;

    sget-object v0, Lz/J;->Min:Lz/J;

    if-ne p1, v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result p1

    invoke-interface {p2, p1}, LC0/n;->s0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result p1

    invoke-interface {p2, p1}, LC0/n;->s(I)I

    move-result p1

    :goto_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    sget-object p2, LY0/b;->b:LY0/b$a;

    invoke-virtual {p2, p1}, LY0/b$a;->d(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public E2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/h;->o:Z

    return v0
.end method

.method public F2(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/layout/h;->o:Z

    return-void
.end method

.method public final G2(Lz/J;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/h;->n:Lz/J;

    return-void
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 1

    iget-object p1, p0, Landroidx/compose/foundation/layout/h;->n:Lz/J;

    sget-object v0, Lz/J;->Min:Lz/J;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 1

    iget-object p1, p0, Landroidx/compose/foundation/layout/h;->n:Lz/J;

    sget-object v0, Lz/J;->Min:Lz/J;

    if-ne p1, v0, :cond_0

    invoke-interface {p2, p3}, LC0/n;->s0(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p3}, LC0/n;->s(I)I

    move-result p1

    :goto_0
    return p1
.end method
