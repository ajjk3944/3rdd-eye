.class LB1/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/i;->d(Landroid/content/Context;Ljava/util/List;ILjava/util/concurrent/Executor;LB1/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB1/a;


# direct methods
.method constructor <init>(LB1/a;)V
    .locals 0

    iput-object p1, p0, LB1/i$b;->a:LB1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LB1/i$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, LB1/i$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, LB1/i$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, LB1/i$b;->a:LB1/a;

    invoke-virtual {v0, p1}, LB1/a;->b(LB1/i$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LB1/i$e;

    invoke-virtual {p0, p1}, LB1/i$b;->a(LB1/i$e;)V

    return-void
.end method
