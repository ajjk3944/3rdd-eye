.class public final synthetic LD9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:F


# direct methods
.method public synthetic constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LD9/j;->a:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LD9/j;->a:F

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-static {v0, p1}, LD9/k$a;->a(FLandroidx/compose/ui/graphics/c;)LYg/J;

    move-result-object p1

    return-object p1
.end method
