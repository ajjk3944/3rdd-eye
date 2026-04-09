.class final LM/t$o$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;)V
    .locals 0

    iput-object p1, p0, LM/t$o$a;->a:Lkotlin/jvm/internal/M;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;J)V
    .locals 0

    invoke-virtual {p1}, Ly0/y;->a()V

    iget-object p1, p0, LM/t$o$a;->a:Lkotlin/jvm/internal/M;

    iput-wide p2, p1, Lkotlin/jvm/internal/M;->a:J

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LM/t$o$a;->a(Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
