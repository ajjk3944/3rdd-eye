.class public abstract Lz/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lw1/f;Ljava/lang/String;)Lz/d0;
    .locals 1

    new-instance v0, Lz/d0;

    invoke-static {p0}, Lz/k0;->d(Lw1/f;)Lz/H;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lz/d0;-><init>(Lz/H;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lz/f0$a;LT/l;I)Lz/f0;
    .locals 2

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)"

    const v1, -0x283d10ee

    invoke-static {v1, p2, p0, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lz/g0;->x:Lz/g0$a;

    const/4 p2, 0x6

    invoke-virtual {p0, p1, p2}, Lz/g0$a;->c(LT/l;I)Lz/g0;

    move-result-object p0

    invoke-virtual {p0}, Lz/g0;->f()Lz/b;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p0
.end method

.method public static final c(Lz/f0$a;LT/l;I)Lz/f0;
    .locals 2

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, -0x1

    const-string v0, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)"

    const v1, -0x10dd45b4

    invoke-static {v1, p2, p0, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lz/g0;->x:Lz/g0$a;

    const/4 p2, 0x6

    invoke-virtual {p0, p1, p2}, Lz/g0$a;->c(LT/l;I)Lz/g0;

    move-result-object p0

    invoke-virtual {p0}, Lz/g0;->g()Lz/b;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p0
.end method

.method public static final d(Lw1/f;)Lz/H;
    .locals 4

    new-instance v0, Lz/H;

    iget v1, p0, Lw1/f;->a:I

    iget v2, p0, Lw1/f;->b:I

    iget v3, p0, Lw1/f;->c:I

    iget p0, p0, Lw1/f;->d:I

    invoke-direct {v0, v1, v2, v3, p0}, Lz/H;-><init>(IIII)V

    return-object v0
.end method
