.class final Lk2/a$a;
.super Lk2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Landroidx/privacysandbox/ads/adservices/measurement/b;


# direct methods
.method public constructor <init>(Landroidx/privacysandbox/ads/adservices/measurement/b;)V
    .locals 1

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lk2/a;-><init>()V

    iput-object p1, p0, Lk2/a$a;->b:Landroidx/privacysandbox/ads/adservices/measurement/b;

    return-void
.end method

.method public static final synthetic d(Lk2/a$a;)Landroidx/privacysandbox/ads/adservices/measurement/b;
    .locals 0

    iget-object p0, p0, Lk2/a$a;->b:Landroidx/privacysandbox/ads/adservices/measurement/b;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lk2/a$a$b;-><init>(Lk2/a$a;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "trigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$e;-><init>(Lk2/a$a;Landroid/net/Uri;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroidx/privacysandbox/ads/adservices/measurement/a;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/a;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "deletionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$a;-><init>(Lk2/a$a;Landroidx/privacysandbox/ads/adservices/measurement/a;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "attributionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lk2/a$a$c;-><init>(Lk2/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/privacysandbox/ads/adservices/measurement/m;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/m;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$d;-><init>(Lk2/a$a;Landroidx/privacysandbox/ads/adservices/measurement/m;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroidx/privacysandbox/ads/adservices/measurement/n;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/n;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$f;-><init>(Lk2/a$a;Landroidx/privacysandbox/ads/adservices/measurement/n;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroidx/privacysandbox/ads/adservices/measurement/o;)Lcom/google/common/util/concurrent/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/measurement/o;",
            ")",
            "Lcom/google/common/util/concurrent/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$g;-><init>(Lk2/a$a;Landroidx/privacysandbox/ads/adservices/measurement/o;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->b(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LIi/V;Ljava/lang/Object;ILjava/lang/Object;)Lcom/google/common/util/concurrent/d;

    move-result-object p1

    return-object p1
.end method
