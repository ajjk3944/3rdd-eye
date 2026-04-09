.class public final Lcom/google/gson/internal/bind/e;
.super Lw5/c;
.source "SourceFile"


# static fields
.field private static final r:Ljava/io/Writer;

.field private static final s:Lcom/google/gson/j;


# instance fields
.field private final o:Ljava/util/List;

.field private p:Ljava/lang/String;

.field private q:Lcom/google/gson/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/gson/internal/bind/e$a;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/e$a;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/e;->r:Ljava/io/Writer;

    new-instance v0, Lcom/google/gson/j;

    const-string/jumbo v1, "closed"

    invoke-direct {v0, v1}, Lcom/google/gson/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/e;->s:Lcom/google/gson/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/e;->r:Ljava/io/Writer;

    invoke-direct {p0, v0}, Lw5/c;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    sget-object v0, Lcom/google/gson/h;->a:Lcom/google/gson/h;

    iput-object v0, p0, Lcom/google/gson/internal/bind/e;->q:Lcom/google/gson/g;

    return-void
.end method

.method private B0()Lcom/google/gson/g;
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/g;

    return-object v0
.end method

.method private C0(Lcom/google/gson/g;)V
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/gson/g;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lw5/c;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/google/gson/internal/bind/e;->B0()Lcom/google/gson/g;

    move-result-object v0

    check-cast v0, Lcom/google/gson/i;

    iget-object v1, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/gson/i;->m(Ljava/lang/String;Lcom/google/gson/g;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lcom/google/gson/internal/bind/e;->q:Lcom/google/gson/g;

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/google/gson/internal/bind/e;->B0()Lcom/google/gson/g;

    move-result-object v0

    instance-of v1, v0, Lcom/google/gson/f;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/google/gson/f;

    invoke-virtual {v0, p1}, Lcom/google/gson/f;->m(Lcom/google/gson/g;)V

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method


# virtual methods
.method public A0()Lcom/google/gson/g;
    .locals 3

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->q:Lcom/google/gson/g;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected one JSON element but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public T(Ljava/lang/String;)Lw5/c;
    .locals 1

    const-string/jumbo v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/gson/internal/bind/e;->B0()Lcom/google/gson/g;

    move-result-object v0

    instance-of v0, v0, Lcom/google/gson/i;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Please begin an object before writing a name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Did not expect a name"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b0()Lw5/c;
    .locals 1

    sget-object v0, Lcom/google/gson/h;->a:Lcom/google/gson/h;

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    sget-object v1, Lcom/google/gson/internal/bind/e;->s:Lcom/google/gson/j;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public h()Lw5/c;
    .locals 2

    new-instance v0, Lcom/google/gson/f;

    invoke-direct {v0}, Lcom/google/gson/f;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    iget-object v1, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public j()Lw5/c;
    .locals 2

    new-instance v0, Lcom/google/gson/i;

    invoke-direct {v0}, Lcom/google/gson/i;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    iget-object v1, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public s()Lw5/c;
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/gson/internal/bind/e;->B0()Lcom/google/gson/g;

    move-result-object v0

    instance-of v0, v0, Lcom/google/gson/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public t0(D)Lw5/c;
    .locals 3

    invoke-virtual {p0}, Lw5/c;->P()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/gson/j;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public u0(J)Lw5/c;
    .locals 1

    new-instance v0, Lcom/google/gson/j;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public v()Lw5/c;
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/gson/internal/bind/e;->B0()Lcom/google/gson/g;

    move-result-object v0

    instance-of v0, v0, Lcom/google/gson/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/internal/bind/e;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public v0(Ljava/lang/Boolean;)Lw5/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/internal/bind/e;->b0()Lw5/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/gson/j;

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public w0(Ljava/lang/Number;)Lw5/c;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/internal/bind/e;->b0()Lw5/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lw5/c;->P()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Lcom/google/gson/j;

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public x0(Ljava/lang/String;)Lw5/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/gson/internal/bind/e;->b0()Lw5/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/gson/j;

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method

.method public y0(Z)Lw5/c;
    .locals 1

    new-instance v0, Lcom/google/gson/j;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/e;->C0(Lcom/google/gson/g;)V

    return-object p0
.end method
