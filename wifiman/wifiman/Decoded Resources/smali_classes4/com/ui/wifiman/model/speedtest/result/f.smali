.class public final Lcom/ui/wifiman/model/speedtest/result/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/result/e;
.implements Lcom/ui/wifiman/model/speedtest/result/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/result/f$a;
    }
.end annotation


# instance fields
.field private final a:LXb/e;

.field private final b:Lxa/o;

.field private final c:Lgg/y;


# direct methods
.method public constructor <init>(LXb/e;Lxa/o;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f;->b:Lxa/o;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p1

    const-string p2, "io(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f;->c:Lgg/y;

    return-void
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/speedtest/result/f;)LXb/e;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/speedtest/result/f;)Lxa/o;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->b:Lxa/o;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->b:Lxa/o;

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/result/f$f;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/speedtest/result/f$f;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public varargs b([J)Lgg/b;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/f$b;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/speedtest/result/f$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;[J)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/speedtest/result/d$a;->a(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;

    move-result-object p1

    return-object p1
.end method

.method public d(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->d(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;

    move-result-object p1

    return-object p1
.end method

.method public e(Lb8/c;Ljava/lang/String;Ljava/lang/Integer;)Lgg/i;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ui/wifiman/model/speedtest/result/f$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    sget-object v0, Lb8/c;->DISCONNECTED:Lb8/c;

    if-ne p1, v0, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, LXb/e;->e(Lb8/c;Ljava/lang/String;I)Lgg/i;

    move-result-object p1

    goto :goto_2

    :cond_3
    if-nez p2, :cond_4

    if-eqz p3, :cond_4

    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, LXb/e;->b(I)Lgg/i;

    move-result-object p1

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    iget-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    invoke-virtual {p2, p1}, LXb/e;->c(Lb8/c;)Lgg/i;

    move-result-object p1

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    invoke-virtual {p1}, LXb/e;->a()Lgg/i;

    move-result-object p1

    :goto_2
    new-instance p2, Lcom/ui/wifiman/model/speedtest/result/f$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/speedtest/result/f$d;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->x(Lgg/m;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/speedtest/result/f$e;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/speedtest/result/f$e;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f(J)Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->a:LXb/e;

    invoke-virtual {v0, p1, p2}, LXb/e;->k(J)Lgg/i;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f;->b:Lxa/o;

    invoke-interface {p2}, Lxa/o;->b()Lgg/i;

    move-result-object p2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/f$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/result/f$c;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;)V

    invoke-static {p1, p2, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/f;->c:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->c(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/f$g;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/speedtest/result/f$g;-><init>(Lcom/ui/wifiman/model/speedtest/result/f;Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/speedtest/result/f$h;->a:Lcom/ui/wifiman/model/speedtest/result/f$h;

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/f;->c:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public k(Lcom/ui/wifiman/model/speedtest/result/b;)LXb/d;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/speedtest/result/d$a;->b(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b;)LXb/d;

    move-result-object p1

    return-object p1
.end method

.method public l(LXb/d;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->m(Lcom/ui/wifiman/model/speedtest/result/d;LXb/d;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object p1

    return-object p1
.end method
