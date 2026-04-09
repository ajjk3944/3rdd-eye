.class public final LWb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWb/j;


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/i;

.field private final d:Lm2/h;

.field private final e:Lm2/w;

.field private final f:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWb/k;->a:Lm2/q;

    new-instance v0, LWb/k$a;

    invoke-direct {v0, p0, p1}, LWb/k$a;-><init>(LWb/k;Lm2/q;)V

    iput-object v0, p0, LWb/k;->b:Lm2/i;

    new-instance v0, LWb/k$b;

    invoke-direct {v0, p0, p1}, LWb/k$b;-><init>(LWb/k;Lm2/q;)V

    iput-object v0, p0, LWb/k;->c:Lm2/i;

    new-instance v0, LWb/k$c;

    invoke-direct {v0, p0, p1}, LWb/k$c;-><init>(LWb/k;Lm2/q;)V

    iput-object v0, p0, LWb/k;->d:Lm2/h;

    new-instance v0, LWb/k$d;

    invoke-direct {v0, p0, p1}, LWb/k$d;-><init>(LWb/k;Lm2/q;)V

    iput-object v0, p0, LWb/k;->e:Lm2/w;

    new-instance v0, LWb/k$e;

    invoke-direct {v0, p0, p1}, LWb/k$e;-><init>(LWb/k;Lm2/q;)V

    iput-object v0, p0, LWb/k;->f:Lm2/w;

    return-void
.end method

.method static bridge synthetic j(LWb/k;)Lm2/q;
    .locals 0

    iget-object p0, p0, LWb/k;->a:Lm2/q;

    return-object p0
.end method

.method public static k()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 2

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/k;->e:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1}, Lr2/g;->bindString(ILjava/lang/String;)V

    :try_start_0
    iget-object p1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object v1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, LWb/k;->e:Lm2/w;

    invoke-virtual {v1, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object v1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->i()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v1, p0, LWb/k;->e:Lm2/w;

    invoke-virtual {v1, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public b(LWb/g;)I
    .locals 1

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/k;->d:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public c(LWb/f;)J
    .locals 2

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/k;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public d(J)Lgg/i;
    .locals 2

    const-string/jumbo v0, "SELECT * FROM signalMapperPlaces WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LWb/k;->a:Lm2/q;

    const-string/jumbo p2, "signalMapperPlaces"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LWb/k$f;

    invoke-direct {v1, p0, v0}, LWb/k$f;-><init>(LWb/k;Lm2/t;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v1}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public e(LWb/g;)J
    .locals 2

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/k;->c:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public f()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM signalMapperPlaceName ORDER BY created DESC"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/k;->a:Lm2/q;

    const-string/jumbo v3, "signalMapperPlaceName"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LWb/k$h;

    invoke-direct {v4, p0, v0}, LWb/k$h;-><init>(LWb/k;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public g()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM signalMapperPlaces ORDER BY created DESC"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/k;->a:Lm2/q;

    const-string/jumbo v3, "signalMapperPlaces"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LWb/k$g;

    invoke-direct {v4, p0, v0}, LWb/k$g;-><init>(LWb/k;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public h()I
    .locals 4

    const-string/jumbo v0, "SELECT COUNT(name) FROM signalMapperPlaceName"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->d()V

    iget-object v2, p0, LWb/k;->a:Lm2/q;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    return v1

    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    throw v1
.end method

.method public i()I
    .locals 3

    iget-object v0, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/k;->f:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result v1

    iget-object v2, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v2, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, LWb/k;->f:Lm2/w;

    invoke-virtual {v2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    iget-object v2, p0, LWb/k;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->i()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v2, p0, LWb/k;->f:Lm2/w;

    invoke-virtual {v2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw v1
.end method
