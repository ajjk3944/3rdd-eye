.class public final LJd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJd/b;


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/h;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJd/c;->a:Lm2/q;

    new-instance v0, LJd/c$a;

    invoke-direct {v0, p0, p1}, LJd/c$a;-><init>(LJd/c;Lm2/q;)V

    iput-object v0, p0, LJd/c;->b:Lm2/i;

    new-instance v0, LJd/c$b;

    invoke-direct {v0, p0, p1}, LJd/c$b;-><init>(LJd/c;Lm2/q;)V

    iput-object v0, p0, LJd/c;->c:Lm2/h;

    return-void
.end method

.method static bridge synthetic d(LJd/c;)Lm2/q;
    .locals 0

    iget-object p0, p0, LJd/c;->a:Lm2/q;

    return-object p0
.end method

.method public static e()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 5

    const-string v0, "SELECT * FROM config"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LJd/c;->a:Lm2/q;

    const-string v3, "config"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LJd/c$c;

    invoke-direct {v4, p0, v0}, LJd/c$c;-><init>(LJd/c;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public b(LJd/a;)J
    .locals 2

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LJd/c;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public varargs c([Ljava/lang/String;)I
    .locals 6

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    invoke-static {}, Lp2/e;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM config WHERE key in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, Lp2/e;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v1, v0}, Lm2/q;->f(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p1, v3

    invoke-interface {v0, v4, v5}, Lr2/g;->bindString(ILjava/lang/String;)V

    add-int/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->e()V

    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    move-result p1

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LJd/c;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method
