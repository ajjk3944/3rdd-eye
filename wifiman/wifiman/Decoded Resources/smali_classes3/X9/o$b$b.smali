.class final LX9/o$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lb1/f;

.field final synthetic c:F

.field final synthetic d:Z

.field final synthetic e:Lb1/f;

.field final synthetic f:Lb1/f;

.field final synthetic g:F


# direct methods
.method constructor <init>(FLb1/f;FZLb1/f;Lb1/f;F)V
    .locals 0

    iput p1, p0, LX9/o$b$b;->a:F

    iput-object p2, p0, LX9/o$b$b;->b:Lb1/f;

    iput p3, p0, LX9/o$b$b;->c:F

    iput-boolean p4, p0, LX9/o$b$b;->d:Z

    iput-object p5, p0, LX9/o$b$b;->e:Lb1/f;

    iput-object p6, p0, LX9/o$b$b;->f:Lb1/f;

    iput p7, p0, LX9/o$b$b;->g:F

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

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    invoke-virtual {v0}, Lb1/f;->e()Lb1/i$c;

    move-result-object v2

    iget v3, p0, LX9/o$b$b;->a:F

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->f()Lb1/D;

    move-result-object v7

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    invoke-virtual {v0}, Lb1/f;->d()Lb1/i$c;

    move-result-object v8

    iget v9, p0, LX9/o$b$b;->a:F

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->i()Lb1/v;

    move-result-object v0

    iget-object v1, p0, LX9/o$b$b;->b:Lb1/f;

    invoke-virtual {v1}, Lb1/f;->c()Lb1/i$b;

    move-result-object v1

    iget v2, p0, LX9/o$b$b;->c:F

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lb1/v;->a(Lb1/v;Lb1/i$b;FFILjava/lang/Object;)V

    iget-boolean v0, p0, LX9/o$b$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LX9/o$b$b;->e:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v2

    iget-object v0, p0, LX9/o$b$b;->f:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->f()Lb1/i$b;

    move-result-object v3

    iget v5, p0, LX9/o$b$b;->c:F

    const/16 v9, 0x34

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lb1/e;->l(Lb1/e;Lb1/i$b;Lb1/i$b;FFFFFILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LX9/o$b$b;->e:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v2

    invoke-virtual {p1}, Lb1/e;->g()Lb1/f;

    move-result-object v0

    invoke-virtual {v0}, Lb1/f;->c()Lb1/i$b;

    move-result-object v3

    iget v5, p0, LX9/o$b$b;->g:F

    const/16 v9, 0x34

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lb1/e;->l(Lb1/e;Lb1/i$b;Lb1/i$b;FFFFFILjava/lang/Object;)V

    :goto_0
    sget-object v0, Lb1/s;->a:Lb1/s$b;

    invoke-virtual {v0}, Lb1/s$b;->a()Lb1/s$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/e;->o(Lb1/s;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb1/e;

    invoke-virtual {p0, p1}, LX9/o$b$b;->a(Lb1/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
