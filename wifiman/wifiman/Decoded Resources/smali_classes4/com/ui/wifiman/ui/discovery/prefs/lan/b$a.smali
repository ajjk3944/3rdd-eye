.class final Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/discovery/prefs/lan/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 10

    const-string v0, "$this$ModalScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.discovery.prefs.lan.ComposableSingletons$DiscoveryHomeDisplayPrefsLanUiKt.lambda-1.<anonymous> (DiscoveryHomeDisplayPrefsLanUi.kt:35)"

    const v1, 0x1c6b7b0b

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxe/f$b;

    new-instance v1, Ls9/d$b;

    sget p3, Lm8/c;->M2:I

    invoke-direct {v1, p3}, Ls9/d$b;-><init>(I)V

    new-instance p3, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a$a;

    invoke-direct {p3, p1}, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a$a;-><init>(Lxe/f$b;)V

    const/16 p1, 0x36

    const v0, 0x298b8552

    const/4 v2, 0x1

    invoke-static {v0, v2, p3, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    const/16 v8, 0x6000

    const/16 v9, 0x2d

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LFe/j;->c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/discovery/prefs/lan/b$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
