.class final LC/C$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/C;-><init>(IFLB/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;


# direct methods
.method constructor <init>(LC/C;)V
    .locals 0

    iput-object p1, p0, LC/C$h;->a:LC/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->v()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-static {v0}, LC/C;->i(LC/C;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-static {v0}, LC/C;->i(LC/C;)I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->w()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v1}, LC/C;->L()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->y()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->y()I

    move-result v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, LC/C$h;->a:LC/C;

    invoke-virtual {v0}, LC/C;->v()I

    move-result v0

    :goto_0
    iget-object v1, p0, LC/C$h;->a:LC/C;

    invoke-static {v1, v0}, LC/C;->h(LC/C;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/C$h;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
