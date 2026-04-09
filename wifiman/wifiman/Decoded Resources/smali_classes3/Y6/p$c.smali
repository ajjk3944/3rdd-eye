.class LY6/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:LY6/p$g;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LY6/p$g;
    .locals 4

    iget-object v0, p0, LY6/p$c;->a:LY6/p$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, v0, LY6/p$g;->a:LY6/p$g;

    iput-object v1, v0, LY6/p$g;->a:LY6/p$g;

    iget-object v1, v0, LY6/p$g;->c:LY6/p$g;

    :goto_0
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    if-eqz v2, :cond_1

    iput-object v1, v2, LY6/p$g;->a:LY6/p$g;

    iget-object v1, v2, LY6/p$g;->b:LY6/p$g;

    goto :goto_0

    :cond_1
    iput-object v1, p0, LY6/p$c;->a:LY6/p$g;

    return-object v0
.end method

.method b(LY6/p$g;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_0

    iput-object v0, p1, LY6/p$g;->a:LY6/p$g;

    iget-object v0, p1, LY6/p$g;->b:LY6/p$g;

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    goto :goto_0

    :cond_0
    iput-object v0, p0, LY6/p$c;->a:LY6/p$g;

    return-void
.end method
