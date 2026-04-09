.class public abstract Lw/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;)Lw/y;
    .locals 1

    new-instance v0, Lw/i;

    invoke-direct {v0, p0}, Lw/i;-><init>(Lmh/l;)V

    return-object v0
.end method

.method public static final b(Lmh/l;LT/l;I)Lw/y;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)"

    const v2, -0xac19cfe

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, p1, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_1

    new-instance p2, Lw/z$a;

    invoke-direct {p2, p0}, Lw/z$a;-><init>(LT/z1;)V

    invoke-static {p2}, Lw/z;->a(Lmh/l;)Lw/y;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lw/y;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-object p2
.end method
