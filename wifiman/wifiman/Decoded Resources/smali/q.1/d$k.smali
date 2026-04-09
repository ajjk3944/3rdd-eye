.class final Lq/d$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lq/d$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/d$k;

    invoke-direct {v0}, Lq/d$k;-><init>()V

    sput-object v0, Lq/d$k;->a:Lq/d$k;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/k;Lq/k;)Ljava/lang/Boolean;
    .locals 0

    if-ne p1, p2, :cond_0

    sget-object p1, Lq/k;->PostExit:Lq/k;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/k;

    check-cast p2, Lq/k;

    invoke-virtual {p0, p1, p2}, Lq/d$k;->a(Lq/k;Lq/k;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
