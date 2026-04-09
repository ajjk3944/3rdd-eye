.class final Lr/o0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/o0;->e(Ljava/lang/Object;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/N;

.field final synthetic b:Lr/o0;


# direct methods
.method constructor <init>(LIi/N;Lr/o0;)V
    .locals 0

    iput-object p1, p0, Lr/o0$e;->a:LIi/N;

    iput-object p2, p0, Lr/o0$e;->b:Lr/o0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 6

    iget-object v0, p0, Lr/o0$e;->a:LIi/N;

    sget-object v2, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v3, Lr/o0$e$a;

    iget-object p1, p0, Lr/o0$e;->b:Lr/o0;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lr/o0$e$a;-><init>(Lr/o0;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance p1, Lr/o0$e$b;

    invoke-direct {p1}, Lr/o0$e$b;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lr/o0$e;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
