.class final LC/C$g;
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

    iput-object p1, p0, LC/C$g;->a:LC/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LC/C$g;->a:LC/C;

    invoke-virtual {v0}, LC/C;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC/C$g;->a:LC/C;

    invoke-static {v0}, LC/C;->j(LC/C;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC/C$g;->a:LC/C;

    invoke-virtual {v0}, LC/C;->v()I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/C$g;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
