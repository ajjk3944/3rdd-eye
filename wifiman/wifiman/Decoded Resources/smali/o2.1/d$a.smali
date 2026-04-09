.class Lo2/d$a;
.super Landroidx/room/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/d;->e(Lm2/q;[Ljava/lang/String;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lgg/j;


# direct methods
.method constructor <init>([Ljava/lang/String;Lgg/j;)V
    .locals 0

    iput-object p2, p0, Lo2/d$a;->b:Lgg/j;

    invoke-direct {p0, p1}, Landroidx/room/c$c;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Set;)V
    .locals 1

    iget-object p1, p0, Lo2/d$a;->b:Lgg/j;

    invoke-interface {p1}, Lgg/j;->isCancelled()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lo2/d$a;->b:Lgg/j;

    sget-object v0, Lo2/d;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
