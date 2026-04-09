.class public final LCd/l$d;
.super Ltd/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/l;->j(LCd/j$c;)Ltd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field final synthetic d:LCd/j$c;

.field final synthetic e:LCd/l;


# direct methods
.method constructor <init>(LCd/j$c;LCd/l;)V
    .locals 1

    iput-object p1, p0, LCd/l$d;->d:LCd/j$c;

    iput-object p2, p0, LCd/l$d;->e:LCd/l;

    invoke-direct {p0}, Ltd/c;-><init>()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Local Speed test "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LCd/l$d;->c:Ljava/lang/String;

    return-void
.end method

.method public static synthetic k(LCd/l;LCd/n;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, LCd/l$d;->o(LCd/l;LCd/n;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final o(LCd/l;LCd/n;)Lgg/b;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LCd/n;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LCd/l;->c(LCd/l;)Lvd/a;

    move-result-object p0

    new-instance v6, Lvd/a$a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lvd/a$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v6}, Lvd/a;->a(Lvd/a$a;)Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCd/l$d;->l()LCd/n;

    move-result-object v0

    return-object v0
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCd/l$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected e()Lgg/z;
    .locals 2

    new-instance v0, LCd/l$d$a;

    invoke-direct {v0, p0}, LCd/l$d$a;-><init>(LCd/l$d;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LCd/n;

    invoke-virtual {p0, p1}, LCd/l$d;->m(LCd/n;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Lgg/i;
    .locals 0

    check-cast p1, LCd/n;

    invoke-virtual {p0, p1}, LCd/l$d;->n(LCd/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method protected l()LCd/n;
    .locals 2

    sget-object v0, LCd/n;->m:LCd/n$a;

    iget-object v1, p0, LCd/l$d;->d:LCd/j$c;

    invoke-virtual {v0, v1}, LCd/n$a;->a(LCd/j$c;)LCd/n;

    move-result-object v0

    return-object v0
.end method

.method protected m(LCd/n;)Z
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LCd/n;->c()Z

    move-result p1

    return p1
.end method

.method protected n(LCd/n;)Lgg/i;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCd/l$d;->e:LCd/l;

    invoke-static {v0, p1}, LCd/l;->f(LCd/l;LCd/n;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, LCd/l$d;->e:LCd/l;

    new-instance v1, LCd/m;

    invoke-direct {v1, v0}, LCd/m;-><init>(LCd/l;)V

    invoke-static {p1, v1}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
