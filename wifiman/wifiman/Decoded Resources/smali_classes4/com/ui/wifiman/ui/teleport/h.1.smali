.class public final synthetic Lcom/ui/wifiman/ui/teleport/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LHe/p;

.field public final synthetic b:Lcom/ui/wifiman/ui/teleport/c;

.field public final synthetic c:Lcom/ui/wifiman/ui/teleport/d;


# direct methods
.method public synthetic constructor <init>(LHe/p;Lcom/ui/wifiman/ui/teleport/c;Lcom/ui/wifiman/ui/teleport/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/h;->a:LHe/p;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/h;->b:Lcom/ui/wifiman/ui/teleport/c;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/h;->c:Lcom/ui/wifiman/ui/teleport/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/h;->a:LHe/p;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/h;->b:Lcom/ui/wifiman/ui/teleport/c;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/h;->c:Lcom/ui/wifiman/ui/teleport/d;

    invoke-static {v0, v1, v2}, Lcom/ui/wifiman/ui/teleport/o;->c(LHe/p;Lcom/ui/wifiman/ui/teleport/c;Lcom/ui/wifiman/ui/teleport/d;)LYg/J;

    move-result-object v0

    return-object v0
.end method
