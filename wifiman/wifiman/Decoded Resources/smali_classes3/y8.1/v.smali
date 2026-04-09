.class public final Ly8/v;
.super Ly8/t;
.source "SourceFile"


# instance fields
.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ldd/g;LZc/c;Lad/i;Ljd/b;)V
    .locals 1

    const-string/jumbo v0, "latencyService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "internetLatencyService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dnsLatencyService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkTopologyService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Ly8/t;-><init>(LZc/c;Lad/d;)V

    invoke-interface {p4}, Ljd/b;->d()Lgg/i;

    move-result-object p2

    sget-object p3, Ly8/v$c;->a:Ly8/v$c;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance p3, Ly8/v$d;

    invoke-direct {p3, p1}, Ly8/v$d;-><init>(Ldd/g;)V

    invoke-virtual {p2, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ly8/v;->g:Lgg/i;

    invoke-interface {p4}, Ljd/b;->c()Lgg/i;

    move-result-object p2

    sget-object p4, Ly8/v$a;->a:Ly8/v$a;

    invoke-virtual {p2, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance p4, Ly8/v$b;

    invoke-direct {p4, p1}, Ly8/v$b;-><init>(Ldd/g;)V

    invoke-virtual {p2, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/v;->h:Lgg/i;

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/v;->h:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/v;->g:Lgg/i;

    return-object v0
.end method
