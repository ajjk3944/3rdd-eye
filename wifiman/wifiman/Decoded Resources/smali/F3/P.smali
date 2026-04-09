.class public final LF3/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF3/M;


# instance fields
.field final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;LF3/O;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF3/P;->a:Ljava/util/List;

    invoke-virtual {p2}, LF3/O;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LF3/Z;

    invoke-direct {v1, p1, p2}, LF3/Z;-><init>(Landroid/content/Context;LF3/O;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
