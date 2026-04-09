.class final LA8/o$t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o$t;->a(LYe/e;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LYe/e;


# direct methods
.method constructor <init>(LYe/e;)V
    .locals 0

    iput-object p1, p0, LA8/o$t$a;->a:LYe/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)LA8/o$c;
    .locals 2

    const-string/jumbo v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/o$t$a;->a:LYe/e;

    instance-of v1, v0, LYe/e$b;

    if-eqz v1, :cond_2

    instance-of v0, p1, Lje/r$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LA8/o$t$a;->a:LYe/e;

    check-cast v1, LYe/e$b;

    invoke-virtual {v1}, LYe/e$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LA8/o$c;

    invoke-virtual {p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object v1

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LA8/o$c;-><init>(LS8/l;Lh9/a;)V

    goto :goto_1

    :cond_1
    sget-object p1, LA8/o$c;->c:LA8/o$c$a;

    invoke-virtual {p1}, LA8/o$c$a;->a()LA8/o$c;

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of v0, v0, LYe/e$a;

    if-eqz v0, :cond_4

    instance-of v0, p1, Lje/r$b$a;

    if-eqz v0, :cond_3

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v0

    iget-object v1, p0, LA8/o$t$a;->a:LYe/e;

    check-cast v1, LYe/e$a;

    invoke-virtual {v1}, LYe/e$a;->a()Lh9/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LA8/o$c;

    invoke-virtual {p1}, Lje/r$b$a;->h()LS8/l;

    move-result-object v1

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LA8/o$c;-><init>(LS8/l;Lh9/a;)V

    goto :goto_1

    :cond_3
    sget-object p1, LA8/o$c;->c:LA8/o$c$a;

    invoke-virtual {p1}, LA8/o$c$a;->a()LA8/o$c;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, LA8/o$t$a;->a(Lje/r;)LA8/o$c;

    move-result-object p1

    return-object p1
.end method
