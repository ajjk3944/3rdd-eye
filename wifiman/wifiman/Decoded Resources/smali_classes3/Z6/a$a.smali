.class final LZ6/a$a;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/util/List;

.field final c:Ljava/util/List;

.field final d:Ljava/util/List;

.field final e:LY6/h;

.field final f:LY6/k$b;

.field final g:LY6/k$b;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;LY6/h;)V
    .locals 0

    invoke-direct {p0}, LY6/h;-><init>()V

    iput-object p1, p0, LZ6/a$a;->a:Ljava/lang/String;

    iput-object p2, p0, LZ6/a$a;->b:Ljava/util/List;

    iput-object p3, p0, LZ6/a$a;->c:Ljava/util/List;

    iput-object p4, p0, LZ6/a$a;->d:Ljava/util/List;

    iput-object p5, p0, LZ6/a$a;->e:LY6/h;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object p1

    iput-object p1, p0, LZ6/a$a;->f:LY6/k$b;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {p2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object p1

    iput-object p1, p0, LZ6/a$a;->g:LY6/k$b;

    return-void
.end method

.method private l(LY6/k;)I
    .locals 3

    invoke-virtual {p1}, LY6/k;->g()V

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LZ6/a$a;->f:LY6/k$b;

    invoke-virtual {p1, v0}, LY6/k;->p0(LY6/k$b;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZ6/a$a;->g:LY6/k$b;

    invoke-virtual {p1, v0}, LY6/k;->q0(LY6/k$b;)I

    move-result v0

    if-ne v0, v1, :cond_2

    iget-object v1, p0, LZ6/a$a;->e:LY6/h;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected one of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LZ6/a$a;->b:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for key \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LZ6/a$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' but found \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LY6/k;->Y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Register a subtype for this label."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return v0

    :cond_3
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Missing label for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ6/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b(LY6/k;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, LY6/k;->f0()LY6/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LY6/k;->r0(Z)V

    :try_start_0
    invoke-direct {p0, v0}, LZ6/a$a;->l(LY6/k;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    const/4 v0, -0x1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, LZ6/a$a;->e:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LZ6/a$a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    throw p1
.end method

.method public j(LY6/o;Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, LZ6/a$a;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v1, p0, LZ6/a$a;->e:LY6/h;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Expected one of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ6/a$a;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Register this subtype."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LZ6/a$a;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY6/h;

    :goto_0
    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    iget-object v2, p0, LZ6/a$a;->e:LY6/h;

    if-eq v1, v2, :cond_2

    iget-object v2, p0, LZ6/a$a;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    move-result-object v2

    iget-object v3, p0, LZ6/a$a;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, LY6/o;->r0(Ljava/lang/String;)LY6/o;

    :cond_2
    invoke-virtual {p1}, LY6/o;->g()I

    move-result v0

    invoke-virtual {v1, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LY6/o;->s(I)V

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "PolymorphicJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ6/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
