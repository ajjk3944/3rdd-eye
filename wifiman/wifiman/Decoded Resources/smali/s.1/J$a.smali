.class final Ls/J$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/J;->I2()J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls/J;


# direct methods
.method constructor <init>(Ls/J;)V
    .locals 0

    iput-object p1, p0, Ls/J$a;->a:Ls/J;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Ls/J$a;->a:Ls/J;

    invoke-static {v0}, Ls/J;->E2(Ls/J;)LC0/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LC0/s;->e(LC0/r;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ls/J$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    return-object v0
.end method
