.class public abstract Lm2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm2/q;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/w;->a:Lm2/q;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lm2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lm2/w$a;

    invoke-direct {p1, p0}, Lm2/w$a;-><init>(Lm2/w;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lm2/w;->c:LYg/m;

    return-void
.end method

.method public static final synthetic a(Lm2/w;)Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 0

    invoke-direct {p0}, Lm2/w;->d()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p0

    return-object p0
.end method

.method private final d()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 2

    invoke-virtual {p0}, Lm2/w;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm2/w;->a:Lm2/q;

    invoke-virtual {v1, v0}, Lm2/q;->f(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    return-object v0
.end method

.method private final f()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 1

    iget-object v0, p0, Lm2/w;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/sqlite/db/SupportSQLiteStatement;

    return-object v0
.end method

.method private final g(Z)Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lm2/w;->f()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lm2/w;->d()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public b()Landroidx/sqlite/db/SupportSQLiteStatement;
    .locals 3

    invoke-virtual {p0}, Lm2/w;->c()V

    iget-object v0, p0, Lm2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    invoke-direct {p0, v0}, Lm2/w;->g(Z)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    return-object v0
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Lm2/w;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->c()V

    return-void
.end method

.method protected abstract e()Ljava/lang/String;
.end method

.method public h(Landroidx/sqlite/db/SupportSQLiteStatement;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm2/w;->f()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lm2/w;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
