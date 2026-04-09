.class public abstract Lge/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/b;


# instance fields
.field private a:Ljava/util/HashMap;

.field private final b:Lgg/i;

.field private final c:Lgg/b;


# direct methods
.method public constructor <init>(Lfe/u;)V
    .locals 2

    const-string v0, "schedulers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lge/a;->a:Ljava/util/HashMap;

    new-instance v0, Lge/a$d;

    invoke-direct {v0, p0}, Lge/a$d;-><init>(Lge/a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lge/a$a;->a:Lge/a$a;

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lge/a$b;

    invoke-direct {v1, p0}, Lge/a$b;-><init>(Lge/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lge/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-interface {p1}, Lfe/u;->a()Lgg/y;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lge/a;->b:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string v0, "ignoreElements(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lge/a;->c:Lgg/b;

    return-void
.end method

.method public static final synthetic a(Lge/a;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lge/a;->a:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic b(Lge/a;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, Lge/a;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected final c(Ljava/util/List;Ljava/lang/Object;J)Ljava/util/List;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v2, LWc/c;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1e

    if-lt v1, v4, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    new-instance v0, LWc/c;

    invoke-direct {v0, p3, p4, p2}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected abstract d(JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract e(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract f(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract g()Lgg/i;
.end method

.method public final get(Ljava/lang/Object;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lge/a;->b:Lgg/i;

    new-instance v1, Lge/a$c;

    invoke-direct {v1, p1, p0}, Lge/a$c;-><init>(Ljava/lang/Object;Lge/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, Lge/a;->b:Lgg/i;

    return-object v0
.end method
