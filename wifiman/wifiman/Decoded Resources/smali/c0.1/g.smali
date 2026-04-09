.class public abstract Lc0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/l;I)Lc0/e;
    .locals 7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)"

    const v2, 0xebd1ab

    invoke-static {v2, p1, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x2f7337b1

    invoke-interface {p0, p1}, LT/l;->U(I)V

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    sget-object p1, Lc0/f;->d:Lc0/f$c;

    invoke-virtual {p1}, Lc0/f$c;->a()Lc0/k;

    move-result-object v1

    sget-object v3, Lc0/g$a;->a:Lc0/g$a;

    const/16 v5, 0xc00

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/f;

    invoke-static {}, Lc0/j;->d()LT/H0;

    move-result-object v0

    invoke-interface {p0, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/h;

    invoke-virtual {p1, v0}, Lc0/f;->i(Lc0/h;)V

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
