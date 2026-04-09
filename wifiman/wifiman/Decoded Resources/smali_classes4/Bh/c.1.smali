.class final LBh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/l0;


# instance fields
.field private final a:LBh/l0;

.field private final b:LBh/m;

.field private final c:I


# direct methods
.method public constructor <init>(LBh/l0;LBh/m;I)V
    .locals 1

    const-string v0, "originalDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "declarationDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/c;->a:LBh/l0;

    iput-object p2, p0, LBh/c;->b:LBh/m;

    iput p3, p0, LBh/c;->c:I

    return-void
.end method


# virtual methods
.method public G()Z
    .locals 1

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->G()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a()LBh/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBh/c;->a()LBh/l0;

    move-result-object v0

    return-object v0
.end method

.method public a()LBh/l0;
    .locals 2

    .line 3
    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->a()LBh/l0;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LBh/c;->a()LBh/l0;

    move-result-object v0

    return-object v0
.end method

.method public b()LBh/m;
    .locals 1

    iget-object v0, p0, LBh/c;->b:LBh/m;

    return-object v0
.end method

.method public g0()Loi/n;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->g0()Loi/n;

    move-result-object v0

    const-string v1, "getStorageManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    return-object v0
.end method

.method public getIndex()I
    .locals 2

    iget v0, p0, LBh/c;->c:I

    iget-object v1, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v1}, LBh/l0;->getIndex()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getName()LZh/f;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()LBh/g0;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/p;->j()LBh/g0;

    move-result-object v0

    const-string v1, "getSource(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()Lpi/v0;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->k()Lpi/v0;

    move-result-object v0

    const-string v1, "getTypeConstructor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public m0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public p()Lpi/N0;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/l0;->p()Lpi/N0;

    move-result-object v0

    const-string v1, "getVariance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0, p1, p2}, LBh/m;->t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LBh/c;->a:LBh/l0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[inner-copy]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lpi/d0;
    .locals 2

    iget-object v0, p0, LBh/c;->a:LBh/l0;

    invoke-interface {v0}, LBh/h;->u()Lpi/d0;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
