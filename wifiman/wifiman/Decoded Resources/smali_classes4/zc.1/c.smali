.class final Lzc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCc/a$b;


# instance fields
.field private final a:La8/b;

.field private final b:Lwc/a;

.field private final c:Ljava/util/TreeSet;

.field private final d:LCc/l;

.field private final e:LDc/j;

.field private final f:Lcom/ui/wifiman/model/bluetooth/le/a$a;


# direct methods
.method public constructor <init>(Lwc/a;)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lwc/a;->f()La8/b;

    move-result-object v0

    iput-object v0, p0, Lzc/c;->a:La8/b;

    iput-object p1, p0, Lzc/c;->b:Lwc/a;

    new-instance p1, Ljava/util/TreeSet;

    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    iput-object p1, p0, Lzc/c;->c:Ljava/util/TreeSet;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->i(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->m(LCc/a$b;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    return-object v0
.end method

.method public d()LCc/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->a(LCc/a$b;)LCc/b;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->l(LCc/a$b;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public f()Lxa/a$d;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->k(LCc/a$b;)Lxa/a$d;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 1

    iget-object v0, p0, Lzc/c;->f:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    return-object v0
.end method

.method public getConfig()LCc/l;
    .locals 1

    iget-object v0, p0, Lzc/c;->d:LCc/l;

    return-object v0
.end method

.method public getId()La8/b;
    .locals 1

    iget-object v0, p0, Lzc/c;->a:La8/b;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->j(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->b(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->f(LCc/a$b;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public j()LDc/j;
    .locals 1

    iget-object v0, p0, Lzc/c;->e:LDc/j;

    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->h(LCc/a$b;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public l()Lh9/a;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->g(LCc/a$b;)Lh9/a;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/TreeSet;
    .locals 1

    iget-object v0, p0, Lzc/c;->c:Ljava/util/TreeSet;

    return-object v0
.end method

.method public n()Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->e(LCc/a$b;)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->c(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Lwc/a;
    .locals 1

    iget-object v0, p0, Lzc/c;->b:Lwc/a;

    return-object v0
.end method

.method public q()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->d(LCc/a$b;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
