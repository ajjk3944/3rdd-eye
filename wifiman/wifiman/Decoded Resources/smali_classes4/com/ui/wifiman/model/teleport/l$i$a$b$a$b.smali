.class public final Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l$i$a$b$a;->a(Ljava/lang/Object;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/L;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;->a:Lkotlin/jvm/internal/L;

    iput-wide p2, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;->a:Lkotlin/jvm/internal/L;

    iget v1, v0, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lkotlin/jvm/internal/L;->a:I

    iget-wide v2, p0, Lcom/ui/wifiman/model/teleport/l$i$a$b$a$b;->b:J

    int-to-long v0, v1

    mul-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
