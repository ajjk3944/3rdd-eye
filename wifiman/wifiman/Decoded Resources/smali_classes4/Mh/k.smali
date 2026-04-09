.class public final LMh/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LMh/d;

.field private final b:LMh/p;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:LOh/e;


# direct methods
.method public constructor <init>(LMh/d;LMh/p;LYg/m;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegateForDefaultTypeQualifiers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/k;->a:LMh/d;

    iput-object p2, p0, LMh/k;->b:LMh/p;

    iput-object p3, p0, LMh/k;->c:LYg/m;

    iput-object p3, p0, LMh/k;->d:LYg/m;

    new-instance p1, LOh/e;

    invoke-direct {p1, p0, p2}, LOh/e;-><init>(LMh/k;LMh/p;)V

    iput-object p1, p0, LMh/k;->e:LOh/e;

    return-void
.end method


# virtual methods
.method public final a()LMh/d;
    .locals 1

    iget-object v0, p0, LMh/k;->a:LMh/d;

    return-object v0
.end method

.method public final b()LJh/E;
    .locals 1

    iget-object v0, p0, LMh/k;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJh/E;

    return-object v0
.end method

.method public final c()LYg/m;
    .locals 1

    iget-object v0, p0, LMh/k;->c:LYg/m;

    return-object v0
.end method

.method public final d()LBh/G;
    .locals 1

    iget-object v0, p0, LMh/k;->a:LMh/d;

    invoke-virtual {v0}, LMh/d;->m()LBh/G;

    move-result-object v0

    return-object v0
.end method

.method public final e()Loi/n;
    .locals 1

    iget-object v0, p0, LMh/k;->a:LMh/d;

    invoke-virtual {v0}, LMh/d;->u()Loi/n;

    move-result-object v0

    return-object v0
.end method

.method public final f()LMh/p;
    .locals 1

    iget-object v0, p0, LMh/k;->b:LMh/p;

    return-object v0
.end method

.method public final g()LOh/e;
    .locals 1

    iget-object v0, p0, LMh/k;->e:LOh/e;

    return-object v0
.end method
