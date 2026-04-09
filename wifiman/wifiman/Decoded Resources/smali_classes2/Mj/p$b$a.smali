.class LMj/p$b$a;
.super Lej/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/p$b;-><init>(Lokhttp3/ResponseBody;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LMj/p$b;


# direct methods
.method constructor <init>(LMj/p$b;Lej/D;)V
    .locals 0

    iput-object p1, p0, LMj/p$b$a;->b:LMj/p$b;

    invoke-direct {p0, p2}, Lej/k;-><init>(Lej/D;)V

    return-void
.end method


# virtual methods
.method public U(Lej/e;J)J
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lej/k;->U(Lej/e;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, LMj/p$b$a;->b:LMj/p$b;

    iput-object p1, p2, LMj/p$b;->e:Ljava/io/IOException;

    throw p1
.end method
