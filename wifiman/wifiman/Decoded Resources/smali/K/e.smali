.class public abstract LK/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH/l;LK/d;)V
    .locals 10

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->f()LI/m;

    move-result-object v0

    invoke-virtual {v0}, LI/m;->e()V

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {p1}, LK/d;->d()I

    move-result v1

    invoke-virtual {p1}, LK/d;->d()I

    move-result v2

    invoke-virtual {p1}, LK/d;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p1}, LK/d;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-virtual {p1}, LK/d;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    invoke-virtual {p1}, LK/d;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LI/I;->u(II)V

    new-instance p1, LH/h;

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->m()J

    move-result-wide v4

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->g()LL0/S;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, LH/l;->l()LH/h;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1}, LH/l;->b(LH/l;LH/h;LH/h;Z)V

    return-void
.end method

.method public static final b(LH/l;LK/d;)V
    .locals 10

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->f()LI/m;

    move-result-object v0

    invoke-virtual {v0}, LI/m;->e()V

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {p1}, LK/d;->d()I

    move-result v1

    invoke-virtual {p1}, LK/d;->d()I

    move-result v2

    invoke-virtual {p1}, LK/d;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p1}, LK/d;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-virtual {p1}, LK/d;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    invoke-virtual {p1}, LK/d;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LI/I;->u(II)V

    new-instance p1, LH/h;

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->m()J

    move-result-wide v4

    invoke-virtual {p0}, LH/l;->g()LI/I;

    move-result-object v0

    invoke-virtual {v0}, LI/I;->g()LL0/S;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, LH/l;->l()LH/h;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1}, LH/l;->b(LH/l;LH/h;LH/h;Z)V

    return-void
.end method
