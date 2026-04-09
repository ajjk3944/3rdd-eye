.class public final Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;
.super Lcom/ui/wifiman/ui/speedtest/feedback/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/speedtest/feedback/a$c;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/e;-><init>()V

    sget-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/d;->THROUGHPUT:Lcom/ui/wifiman/ui/speedtest/feedback/d;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->g:LLi/z;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->h:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 3

    new-instance v0, LYg/r;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYg/r;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public q0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "comment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public r0(Lcom/ui/wifiman/ui/speedtest/feedback/d;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public s0()V
    .locals 0

    return-void
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->g:LLi/z;

    return-object v0
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/a$c$a;->h:LLi/z;

    return-object v0
.end method
