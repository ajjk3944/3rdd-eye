.class final LN/n0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/n0;-><init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY0/d;


# direct methods
.method constructor <init>(LY0/d;)V
    .locals 0

    iput-object p1, p0, LN/n0$d;->a:LY0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, LN/n0$d;->a:LY0/d;

    invoke-static {}, LN/m0;->h()F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/n0$d;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
