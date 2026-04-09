.class public abstract Lc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;Lmh/l;)Lc0/k;
    .locals 1

    new-instance v0, Lc0/a$a;

    invoke-direct {v0, p0}, Lc0/a$a;-><init>(Lmh/p;)V

    const-string p0, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/V;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/l;

    invoke-static {v0, p0}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p0

    return-object p0
.end method
