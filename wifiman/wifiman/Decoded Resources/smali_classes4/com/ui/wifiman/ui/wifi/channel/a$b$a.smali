.class public final Lcom/ui/wifiman/ui/wifi/channel/a$b$a;
.super Lcom/ui/wifiman/ui/wifi/channel/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/a$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/N;

.field private final k:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/ui/wifiman/ui/wifi/channel/c;-><init>()V

    new-instance v0, LBf/b;

    sget-object v1, LS8/c;->GHZ_2_4:LS8/c;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LBf/b;-><init>(LS8/c;Ljava/util/List;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->g:LLi/z;

    new-instance v0, Lzf/h;

    sget-object v1, LS8/d;->MHZ_20:LS8/d;

    new-instance v2, Ls9/d$c;

    const-string v3, "Excellent"

    invoke-direct {v2, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lzf/h;-><init>(LS8/d;ZLs9/d;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->h:LLi/z;

    new-instance v0, Lzf/f;

    sget-object v1, Lzf/a;->INTERFERE:Lzf/a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lzf/f;-><init>(Lzf/a;Ljava/util/List;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->i:LLi/z;

    new-instance v0, LEe/g;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LEe/g;-><init>(Ljava/util/List;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->j:LLi/N;

    new-instance v0, Ls9/d$c;

    const-string v1, "Channel 1"

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->k:LLi/z;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->v0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public p0()LLi/N;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->j:LLi/N;

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->w0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public s0(Lzf/a;)V
    .locals 1

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public t0(Lh9/a;)V
    .locals 1

    const-string v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->h:LLi/z;

    return-object v0
.end method

.method public v0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->g:LLi/z;

    return-object v0
.end method

.method public w0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->i:LLi/z;

    return-object v0
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/wifi/channel/a$b$a;->k:LLi/z;

    return-object v0
.end method
