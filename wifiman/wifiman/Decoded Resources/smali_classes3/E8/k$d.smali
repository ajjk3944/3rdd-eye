.class final LE8/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k;-><init>(Lgg/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/k;


# direct methods
.method constructor <init>(LE8/k;)V
    .locals 0

    iput-object p1, p0, LE8/k$d;->a:LE8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE8/k$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/y;

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    const-wide/16 v2, 0x32

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v2, v3, v4, p1}, Lgg/i;->H0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    new-instance v2, LE8/k$d$a;

    invoke-direct {v2, v1}, LE8/k$d$a;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {p1, v2, v3, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    sget-object v2, LE8/k$d$b;->a:LE8/k$d$b;

    invoke-virtual {p1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    iget-object v2, p0, LE8/k$d;->a:LE8/k;

    invoke-virtual {v2}, LE8/k;->j()Lgg/i;

    move-result-object v2

    new-instance v3, LE8/k$d$c;

    invoke-direct {v3, v1}, LE8/k$d$c;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {v2, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->E0()Lgg/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "mergeWith(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v1, LE8/k$d$d;

    invoke-direct {v1, v0}, LE8/k$d$d;-><init>(LE8/k$a;)V

    invoke-virtual {p1, v1}, Lgg/i;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lnf/b;->c:Lnf/b$a;

    invoke-virtual {v0}, Lnf/b$a;->a()Lnf/b;

    move-result-object v0

    sget-object v1, LE8/k$d$e;->a:LE8/k$d$e;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LE8/k$d;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
