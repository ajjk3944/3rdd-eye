.class public final LC/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/F;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/d;->a(LC/C;Z)LB/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LC/C;Z)V
    .locals 0

    iput-object p1, p0, LC/d$a;->a:LC/C;

    iput-boolean p2, p0, LC/d$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    :goto_0
    return v0
.end method

.method public b()F
    .locals 2

    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-static {v0}, LC/y;->a(LC/C;)J

    move-result-wide v0

    long-to-float v0, v0

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->f()I

    move-result v0

    iget-object v1, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->C()LC/n;

    move-result-object v1

    invoke-interface {v1}, LC/n;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public d()F
    .locals 2

    iget-object v0, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    iget-object v1, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->F()I

    move-result v1

    invoke-static {v0, v1}, LC/D;->g(LC/n;I)J

    move-result-wide v0

    long-to-float v0, v0

    return v0
.end method

.method public e()LJ0/b;
    .locals 3

    iget-boolean v0, p0, LC/d$a;->b:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-instance v0, LJ0/b;

    iget-object v2, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->F()I

    move-result v2

    invoke-direct {v0, v2, v1}, LJ0/b;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v0, LJ0/b;

    iget-object v2, p0, LC/d$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->F()I

    move-result v2

    invoke-direct {v0, v1, v2}, LJ0/b;-><init>(II)V

    :goto_0
    return-object v0
.end method

.method public f(ILdh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LC/d$a;->a:LC/C;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LC/C;->Z(LC/C;IFLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
