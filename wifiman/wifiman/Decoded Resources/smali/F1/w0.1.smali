.class public LF1/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF1/w0$j;,
        LF1/w0$k;,
        LF1/w0$i;,
        LF1/w0$h;,
        LF1/w0$g;,
        LF1/w0$f;,
        LF1/w0$l;,
        LF1/w0$a;,
        LF1/w0$m;,
        LF1/w0$d;,
        LF1/w0$c;,
        LF1/w0$b;,
        LF1/w0$e;
    }
.end annotation


# static fields
.field public static final b:LF1/w0;


# instance fields
.field private final a:LF1/w0$k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, LF1/w0$j;->q:LF1/w0;

    sput-object v0, LF1/w0;->b:LF1/w0;

    goto :goto_0

    :cond_0
    sget-object v0, LF1/w0$k;->b:LF1/w0;

    sput-object v0, LF1/w0;->b:LF1/w0;

    :goto_0
    return-void
.end method

.method public constructor <init>(LF1/w0;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    .line 8
    iget-object p1, p1, LF1/w0;->a:LF1/w0$k;

    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LF1/w0$j;

    if-eqz v1, :cond_0

    .line 10
    new-instance v0, LF1/w0$j;

    move-object v1, p1

    check-cast v1, LF1/w0$j;

    invoke-direct {v0, p0, v1}, LF1/w0$j;-><init>(LF1/w0;LF1/w0$j;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 11
    instance-of v1, p1, LF1/w0$i;

    if-eqz v1, :cond_1

    .line 12
    new-instance v0, LF1/w0$i;

    move-object v1, p1

    check-cast v1, LF1/w0$i;

    invoke-direct {v0, p0, v1}, LF1/w0$i;-><init>(LF1/w0;LF1/w0$i;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 13
    instance-of v0, p1, LF1/w0$h;

    if-eqz v0, :cond_2

    .line 14
    new-instance v0, LF1/w0$h;

    move-object v1, p1

    check-cast v1, LF1/w0$h;

    invoke-direct {v0, p0, v1}, LF1/w0$h;-><init>(LF1/w0;LF1/w0$h;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    .line 15
    :cond_2
    instance-of v0, p1, LF1/w0$g;

    if-eqz v0, :cond_3

    .line 16
    new-instance v0, LF1/w0$g;

    move-object v1, p1

    check-cast v1, LF1/w0$g;

    invoke-direct {v0, p0, v1}, LF1/w0$g;-><init>(LF1/w0;LF1/w0$g;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    .line 17
    :cond_3
    instance-of v0, p1, LF1/w0$f;

    if-eqz v0, :cond_4

    .line 18
    new-instance v0, LF1/w0$f;

    move-object v1, p1

    check-cast v1, LF1/w0$f;

    invoke-direct {v0, p0, v1}, LF1/w0$f;-><init>(LF1/w0;LF1/w0$f;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    .line 19
    :cond_4
    new-instance v0, LF1/w0$k;

    invoke-direct {v0, p0}, LF1/w0$k;-><init>(LF1/w0;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    .line 20
    :goto_0
    invoke-virtual {p1, p0}, LF1/w0$k;->e(LF1/w0;)V

    goto :goto_1

    .line 21
    :cond_5
    new-instance p1, LF1/w0$k;

    invoke-direct {p1, p0}, LF1/w0$k;-><init>(LF1/w0;)V

    iput-object p1, p0, LF1/w0;->a:LF1/w0$k;

    :goto_1
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LF1/w0$j;

    invoke-direct {v0, p0, p1}, LF1/w0$j;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LF1/w0$i;

    invoke-direct {v0, p0, p1}, LF1/w0$i;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, LF1/w0$h;

    invoke-direct {v0, p0, p1}, LF1/w0$h;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, LF1/w0$g;

    invoke-direct {v0, p0, p1}, LF1/w0$g;-><init>(LF1/w0;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LF1/w0;->a:LF1/w0$k;

    :goto_0
    return-void
.end method

.method static n(Lw1/f;IIII)Lw1/f;
    .locals 5

    iget v0, p0, Lw1/f;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, Lw1/f;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Lw1/f;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, Lw1/f;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, Lw1/f;->b(IIII)Lw1/f;

    move-result-object p0

    return-object p0
.end method

.method public static w(Landroid/view/WindowInsets;)LF1/w0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LF1/w0;->x(Landroid/view/WindowInsets;Landroid/view/View;)LF1/w0;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/view/WindowInsets;Landroid/view/View;)LF1/w0;
    .locals 1

    new-instance v0, LF1/w0;

    invoke-static {p0}, LE1/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, LF1/w0;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, LF1/W;->F(Landroid/view/View;)LF1/w0;

    move-result-object p0

    invoke-virtual {v0, p0}, LF1/w0;->t(LF1/w0;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, LF1/w0;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->a()LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method public b()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->b()LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method public c()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->c()LF1/w0;

    move-result-object v0

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()LF1/r;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->f()LF1/r;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LF1/w0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LF1/w0;

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    iget-object p1, p1, LF1/w0;->a:LF1/w0$k;

    invoke-static {v0, p1}, LE1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->g(I)Lw1/f;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->h(I)Lw1/f;

    move-result-object p1

    return-object p1
.end method

.method public h()Lw1/f;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->j()Lw1/f;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LF1/w0$k;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    iget v0, v0, Lw1/f;->d:I

    return v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    iget v0, v0, Lw1/f;->a:I

    return v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    iget v0, v0, Lw1/f;->c:I

    return v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    iget v0, v0, Lw1/f;->b:I

    return v0
.end method

.method public m(IIII)LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1, p2, p3, p4}, LF1/w0$k;->n(IIII)LF1/w0;

    move-result-object p1

    return-object p1
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0}, LF1/w0$k;->o()Z

    move-result v0

    return v0
.end method

.method public p(I)Z
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->q(I)Z

    move-result p1

    return p1
.end method

.method public q(IIII)LF1/w0;
    .locals 1

    new-instance v0, LF1/w0$a;

    invoke-direct {v0, p0}, LF1/w0$a;-><init>(LF1/w0;)V

    invoke-static {p1, p2, p3, p4}, Lw1/f;->b(IIII)Lw1/f;

    move-result-object p1

    invoke-virtual {v0, p1}, LF1/w0$a;->d(Lw1/f;)LF1/w0$a;

    move-result-object p1

    invoke-virtual {p1}, LF1/w0$a;->a()LF1/w0;

    move-result-object p1

    return-object p1
.end method

.method r([Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->r([Lw1/f;)V

    return-void
.end method

.method s(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->s(Lw1/f;)V

    return-void
.end method

.method t(LF1/w0;)V
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->t(LF1/w0;)V

    return-void
.end method

.method u(Lw1/f;)V
    .locals 1

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    invoke-virtual {v0, p1}, LF1/w0$k;->u(Lw1/f;)V

    return-void
.end method

.method public v()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, LF1/w0;->a:LF1/w0$k;

    instance-of v1, v0, LF1/w0$f;

    if-eqz v1, :cond_0

    check-cast v0, LF1/w0$f;

    iget-object v0, v0, LF1/w0$f;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
