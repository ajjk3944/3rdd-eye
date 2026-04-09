.class public final LD8/v$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/v$e;->a(LCc/a;)Lgg/r;
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

    iput-object p1, p0, LD8/v$e$a;->a:LCc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LD8/v$e$a;->a:LCc/a;

    instance-of v1, v0, LCc/j;

    if-eqz v1, :cond_0

    sget-object v0, LJe/b$d;->b:LJe/b$d;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDc/j;->F()LMc/a$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    sget-object v0, LJe/b$d;->b:LJe/b$d;

    goto :goto_2

    :cond_2
    iget-object v0, p0, LD8/v$e$a;->a:LCc/a;

    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LDc/j;->C()LIc/a$a;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    sget-object v0, LJe/b$a;->b:LJe/b$a;

    goto :goto_2

    :cond_4
    iget-object v0, p0, LD8/v$e$a;->a:LCc/a;

    invoke-interface {v0}, LCc/k;->getId()La8/b;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v0, LJe/b$b;

    iget-object v1, p0, LD8/v$e$a;->a:LCc/a;

    invoke-interface {v1}, LCc/k;->getId()La8/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LJe/b$b;-><init>(La8/b;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, LD8/v$e$a;->a:LCc/a;

    invoke-interface {v0}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v0, LJe/b$c;

    iget-object v1, p0, LD8/v$e$a;->a:LCc/a;

    invoke-interface {v1}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LJe/b$c;-><init>(Linet/ipaddr/g;)V

    goto :goto_2

    :cond_6
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_7

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method
