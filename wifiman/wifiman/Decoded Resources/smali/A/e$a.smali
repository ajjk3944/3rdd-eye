.class public final LA/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/e;->a(LA/B;Z)LB/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/B;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LA/B;Z)V
    .locals 0

    iput-object p1, p0, LA/e$a;->a:LA/B;

    iput-boolean p2, p0, LA/e$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    :goto_0
    return v0
.end method

.method public b()F
    .locals 2

    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->r()I

    move-result v0

    iget-object v1, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v1}, LA/B;->s()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/layout/f;->b(II)F

    move-result v0

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->w()LA/q;

    move-result-object v0

    invoke-interface {v0}, LA/q;->f()I

    move-result v0

    iget-object v1, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v1}, LA/B;->w()LA/q;

    move-result-object v1

    invoke-interface {v1}, LA/q;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()F
    .locals 3

    iget-object v0, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v0}, LA/B;->r()I

    move-result v0

    iget-object v1, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v1}, LA/B;->s()I

    move-result v1

    iget-object v2, p0, LA/e$a;->a:LA/B;

    invoke-virtual {v2}, LA/B;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/f;->a(IIZ)F

    move-result v0

    return v0
.end method

.method public e()LJ0/b;
    .locals 3

    iget-boolean v0, p0, LA/e$a;->b:Z

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    new-instance v0, LJ0/b;

    invoke-direct {v0, v2, v1}, LJ0/b;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ0/b;

    invoke-direct {v0, v1, v2}, LJ0/b;-><init>(II)V

    :goto_0
    return-object v0
.end method

.method public f(ILdh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LA/e$a;->a:LA/B;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LA/B;->K(LA/B;IILdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
