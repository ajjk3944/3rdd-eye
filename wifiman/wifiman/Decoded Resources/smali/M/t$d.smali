.class final LM/t$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t;->k(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/i;

.field final synthetic b:LM/r;


# direct methods
.method constructor <init>(LM/i;LM/r;)V
    .locals 0

    iput-object p1, p0, LM/t$d;->a:LM/i;

    iput-object p2, p0, LM/t$d;->b:LM/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;)V
    .locals 4

    iget-object v0, p0, LM/t$d;->a:LM/i;

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v1

    iget-object v3, p0, LM/t$d;->b:LM/r;

    invoke-interface {v0, v1, v2, v3}, LM/i;->b(JLM/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ly0/y;->a()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/y;

    invoke-virtual {p0, p1}, LM/t$d;->a(Ly0/y;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
