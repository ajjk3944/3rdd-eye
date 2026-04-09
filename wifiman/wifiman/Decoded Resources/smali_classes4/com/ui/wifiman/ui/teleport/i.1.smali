.class public final synthetic Lcom/ui/wifiman/ui/teleport/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LHe/p;


# direct methods
.method public synthetic constructor <init>(LHe/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/i;->a:LHe/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/i;->a:LHe/p;

    invoke-static {v0}, Lcom/ui/wifiman/ui/teleport/o;->g(LHe/p;)LYg/J;

    move-result-object v0

    return-object v0
.end method
