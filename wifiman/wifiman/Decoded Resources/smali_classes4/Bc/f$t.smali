.class final LBc/f$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;-><init>(Landroid/telephony/SubscriptionManager;Landroid/telephony/TelephonyManager;Lcom/ui/wifiman/model/android/permissions/d;Lpc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LBc/f$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc/f$t;

    invoke-direct {v0}, LBc/f$t;-><init>()V

    sput-object v0, LBc/f$t;->a:LBc/f$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "Cell State Secondary subscribed"

    invoke-static {v1, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, LBc/f$t;->a(LDj/c;)V

    return-void
.end method
