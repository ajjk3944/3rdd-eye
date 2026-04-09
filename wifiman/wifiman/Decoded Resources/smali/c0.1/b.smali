.class public abstract Lc0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;Lmh/l;)Lc0/k;
    .locals 1

    new-instance v0, Lc0/b$a;

    invoke-direct {v0, p0}, Lc0/b$a;-><init>(Lmh/p;)V

    new-instance p0, Lc0/b$b;

    invoke-direct {p0, p1}, Lc0/b$b;-><init>(Lmh/l;)V

    invoke-static {v0, p0}, Lc0/a;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p0

    return-object p0
.end method
