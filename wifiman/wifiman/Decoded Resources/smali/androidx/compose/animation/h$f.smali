.class final Landroidx/compose/animation/h$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/h;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/h$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/h$f;

    invoke-direct {v0}, Landroidx/compose/animation/h$f;-><init>()V

    sput-object v0, Landroidx/compose/animation/h$f;->a:Landroidx/compose/animation/h$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;)Lr/H;
    .locals 0

    invoke-static {}, Landroidx/compose/animation/g;->c()Lr/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/h$f;->a(Lr/o0$b;)Lr/H;

    move-result-object p1

    return-object p1
.end method
