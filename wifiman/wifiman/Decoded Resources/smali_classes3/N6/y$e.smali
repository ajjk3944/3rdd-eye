.class LN6/y$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN6/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y;


# direct methods
.method constructor <init>(LN6/y;)V
    .locals 0

    iput-object p1, p0, LN6/y$e;->a:LN6/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, LN6/y$e;->a:LN6/y;

    iget-object v1, v1, LN6/y;->a:Lgg/y;

    const-wide/16 v2, 0xa

    invoke-virtual {p1, v2, v3, v0, v1}, Lgg/s;->q(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    invoke-static {}, LN6/y;->h()Lkg/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/y$e;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
