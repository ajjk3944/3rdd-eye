.class final Lpc/j$e;
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
.field public static final a:Lpc/j$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpc/j$e;

    invoke-direct {v0}, Lpc/j$e;-><init>()V

    sput-object v0, Lpc/j$e;->a:Lpc/j$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION:Lcom/ui/wifiman/model/android/permissions/a;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, Lpc/j$e;->a(Ljava/util/Set;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
