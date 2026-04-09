.class public final Lzh/b;
.super LDh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzh/b$a;,
        Lzh/b$b;
    }
.end annotation


# static fields
.field public static final n:Lzh/b$a;

.field private static final o:LZh/b;

.field private static final p:LZh/b;


# instance fields
.field private final f:Loi/n;

.field private final g:LBh/M;

.field private final h:Lzh/f;

.field private final i:I

.field private final j:Lzh/b$b;

.field private final k:Lzh/d;

.field private final l:Ljava/util/List;

.field private final m:Lzh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzh/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzh/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzh/b;->n:Lzh/b$a;

    new-instance v0, LZh/b;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->A:LZh/c;

    const-string v2, "Function"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    const-string v3, "identifier(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, LZh/b;-><init>(LZh/c;LZh/f;)V

    sput-object v0, Lzh/b;->o:LZh/b;

    new-instance v0, LZh/b;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->x:LZh/c;

    const-string v2, "KFunction"

    invoke-static {v2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, LZh/b;-><init>(LZh/c;LZh/f;)V

    sput-object v0, Lzh/b;->p:LZh/b;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/M;Lzh/f;I)V
    .locals 3

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionTypeKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Lzh/f;->c(I)LZh/f;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LDh/a;-><init>(Loi/n;LZh/f;)V

    iput-object p1, p0, Lzh/b;->f:Loi/n;

    iput-object p2, p0, Lzh/b;->g:LBh/M;

    iput-object p3, p0, Lzh/b;->h:Lzh/f;

    iput p4, p0, Lzh/b;->i:I

    new-instance p2, Lzh/b$b;

    invoke-direct {p2, p0}, Lzh/b$b;-><init>(Lzh/b;)V

    iput-object p2, p0, Lzh/b;->j:Lzh/b$b;

    new-instance p2, Lzh/d;

    invoke-direct {p2, p1, p0}, Lzh/d;-><init>(Loi/n;Lzh/b;)V

    iput-object p2, p0, Lzh/b;->k:Lzh/d;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Lsh/i;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p4}, Lsh/i;-><init>(II)V

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, LZg/Q;

    invoke-virtual {p4}, LZg/Q;->d()I

    move-result p4

    sget-object v0, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x50

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p0, v0, p4}, Lzh/b;->K0(Ljava/util/ArrayList;Lzh/b;Lpi/N0;Ljava/lang/String;)V

    sget-object p4, LYg/J;->a:LYg/J;

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    const-string p3, "R"

    invoke-static {p1, p0, p2, p3}, Lzh/b;->K0(Ljava/util/ArrayList;Lzh/b;Lpi/N0;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lzh/b;->l:Ljava/util/List;

    sget-object p1, Lzh/c;->Companion:Lzh/c$a;

    iget-object p2, p0, Lzh/b;->h:Lzh/f;

    invoke-virtual {p1, p2}, Lzh/c$a;->a(Lzh/f;)Lzh/c;

    move-result-object p1

    iput-object p1, p0, Lzh/b;->m:Lzh/c;

    return-void
.end method

.method private static final K0(Ljava/util/ArrayList;Lzh/b;Lpi/N0;Ljava/lang/String;)V
    .locals 8

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    invoke-static {p3}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v5

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v6

    iget-object v7, p1, Lzh/b;->f:Loi/n;

    const/4 v3, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-static/range {v1 .. v7}, LDh/U;->R0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLpi/N0;LZh/f;ILoi/n;)LBh/l0;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final synthetic L0(Lzh/b;)LBh/M;
    .locals 0

    iget-object p0, p0, Lzh/b;->g:LBh/M;

    return-object p0
.end method

.method public static final synthetic M0()LZh/b;
    .locals 1

    sget-object v0, Lzh/b;->o:LZh/b;

    return-object v0
.end method

.method public static final synthetic N0()LZh/b;
    .locals 1

    sget-object v0, Lzh/b;->p:LZh/b;

    return-object v0
.end method

.method public static final synthetic O0(Lzh/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzh/b;->l:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic P0(Lzh/b;)Loi/n;
    .locals 0

    iget-object p0, p0, Lzh/b;->f:Loi/n;

    return-object p0
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public F0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic P()LBh/d;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->Y0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LBh/d;

    return-object v0
.end method

.method public bridge synthetic Q()Lii/k;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->W0()Lii/k$b;

    move-result-object v0

    return-object v0
.end method

.method public final Q0()I
    .locals 1

    iget v0, p0, Lzh/b;->i:I

    return v0
.end method

.method public R0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic S()LBh/e;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->R0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LBh/e;

    return-object v0
.end method

.method public S0()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public T0()LBh/M;
    .locals 1

    iget-object v0, p0, Lzh/b;->g:LBh/M;

    return-object v0
.end method

.method public final U0()Lzh/f;
    .locals 1

    iget-object v0, p0, Lzh/b;->h:Lzh/f;

    return-object v0
.end method

.method public V0()Ljava/util/List;
    .locals 1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public W0()Lii/k$b;
    .locals 1

    sget-object v0, Lii/k$b;->b:Lii/k$b;

    return-object v0
.end method

.method protected X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lzh/d;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lzh/b;->k:Lzh/d;

    return-object p1
.end method

.method public Y0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->T0()LBh/M;

    move-result-object v0

    return-object v0
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    sget-object v0, LBh/t;->e:LBh/u;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()LBh/f;
    .locals 1

    sget-object v0, LBh/f;->INTERFACE:LBh/f;

    return-object v0
.end method

.method public bridge synthetic i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 0

    invoke-virtual {p0, p1}, Lzh/b;->X0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lzh/d;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()LBh/g0;
    .locals 2

    sget-object v0, LBh/g0;->a:LBh/g0;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()Lpi/v0;
    .locals 1

    iget-object v0, p0, Lzh/b;->j:Lzh/b$b;

    return-object v0
.end method

.method public l()LBh/D;
    .locals 1

    sget-object v0, LBh/D;->ABSTRACT:LBh/D;

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->S0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic n()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lzh/b;->V0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LDh/a;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lzh/b;->l:Ljava/util/List;

    return-object v0
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z0()LBh/q0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
