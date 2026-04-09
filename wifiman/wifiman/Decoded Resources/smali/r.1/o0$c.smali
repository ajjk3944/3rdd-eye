.class final Lr/o0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/o0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/o0$c;->a:Ljava/lang/Object;

    iput-object p2, p0, Lr/o0$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/o0$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lr/o0$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr/o0$c;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast p1, Lr/o0$b;

    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr/o0$c;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/o0$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lr/o0$c;->d()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lr/o0$c;->f()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method
