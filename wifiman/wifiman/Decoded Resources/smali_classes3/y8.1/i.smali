.class public abstract Ly8/i;
.super Ly8/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/i$a;,
        Ly8/i$b;
    }
.end annotation


# static fields
.field public static final i:Ly8/i$a;

.field public static final j:I

.field private static final k:LTe/N;

.field private static final l:LTe/N;

.field private static final m:LTe/N;


# instance fields
.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly8/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly8/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ly8/i;->i:Ly8/i$a;

    const/16 v0, 0x8

    sput v0, Ly8/i;->j:I

    sget-object v0, LTe/N;->PRIMARY:LTe/N;

    sput-object v0, Ly8/i;->k:LTe/N;

    sget-object v0, LTe/N;->COMPARE_1:LTe/N;

    sput-object v0, Ly8/i;->l:LTe/N;

    sget-object v0, LTe/N;->COMPARE_2:LTe/N;

    sput-object v0, Ly8/i;->m:LTe/N;

    return-void
.end method

.method public constructor <init>(Ly8/a$b;Ly8/r;Ljd/b;)V
    .locals 7

    const-string/jumbo v0, "latencyOperator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkTopologyService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly8/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2}, Ly8/r;->c()Lgg/i;

    move-result-object v1

    invoke-interface {p2}, Ly8/r;->d()Lgg/i;

    move-result-object v2

    invoke-interface {p2}, Ly8/r;->b()Lgg/i;

    move-result-object v3

    invoke-interface {p2}, Ly8/r;->e()Lgg/i;

    move-result-object v4

    invoke-interface {p2}, Ly8/r;->a()Lgg/i;

    move-result-object v5

    sget-object v6, Ly8/i$e;->a:Ly8/i$e;

    invoke-static/range {v1 .. v6}, Lgg/i;->s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "combineLatest(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly8/f;->g(Lgg/i;)Lgg/i;

    move-result-object v0

    iput-object v0, p0, Ly8/i;->d:Lgg/i;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ly8/a$b;->a()Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    new-instance v1, Ly8/i$f;

    invoke-direct {v1, p0}, Ly8/i$f;-><init>(Ly8/i;)V

    invoke-static {v0, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "onBackpressureLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/i;->e:Lgg/i;

    invoke-interface {p3}, Ljd/b;->d()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, Ly8/r;->d()Lgg/i;

    move-result-object v0

    new-instance v1, Ly8/i$d;

    invoke-direct {v1, p0}, Ly8/i$d;-><init>(Ly8/i;)V

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/i;->f:Lgg/i;

    invoke-interface {p3}, Ljd/b;->c()Lgg/i;

    move-result-object p3

    invoke-interface {p2}, Ly8/r;->b()Lgg/i;

    move-result-object v1

    new-instance v2, Ly8/i$c;

    invoke-direct {v2, p0}, Ly8/i$c;-><init>(Ly8/i;)V

    invoke-static {p3, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Ly8/i;->g:Lgg/i;

    invoke-interface {p2}, Ly8/r;->c()Lgg/i;

    move-result-object p2

    sget-object v0, Ly8/i$g;->a:Ly8/i$g;

    invoke-static {p2, p1, p3, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/i;->h:Lgg/i;

    return-void
.end method

.method public static final synthetic i(Ly8/i;Lb8/b;Lb8/b;)Lb8/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/i;->m(Lb8/b;Lb8/b;)Lb8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j()LTe/N;
    .locals 1

    sget-object v0, Ly8/i;->m:LTe/N;

    return-object v0
.end method

.method public static final synthetic k()LTe/N;
    .locals 1

    sget-object v0, Ly8/i;->l:LTe/N;

    return-object v0
.end method

.method public static final synthetic l()LTe/N;
    .locals 1

    sget-object v0, Ly8/i;->k:LTe/N;

    return-object v0
.end method

.method private final m(Lb8/b;Lb8/b;)Lb8/b;
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lb8/b;->a(Lb8/b;)I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p2

    :goto_0
    return-object p1
.end method


# virtual methods
.method protected final n()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/i;->e:Lgg/i;

    return-object v0
.end method

.method protected final o()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/i;->h:Lgg/i;

    return-object v0
.end method
