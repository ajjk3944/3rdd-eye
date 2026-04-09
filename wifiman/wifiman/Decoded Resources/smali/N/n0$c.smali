.class final LN/n0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LN/n0$c;->a:LY0/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 1

    iget-object p1, p0, LN/n0$c;->a:LY0/d;

    invoke-static {}, LN/m0;->g()F

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->d1(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LN/n0$c;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
