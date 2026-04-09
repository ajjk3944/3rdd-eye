.class final LK8/e$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK8/e;


# direct methods
.method constructor <init>(LK8/e;)V
    .locals 0

    iput-object p1, p0, LK8/e$i;->a:LK8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LK8/e$a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "availability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LK8/e$a$d;

    if-nez v0, :cond_6

    instance-of v0, p1, LK8/e$a$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LK8/e$a$b;

    if-eqz v0, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, LK8/e$a$c;

    if-eqz v0, :cond_5

    check-cast p1, LK8/e$a$c;

    invoke-virtual {p1}, LK8/e$a$c;->a()LId/a$c;

    move-result-object p1

    instance-of v0, p1, LId/a$c$d;

    if-eqz v0, :cond_2

    iget-object p1, p0, LK8/e$i;->a:LK8/e;

    invoke-static {p1}, LK8/e;->w0(LK8/e;)Li8/a;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Li8/a$b;

    sget-object v1, Li8/a$b$D$g;->a:Li8/a$b$D$g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_2
    instance-of v0, p1, LId/a$c$f;

    if-nez v0, :cond_4

    instance-of v0, p1, LId/a$c$e;

    if-nez v0, :cond_4

    instance-of v0, p1, LId/a$c$a;

    if-nez v0, :cond_4

    instance-of v0, p1, LId/a$c$c;

    if-nez v0, :cond_4

    instance-of v0, p1, LId/a$c$b;

    if-nez v0, :cond_4

    instance-of p1, p1, LId/a$c$g;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK8/e$a;

    invoke-virtual {p0, p1}, LK8/e$i;->a(LK8/e$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
