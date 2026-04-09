.class LB1/l$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/l$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE1/a;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:LB1/l$c;


# direct methods
.method constructor <init>(LB1/l$c;LE1/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LB1/l$c$a;->c:LB1/l$c;

    iput-object p2, p0, LB1/l$c$a;->a:LE1/a;

    iput-object p3, p0, LB1/l$c$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LB1/l$c$a;->a:LE1/a;

    iget-object v1, p0, LB1/l$c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, LE1/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
