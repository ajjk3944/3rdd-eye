.class public abstract LQ0/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LQ0/A;LQ0/A;F)LQ0/A;
    .locals 0

    invoke-virtual {p0}, LQ0/A;->p()I

    move-result p0

    invoke-virtual {p1}, LQ0/A;->p()I

    move-result p1

    invoke-static {p0, p1, p2}, La1/b;->c(IIF)I

    move-result p0

    const/4 p1, 0x1

    const/16 p2, 0x3e8

    invoke-static {p0, p1, p2}, Lsh/m;->k(III)I

    move-result p0

    new-instance p1, LQ0/A;

    invoke-direct {p1, p0}, LQ0/A;-><init>(I)V

    return-object p1
.end method
