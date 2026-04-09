.class public final LBc/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->s(I)Lgg/i;
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

    iput-object p1, p0, LBc/f$h;->a:LBc/f;

    iput p2, p0, LBc/f$h;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LBc/f$h;->a:LBc/f;

    invoke-static {v0}, LBc/f;->o(LBc/f;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    iget v1, p0, LBc/f$h;->b:I

    invoke-virtual {v0, v1}, Landroid/telephony/TelephonyManager;->getSimState(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    sget-object v0, LBc/f$d;->UNKNOWN:LBc/f$d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :pswitch_0
    sget-object v0, LBc/f$d;->ACTIVE:LBc/f$d;

    goto :goto_0

    :pswitch_1
    sget-object v0, LBc/f$d;->INACTIVE:LBc/f$d;

    goto :goto_0

    :pswitch_2
    sget-object v0, LBc/f$d;->ABSENT:LBc/f$d;

    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
