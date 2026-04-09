.class final Luj/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/g;->i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/g;

.field final synthetic b:Luj/b;


# direct methods
.method constructor <init>(Luj/g;Luj/b;)V
    .locals 0

    iput-object p1, p0, Luj/g$a;->a:Luj/g;

    iput-object p2, p0, Luj/g$a;->b:Luj/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luj/g$a;->a:Luj/g;

    invoke-static {v0}, Luj/g;->k(Luj/g;)Lmh/p;

    move-result-object v0

    iget-object v1, p0, Luj/g$a;->b:Luj/b;

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
