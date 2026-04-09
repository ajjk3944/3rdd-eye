.class final Lx9/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx9/h;->e(LK0/a;Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lx9/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx9/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/h$b;

    invoke-direct {v0}, Lx9/h$b;-><init>()V

    sput-object v0, Lx9/h$b;->a:Lx9/h$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;LT/l;I)Lr/H;
    .locals 3

    const-string v0, "$this$animateFloat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7587814a

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.checkbox.UiCheckBoxImpl.<anonymous> (UiCheckbox.kt:213)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LK0/a;->Off:LK0/a;

    const/4 v1, 0x0

    if-ne p3, v0, :cond_1

    const/4 p1, 0x0

    const/4 p3, 0x6

    const/16 v0, 0x12c

    invoke-static {v0, p1, v1, p3, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    const/16 p1, 0xc8

    invoke-static {p1}, Lr/j;->g(I)Lr/d0;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x7

    const/4 p3, 0x0

    invoke-static {p3, p3, v1, p1, v1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

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

    invoke-virtual {p0, p1, p2, p3}, Lx9/h$b;->a(Lr/o0$b;LT/l;I)Lr/H;

    move-result-object p1

    return-object p1
.end method
