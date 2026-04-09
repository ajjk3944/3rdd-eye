.class final LX9/o$b$h;
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
.field final synthetic a:Lb1/f;

.field final synthetic b:Lb1/f;


# direct methods
.method constructor <init>(Lb1/f;Lb1/f;)V
    .locals 0

    iput-object p1, p0, LX9/o$b$h;->a:Lb1/f;

    iput-object p2, p0, LX9/o$b$h;->b:Lb1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/e;)V
    .locals 13

    const-string v0, "$this$constrainAs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lb1/e;->f()Lb1/D;

    move-result-object v1

    iget-object v0, p0, LX9/o$b$h;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->d()Lb1/i$c;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lb1/D;->b(Lb1/D;Lb1/i$c;FFILjava/lang/Object;)V

    invoke-virtual {p1}, Lb1/e;->c()Lb1/d;

    move-result-object v7

    iget-object p1, p0, LX9/o$b$h;->b:Lb1/f;

    invoke-virtual {p1}, Lb1/f;->b()Lb1/i$a;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lb1/d;->a(Lb1/d;Lb1/i$a;FFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb1/e;

    invoke-virtual {p0, p1}, LX9/o$b$h;->a(Lb1/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
