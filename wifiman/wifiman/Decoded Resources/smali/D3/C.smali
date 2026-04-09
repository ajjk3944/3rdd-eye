.class public final LD3/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD3/y;


# instance fields
.field final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;LD3/B;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LD3/C;->a:Ljava/util/List;

    invoke-virtual {p2}, LD3/B;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LD3/K;

    invoke-direct {v1, p1, p2}, LD3/K;-><init>(Landroid/content/Context;LD3/B;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
