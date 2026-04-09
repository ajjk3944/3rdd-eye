.class final Lb5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/d;
.implements LZ4/f;


# instance fields
.field private a:Lb5/e;

.field private b:Z

.field private final c:Landroid/util/JsonWriter;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:LZ4/c;

.field private final g:Z


# direct methods
.method constructor <init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;LZ4/c;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb5/e;->a:Lb5/e;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb5/e;->b:Z

    new-instance v0, Landroid/util/JsonWriter;

    invoke-direct {v0, p1}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    iput-object p2, p0, Lb5/e;->d:Ljava/util/Map;

    iput-object p3, p0, Lb5/e;->e:Ljava/util/Map;

    iput-object p4, p0, Lb5/e;->f:LZ4/c;

    iput-boolean p5, p0, Lb5/e;->g:Z

    return-void
.end method

.method private t(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-nez v0, :cond_1

    instance-of v0, p1, Ljava/util/Collection;

    if-nez v0, :cond_1

    instance-of v0, p1, Ljava/util/Date;

    if-nez v0, :cond_1

    instance-of v0, p1, Ljava/lang/Enum;

    if-nez v0, :cond_1

    instance-of p1, p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private w(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    if-nez p2, :cond_0

    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    return-object p0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lb5/e;->k(Ljava/lang/Object;Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method private x(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;
    .locals 1

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lb5/e;->k(Ljava/lang/Object;Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method private y()V
    .locals 2

    iget-boolean v0, p0, Lb5/e;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb5/e;->a:Lb5/e;

    if-eqz v0, :cond_0

    invoke-direct {v0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->a:Lb5/e;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb5/e;->b:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lb5/e;->a:Lb5/e;

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Parent context used since this context was created. Cannot use this context anymore."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)LZ4/f;
    .locals 0

    invoke-virtual {p0, p1}, Lb5/e;->l(Ljava/lang/String;)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public b(LZ4/b;Ljava/lang/Object;)LZ4/d;
    .locals 0

    invoke-virtual {p1}, LZ4/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb5/e;->p(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public c(LZ4/b;J)LZ4/d;
    .locals 0

    invoke-virtual {p1}, LZ4/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lb5/e;->o(Ljava/lang/String;J)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public d(LZ4/b;I)LZ4/d;
    .locals 0

    invoke-virtual {p1}, LZ4/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb5/e;->n(Ljava/lang/String;I)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public e(LZ4/b;D)LZ4/d;
    .locals 0

    invoke-virtual {p1}, LZ4/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lb5/e;->m(Ljava/lang/String;D)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public f(LZ4/b;Z)LZ4/d;
    .locals 0

    invoke-virtual {p1}, LZ4/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb5/e;->q(Ljava/lang/String;Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Z)LZ4/f;
    .locals 0

    invoke-virtual {p0, p1}, Lb5/e;->r(Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public h(D)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1, p2}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    return-object p0
.end method

.method public i(I)Lb5/e;
    .locals 3

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    return-object p0
.end method

.method public j(J)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1, p2}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    return-object p0
.end method

.method k(Ljava/lang/Object;Z)Lb5/e;
    .locals 5

    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, Lb5/e;->t(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lcom/google/firebase/encoders/EncodingException;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%s cannot be encoded inline"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    return-object p0

    :cond_2
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_3

    iget-object p2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p2, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    return-object p0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    instance-of p2, p1, [B

    if-eqz p2, :cond_4

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lb5/e;->s([B)Lb5/e;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p2}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    instance-of p2, p1, [I

    if-eqz p2, :cond_5

    check-cast p1, [I

    array-length p2, p1

    :goto_1
    if-ge v1, p2, :cond_a

    aget v0, p1, v1

    iget-object v2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    instance-of p2, p1, [J

    if-eqz p2, :cond_6

    check-cast p1, [J

    array-length p2, p1

    :goto_2
    if-ge v1, p2, :cond_a

    aget-wide v2, p1, v1

    invoke-virtual {p0, v2, v3}, Lb5/e;->j(J)Lb5/e;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    instance-of p2, p1, [D

    if-eqz p2, :cond_7

    check-cast p1, [D

    array-length p2, p1

    :goto_3
    if-ge v1, p2, :cond_a

    aget-wide v2, p1, v1

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, v2, v3}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    instance-of p2, p1, [Z

    if-eqz p2, :cond_8

    check-cast p1, [Z

    array-length p2, p1

    :goto_4
    if-ge v1, p2, :cond_a

    aget-boolean v0, p1, v1

    iget-object v2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v2, v0}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    instance-of p2, p1, [Ljava/lang/Number;

    if-eqz p2, :cond_9

    check-cast p1, [Ljava/lang/Number;

    array-length p2, p1

    move v0, v1

    :goto_5
    if-ge v0, p2, :cond_a

    aget-object v2, p1, v0

    invoke-virtual {p0, v2, v1}, Lb5/e;->k(Ljava/lang/Object;Z)Lb5/e;

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_9
    check-cast p1, [Ljava/lang/Object;

    array-length p2, p1

    move v0, v1

    :goto_6
    if-ge v0, p2, :cond_a

    aget-object v2, p1, v0

    invoke-virtual {p0, v2, v1}, Lb5/e;->k(Ljava/lang/Object;Z)Lb5/e;

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_a
    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    return-object p0

    :cond_b
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_d

    check-cast p1, Ljava/util/Collection;

    iget-object p2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p2}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p2, v1}, Lb5/e;->k(Ljava/lang/Object;Z)Lb5/e;

    goto :goto_7

    :cond_c
    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    return-object p0

    :cond_d
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_f

    check-cast p1, Ljava/util/Map;

    iget-object p2, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p2}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v1, p2}, Lb5/e;->p(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/firebase/encoders/EncodingException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Only String keys are currently supported in maps, got %s of type %s instead."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :cond_e
    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    return-object p0

    :cond_f
    iget-object v0, p0, Lb5/e;->d:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ4/c;

    if-eqz v0, :cond_10

    invoke-virtual {p0, v0, p1, p2}, Lb5/e;->v(LZ4/c;Ljava/lang/Object;Z)Lb5/e;

    move-result-object p1

    return-object p1

    :cond_10
    iget-object v0, p0, Lb5/e;->e:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ4/e;

    if-eqz v0, :cond_11

    invoke-interface {v0, p1, p0}, LZ4/e;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_11
    instance-of v0, p1, Ljava/lang/Enum;

    if-eqz v0, :cond_13

    instance-of p2, p1, Lb5/f;

    if-eqz p2, :cond_12

    check-cast p1, Lb5/f;

    invoke-interface {p1}, Lb5/f;->getNumber()I

    move-result p1

    invoke-virtual {p0, p1}, Lb5/e;->i(I)Lb5/e;

    goto :goto_9

    :cond_12
    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb5/e;->l(Ljava/lang/String;)Lb5/e;

    :goto_9
    return-object p0

    :cond_13
    iget-object v0, p0, Lb5/e;->f:LZ4/c;

    invoke-virtual {p0, v0, p1, p2}, Lb5/e;->v(LZ4/c;Ljava/lang/Object;Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    return-object p0
.end method

.method public m(Ljava/lang/String;D)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    invoke-virtual {p0, p2, p3}, Lb5/e;->h(D)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;I)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    invoke-virtual {p0, p2}, Lb5/e;->i(I)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/String;J)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    invoke-virtual {p0, p2, p3}, Lb5/e;->j(J)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;
    .locals 1

    iget-boolean v0, p0, Lb5/e;->g:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lb5/e;->x(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lb5/e;->w(Ljava/lang/String;Ljava/lang/Object;)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public q(Ljava/lang/String;Z)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    invoke-virtual {p0, p2}, Lb5/e;->r(Z)Lb5/e;

    move-result-object p1

    return-object p1
.end method

.method public r(Z)Lb5/e;
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    return-object p0
.end method

.method public s([B)Lb5/e;
    .locals 2

    invoke-direct {p0}, Lb5/e;->y()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    const/4 v1, 0x2

    invoke-static {p1, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    :goto_0
    return-object p0
.end method

.method u()V
    .locals 1

    invoke-direct {p0}, Lb5/e;->y()V

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V

    return-void
.end method

.method v(LZ4/c;Ljava/lang/Object;Z)Lb5/e;
    .locals 1

    if-nez p3, :cond_0

    iget-object v0, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {v0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    :cond_0
    invoke-interface {p1, p2, p0}, LZ4/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez p3, :cond_1

    iget-object p1, p0, Lb5/e;->c:Landroid/util/JsonWriter;

    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    :cond_1
    return-object p0
.end method
