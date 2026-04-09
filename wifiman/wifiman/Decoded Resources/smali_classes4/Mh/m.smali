.class public final LMh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMh/p;


# instance fields
.field private final a:LMh/k;

.field private final b:LBh/m;

.field private final c:I

.field private final d:Ljava/util/Map;

.field private final e:Loi/h;


# direct methods
.method public constructor <init>(LMh/k;LBh/m;LQh/z;I)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/m;->a:LMh/k;

    iput-object p2, p0, LMh/m;->b:LBh/m;

    iput p4, p0, LMh/m;->c:I

    invoke-interface {p3}, LQh/z;->getTypeParameters()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lxi/a;->d(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, LMh/m;->d:Ljava/util/Map;

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p1

    new-instance p2, LMh/l;

    invoke-direct {p2, p0}, LMh/l;-><init>(LMh/m;)V

    invoke-interface {p1, p2}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, LMh/m;->e:Loi/h;

    return-void
.end method

.method static synthetic b(LMh/m;LQh/y;)LNh/c0;
    .locals 0

    invoke-static {p0, p1}, LMh/m;->c(LMh/m;LQh/y;)LNh/c0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LMh/m;LQh/y;)LNh/c0;
    .locals 4

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMh/m;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, LNh/c0;

    iget-object v2, p0, LMh/m;->a:LMh/k;

    invoke-static {v2, p0}, LMh/c;->d(LMh/k;LMh/p;)LMh/k;

    move-result-object v2

    iget-object v3, p0, LMh/m;->b:LBh/m;

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-static {v2, v3}, LMh/c;->k(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LMh/k;

    move-result-object v2

    iget v3, p0, LMh/m;->c:I

    add-int/2addr v3, v0

    iget-object p0, p0, LMh/m;->b:LBh/m;

    invoke-direct {v1, v2, p1, v3, p0}, LNh/c0;-><init>(LMh/k;LQh/y;ILBh/m;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method


# virtual methods
.method public a(LQh/y;)LBh/l0;
    .locals 1

    const-string v0, "javaTypeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMh/m;->e:Loi/h;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNh/c0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LMh/m;->a:LMh/k;

    invoke-virtual {v0}, LMh/k;->f()LMh/p;

    move-result-object v0

    invoke-interface {v0, p1}, LMh/p;->a(LQh/y;)LBh/l0;

    move-result-object v0

    :goto_0
    return-object v0
.end method
