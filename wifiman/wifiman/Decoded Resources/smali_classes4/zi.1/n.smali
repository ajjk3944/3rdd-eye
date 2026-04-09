.class abstract Lzi/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lmh/p;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/k;

    invoke-direct {v0}, Lzi/k;-><init>()V

    invoke-static {p0, v0, v0}, Leh/b;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p0

    invoke-virtual {v0, p0}, Lzi/k;->g(Ldh/e;)V

    return-object v0
.end method

.method public static b(Lmh/p;)Lzi/j;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/n$a;

    invoke-direct {v0, p0}, Lzi/n$a;-><init>(Lmh/p;)V

    return-object v0
.end method
