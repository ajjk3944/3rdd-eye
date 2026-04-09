.class final Lr/p0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/p0;->b(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LT/l;I)Lr/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Lr/o0;


# direct methods
.method constructor <init>(Lr/o0;Lr/o0;)V
    .locals 0

    iput-object p1, p0, Lr/p0$c;->a:Lr/o0;

    iput-object p2, p0, Lr/p0$c;->b:Lr/o0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Lr/p0$c;->a:Lr/o0;

    iget-object v0, p0, Lr/p0$c;->b:Lr/o0;

    invoke-virtual {p1, v0}, Lr/o0;->d(Lr/o0;)Z

    iget-object p1, p0, Lr/p0$c;->a:Lr/o0;

    iget-object v0, p0, Lr/p0$c;->b:Lr/o0;

    new-instance v1, Lr/p0$c$a;

    invoke-direct {v1, p1, v0}, Lr/p0$c$a;-><init>(Lr/o0;Lr/o0;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lr/p0$c;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
