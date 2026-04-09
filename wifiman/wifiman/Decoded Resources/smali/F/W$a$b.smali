.class final LF/W$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/W$a;->k(LR0/Z;LR0/Q;LR0/H;LF/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC0/r;


# direct methods
.method constructor <init>(LC0/r;)V
    .locals 0

    iput-object p1, p0, LF/W$a$b;->a:LC0/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([F)V
    .locals 2

    iget-object v0, p0, LF/W$a$b;->a:LC0/r;

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/W$a$b;->a:LC0/r;

    invoke-static {v0}, LC0/s;->d(LC0/r;)LC0/r;

    move-result-object v0

    iget-object v1, p0, LF/W$a$b;->a:LC0/r;

    invoke-interface {v0, v1, p1}, LC0/r;->z(LC0/r;[F)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/O0;

    invoke-virtual {p1}, Lm0/O0;->r()[F

    move-result-object p1

    invoke-virtual {p0, p1}, LF/W$a$b;->a([F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
