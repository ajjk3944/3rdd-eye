.class public final LS6/c;
.super Lr0/d;
.source "SourceFile"

# interfaces
.implements LT/S0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS6/c$a;
    }
.end annotation


# instance fields
.field private final g:Landroid/graphics/drawable/Drawable;

.field private final h:LT/n0;

.field private final i:LT/q0;

.field private final j:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    const-string/jumbo v0, "drawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lr0/d;-><init>()V

    iput-object p1, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    invoke-static {v0}, LT/f1;->a(I)LT/n0;

    move-result-object v1

    iput-object v1, p0, LS6/c;->h:LT/n0;

    invoke-static {p1}, LS6/e;->c(Landroid/graphics/drawable/Drawable;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->c(J)Ll0/m;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LS6/c;->i:LT/q0;

    new-instance v1, LS6/b;

    invoke-direct {v1, p0}, LS6/b;-><init>(LS6/c;)V

    invoke-static {v1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, LS6/c;->j:LYg/m;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public static synthetic o(LS6/c;)LS6/c$b;
    .locals 0

    invoke-static {p0}, LS6/c;->s(LS6/c;)LS6/c$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LS6/c;)I
    .locals 0

    invoke-direct {p0}, LS6/c;->u()I

    move-result p0

    return p0
.end method

.method public static final synthetic q(LS6/c;I)V
    .locals 0

    invoke-direct {p0, p1}, LS6/c;->x(I)V

    return-void
.end method

.method public static final synthetic r(LS6/c;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LS6/c;->y(J)V

    return-void
.end method

.method private static final s(LS6/c;)LS6/c$b;
    .locals 1

    new-instance v0, LS6/c$b;

    invoke-direct {v0, p0}, LS6/c$b;-><init>(LS6/c;)V

    return-object v0
.end method

.method private final t()Landroid/graphics/drawable/Drawable$Callback;
    .locals 1

    iget-object v0, p0, LS6/c;->j:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable$Callback;

    return-object v0
.end method

.method private final u()I
    .locals 1

    iget-object v0, p0, LS6/c;->h:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method private final w()J
    .locals 2

    iget-object v0, p0, LS6/c;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/m;

    invoke-virtual {v0}, Ll0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method private final x(I)V
    .locals 1

    iget-object v0, p0, LS6/c;->h:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method private final y(J)V
    .locals 1

    iget-object v0, p0, LS6/c;->i:LT/q0;

    invoke-static {p1, p2}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected a(F)Z
    .locals 3

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    const/16 v1, 0xff

    int-to-float v2, v1

    mul-float/2addr p1, v2

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Lsh/m;->k(III)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, LS6/c;->c()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, LS6/c;->t()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_0
    return-void
.end method

.method protected e(Lm0/w0;)Z
    .locals 1

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm0/I;->b(Lm0/w0;)Landroid/graphics/ColorFilter;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected f(LY0/t;)Z
    .locals 3

    const-string/jumbo v0, "layoutDirection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    sget-object v1, LS6/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result p1

    return p1
.end method

.method public l()J
    .locals 2

    invoke-direct {p0}, LS6/c;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method protected n(Lo0/f;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-direct {p0}, LS6/c;->u()I

    iget-object v1, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    invoke-static {v2}, Loh/b;->e(F)I

    move-result v2

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :try_start_0
    invoke-interface {v0}, Lm0/n0;->j()V

    iget-object p1, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lm0/n0;->r()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lm0/n0;->r()V

    throw p1
.end method

.method public final v()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LS6/c;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method
