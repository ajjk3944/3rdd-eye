.class final Lsj/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsj/d;->a(Ljava/lang/Object;Lth/l;)LYg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lsj/d;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lsj/d;)V
    .locals 0

    iput-object p1, p0, Lsj/d$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lsj/d$a;->b:Lsj/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/kodein/di/DI;
    .locals 2

    iget-object v0, p0, Lsj/d$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lsj/d$a;->b:Lsj/d;

    invoke-static {v1}, Lsj/d;->b(Lsj/d;)Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lsj/a;->a(Ljava/lang/Object;Landroid/content/Context;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsj/d$a;->a()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method
