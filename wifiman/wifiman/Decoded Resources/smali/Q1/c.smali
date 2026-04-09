.class public final LQ1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LP1/b;

.field private final c:Lmh/l;

.field private final d:LIi/N;

.field private final e:Ljava/lang/Object;

.field private volatile f:LO1/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ1/c;->a:Ljava/lang/String;

    iput-object p2, p0, LQ1/c;->b:LP1/b;

    iput-object p3, p0, LQ1/c;->c:Lmh/l;

    iput-object p4, p0, LQ1/c;->d:LIi/N;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ1/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic c(LQ1/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LQ1/c;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, LQ1/c;->d(Landroid/content/Context;Lth/l;)LO1/e;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/content/Context;Lth/l;)LO1/e;
    .locals 5

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQ1/c;->f:LO1/e;

    if-nez p2, :cond_1

    iget-object p2, p0, LQ1/c;->e:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, LQ1/c;->f:LO1/e;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LR1/c;->a:LR1/c;

    iget-object v1, p0, LQ1/c;->b:LP1/b;

    iget-object v2, p0, LQ1/c;->c:Lmh/l;

    const-string v3, "applicationContext"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, LQ1/c;->d:LIi/N;

    new-instance v4, LQ1/c$a;

    invoke-direct {v4, p1, p0}, LQ1/c$a;-><init>(Landroid/content/Context;LQ1/c;)V

    invoke-virtual {v0, v1, v2, v3, v4}, LR1/c;->a(LP1/b;Ljava/util/List;LIi/N;Lmh/a;)LO1/e;

    move-result-object p1

    iput-object p1, p0, LQ1/c;->f:LO1/e;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LQ1/c;->f:LO1/e;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    move-object p2, p1

    goto :goto_2

    :goto_1
    monitor-exit p2

    throw p1

    :cond_1
    :goto_2
    return-object p2
.end method
