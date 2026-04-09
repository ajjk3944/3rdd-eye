.class final Lwg/d$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field private final a:Llg/e;

.field private final b:Ljava/lang/Runnable;

.field final synthetic c:Lwg/d$c;


# direct methods
.method constructor <init>(Lwg/d$c;Llg/e;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lwg/d$c$c;->c:Lwg/d$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwg/d$c$c;->a:Llg/e;

    iput-object p3, p0, Lwg/d$c$c;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lwg/d$c$c;->a:Llg/e;

    iget-object v1, p0, Lwg/d$c$c;->c:Lwg/d$c;

    iget-object v2, p0, Lwg/d$c$c;->b:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Lwg/d$c;->b(Ljava/lang/Runnable;)Lhg/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method
