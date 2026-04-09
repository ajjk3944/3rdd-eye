.class final LOd/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c;->h(LWc/b;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LWc/b;

.field final synthetic b:LOd/c;


# direct methods
.method constructor <init>(LWc/b;LOd/c;)V
    .locals 0

    iput-object p1, p0, LOd/c$g;->a:LWc/b;

    iput-object p2, p0, LOd/c$g;->b:LOd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/v;
    .locals 3

    const-string v0, "networkAvailable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LOd/c$g;->a:LWc/b;

    instance-of v0, p1, LWc/b$a$a;

    if-eqz v0, :cond_0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, p1, v0}, Lgg/s;->c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, LWc/b$c;

    if-nez v0, :cond_2

    instance-of v0, p1, LWc/b$b;

    if-nez v0, :cond_2

    instance-of p1, p1, LWc/b$a$b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    const-wide/16 v1, 0x7530

    invoke-static {v1, v2, p1, v0}, Lgg/s;->c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    :goto_1
    sget-object v0, LOd/c$g$a;->a:LOd/c$g$a;

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    goto :goto_2

    :cond_3
    iget-object p1, p0, LOd/c$g;->b:LOd/c;

    invoke-static {p1}, LOd/c;->d(LOd/c;)Lgg/i;

    move-result-object p1

    sget-object v0, LOd/c$g$b;->a:LOd/c$g$b;

    invoke-virtual {p1, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lgg/i;->O1(J)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->f2()Lgg/s;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LOd/c$g;->a(Ljava/lang/Boolean;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
