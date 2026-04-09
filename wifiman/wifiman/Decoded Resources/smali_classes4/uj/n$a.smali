.class final Luj/n$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/n;->i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/n;

.field final synthetic b:Luj/b;


# direct methods
.method constructor <init>(Luj/n;Luj/b;)V
    .locals 0

    iput-object p1, p0, Luj/n$a;->a:Luj/n;

    iput-object p2, p0, Luj/n$a;->b:Luj/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Luj/n$a;->a:Luj/n;

    invoke-virtual {p1}, Luj/n;->k()Lmh/l;

    move-result-object p1

    new-instance v0, Luj/k;

    iget-object v1, p0, Luj/n$a;->b:Luj/b;

    invoke-direct {v0, v1}, Luj/k;-><init>(Luj/b;)V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Luj/n$a;->a(LYg/J;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
