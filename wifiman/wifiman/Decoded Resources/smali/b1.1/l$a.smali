.class final Lb1/l$a;
.super Landroidx/compose/ui/platform/C0;
.source "SourceFile"

# interfaces
.implements LC0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lb1/f;

.field private final c:Lmh/l;


# direct methods
.method public constructor <init>(Lb1/f;Lmh/l;)V
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lb1/l$a$a;

    invoke-direct {v0, p1, p2}, Lb1/l$a$a;-><init>(Lb1/f;Lmh/l;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/z0;->a()Lmh/l;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/C0;-><init>(Lmh/l;)V

    iput-object p1, p0, Lb1/l$a;->b:Lb1/f;

    iput-object p2, p0, Lb1/l$a;->c:Lmh/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb1/l$a;->a(LY0/d;Ljava/lang/Object;)Lb1/k;

    move-result-object p1

    return-object p1
.end method

.method public a(LY0/d;Ljava/lang/Object;)Lb1/k;
    .locals 1

    new-instance p1, Lb1/k;

    iget-object p2, p0, Lb1/l$a;->b:Lb1/f;

    iget-object v0, p0, Lb1/l$a;->c:Lmh/l;

    invoke-direct {p1, p2, v0}, Lb1/k;-><init>(Lb1/f;Lmh/l;)V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lb1/l$a;->c:Lmh/l;

    instance-of v1, p1, Lb1/l$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lb1/l$a;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object v2, p1, Lb1/l$a;->c:Lmh/l;

    :cond_1
    if-ne v0, v2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb1/l$a;->c:Lmh/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
