.class public final synthetic Lcom/ui/wifiman/ui/teleport/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LHe/p;


# direct methods
.method public synthetic constructor <init>(LIi/N;LHe/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/q;->a:LIi/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/q;->b:LHe/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/q;->a:LIi/N;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/q;->b:LHe/p;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/teleport/o$g$a;->a(LIi/N;LHe/p;)LYg/J;

    move-result-object v0

    return-object v0
.end method
