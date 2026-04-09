.class final LN/p$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/p$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/p$c;

    invoke-direct {v0}, LN/p$c;-><init>()V

    sput-object v0, LN/p$c;->a:LN/p$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/K0;LT/l;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:188)"

    const v2, 0x7c5eb3c4

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    and-int/lit8 v7, p3, 0xe

    const/4 v8, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v3 .. v8}, LN/J0;->b(LN/K0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/K0;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/p$c;->a(LN/K0;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
