.class final LF/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/F;->e(Ly/k;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/F;

.field final synthetic b:LF/F;


# direct methods
.method constructor <init>(Lo/F;LF/F;)V
    .locals 0

    iput-object p1, p0, LF/F$a;->a:Lo/F;

    iput-object p2, p0, LF/F$a;->b:LF/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, LF/F$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of p2, p1, Ly/g;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ly/d;

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Ly/o$b;

    :goto_1
    if-eqz v0, :cond_2

    iget-object p2, p0, LF/F$a;->a:Lo/F;

    invoke-virtual {p2, p1}, Lo/F;->g(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    instance-of p2, p1, Ly/h;

    if-eqz p2, :cond_3

    iget-object p2, p0, LF/F$a;->a:Lo/F;

    check-cast p1, Ly/h;

    invoke-virtual {p1}, Ly/h;->a()Ly/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/F;->j(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    instance-of p2, p1, Ly/e;

    if-eqz p2, :cond_4

    iget-object p2, p0, LF/F$a;->a:Lo/F;

    check-cast p1, Ly/e;

    invoke-virtual {p1}, Ly/e;->a()Ly/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/F;->j(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    instance-of p2, p1, Ly/o$c;

    if-eqz p2, :cond_5

    iget-object p2, p0, LF/F$a;->a:Lo/F;

    check-cast p1, Ly/o$c;

    invoke-virtual {p1}, Ly/o$c;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/F;->j(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    instance-of p2, p1, Ly/o$a;

    if-eqz p2, :cond_6

    iget-object p2, p0, LF/F$a;->a:Lo/F;

    check-cast p1, Ly/o$a;

    invoke-virtual {p1}, Ly/o$a;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/F;->j(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    iget-object p1, p0, LF/F$a;->a:Lo/F;

    iget-object p2, p0, LF/F$a;->b:LF/F;

    iget-object v0, p1, Lo/M;->a:[Ljava/lang/Object;

    iget p1, p1, Lo/M;->b:I

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v1, p1, :cond_a

    aget-object v3, v0, v1

    check-cast v3, Ly/j;

    instance-of v4, v3, Ly/g;

    if-eqz v4, :cond_7

    invoke-static {p2}, LF/F;->b(LF/F;)I

    move-result v3

    :goto_4
    or-int/2addr v2, v3

    goto :goto_5

    :cond_7
    instance-of v4, v3, Ly/d;

    if-eqz v4, :cond_8

    invoke-static {p2}, LF/F;->a(LF/F;)I

    move-result v3

    goto :goto_4

    :cond_8
    instance-of v3, v3, Ly/o$b;

    if-eqz v3, :cond_9

    invoke-static {p2}, LF/F;->d(LF/F;)I

    move-result v3

    goto :goto_4

    :cond_9
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_a
    iget-object p1, p0, LF/F$a;->b:LF/F;

    invoke-static {p1}, LF/F;->c(LF/F;)LT/n0;

    move-result-object p1

    invoke-interface {p1, v2}, LT/n0;->l(I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
