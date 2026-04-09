.class final LJ/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lmh/a;

.field private b:I

.field private c:J

.field final synthetic d:LJ/j;


# direct methods
.method public constructor <init>(LJ/j;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LJ/j$b;->d:LJ/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ/j$b;->a:Lmh/a;

    const/4 p1, -0x1

    iput p1, p0, LJ/j$b;->b:I

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LJ/j$b;->c:J

    return-void
.end method

.method private final f(JLM/r;Z)J
    .locals 10

    iget v0, p0, LJ/j$b;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v0

    iget-wide v2, p0, LJ/j$b;->c:J

    invoke-virtual {v0, v2, v3, v1}, LI/l1;->h(JZ)I

    move-result v0

    goto :goto_1

    :goto_2
    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v1}, LI/l1;->h(JZ)I

    move-result v5

    iget-object v2, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v2}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p1

    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, p3

    move v9, p4

    invoke-static/range {v2 .. v9}, LJ/j;->y(LJ/j;LH/h;IIZLM/r;ZZ)J

    move-result-wide p1

    iget p3, p0, LJ/j$b;->b:I

    const/4 p4, -0x1

    if-ne p3, p4, :cond_2

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result p3

    iput p3, p0, LJ/j$b;->b:I

    :cond_2
    invoke-static {p1, p2}, LL0/S;->m(J)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, p2}, LJ/k;->b(J)J

    move-result-wide p1

    :cond_3
    iget-object p3, p0, LJ/j$b;->d:LJ/j;

    invoke-static {p3}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, LI/o1;->y(J)V

    iget-object p3, p0, LJ/j$b;->d:LJ/j;

    sget-object p4, LJ/n;->Selection:LJ/n;

    invoke-virtual {p3, p4}, LJ/j;->I0(LJ/n;)V

    return-wide p1
.end method


# virtual methods
.method public a(J)Z
    .locals 0

    sget-object p1, LJ/j$b$d;->a:LJ/j$b$d;

    invoke-static {p1}, LJ/k;->a(Lmh/a;)V

    const/4 p1, 0x1

    return p1
.end method

.method public b(JLM/r;)Z
    .locals 2

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->f(LJ/j;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LJ/j$b$a;

    invoke-direct {v0, p1, p2}, LJ/j$b$a;-><init>(J)V

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    invoke-direct {p0, p1, p2, p3, v1}, LJ/j$b;->f(JLM/r;Z)J

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public c(JLM/r;)Z
    .locals 2

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->f(LJ/j;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LJ/j$b$e;->a:LJ/j$b$e;

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    sget-object v1, LJ/j$a;->Mouse:LJ/j$a;

    invoke-virtual {v0, v1}, LJ/j;->t0(LJ/j$a;)V

    iget-object v0, p0, LJ/j$b;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LJ/j;->u(LJ/j;I)V

    iput v1, p0, LJ/j$b;->b:I

    iput-wide p1, p0, LJ/j$b;->c:J

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, LJ/j$b;->f(JLM/r;Z)J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result p1

    iput p1, p0, LJ/j$b;->b:I

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()V
    .locals 2

    sget-object v0, LJ/j$b$b;->a:LJ/j$b$b;

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    iget-object v0, p0, LJ/j$b;->d:LJ/j;

    sget-object v1, LJ/j$a;->None:LJ/j$a;

    invoke-virtual {v0, v1}, LJ/j;->t0(LJ/j$a;)V

    return-void
.end method

.method public e(J)Z
    .locals 0

    sget-object p1, LJ/j$b$c;->a:LJ/j$b$c;

    invoke-static {p1}, LJ/k;->a(Lmh/a;)V

    const/4 p1, 0x1

    return p1
.end method
