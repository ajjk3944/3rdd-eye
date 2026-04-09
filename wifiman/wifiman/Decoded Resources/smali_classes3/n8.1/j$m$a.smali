.class public final Ln8/j$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j$m;->a(Ll9/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/a;


# direct methods
.method public constructor <init>(LCc/a;)V
    .locals 0

    iput-object p1, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Ln8/j$m$a;->a:LCc/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDc/j;->J()LQc/a$b;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-interface {v0}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-interface {v0}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_4

    new-instance v1, LCd/j$c;

    invoke-direct {v1, v0}, LCd/j$c;-><init>(Linet/ipaddr/g;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Ln8/j$m$a;->a:LCc/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lqd/a$a;

    invoke-virtual {v0}, LRc/a$a;->c()Linet/ipaddr/g;

    move-result-object v2

    invoke-virtual {v0}, LRc/a$a;->j()I

    move-result v0

    iget-object v3, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-interface {v3}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ln8/j$m$a;->a:LCc/a;

    invoke-interface {v4}, LCc/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v0, v3, v4}, Lqd/a$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
