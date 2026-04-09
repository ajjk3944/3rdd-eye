.class public final LNb/b;
.super LNb/a;
.source "SourceFile"


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lcom/ui/wifiman/db/A;

.field private final d:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, LNb/a;-><init>()V

    new-instance v0, Lcom/ui/wifiman/db/A;

    invoke-direct {v0}, Lcom/ui/wifiman/db/A;-><init>()V

    iput-object v0, p0, LNb/b;->c:Lcom/ui/wifiman/db/A;

    iput-object p1, p0, LNb/b;->a:Lm2/q;

    new-instance v0, LNb/b$a;

    invoke-direct {v0, p0, p1}, LNb/b$a;-><init>(LNb/b;Lm2/q;)V

    iput-object v0, p0, LNb/b;->b:Lm2/i;

    new-instance v0, LNb/b$b;

    invoke-direct {v0, p0, p1}, LNb/b$b;-><init>(LNb/b;Lm2/q;)V

    iput-object v0, p0, LNb/b;->d:Lm2/w;

    return-void
.end method

.method static bridge synthetic f(LNb/b;)Lm2/q;
    .locals 0

    iget-object p0, p0, LNb/b;->a:Lm2/q;

    return-object p0
.end method

.method static bridge synthetic g(LNb/b;)Lcom/ui/wifiman/db/A;
    .locals 0

    iget-object p0, p0, LNb/b;->c:Lcom/ui/wifiman/db/A;

    return-object p0
.end method

.method static synthetic h(LNb/b;Ljava/lang/String;Z)V
    .locals 0

    invoke-super {p0, p1, p2}, LNb/a;->d(Ljava/lang/String;Z)V

    return-void
.end method

.method public static i()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LNb/c;)V
    .locals 1

    iget-object v0, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LNb/b;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->k(Ljava/lang/Object;)V

    iget-object p1, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Lgg/i;
    .locals 3

    const-string/jumbo v0, "SELECT * FROM directConsoleConnectionPopup WHERE consoleId = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lm2/t;->bindString(ILjava/lang/String;)V

    iget-object p1, p0, LNb/b;->a:Lm2/q;

    const-string/jumbo v1, "directConsoleConnectionPopup"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LNb/b$c;

    invoke-direct {v2, p0, v0}, LNb/b$c;-><init>(LNb/b;Lm2/t;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1, p2}, LNb/b;->h(LNb/b;Ljava/lang/String;Z)V

    iget-object p1, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
.end method

.method public e(Ljava/lang/String;Z)I
    .locals 3

    iget-object v0, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LNb/b;->d:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    int-to-long v1, p2

    const/4 p2, 0x1

    invoke-interface {v0, p2, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/4 p2, 0x2

    invoke-interface {v0, p2, p1}, Lr2/g;->bindString(ILjava/lang/String;)V

    :try_start_0
    iget-object p1, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object p2, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object p2, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, LNb/b;->d:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    iget-object p2, p0, LNb/b;->a:Lm2/q;

    invoke-virtual {p2}, Lm2/q;->i()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object p2, p0, LNb/b;->d:Lm2/w;

    invoke-virtual {p2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw p1
.end method
