.class public final LBc/f$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->z(I)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBc/f;

.field final synthetic b:I


# direct methods
.method public constructor <init>(LBc/f;I)V
    .locals 0

    iput-object p1, p0, LBc/f$n;->a:LBc/f;

    iput p2, p0, LBc/f$n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LBc/f$n;->a:LBc/f;

    invoke-static {v1}, LBc/f;->n(LBc/f;)Landroid/telephony/SubscriptionManager;

    move-result-object v1

    iget v2, p0, LBc/f$n;->b:I

    invoke-virtual {v1, v2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoForSimSlotIndex(I)Landroid/telephony/SubscriptionInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    :try_start_1
    new-instance v0, LBc/f$f;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, LBc/f$n;->a:LBc/f;

    invoke-static {v3}, LBc/f;->o(LBc/f;)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v1

    const-string v3, "createForSubscriptionId(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2, v1}, LBc/f$f;-><init>(ILandroid/telephony/TelephonyManager;)V

    :cond_1
    new-instance v1, Ll9/a;

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
