.class public final Lpb/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttSubscriptionStatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpb/l;->C(Ljava/lang/String;Ljava/lang/String;Z)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/t;


# direct methods
.method constructor <init>(Lgg/t;)V
    .locals 0

    iput-object p1, p0, Lpb/l$c;->a:Lgg/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 3

    const-string/jumbo v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "subscribeToTopic failed"

    invoke-virtual {v0, p1, v2, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpb/l$c;->a:Lgg/t;

    invoke-interface {v0, p1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public b()V
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "subscribeToTopic success"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
