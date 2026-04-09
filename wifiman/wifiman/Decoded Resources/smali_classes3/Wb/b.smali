.class public final LWb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWb/a;


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/i;

.field private final d:Lm2/w;

.field private final e:Lm2/w;

.field private final f:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWb/b;->a:Lm2/q;

    new-instance v0, LWb/b$a;

    invoke-direct {v0, p0, p1}, LWb/b$a;-><init>(LWb/b;Lm2/q;)V

    iput-object v0, p0, LWb/b;->b:Lm2/i;

    new-instance v0, LWb/b$b;

    invoke-direct {v0, p0, p1}, LWb/b$b;-><init>(LWb/b;Lm2/q;)V

    iput-object v0, p0, LWb/b;->c:Lm2/i;

    new-instance v0, LWb/b$c;

    invoke-direct {v0, p0, p1}, LWb/b$c;-><init>(LWb/b;Lm2/q;)V

    iput-object v0, p0, LWb/b;->d:Lm2/w;

    new-instance v0, LWb/b$d;

    invoke-direct {v0, p0, p1}, LWb/b$d;-><init>(LWb/b;Lm2/q;)V

    iput-object v0, p0, LWb/b;->e:Lm2/w;

    new-instance v0, LWb/b$e;

    invoke-direct {v0, p0, p1}, LWb/b$e;-><init>(LWb/b;Lm2/q;)V

    iput-object v0, p0, LWb/b;->f:Lm2/w;

    return-void
.end method

.method static bridge synthetic l(LWb/b;)Lm2/q;
    .locals 0

    iget-object p0, p0, LWb/b;->a:Lm2/q;

    return-object p0
.end method

.method public static m()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1, p2}, LWb/a$a;->a(LWb/a;J)V

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
.end method

.method public b(JLjava/lang/String;)I
    .locals 2

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/b;->d:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_0

    invoke-interface {v0, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p3}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    const/4 p3, 0x2

    invoke-interface {v0, p3, p1, p2}, Lr2/g;->bindLong(IJ)V

    :try_start_0
    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, LWb/b;->d:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    iget-object p2, p0, LWb/b;->d:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public c(LWb/d;)J
    .locals 2

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/b;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public d(J)Lgg/i;
    .locals 2

    const-string/jumbo v0, "SELECT * FROM floorplanRecord WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    const-string/jumbo p2, "floorplanRecord"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LWb/b$f;

    invoke-direct {v1, p0, v0}, LWb/b$f;-><init>(LWb/b;Lm2/t;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v1}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/util/List;
    .locals 6

    const-string/jumbo v0, "SELECT id FROM floorplanRecord WHERE name IS NULL"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->d()V

    iget-object v2, p0, LWb/b;->a:Lm2/q;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    return-object v3

    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    throw v1
.end method

.method public f(LWb/d;Ljava/lang/String;)J
    .locals 1

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1, p2}, LWb/a$a;->b(LWb/a;LWb/d;Ljava/lang/String;)J

    move-result-wide p1

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return-wide p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
.end method

.method public g(LWb/c;)J
    .locals 2

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/b;->c:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public h(J)I
    .locals 2

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/b;->f:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1, p2}, Lr2/g;->bindLong(IJ)V

    :try_start_0
    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, LWb/b;->f:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object p2, p0, LWb/b;->f:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public i(J)Lgg/i;
    .locals 2

    const-string/jumbo v0, "SELECT * FROM floorplanGpx WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, Lm2/t;->bindLong(IJ)V

    iget-object p1, p0, LWb/b;->a:Lm2/q;

    const-string/jumbo p2, "floorplanGpx"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LWb/b$h;

    invoke-direct {v1, p0, v0}, LWb/b$h;-><init>(LWb/b;Lm2/t;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, v1}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public j(J)I
    .locals 2

    iget-object v0, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/b;->e:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1, p2}, Lr2/g;->bindLong(IJ)V

    :try_start_0
    iget-object p1, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, LWb/b;->e:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object p2, p0, LWb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object p2, p0, LWb/b;->e:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw p1
.end method

.method public k()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM floorplanRecord WHERE name IS NOT NULL ORDER BY timestamp DESC"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/b;->a:Lm2/q;

    const-string/jumbo v3, "floorplanRecord"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LWb/b$g;

    invoke-direct {v4, p0, v0}, LWb/b$g;-><init>(LWb/b;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
