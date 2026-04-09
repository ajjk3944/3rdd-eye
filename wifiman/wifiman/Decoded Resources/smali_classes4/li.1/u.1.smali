.class public abstract Lli/u;
.super Lli/r;
.source "SourceFile"


# instance fields
.field private final h:LWh/a;

.field private final i:Lni/s;

.field private final j:LWh/d;

.field private final k:Lli/M;

.field private l:LUh/m;

.field private m:Lii/k;


# direct methods
.method public constructor <init>(LZh/c;Loi/n;LBh/G;LUh/m;LWh/a;Lni/s;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lli/r;-><init>(LZh/c;Loi/n;LBh/G;)V

    iput-object p5, p0, Lli/u;->h:LWh/a;

    iput-object p6, p0, Lli/u;->i:Lni/s;

    new-instance p1, LWh/d;

    invoke-virtual {p4}, LUh/m;->Y0()LUh/p;

    move-result-object p2

    const-string p3, "getStrings(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, LUh/m;->X0()LUh/o;

    move-result-object p3

    const-string p6, "getQualifiedNames(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, LWh/d;-><init>(LUh/p;LUh/o;)V

    iput-object p1, p0, Lli/u;->j:LWh/d;

    new-instance p2, Lli/M;

    new-instance p3, Lli/s;

    invoke-direct {p3, p0}, Lli/s;-><init>(Lli/u;)V

    invoke-direct {p2, p4, p1, p5, p3}, Lli/M;-><init>(LUh/m;LWh/c;LWh/a;Lmh/l;)V

    iput-object p2, p0, Lli/u;->k:Lli/M;

    iput-object p4, p0, Lli/u;->l:LUh/m;

    return-void
.end method

.method static synthetic M0(Lli/u;LZh/b;)LBh/g0;
    .locals 0

    invoke-static {p0, p1}, Lli/u;->O0(Lli/u;LZh/b;)LBh/g0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N0(Lli/u;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0}, Lli/u;->Q0(Lli/u;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lli/u;LZh/b;)LBh/g0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lli/u;->i:Lni/s;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, LBh/g0;->a:LBh/g0;

    const-string p1, "NO_SOURCE"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method private static final Q0(Lli/u;)Ljava/util/Collection;
    .locals 4

    invoke-virtual {p0}, Lli/u;->P0()Lli/M;

    move-result-object p0

    invoke-virtual {p0}, Lli/M;->b()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LZh/b;

    invoke-virtual {v2}, LZh/b;->j()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lli/l;->c:Lli/l$b;

    invoke-virtual {v3}, Lli/l$b;->a()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZh/b;

    invoke-virtual {v1}, LZh/b;->h()LZh/f;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p0
.end method


# virtual methods
.method public bridge synthetic G0()Lli/j;
    .locals 1

    invoke-virtual {p0}, Lli/u;->P0()Lli/M;

    move-result-object v0

    return-object v0
.end method

.method public L0(Lli/n;)V
    .locals 11

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/u;->l:LUh/m;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lli/u;->l:LUh/m;

    new-instance v1, Lni/M;

    invoke-virtual {v0}, LUh/m;->W0()LUh/l;

    move-result-object v4

    const-string v0, "getPackage(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lli/u;->j:LWh/d;

    iget-object v6, p0, Lli/u;->h:LWh/a;

    iget-object v7, p0, Lli/u;->i:Lni/s;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scope of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lli/t;

    invoke-direct {v10, p0}, Lli/t;-><init>(Lli/u;)V

    move-object v2, v1

    move-object v3, p0

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, Lni/M;-><init>(LBh/M;LUh/l;LWh/c;LWh/a;Lni/s;Lli/n;Ljava/lang/String;Lmh/a;)V

    iput-object v1, p0, Lli/u;->m:Lii/k;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Repeated call to DeserializedPackageFragmentImpl::initialize"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public P0()Lli/M;
    .locals 1

    iget-object v0, p0, Lli/u;->k:Lli/M;

    return-object v0
.end method

.method public r()Lii/k;
    .locals 1

    iget-object v0, p0, Lli/u;->m:Lii/k;

    if-nez v0, :cond_0

    const-string v0, "_memberScope"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
