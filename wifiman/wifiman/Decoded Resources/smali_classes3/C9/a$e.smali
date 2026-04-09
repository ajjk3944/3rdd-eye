.class final LC9/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC9/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC9/a$e;

    invoke-direct {v0}, LC9/a$e;-><init>()V

    sput-object v0, LC9/a$e;->a:LC9/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LC9/a$e;->c()LYg/J;

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
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.notifications.ComposableSingletons$UiNotificationsKt.lambda-5.<anonymous> (UiNotifications.kt:577)"

    const v2, -0x21bb3140

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v7, Ls9/d$c;

    const-string/jumbo p2, "Main Entrance Updated"

    invoke-direct {v7, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object p2, LN9/b;->a:LN9/b;

    invoke-virtual {p2}, LN9/b;->M()Ls9/b;

    move-result-object p2

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p1, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v0

    const-string/jumbo v2, "blue"

    invoke-static {v0, v1, v2}, Lta/c;->g(JLjava/lang/String;)Ls9/b$b;

    move-result-object v0

    invoke-virtual {p2, v0}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v6

    new-instance p2, LC9/i;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const-string v5, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p2

    invoke-direct/range {v4 .. v11}, LC9/i;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LC9/i$a;LC9/i$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0xb6121e1

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, LC9/d;

    invoke-direct {v0}, LC9/d;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v5, v0

    check-cast v5, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v8, 0x186

    const/16 v9, 0x8

    const/4 v6, 0x0

    move-object v4, p2

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LC9/s;->u(Landroidx/compose/ui/e;LC9/i;Lmh/a;LC9/h;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, LC9/a$e;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
