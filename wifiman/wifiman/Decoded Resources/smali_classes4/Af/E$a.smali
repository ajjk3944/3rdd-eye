.class final LAf/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAf/E;->c(Landroidx/compose/ui/e;LAf/B;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:LAf/B;


# direct methods
.method constructor <init>(Ljava/util/Map;LAf/B;)V
    .locals 0

    iput-object p1, p0, LAf/E$a;->a:Ljava/util/Map;

    iput-object p2, p0, LAf/E$a;->b:LAf/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;LT/l;I)Ljava/lang/String;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1c19dc8b

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.WifiSpectrumPicker.<anonymous> (WifiSpectrumPicker.kt:46)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LAf/E$a;->a:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/c;

    iget-object p3, p0, LAf/E$a;->b:LAf/B;

    invoke-virtual {p3}, LAf/B;->a()Ljava/util/Map;

    move-result-object p3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    new-instance v1, Ll9/a;

    invoke-direct {v1, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    move-object p3, v0

    :goto_0
    const v1, -0x4f52dcad

    invoke-interface {p2, v1}, LT/l;->U(I)V

    const/4 v1, 0x0

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-static {p1, p3, p2, v1}, LNe/h;->b(LS8/c;ILT/l;I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p2}, LT/l;->J()V

    if-nez v0, :cond_3

    invoke-static {p1, p2, v1}, LNe/h;->a(LS8/c;LT/l;I)Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p2}, LT/l;->J()V

    return-object v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LAf/E$a;->a(Ljava/lang/String;LT/l;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
