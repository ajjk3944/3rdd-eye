.class final Lc0/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/c;->c(Lc0/k;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/k;


# direct methods
.method constructor <init>(Lc0/k;)V
    .locals 0

    iput-object p1, p0, Lc0/c$a;->a:Lc0/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;LT/q0;)LT/q0;
    .locals 2

    instance-of v0, p2, Ld0/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc0/c$a;->a:Lc0/k;

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lc0/k;->b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p2, Ld0/g;

    invoke-interface {p2}, Ld0/g;->d()LT/n1;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, LT/q0;

    invoke-virtual {p0, p1, p2}, Lc0/c$a;->a(Lc0/m;LT/q0;)LT/q0;

    move-result-object p1

    return-object p1
.end method
