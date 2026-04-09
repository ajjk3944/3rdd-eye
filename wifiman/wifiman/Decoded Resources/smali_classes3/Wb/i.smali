.class public final LWb/i;
.super LWb/h;
.source "SourceFile"


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/h;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, LWb/h;-><init>()V

    iput-object p1, p0, LWb/i;->a:Lm2/q;

    new-instance v0, LWb/i$a;

    invoke-direct {v0, p0, p1}, LWb/i$a;-><init>(LWb/i;Lm2/q;)V

    iput-object v0, p0, LWb/i;->b:Lm2/i;

    new-instance v0, LWb/i$b;

    invoke-direct {v0, p0, p1}, LWb/i$b;-><init>(LWb/i;Lm2/q;)V

    iput-object v0, p0, LWb/i;->c:Lm2/h;

    return-void
.end method

.method static bridge synthetic h(LWb/i;)Lm2/q;
    .locals 0

    iget-object p0, p0, LWb/i;->a:Lm2/q;

    return-object p0
.end method

.method static synthetic i(LWb/i;Lmh/a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->c(Lmh/a;)V

    return-void
.end method

.method static synthetic j(LWb/i;Lmh/l;Lmh/a;)I
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->g(Lmh/l;Lmh/a;)I

    move-result p0

    return p0
.end method

.method public static l()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWb/i;->k()LWb/e;

    move-result-object v0

    return-object v0
.end method

.method public c(Lmh/a;)V
    .locals 1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, LWb/i;->i(LWb/i;Lmh/a;)V

    iget-object p1, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected bridge synthetic d(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, LWb/e;

    invoke-virtual {p0, p1}, LWb/i;->m(LWb/e;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM signalMapperUiState"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LWb/i;->a:Lm2/q;

    const-string/jumbo v3, "signalMapperUiState"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LWb/i$c;

    invoke-direct {v4, p0, v0}, LWb/i$c;-><init>(LWb/i;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic f(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LWb/e;

    invoke-virtual {p0, p1}, LWb/i;->n(LWb/e;)I

    move-result p1

    return p1
.end method

.method public g(Lmh/l;Lmh/a;)I
    .locals 1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1, p2}, LWb/i;->j(LWb/i;Lmh/l;Lmh/a;)I

    move-result p1

    iget-object p2, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
.end method

.method protected k()LWb/e;
    .locals 17

    move-object/from16 v1, p0

    const-string/jumbo v0, "SELECT * FROM signalMapperUiState LIMIT 1"

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v3

    iget-object v0, v1, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, v1, LWb/i;->a:Lm2/q;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v5

    :try_start_0
    const-string/jumbo v0, "id"

    invoke-static {v5, v0}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string/jumbo v6, "tutorialShown"

    invoke-static {v5, v6}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string/jumbo v7, "section"

    invoke-static {v5, v7}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string/jumbo v8, "signalType"

    invoke-static {v5, v8}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string/jumbo v9, "tab"

    invoke-static {v5, v9}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    move v13, v2

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v5, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    new-instance v4, LWb/e;

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, LWb/e;-><init>(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    invoke-virtual {v3}, Lm2/t;->s()V

    return-object v4

    :goto_1
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    invoke-virtual {v3}, Lm2/t;->s()V

    throw v0
.end method

.method protected m(LWb/e;)J
    .locals 2

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/i;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected n(LWb/e;)I
    .locals 1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LWb/i;->c:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LWb/i;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method
