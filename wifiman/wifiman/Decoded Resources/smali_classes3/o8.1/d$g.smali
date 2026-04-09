.class final Lo8/d$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/d;-><init>(Lgd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo8/d;


# direct methods
.method constructor <init>(Lo8/d;)V
    .locals 0

    iput-object p1, p0, Lo8/d$g;->a:Lo8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo8/d$b;

    instance-of v0, p1, Lo8/d$b$a;

    const-string/jumbo v1, "empty(...)"

    if-eqz v0, :cond_2

    check-cast p1, Lo8/d$b$a;

    invoke-virtual {p1}, Lo8/d$b$a;->a()Lgd/g$b;

    move-result-object v0

    instance-of v2, v0, Lgd/g$b$a;

    if-eqz v2, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lgd/g$b$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo8/d$g;->a:Lo8/d;

    invoke-static {v0}, Lo8/d;->i(Lo8/d;)Lgd/g;

    move-result-object v1

    invoke-virtual {p1}, Lo8/d$b$a;->a()Lgd/g$b;

    move-result-object p1

    check-cast p1, Lgd/g$b$b;

    invoke-interface {v1, p1}, Lgd/g;->b(Lgd/g$b$b;)Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lo8/d;->h(Lo8/d;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    instance-of v0, p1, Lo8/d$b$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo8/d$g;->a:Lo8/d;

    invoke-static {v0}, Lo8/d;->i(Lo8/d;)Lgd/g;

    move-result-object v1

    check-cast p1, Lo8/d$b$b;

    invoke-virtual {p1}, Lo8/d$b$b;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Lgd/g$a;->a(Lgd/g;Ljava/lang/String;Lsh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lo8/d;->h(Lo8/d;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lo8/d$g;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
