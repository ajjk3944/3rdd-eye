.class final Lsj/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsj/b;->b(Landroid/content/Context;Lth/l;)LYg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lsj/b$a;->a:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lsj/b$a;->a:Landroid/content/Context;

    invoke-static {v0, v0}, Lsj/a;->a(Ljava/lang/Object;Landroid/content/Context;)Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsj/b$a;->a()Lorg/kodein/di/DI;

    move-result-object v0

    return-object v0
.end method
