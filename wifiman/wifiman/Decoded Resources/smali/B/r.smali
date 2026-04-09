.class public final LB/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/r$a;
    }
.end annotation


# instance fields
.field private final a:Lc0/e;

.field private final b:Lmh/a;

.field private final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lc0/e;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/r;->a:Lc0/e;

    iput-object p2, p0, LB/r;->b:Lmh/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LB/r;->c:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(LB/r;)Lc0/e;
    .locals 0

    iget-object p0, p0, LB/r;->a:Lc0/e;

    return-object p0
.end method


# virtual methods
.method public final b(ILjava/lang/Object;Ljava/lang/Object;)Lmh/p;
    .locals 2

    iget-object v0, p0, LB/r;->c:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/r$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB/r$a;->f()I

    move-result v1

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, LB/r$a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LB/r$a;->d()Lmh/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, LB/r$a;

    invoke-direct {v0, p0, p1, p2, p3}, LB/r$a;-><init>(LB/r;ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, LB/r;->c:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LB/r$a;->d()Lmh/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, LB/r;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/r$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LB/r$a;->e()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LB/r;->b:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/t;

    invoke-interface {v1, p1}, LB/t;->c(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_2

    invoke-interface {v1, p1}, LB/t;->d(I)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final d()Lmh/a;
    .locals 1

    iget-object v0, p0, LB/r;->b:Lmh/a;

    return-object v0
.end method
