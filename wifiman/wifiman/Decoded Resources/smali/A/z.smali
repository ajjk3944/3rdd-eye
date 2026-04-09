.class public final LA/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/n0;

.field private final b:LT/n0;

.field private c:Z

.field private d:Ljava/lang/Object;

.field private final e:LB/B;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object v0

    iput-object v0, p0, LA/z;->a:LT/n0;

    invoke-static {p2}, LT/f1;->a(I)LT/n0;

    move-result-object p2

    iput-object p2, p0, LA/z;->b:LT/n0;

    new-instance p2, LB/B;

    const/16 v0, 0x1e

    const/16 v1, 0x64

    invoke-direct {p2, p1, v0, v1}, LB/B;-><init>(III)V

    iput-object p2, p0, LA/z;->e:LB/B;

    return-void
.end method

.method private final f(I)V
    .locals 1

    iget-object v0, p0, LA/z;->b:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method private final g(II)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0, p1}, LA/z;->e(I)V

    iget-object v0, p0, LA/z;->e:LB/B;

    invoke-virtual {v0, p1}, LB/B;->j(I)V

    invoke-direct {p0, p2}, LA/z;->f(I)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index should be non-negative ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LA/z;->a:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public final b()LB/B;
    .locals 1

    iget-object v0, p0, LA/z;->e:LB/B;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LA/z;->b:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method public final d(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, LA/z;->g(II)V

    const/4 p1, 0x0

    iput-object p1, p0, LA/z;->d:Ljava/lang/Object;

    return-void
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, LA/z;->a:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method public final h(LA/s;)V
    .locals 3

    invoke-virtual {p1}, LA/s;->t()LA/t;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LA/t;->getKey()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LA/z;->d:Ljava/lang/Object;

    iget-boolean v0, p0, LA/z;->c:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, LA/s;->h()I

    move-result v0

    if-lez v0, :cond_3

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LA/z;->c:Z

    invoke-virtual {p1}, LA/s;->u()I

    move-result v0

    int-to-float v1, v0

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_4

    invoke-virtual {p1}, LA/s;->t()LA/t;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LA/t;->getIndex()I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-direct {p0, p1, v0}, LA/z;->g(II)V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "scrollOffset should be non-negative ("

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(I)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-direct {p0, p1}, LA/z;->f(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "scrollOffset should be non-negative ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(LA/m;I)I
    .locals 1

    iget-object v0, p0, LA/z;->d:Ljava/lang/Object;

    invoke-static {p1, v0, p2}, LB/u;->a(LB/t;Ljava/lang/Object;I)I

    move-result p1

    if-eq p2, p1, :cond_0

    invoke-virtual {p0, p1}, LA/z;->e(I)V

    iget-object v0, p0, LA/z;->e:LB/B;

    invoke-virtual {v0, p2}, LB/B;->j(I)V

    :cond_0
    return p1
.end method
