.class final Laa/c$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/f;

.field final synthetic b:Z

.field final synthetic c:Lb1/f;

.field final synthetic d:Lb1/f;


# direct methods
.method constructor <init>(Lb1/f;ZLb1/f;Lb1/f;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$b;->a:Lb1/f;

    iput-boolean p2, p0, Laa/c$b$b;->b:Z

    iput-object p3, p0, Laa/c$b$b;->c:Lb1/f;

    iput-object p4, p0, Laa/c$b$b;->d:Lb1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/e;)V
    .locals 13

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lb1/e;->b(Lb1/e;Lb1/f;FILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->i()Lb1/v;

    move-result-object v4

    iget-object v0, p0, Laa/c$b$b;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    iget-boolean v0, p0, Laa/c$b$b;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb1/e;->d()Lb1/v;

    move-result-object v1

    iget-object v0, p0, Laa/c$b$b;->c:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->f()Lb1/i$b;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb1/e;->d()Lb1/v;

    move-result-object v7

    iget-object v0, p0, Laa/c$b$b;->d:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->f()Lb1/i$b;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    :goto_0
    sget-object v0, Lb1/s;->a:Lb1/s$b;

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lb1/e;->o(Lb1/s;)V

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/e;->n(Lb1/s;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb1/e;

    invoke-virtual {p0, p1}, Laa/c$b$b;->a(Lb1/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
