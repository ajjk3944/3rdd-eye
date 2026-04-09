.class public abstract LC0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LE0/Q;)LE0/Q;
    .locals 2

    invoke-virtual {p0}, LE0/Q;->G1()LE0/G;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->a0()LE0/G;

    move-result-object v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/G;->a0()LE0/G;

    move-result-object v1

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, LE0/G;->O0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, LE0/G;->a0()LE0/G;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object p0

    invoke-virtual {p0}, LE0/c0;->C2()LE0/Q;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method
