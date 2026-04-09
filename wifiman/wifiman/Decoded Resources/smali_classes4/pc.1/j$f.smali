.class final Lpc/j$f;
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


# static fields
.field public static final a:Lpc/j$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc/j$f;

    invoke-direct {v0}, Lpc/j$f;-><init>()V

    sput-object v0, Lpc/j$f;->a:Lpc/j$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lpc/j$f;->a(Landroid/content/Intent;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
