.class abstract Lzj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyj/o;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic A()Lyj/e;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->T()Lyj/j;

    move-result-object v0

    return-object v0
.end method

.method public C()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isNilType()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic D()Lyj/d;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->S()Lyj/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic F()Lyj/b;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->Q()Lyj/g;

    move-result-object v0

    return-object v0
.end method

.method public G()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isArrayType()Z

    move-result v0

    return v0
.end method

.method public H()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isBooleanType()Z

    move-result v0

    return v0
.end method

.method public I()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isStringType()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic L()Lyj/t;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->W()Lyj/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic M()Lyj/c;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->R()Lyj/h;

    move-result-object v0

    return-object v0
.end method

.method public N()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isFloatType()Z

    move-result v0

    return v0
.end method

.method public O()Lyj/f;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public Q()Lyj/g;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public R()Lyj/h;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public S()Lyj/i;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public T()Lyj/j;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public U()Lyj/k;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public V()Lyj/l;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public W()Lyj/n;
    .locals 1

    new-instance v0, Lorg/msgpack/core/MessageTypeCastException;

    invoke-direct {v0}, Lorg/msgpack/core/MessageTypeCastException;-><init>()V

    throw v0
.end method

.method public e()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isBinaryType()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Lyj/a;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->O()Lyj/f;

    move-result-object v0

    return-object v0
.end method

.method public j()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isRawType()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic o()Lyj/q;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->V()Lyj/l;

    move-result-object v0

    return-object v0
.end method

.method public v()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isExtensionType()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic x()Lyj/p;
    .locals 1

    invoke-virtual {p0}, Lzj/b;->U()Lyj/k;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isIntegerType()Z

    move-result v0

    return v0
.end method

.method public z()Z
    .locals 1

    invoke-interface {p0}, Lyj/u;->k()Lyj/w;

    move-result-object v0

    invoke-virtual {v0}, Lyj/w;->isMapType()Z

    move-result v0

    return v0
.end method
