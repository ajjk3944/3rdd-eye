.class public abstract LMg/a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field private final a:LLg/l;


# direct methods
.method protected constructor <init>(LLg/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput-object p1, p0, LMg/a;->a:LLg/l;

    return-void
.end method


# virtual methods
.method public a(LLg/f;LLg/c;LLg/h;)LLg/f;
    .locals 5

    :try_start_0
    invoke-virtual {p1, p2, p3}, LLg/f;->x(LLg/c;LLg/h;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, LLg/e;->e()I

    move-result v0

    invoke-virtual {p1}, LLg/e;->o()Z

    move-result v1

    invoke-virtual {p1}, LLg/f;->E()I

    move-result v2

    invoke-virtual {p1}, LLg/e;->f()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    invoke-virtual {p1, v4}, LLg/e;->v(I)V

    invoke-virtual {p1, v3}, LLg/e;->w(I)V

    iget-object v3, p0, LMg/a;->a:LLg/l;

    invoke-virtual {v3, p1}, LLg/l;->m1(LLg/f;)V

    new-instance p1, LLg/f;

    invoke-direct {p1, v0, v1, v2}, LLg/f;-><init>(IZI)V

    invoke-virtual {p1, p2, p3}, LLg/f;->x(LLg/c;LLg/h;)V

    :goto_0
    return-object p1
.end method

.method public b(LLg/f;LLg/h;J)LLg/f;
    .locals 5

    :try_start_0
    invoke-virtual {p1, p2, p3, p4}, LLg/f;->y(LLg/h;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, LLg/e;->e()I

    move-result v0

    invoke-virtual {p1}, LLg/e;->o()Z

    move-result v1

    invoke-virtual {p1}, LLg/f;->E()I

    move-result v2

    invoke-virtual {p1}, LLg/e;->f()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    invoke-virtual {p1, v4}, LLg/e;->v(I)V

    invoke-virtual {p1, v3}, LLg/e;->w(I)V

    iget-object v3, p0, LMg/a;->a:LLg/l;

    invoke-virtual {v3, p1}, LLg/l;->m1(LLg/f;)V

    new-instance p1, LLg/f;

    invoke-direct {p1, v0, v1, v2}, LLg/f;-><init>(IZI)V

    invoke-virtual {p1, p2, p3, p4}, LLg/f;->y(LLg/h;J)V

    :goto_0
    return-object p1
.end method

.method public c(LLg/f;LLg/h;)LLg/f;
    .locals 5

    :try_start_0
    invoke-virtual {p1, p2}, LLg/f;->z(LLg/h;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, LLg/e;->e()I

    move-result v0

    invoke-virtual {p1}, LLg/e;->o()Z

    move-result v1

    invoke-virtual {p1}, LLg/f;->E()I

    move-result v2

    invoke-virtual {p1}, LLg/e;->f()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    invoke-virtual {p1, v4}, LLg/e;->v(I)V

    invoke-virtual {p1, v3}, LLg/e;->w(I)V

    iget-object v3, p0, LMg/a;->a:LLg/l;

    invoke-virtual {v3, p1}, LLg/l;->m1(LLg/f;)V

    new-instance p1, LLg/f;

    invoke-direct {p1, v0, v1, v2}, LLg/f;-><init>(IZI)V

    invoke-virtual {p1, p2}, LLg/f;->z(LLg/h;)V

    :goto_0
    return-object p1
.end method

.method public d(LLg/f;LLg/g;)LLg/f;
    .locals 5

    :try_start_0
    invoke-virtual {p1, p2}, LLg/f;->A(LLg/g;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, LLg/e;->e()I

    move-result v0

    invoke-virtual {p1}, LLg/e;->o()Z

    move-result v1

    invoke-virtual {p1}, LLg/f;->E()I

    move-result v2

    invoke-virtual {p1}, LLg/e;->f()I

    move-result v3

    or-int/lit16 v4, v0, 0x200

    invoke-virtual {p1, v4}, LLg/e;->v(I)V

    invoke-virtual {p1, v3}, LLg/e;->w(I)V

    iget-object v3, p0, LMg/a;->a:LLg/l;

    invoke-virtual {v3, p1}, LLg/l;->m1(LLg/f;)V

    new-instance p1, LLg/f;

    invoke-direct {p1, v0, v1, v2}, LLg/f;-><init>(IZI)V

    invoke-virtual {p1, p2}, LLg/f;->A(LLg/g;)V

    :goto_0
    return-object p1
.end method

.method public e()LLg/l;
    .locals 1

    iget-object v0, p0, LMg/a;->a:LLg/l;

    return-object v0
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LMg/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
