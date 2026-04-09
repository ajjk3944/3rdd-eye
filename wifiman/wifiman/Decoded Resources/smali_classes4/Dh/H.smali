.class public abstract LDh/H;
.super LDh/n;
.source "SourceFile"

# interfaces
.implements LBh/M;


# instance fields
.field private final e:LZh/c;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(LBh/G;LZh/c;)V
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-virtual {p2}, LZh/c;->h()LZh/f;

    move-result-object v1

    sget-object v2, LBh/g0;->a:LBh/g0;

    invoke-direct {p0, p1, v0, v1, v2}, LDh/n;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;)V

    iput-object p2, p0, LDh/H;->e:LZh/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "package "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LDh/H;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()LBh/G;
    .locals 2

    .line 2
    invoke-super {p0}, LDh/n;->b()LBh/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LBh/G;

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/H;->b()LBh/G;

    move-result-object v0

    return-object v0
.end method

.method public final e()LZh/c;
    .locals 1

    iget-object v0, p0, LDh/H;->e:LZh/c;

    return-object v0
.end method

.method public j()LBh/g0;
    .locals 2

    sget-object v0, LBh/g0;->a:LBh/g0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LBh/o;->k(LBh/M;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDh/H;->f:Ljava/lang/String;

    return-object v0
.end method
