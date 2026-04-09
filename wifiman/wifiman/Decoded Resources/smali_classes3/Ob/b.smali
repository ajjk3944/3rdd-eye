.class public final LOb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOb/a;


# instance fields
.field private final a:Lm2/q;

.field private final b:Lm2/i;

.field private final c:Lm2/h;

.field private final d:Lm2/w;


# direct methods
.method public constructor <init>(Lm2/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOb/b;->a:Lm2/q;

    new-instance v0, LOb/b$a;

    invoke-direct {v0, p0, p1}, LOb/b$a;-><init>(LOb/b;Lm2/q;)V

    iput-object v0, p0, LOb/b;->b:Lm2/i;

    new-instance v0, LOb/b$b;

    invoke-direct {v0, p0, p1}, LOb/b$b;-><init>(LOb/b;Lm2/q;)V

    iput-object v0, p0, LOb/b;->c:Lm2/h;

    new-instance v0, LOb/b$c;

    invoke-direct {v0, p0, p1}, LOb/b$c;-><init>(LOb/b;Lm2/q;)V

    iput-object v0, p0, LOb/b;->d:Lm2/w;

    return-void
.end method

.method static bridge synthetic d(LOb/b;)Lm2/q;
    .locals 0

    iget-object p0, p0, LOb/b;->a:Lm2/q;

    return-object p0
.end method

.method public static e()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LOb/c;)J
    .locals 2

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LOb/b;->b:Lm2/i;

    invoke-virtual {v0, p1}, Lm2/i;->m(Ljava/lang/Object;)J

    move-result-wide v0

    iget-object p1, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {p1}, Lm2/q;->i()V

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public b(LOb/c;)I
    .locals 1

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->d()V

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->e()V

    :try_start_0
    iget-object v0, p0, LOb/b;->c:Lm2/h;

    invoke-virtual {v0, p1}, Lm2/h;->j(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LOb/b;->a:Lm2/q;

    invoke-virtual {v0}, Lm2/q;->i()V

    throw p1
.end method

.method public c()Lgg/i;
    .locals 5

    const-string/jumbo v0, "SELECT * FROM deviceInformation"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm2/t;->j(Ljava/lang/String;I)Lm2/t;

    move-result-object v0

    iget-object v2, p0, LOb/b;->a:Lm2/q;

    const-string/jumbo v3, "deviceInformation"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LOb/b$d;

    invoke-direct {v4, p0, v0}, LOb/b$d;-><init>(LOb/b;Lm2/t;)V

    invoke-static {v2, v1, v3, v4}, Lo2/d;->d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
