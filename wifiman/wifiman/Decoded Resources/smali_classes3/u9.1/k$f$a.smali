.class final Lu9/k$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu9/k$f;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/f;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lb1/f;


# direct methods
.method constructor <init>(Lb1/f;Ljava/lang/String;Lb1/f;)V
    .locals 0

    iput-object p1, p0, Lu9/k$f$a;->a:Lb1/f;

    iput-object p2, p0, Lu9/k$f$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lu9/k$f$a;->c:Lb1/f;

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

    iget-object v0, p0, Lu9/k$f$a;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->e()Lb1/i$c;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->f()Lb1/D;

    move-result-object v7

    iget-object v0, p0, Lu9/k$f$a;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->d()Lb1/i$c;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->i()Lb1/v;

    move-result-object v0

    iget-object v1, p0, Lu9/k$f$a;->a:Lb1/f;

    invoke-virtual {v1}, Lb1/f;->f()Lb1/i$b;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    iget-object v0, p0, Lu9/k$f$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb1/e;->d()Lb1/v;

    move-result-object v1

    iget-object v0, p0, Lu9/k$f$a;->c:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lb1/e;->d()Lb1/v;

    move-result-object v7

    iget-object v0, p0, Lu9/k$f$a;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    :goto_1
    sget-object v0, Lb1/s;->a:Lb1/s$b;

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lb1/e;->n(Lb1/s;)V

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/e;->o(Lb1/s;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb1/e;

    invoke-virtual {p0, p1}, Lu9/k$f$a;->a(Lb1/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
