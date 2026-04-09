.class final LBc/f$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;-><init>(Landroid/telephony/SubscriptionManager;Landroid/telephony/TelephonyManager;Lcom/ui/wifiman/model/android/permissions/d;Lpc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LBc/f$w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc/f$w;

    invoke-direct {v0}, LBc/f$w;-><init>()V

    sput-object v0, LBc/f$w;->a:LBc/f$w;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$b;LBc/a$b;)LBc/a$b;
    .locals 1

    const-string v0, "sim0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sim1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LBc/a$b$a$b$a;

    if-eqz v0, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    check-cast p2, LBc/a$b;

    invoke-virtual {p0, p1, p2}, LBc/f$w;->a(LBc/a$b;LBc/a$b;)LBc/a$b;

    move-result-object p1

    return-object p1
.end method
