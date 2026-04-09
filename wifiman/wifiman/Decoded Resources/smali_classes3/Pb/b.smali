.class public final LPb/b;
.super LPb/a;
.source "SourceFile"


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/h;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, LPb/a;-><init>()V

    iput-object p1, p0, LPb/b;->a:Lm2/q;

    new-instance v0, LPb/b$a;

    invoke-direct {v0, p0, p1}, LPb/b$a;-><init>(LPb/b;Lm2/q;)V

    iput-object v0, p0, LPb/b;->b:Lm2/i;

    new-instance v0, LPb/b$b;

    invoke-direct {v0, p0, p1}, LPb/b$b;-><init>(LPb/b;Lm2/q;)V

    iput-object v0, p0, LPb/b;->c:Lm2/h;

    return-void
.end method

.method static bridge synthetic h(LPb/b;)Lm2/q;
    .locals 0

    iget-object p0, p0, LPb/b;->a:Lm2/q;

    return-object p0
.end method

.method static synthetic i(LPb/b;Lmh/a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->c(Lmh/a;)V

    return-void
.end method

.method static synthetic j(LPb/b;Lmh/l;Lmh/a;)I
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

    invoke-virtual {p0}, LPb/b;->k()LPb/g;

    move-result-object v0

    return-object v0
.end method

.method public c(Lmh/a;)V
    .locals 1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, LPb/b;->i(LPb/b;Lmh/a;)V

    iget-object p1, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected bridge synthetic d(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, LPb/g;

    invoke-virtual {p0, p1}, LPb/b;->m(LPb/g;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM bluetoothListUiState"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LPb/b;->a:Lm2/q;

    const-string/jumbo v3, "bluetoothListUiState"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LPb/b$c;

    invoke-direct {v4, p0, v0}, LPb/b$c;-><init>(LPb/b;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic f(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LPb/g;

    invoke-virtual {p0, p1}, LPb/b;->n(LPb/g;)I

    move-result p1

    return p1
.end method

.method public g(Lmh/l;Lmh/a;)I
    .locals 1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1, p2}, LPb/b;->j(LPb/b;Lmh/l;Lmh/a;)I

    move-result p1

    iget-object p2, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
.end method

.method protected k()LPb/g;
    .locals 9

    const-string/jumbo v0, "SELECT * FROM bluetoothListUiState LIMIT 1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->d()V

    iget-object v2, p0, LPb/b;->a:Lm2/q;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lp2/b;->b(Lm2/q;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string/jumbo v4, "id"

    invoke-static {v2, v4}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string/jumbo v5, "connectedOnTop"

    invoke-static {v2, v5}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string/jumbo v6, "ubiquitiGrouped"

    invoke-static {v2, v6}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string/jumbo v7, "sort_type"

    invoke-static {v2, v7}, Lp2/a;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_1

    move v1, v5

    :cond_1
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LPb/g;

    invoke-direct {v6, v3, v4, v1, v5}, LPb/g;-><init>(IZZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v6

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    return-object v3

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lm2/t;->s()V

    throw v1
.end method

.method protected m(LPb/g;)J
    .locals 2

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LPb/b;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method protected n(LPb/g;)I
    .locals 1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LPb/b;->c:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LPb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method
