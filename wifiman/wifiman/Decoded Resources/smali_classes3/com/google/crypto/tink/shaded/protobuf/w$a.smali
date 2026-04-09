.class public abstract Lcom/google/crypto/tink/shaded/protobuf/w$a;
.super Lcom/google/crypto/tink/shaded/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/crypto/tink/shaded/protobuf/w;

.field protected b:Lcom/google/crypto/tink/shaded/protobuf/w;


# direct methods
.method protected constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->a:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->C()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->r()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static q(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/Y;->a()Lcom/google/crypto/tink/shaded/protobuf/Y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/Y;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/c0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/c0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private r()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->a:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->I()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final i()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->k()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->A()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->f(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public k()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->C()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->D()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-object v0
.end method

.method public l()Lcom/google/crypto/tink/shaded/protobuf/w$a;
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->o()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->G()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->k()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-object v0
.end method

.method protected final m()V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->C()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->n()V

    :cond_0
    return-void
.end method

.method protected n()V
    .locals 2

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->r()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->q(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-void
.end method

.method public o()Lcom/google/crypto/tink/shaded/protobuf/w;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->a:Lcom/google/crypto/tink/shaded/protobuf/w;

    return-object v0
.end method

.method public p(Lcom/google/crypto/tink/shaded/protobuf/w;)Lcom/google/crypto/tink/shaded/protobuf/w$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->o()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->m()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-static {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->q(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
