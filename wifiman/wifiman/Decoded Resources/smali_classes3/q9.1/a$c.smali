.class final Lq9/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lq9/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq9/a$c;

    invoke-direct {v0}, Lq9/a$c;-><init>()V

    sput-object v0, Lq9/a$c;->a:Lq9/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, Lq9/a$c;->c()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.account.ComposableSingletons$UiAccountPickerScreenKt.lambda-3.<anonymous> (UiAccountPickerScreen.kt:271)"

    const v2, 0x4db7ffb5    # 3.8587357E8f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, Lq9/a$c$a;

    invoke-direct {p2}, Lq9/a$c$a;-><init>()V

    const v0, 0x18c9f936

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, Lq9/c;

    invoke-direct {v0}, Lq9/c;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v1, 0x30

    invoke-static {p2, v0, p1, v1}, Lq9/o;->f(Lq9/i;Lmh/a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq9/a$c;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
