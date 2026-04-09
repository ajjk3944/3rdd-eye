.class final LN/l$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/l;->b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/l$e;

    invoke-direct {v0}, LN/l$e;-><init>()V

    sput-object v0, LN/l$e;->a:LN/l$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;LT/l;I)Lr/H;
    .locals 3

    const v0, 0x40178695

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LK0/a;->Off:LK0/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-ne p3, v0, :cond_1

    const/4 p1, 0x1

    invoke-static {v1, p1, v2}, Lr/j;->h(IILjava/lang/Object;)Lr/d0;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object p1

    const/16 p3, 0x64

    if-ne p1, v0, :cond_2

    invoke-static {p3}, Lr/j;->g(I)Lr/d0;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x6

    invoke-static {p3, v1, v2, p1, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object p1

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/l$e;->a(Lr/o0$b;LT/l;I)Lr/H;

    move-result-object p1

    return-object p1
.end method
