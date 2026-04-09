.class final Lwg/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Lwg/d$b;

.field final synthetic b:Lwg/d;


# direct methods
.method constructor <init>(Lwg/d;Lwg/d$b;)V
    .locals 0

    iput-object p1, p0, Lwg/d$a;->b:Lwg/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwg/d$a;->a:Lwg/d$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lwg/d$a;->a:Lwg/d$b;

    iget-object v1, v0, Lwg/d$b;->b:Llg/e;

    iget-object v2, p0, Lwg/d$a;->b:Lwg/d;

    invoke-virtual {v2, v0}, Lwg/d;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method
