.class final Lq9/t$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/t;->b(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/f;

.field final synthetic b:F

.field final synthetic c:Ls9/b;

.field final synthetic d:Lb1/f;


# direct methods
.method constructor <init>(Lb1/f;FLs9/b;Lb1/f;)V
    .locals 0

    iput-object p1, p0, Lq9/t$f;->a:Lb1/f;

    iput p2, p0, Lq9/t$f;->b:F

    iput-object p3, p0, Lq9/t$f;->c:Ls9/b;

    iput-object p4, p0, Lq9/t$f;->d:Lb1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/e;)V
    .locals 13

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb1/e;->h()Lb1/D;

    move-result-object v1

    iget-object v0, p0, Lq9/t$f;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->d()Lb1/i$c;

    move-result-object v2

    iget v3, p0, Lq9/t$f;->b:F

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    iget-object v0, p0, Lq9/t$f;->c:Ls9/b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb1/e;->f()Lb1/D;

    move-result-object v1

    iget-object v0, p0, Lq9/t$f;->d:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->e()Lb1/i$c;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb1/e;->f()Lb1/D;

    move-result-object v7

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    invoke-virtual {v0}, Lb1/f;->d()Lb1/i$c;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lb1/e;->i()Lb1/v;

    move-result-object v0

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v1

    invoke-virtual {v1}, Lb1/f;->f()Lb1/i$b;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->d()Lb1/v;

    move-result-object v6

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    sget-object v0, Lb1/s;->a:Lb1/s$b;

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/e;->o(Lb1/s;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb1/e;

    invoke-virtual {p0, p1}, Lq9/t$f;->a(Lb1/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
