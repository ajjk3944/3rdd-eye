.class public final Lr/w0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/w0;->c(Lr/q;FF)Lr/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method constructor <init>(Lr/q;FF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lr/q;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    new-instance v3, Lr/K;

    invoke-virtual {p1, v2}, Lr/q;->a(I)F

    move-result v2

    invoke-direct {v3, p2, p3, v2}, Lr/K;-><init>(FFF)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lr/w0$a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(I)Lr/K;
    .locals 1

    iget-object v0, p0, Lr/w0$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/K;

    return-object p1
.end method

.method public bridge synthetic get(I)Lr/I;
    .locals 0

    invoke-virtual {p0, p1}, Lr/w0$a;->a(I)Lr/K;

    move-result-object p1

    return-object p1
.end method
