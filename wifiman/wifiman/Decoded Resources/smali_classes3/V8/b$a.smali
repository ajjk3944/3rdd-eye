.class public final LV8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/b;->j(I)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:LV8/b;


# direct methods
.method public constructor <init>(ILV8/b;)V
    .locals 0

    iput p1, p0, LV8/b$a;->a:I

    iput-object p2, p0, LV8/b$a;->b:LV8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    iget v0, p0, LV8/b$a;->a:I

    iget-object v1, p0, LV8/b$a;->b:LV8/b;

    invoke-static {v1}, LV8/b;->g(LV8/b;)I

    move-result v1

    const/4 v2, 0x0

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV8/b$a;->b:LV8/b;

    invoke-static {v0}, LV8/b;->f(LV8/b;)Z

    move-result v0

    const/16 v1, 0x200

    if-eqz v0, :cond_1

    iget v0, p0, LV8/b$a;->a:I

    if-gt v0, v1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, LV8/b$a;->b:LV8/b;

    invoke-static {v0}, LV8/b;->h(LV8/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance v0, Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;

    iget v2, p0, LV8/b$a;->a:I

    iget-object v3, p0, LV8/b$a;->b:LV8/b;

    invoke-static {v3}, LV8/b;->f(LV8/b;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, LV8/b$a;->b:LV8/b;

    invoke-static {v1}, LV8/b;->g(LV8/b;)I

    move-result v1

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Packet payload is too long to be sent. Payload has "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " bytes but since the writePacketFragmentation is disabled the maximal possible length is "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
