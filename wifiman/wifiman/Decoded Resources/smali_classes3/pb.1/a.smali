.class public final synthetic Lpb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lpb/l;

.field public final synthetic b:Llb/o;


# direct methods
.method public synthetic constructor <init>(Lpb/l;Llb/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/a;->a:Lpb/l;

    iput-object p2, p0, Lpb/a;->b:Llb/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpb/a;->a:Lpb/l;

    iget-object v1, p0, Lpb/a;->b:Llb/o;

    invoke-static {v0, v1}, Lpb/l;->e(Lpb/l;Llb/o;)Lcom/amazonaws/mobileconnectors/iot/AWSIotMqttManager;

    move-result-object v0

    return-object v0
.end method
