.class final LD/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/f;->a(LE0/j;Ll0/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll0/i;

.field final synthetic b:LC0/r;


# direct methods
.method constructor <init>(Ll0/i;LC0/r;)V
    .locals 0

    iput-object p1, p0, LD/f$a;->a:Ll0/i;

    iput-object p2, p0, LD/f$a;->b:LC0/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ll0/i;
    .locals 3

    iget-object v0, p0, LD/f$a;->a:Ll0/i;

    if-nez v0, :cond_2

    iget-object v0, p0, LD/f$a;->b:LC0/r;

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LC0/r;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/s;->d(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/n;->c(J)Ll0/i;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :cond_2
    :goto_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD/f$a;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method
