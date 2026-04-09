.class final Lza/b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lza/b;->a(Lcom/ui/uidb/UiDB$c;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lza/b;

.field final synthetic c:Lcom/ui/uidb/UiDB$c;


# direct methods
.method constructor <init>(Lza/b;Lcom/ui/uidb/UiDB$c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lza/b$d;->b:Lza/b;

    iput-object p2, p0, Lza/b$d;->c:Lcom/ui/uidb/UiDB$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lza/b$d;

    iget-object v0, p0, Lza/b$d;->b:Lza/b;

    iget-object v1, p0, Lza/b$d;->c:Lcom/ui/uidb/UiDB$c;

    invoke-direct {p1, v0, v1, p2}, Lza/b$d;-><init>(Lza/b;Lcom/ui/uidb/UiDB$c;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lza/b$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lza/b$d;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lza/b$d;->b:Lza/b;

    invoke-static {p1}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string/jumbo v0, "access$getPrefs$p(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza/b$d;->b:Lza/b;

    iget-object v1, p0, Lza/b$d;->c:Lcom/ui/uidb/UiDB$c;

    monitor-enter p1

    :try_start_0
    invoke-static {v0}, Lza/b;->d(Lza/b;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "storage_version"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "created"

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->c()Lbb/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lbb/a$a;->a()J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "etag"

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->c()Lbb/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lbb/a$a;->b()LYa/a;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, LYa/a;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "version"

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->d()Lbb/a;

    move-result-object v4

    invoke-virtual {v4}, Lbb/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "raw"

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string/jumbo v3, "env"

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->a()Lcom/ui/uidb/UiDB$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lza/b;->g(Lcom/ui/uidb/UiDB$b;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz v0, :cond_1

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Lcom/ui/uidb/UiDB$Error$IO;

    const-string/jumbo v0, "Failed to store snapshot"

    const/4 v1, 0x2

    invoke-direct {p1, v0, v5, v1, v5}, Lcom/ui/uidb/UiDB$Error$IO;-><init>(Ljava/lang/String;Ljava/io/IOException;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :goto_1
    monitor-exit p1

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lza/b$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lza/b$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lza/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
