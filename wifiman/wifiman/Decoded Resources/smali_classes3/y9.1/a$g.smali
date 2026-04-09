.class final Ly9/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly9/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/a$g;

    invoke-direct {v0}, Ly9/a$g;-><init>()V

    sput-object v0, Ly9/a$g;->a:Ly9/a$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, Ly9/a$g;->c()LYg/J;

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
    .locals 9

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

    const-string/jumbo v1, "com.ui.core.ui.component.dialog.ComposableSingletons$UiDialogAlertBottomKt.lambda-5.<anonymous> (UiDialogAlertBottom.kt:222)"

    const v2, 0xcce6965

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x7837635c

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    new-instance p2, Ly9/d;

    invoke-direct {p2}, Ly9/d;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p2

    check-cast v4, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    sget-object p2, Ly9/a;->a:Ly9/a;

    invoke-virtual {p2}, Ly9/a;->e()Lmh/p;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x7

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V

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

    invoke-virtual {p0, p1, p2}, Ly9/a$g;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
