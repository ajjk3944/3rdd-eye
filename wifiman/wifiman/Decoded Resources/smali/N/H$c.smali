.class final LN/H$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H;-><init>(LN/I;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/H;


# direct methods
.method constructor <init>(LN/H;)V
    .locals 0

    iput-object p1, p0, LN/H$c;->a:LN/H;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, LN/H$c;->a:LN/H;

    invoke-static {v0}, LN/H;->a(LN/H;)LY0/d;

    move-result-object v0

    invoke-static {}, LN/G;->g()F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/H$c;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
