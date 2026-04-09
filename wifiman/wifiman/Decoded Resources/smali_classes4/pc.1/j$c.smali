.class final Lpc/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/j;-><init>(Landroid/content/Context;Ltc/a;Landroid/location/LocationManager;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lpc/j;


# direct methods
.method constructor <init>(Lpc/j;)V
    .locals 0

    iput-object p1, p0, Lpc/j$c;->a:Lpc/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 4

    const-string v0, "locationEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpc/j$c;->a:Lpc/j;

    invoke-static {p1}, Lpc/j;->k(Lpc/j;)Lgg/z;

    move-result-object p1

    const-wide/16 v1, 0x7d0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    sget-object v1, Lpc/j$c$a;->a:Lpc/j$c$a;

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v1, Lpc/j$c$b;->a:Lpc/j$c$b;

    invoke-virtual {p1, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v1, Lpc/j$c$c;->a:Lpc/j$c$c;

    invoke-virtual {p1, v1}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v1, Lpc/j$c$d;->a:Lpc/j$c$d;

    invoke-virtual {p1, v1}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, Ll9/a;

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lpc/j$c;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
