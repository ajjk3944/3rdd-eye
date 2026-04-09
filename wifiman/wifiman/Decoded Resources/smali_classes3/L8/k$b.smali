.class final LL8/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL8/k;->a(Lcom/ui/wifiman/model/vendor/d;)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/vendor/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/vendor/d;)V
    .locals 0

    iput-object p1, p0, LL8/k$b;->a:Lcom/ui/wifiman/model/vendor/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 6

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x5da55c3a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ubnt.usurvey.ui.util.clickableText.<anonymous> (VendorExtensions.kt:12)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Lvf/d;->a:Lvf/d;

    new-instance p3, LL0/d;

    iget-object v0, p0, LL8/k$b;->a:Lcom/ui/wifiman/model/vendor/d;

    check-cast v0, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$c;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lvf/d;->b:I

    invoke-virtual {p1, p2, v0}, Lvf/d;->a(LT/l;I)J

    move-result-wide v0

    iget-object v2, p0, LL8/k$b;->a:Lcom/ui/wifiman/model/vendor/d;

    check-cast v2, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/vendor/d$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, p3, v0, v1, v2}, Lvf/d;->b(LL0/d;JLjava/lang/String;)LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LL8/k$b;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
