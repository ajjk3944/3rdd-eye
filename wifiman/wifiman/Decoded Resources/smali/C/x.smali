.class public final LC/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LC/C;

.field private final b:LT/n0;

.field private final c:LT/m0;

.field private d:Z

.field private e:Ljava/lang/Object;

.field private final f:LB/B;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IFLC/C;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LC/x;->a:LC/C;

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p3

    iput-object p3, p0, LC/x;->b:LT/n0;

    invoke-static {p2}, LT/C0;->a(F)LT/m0;

    move-result-object p2

    iput-object p2, p0, LC/x;->c:LT/m0;

    new-instance p2, LB/B;

    const/16 p3, 0x1e

    const/16 v0, 0x64

    invoke-direct {p2, p1, p3, v0}, LB/B;-><init>(III)V

    iput-object p2, p0, LC/x;->f:LB/B;

    return-void
.end method

.method private final g(I)V
    .locals 1

    iget-object v0, p0, LC/x;->b:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method private final h(F)V
    .locals 1

    iget-object v0, p0, LC/x;->c:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final i(IF)V
    .locals 1

    invoke-direct {p0, p1}, LC/x;->g(I)V

    iget-object v0, p0, LC/x;->f:LB/B;

    invoke-virtual {v0, p1}, LB/B;->j(I)V

    invoke-direct {p0, p2}, LC/x;->h(F)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, LC/x;->a:LC/C;

    invoke-virtual {v0}, LC/C;->H()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    iget-object v0, p0, LC/x;->a:LC/C;

    invoke-virtual {v0}, LC/C;->H()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    :goto_0
    invoke-virtual {p0}, LC/x;->c()F

    move-result v0

    add-float/2addr v0, p1

    invoke-direct {p0, v0}, LC/x;->h(F)V

    return-void
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LC/x;->b:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, LC/x;->c:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final d()LB/B;
    .locals 1

    iget-object v0, p0, LC/x;->f:LB/B;

    return-object v0
.end method

.method public final e(LC/r;I)I
    .locals 1

    iget-object v0, p0, LC/x;->e:Ljava/lang/Object;

    invoke-static {p1, v0, p2}, LB/u;->a(LB/t;Ljava/lang/Object;I)I

    move-result p1

    if-eq p2, p1, :cond_0

    invoke-direct {p0, p1}, LC/x;->g(I)V

    iget-object v0, p0, LC/x;->f:LB/B;

    invoke-virtual {v0, p2}, LB/B;->j(I)V

    :cond_0
    return p1
.end method

.method public final f(IF)V
    .locals 0

    invoke-direct {p0, p1, p2}, LC/x;->i(IF)V

    const/4 p1, 0x0

    iput-object p1, p0, LC/x;->e:Ljava/lang/Object;

    return-void
.end method

.method public final j(F)V
    .locals 0

    invoke-direct {p0, p1}, LC/x;->h(F)V

    return-void
.end method

.method public final k(LC/u;)V
    .locals 1

    invoke-virtual {p1}, LC/u;->o()LC/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC/e;->d()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LC/x;->e:Ljava/lang/Object;

    iget-boolean v0, p0, LC/x;->d:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, LC/u;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LC/x;->d:Z

    invoke-virtual {p1}, LC/u;->o()LC/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LC/e;->getIndex()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, LC/u;->s()F

    move-result p1

    invoke-direct {p0, v0, p1}, LC/x;->i(IF)V

    :cond_3
    return-void
.end method
