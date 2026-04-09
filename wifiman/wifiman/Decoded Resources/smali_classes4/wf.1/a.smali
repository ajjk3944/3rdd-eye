.class public final synthetic Lwf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:F


# direct methods
.method public synthetic constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lwf/a;->a:F

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwf/a;->a:F

    check-cast p1, Landroidx/compose/ui/layout/m;

    check-cast p2, LC0/B;

    check-cast p3, LY0/b;

    invoke-static {v0, p1, p2, p3}, Lwf/c;->b(FLandroidx/compose/ui/layout/m;LC0/B;LY0/b;)LC0/D;

    move-result-object p1

    return-object p1
.end method
