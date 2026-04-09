.class public final LCd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCd/j$a;


# instance fields
.field private final a:LKa/f$a;


# direct methods
.method public constructor <init>(Ltd/d;)V
    .locals 1

    const-string v0, "speedtestClientFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ltd/d;->a()LKa/f$a;

    move-result-object p1

    iput-object p1, p0, LCd/k;->a:LKa/f$a;

    return-void
.end method

.method public static final synthetic b(LCd/k;)LKa/f$a;
    .locals 0

    iget-object p0, p0, LCd/k;->a:LKa/f$a;

    return-object p0
.end method


# virtual methods
.method public a(Linet/ipaddr/g;J)Lgg/z;
    .locals 3

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCd/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LCd/k$a;-><init>(LCd/k;Linet/ipaddr/g;Ldh/e;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    sget-object v1, LCd/k$b;->a:LCd/k$b;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p2, p3, v1}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    sget-object v1, LCd/k$c;->a:LCd/k$c;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, LCd/k$d;

    invoke-direct {v1, p1}, LCd/k$d;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LCd/k$e;

    invoke-direct {v1, p1, p2, p3}, LCd/k$e;-><init>(Linet/ipaddr/g;J)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p2

    new-instance p3, LCd/k$f;

    invoke-direct {p3, p1}, LCd/k$f;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {p2, p3}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string p2, "doOnError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
