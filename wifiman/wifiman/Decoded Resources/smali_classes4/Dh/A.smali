.class public abstract LDh/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LBh/e;Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeSubstitution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LDh/z;->a:LDh/z$a;

    invoke-virtual {v0, p0, p1, p2}, LDh/z$a;->a(LBh/e;Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LBh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LDh/z;->a:LDh/z$a;

    invoke-virtual {v0, p0, p1}, LDh/z$a;->b(LBh/e;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p0

    return-object p0
.end method
