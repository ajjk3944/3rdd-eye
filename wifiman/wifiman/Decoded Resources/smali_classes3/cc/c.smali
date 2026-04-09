.class public final Lcc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcc/b;


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcc/c;->a:Lm2/q;

    new-instance v0, Lcc/c$a;

    invoke-direct {v0, p0, p1}, Lcc/c$a;-><init>(Lcc/c;Lm2/q;)V

    iput-object v0, p0, Lcc/c;->b:Lm2/i;

    new-instance v0, Lcc/c$b;

    invoke-direct {v0, p0, p1}, Lcc/c$b;-><init>(Lcc/c;Lm2/q;)V

    iput-object v0, p0, Lcc/c;->c:Lm2/w;

    return-void
.end method

.method static bridge synthetic e(Lcc/c;)Lm2/q;
    .locals 0

    iget-object p0, p0, Lcc/c;->a:Lm2/q;

    return-object p0
.end method

.method public static f()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM wifimanWizardAdoption"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, Lcc/c;->a:Lm2/q;

    const-string/jumbo v3, "wifimanWizardAdoption"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcc/c$c;

    invoke-direct {v4, p0, v0}, Lcc/c$c;-><init>(Lcc/c;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcc/a;)V
    .locals 1

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    invoke-static {p0, p1}, Lcc/b$a;->a(Lcc/b;Lcc/a;)V

    iget-object p1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public c(Lcc/a;)J
    .locals 2

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, Lcc/c;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, Lcc/c;->c:Lm2/w;

    invoke-virtual {v0}, Lm2/w;->b()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    iget-object v1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v1}, Lm2/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcc/c;->c:Lm2/w;

    invoke-virtual {v1, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    iget-object v2, p0, Lcc/c;->a:Lm2/q;

    invoke-virtual {v2}, Lm2/q;->i()V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v2, p0, Lcc/c;->c:Lm2/w;

    invoke-virtual {v2, v0}, Lm2/w;->h(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    throw v1
.end method
