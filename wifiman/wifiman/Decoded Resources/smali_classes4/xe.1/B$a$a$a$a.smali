.class final Lxe/B$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B$a$a$a;->a(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:LN/n0;

.field final synthetic c:Lxe/f$b;


# direct methods
.method constructor <init>(Lmh/p;LN/n0;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, Lxe/B$a$a$a$a;->a:Lmh/p;

    iput-object p2, p0, Lxe/B$a$a$a$a;->b:LN/n0;

    iput-object p3, p0, Lxe/B$a$a$a$a;->c:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B$a$a$a$a;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.AppModalNavigation.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:218)"

    const v2, 0x2b0c57c9

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lxe/B$a$a$a$a;->a:Lmh/p;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lxe/B$a$a$a$a;->b:LN/n0;

    invoke-virtual {p2}, LN/n0;->g()LN/o0;

    move-result-object p2

    sget-object v1, LN/o0;->Hidden:LN/o0;

    if-eq p2, v1, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    move p2, v0

    :goto_1
    const v1, -0x12e70e79

    invoke-interface {p1, v1}, LT/l;->U(I)V

    iget-object v1, p0, Lxe/B$a$a$a$a;->c:Lxe/f$b;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    new-instance v2, Lxe/A;

    invoke-direct {v2, v1}, Lxe/A;-><init>(Lxe/f$b;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v1, 0x30

    invoke-static {p2, v2, p1, v1, v0}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lxe/B$a$a$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
