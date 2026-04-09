.class final Lpc/j$g;
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

    iput-object p1, p0, Lpc/j$g;->a:Lpc/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpc/j$g;->a:Lpc/j;

    invoke-static {p1}, Lpc/j;->l(Lpc/j;)Landroid/location/LocationManager;

    move-result-object v0

    invoke-static {p1, v0}, Lpc/j;->m(Lpc/j;Landroid/location/LocationManager;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lpc/j$g;->a(LYg/J;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
