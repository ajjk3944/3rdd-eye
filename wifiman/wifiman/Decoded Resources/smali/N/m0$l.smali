.class final LN/m0$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/o0;

.field final synthetic b:LY0/d;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lr/i;

.field final synthetic e:Z


# direct methods
.method constructor <init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V
    .locals 0

    iput-object p1, p0, LN/m0$l;->a:LN/o0;

    iput-object p2, p0, LN/m0$l;->b:LY0/d;

    iput-object p3, p0, LN/m0$l;->c:Lmh/l;

    iput-object p4, p0, LN/m0$l;->d:Lr/i;

    iput-boolean p5, p0, LN/m0$l;->e:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/n0;
    .locals 7

    new-instance v6, LN/n0;

    iget-object v1, p0, LN/m0$l;->a:LN/o0;

    iget-object v2, p0, LN/m0$l;->b:LY0/d;

    iget-object v3, p0, LN/m0$l;->c:Lmh/l;

    iget-object v4, p0, LN/m0$l;->d:Lr/i;

    iget-boolean v5, p0, LN/m0$l;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LN/n0;-><init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/m0$l;->a()LN/n0;

    move-result-object v0

    return-object v0
.end method
