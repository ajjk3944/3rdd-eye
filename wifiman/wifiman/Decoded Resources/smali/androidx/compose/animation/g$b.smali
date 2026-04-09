.class final Landroidx/compose/animation/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$b;

    invoke-direct {v0}, Landroidx/compose/animation/g$b;-><init>()V

    sput-object v0, Landroidx/compose/animation/g$b;->a:Landroidx/compose/animation/g$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/n;)J
    .locals 2

    invoke-virtual {p1}, Lr/n;->f()F

    move-result v0

    invoke-virtual {p1}, Lr/n;->g()F

    move-result p1

    invoke-static {v0, p1}, Lm0/p1;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lr/n;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$b;->a(Lr/n;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    return-object p1
.end method
