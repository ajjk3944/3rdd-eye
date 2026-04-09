.class public abstract LZi/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;LVi/b;)LXi/f;
    .locals 2

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitiveSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZi/S;

    new-instance v1, LZi/T$a;

    invoke-direct {v1, p1}, LZi/T$a;-><init>(LVi/b;)V

    invoke-direct {v0, p0, v1}, LZi/S;-><init>(Ljava/lang/String;LZi/M;)V

    return-object v0
.end method
