.class final LCd/g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g;-><init>(LDc/e;Ltd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCd/g;


# direct methods
.method constructor <init>(LCd/g;)V
    .locals 0

    iput-object p1, p0, LCd/g$h;->a:LCd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LCd/g;)V
    .locals 0

    invoke-static {p0}, LCd/g$h;->d(LCd/g;)V

    return-void
.end method

.method public static synthetic b(LCd/g;)V
    .locals 0

    invoke-static {p0}, LCd/g$h;->e(LCd/g;)V

    return-void
.end method

.method private static final d(LCd/g;)V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "Infinite speedtest disposed"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {p0}, LCd/g;->g(LCd/g;)LFg/a;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-static {p0}, LCd/g;->f(LCd/g;)LFg/a;

    move-result-object p0

    new-instance v0, Ll9/a;

    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(LCd/g;)V
    .locals 0

    invoke-static {p0}, LCd/g;->d(LCd/g;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCd/g$b;

    invoke-virtual {p0, p1}, LCd/g$h;->c(LCd/g$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(LCd/g$b;)Lgg/f;
    .locals 7

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LCd/g$b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, LCd/g$h;->a:LCd/g;

    invoke-static {v0}, LCd/g;->e(LCd/g;)LKa/f$a;

    move-result-object v0

    check-cast p1, LCd/g$b$a;

    invoke-virtual {p1}, LCd/g$b$a;->a()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v2

    const-string p1, "toNormalizedString(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LKa/f$c$b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v3, 0x22c5

    const/16 v4, 0x28

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LKa/f$c$b;-><init>(Ljava/lang/String;IIZLjava/lang/String;)V

    invoke-interface {v0, p1}, LKa/a;->a(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, LCd/g$h$a;->a:LCd/g$h$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LCd/g$h$b;

    iget-object v1, p0, LCd/g$h;->a:LCd/g;

    invoke-direct {v0, v1}, LCd/g$h$b;-><init>(LCd/g;)V

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, LCd/g$h$c;

    iget-object v1, p0, LCd/g$h;->a:LCd/g;

    invoke-direct {v0, v1}, LCd/g$h$c;-><init>(LCd/g;)V

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, LCd/g$h;->a:LCd/g;

    new-instance v1, LCd/h;

    invoke-direct {v1, v0}, LCd/h;-><init>(LCd/g;)V

    invoke-virtual {p1, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    sget-object v0, LCd/g$h$d;->a:LCd/g$h$d;

    invoke-virtual {p1, v0}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, LCd/g$h;->a:LCd/g;

    new-instance v1, LCd/i;

    invoke-direct {v1, v0}, LCd/i;-><init>(LCd/g;)V

    invoke-virtual {p1, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, LCd/g$b$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
