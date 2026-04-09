.class final LF/m0$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->l()Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;


# direct methods
.method constructor <init>(LF/m0;)V
    .locals 0

    iput-object p1, p0, LF/m0$j;->a:LF/m0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LF/m0$j;->a:LF/m0;

    invoke-virtual {v0}, LF/m0;->m()LL0/d;

    move-result-object v0

    iget-object v1, p0, LF/m0$j;->a:LF/m0;

    invoke-virtual {v1}, LF/m0;->n()LL0/M;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/L;->j()LL0/d;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/m0$j;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
