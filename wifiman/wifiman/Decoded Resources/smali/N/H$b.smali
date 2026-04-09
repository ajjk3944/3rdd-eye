.class final LN/H$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LN/H$b;->a:LN/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 1

    iget-object p1, p0, LN/H$b;->a:LN/H;

    invoke-static {p1}, LN/H;->a(LN/H;)LY0/d;

    move-result-object p1

    invoke-static {}, LN/G;->f()F

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

    invoke-virtual {p0, p1}, LN/H$b;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
