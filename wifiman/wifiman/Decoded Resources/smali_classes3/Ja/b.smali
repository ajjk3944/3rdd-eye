.class public final synthetic LJa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lspeedtest/ChangedCallback;


# instance fields
.field public final synthetic a:Lspeedtest/SpeedtestServer;

.field public final synthetic b:LKi/t;


# direct methods
.method public synthetic constructor <init>(Lspeedtest/SpeedtestServer;LKi/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJa/b;->a:Lspeedtest/SpeedtestServer;

    iput-object p2, p0, LJa/b;->b:LKi/t;

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget-object v0, p0, LJa/b;->a:Lspeedtest/SpeedtestServer;

    iget-object v1, p0, LJa/b;->b:LKi/t;

    invoke-static {v0, v1}, LJa/c$a;->n(Lspeedtest/SpeedtestServer;LKi/t;)V

    return-void
.end method
