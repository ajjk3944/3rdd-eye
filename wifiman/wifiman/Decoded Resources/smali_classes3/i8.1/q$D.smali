.class public final Li8/q$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/a$b;


# direct methods
.method public constructor <init>(Li8/a$b;)V
    .locals 0

    iput-object p1, p0, Li8/q$D;->a:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 7

    :try_start_0
    new-instance v0, Li8/a$a$f;

    new-instance v1, Lxe/F$l$e;

    new-instance v2, Lnf/e$a;

    iget-object v3, p0, Li8/q$D;->a:Li8/a$b;

    check-cast v3, Li8/a$b$B$c$a;

    invoke-virtual {v3}, Li8/a$b$B$c$a;->a()Lqd/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object v3

    iget-object v4, p0, Li8/q$D;->a:Li8/a$b;

    check-cast v4, Li8/a$b$B$c$a;

    invoke-virtual {v4}, Li8/a$b$B$c$a;->a()Lqd/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lqd/a$a;->d()I

    move-result v4

    iget-object v5, p0, Li8/q$D;->a:Li8/a$b;

    check-cast v5, Li8/a$b$B$c$a;

    invoke-virtual {v5}, Li8/a$b$B$c$a;->a()Lqd/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lqd/a$a;->c()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Li8/q$D;->a:Li8/a$b;

    check-cast v6, Li8/a$b$B$c$a;

    invoke-virtual {v6}, Li8/a$b$B$c$a;->a()Lqd/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lqd/a$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v3, v4, v5, v6}, Lnf/e$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lxe/F$l$e;-><init>(Lnf/e;)V

    invoke-direct {v0, v1}, Li8/a$a$f;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
