.class final Lxd/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d;->i(Lqd/d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxd/d;

.field final synthetic b:Lqd/d;


# direct methods
.method constructor <init>(Lxd/d;Lqd/d;)V
    .locals 0

    iput-object p1, p0, Lxd/d$e;->a:Lxd/d;

    iput-object p2, p0, Lxd/d$e;->b:Lqd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a;)Lgg/D;
    .locals 5

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxd/d$e;->a:Lxd/d;

    invoke-static {v0}, Lxd/d;->c(Lxd/d;)LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lxd/d$e;->a:Lxd/d;

    invoke-static {v1}, Lxd/d;->d(Lxd/d;)Lpc/a;

    move-result-object v1

    invoke-interface {v1}, Lpc/a;->b()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    iget-object v2, p0, Lxd/d$e;->a:Lxd/d;

    invoke-static {v2}, Lxd/d;->e(Lxd/d;)LDc/e;

    move-result-object v2

    invoke-interface {v2}, LDc/e;->b()Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->o0()Lgg/z;

    move-result-object v2

    sget-object v3, Lxd/d$e$a;->a:Lxd/d$e$a;

    invoke-virtual {v2, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    new-instance v3, Lxd/d$e$b;

    iget-object v4, p0, Lxd/d$e;->b:Lqd/d;

    invoke-direct {v3, v4}, Lxd/d$e$b;-><init>(Lqd/d;)V

    invoke-static {v0, v1, v2, v3}, Lgg/z;->d0(Lgg/D;Lgg/D;Lgg/D;Lkg/g;)Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/d$e$c;

    invoke-direct {v1, p1}, Lxd/d$e$c;-><init>(LIa/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/a;

    invoke-virtual {p0, p1}, Lxd/d$e;->a(LIa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
