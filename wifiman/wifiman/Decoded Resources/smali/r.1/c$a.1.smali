.class final Lr/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c;->f(Ljava/lang/Object;Lr/s0;Lr/i;Ljava/lang/Object;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKi/g;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LKi/g;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr/c$a;->a:LKi/g;

    iput-object p2, p0, Lr/c$a;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lr/c$a;->a:LKi/g;

    iget-object v1, p0, Lr/c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/c$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
