.class public final Ly8/o;
.super Ly8/f;
.source "SourceFile"

# interfaces
.implements Ly8/n;


# instance fields
.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly8/a$b;LCd/f;Ljd/b;)V
    .locals 2

    const-string/jumbo v0, "markerManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "infiniteSpeedtest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "topologyService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly8/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2}, LCd/f;->b()Lgg/i;

    move-result-object v0

    invoke-interface {p1}, Ly8/a$b;->a()Lgg/i;

    move-result-object p1

    new-instance v1, Ly8/o$a;

    invoke-direct {v1, p0}, Ly8/o$a;-><init>(Ly8/o;)V

    invoke-static {v0, p1, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-interface {p2}, LCd/f;->a()Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "onBackpressureLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/o;->d:Lgg/i;

    invoke-interface {p3}, Ljd/b;->d()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, LCd/f;->getState()Lgg/i;

    move-result-object p2

    new-instance p3, Ly8/o$c;

    invoke-direct {p3, p0}, Ly8/o$c;-><init>(Ly8/o;)V

    invoke-static {p1, p2, p3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/o;->e:Lgg/i;

    sget-object p2, Ly8/o$b;->a:Ly8/o$b;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/o;->f:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/o;->f:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/o;->d:Lgg/i;

    return-object v0
.end method
