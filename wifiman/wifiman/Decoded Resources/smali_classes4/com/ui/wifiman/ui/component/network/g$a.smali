.class public final Lcom/ui/wifiman/ui/component/network/g$a;
.super Lcom/ui/wifiman/ui/component/network/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/g;->i(Lcom/ui/wifiman/ui/component/network/c;)Lcom/ui/wifiman/ui/component/network/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/ui/wifiman/ui/component/network/c$b;-><init>()V

    new-instance v0, Lcom/ui/wifiman/ui/component/network/c$a$d;

    sget-object v1, LS8/l;->f:LS8/l$a;

    const/16 v2, -0x46

    invoke-virtual {v1, v2}, LS8/l$a;->a(I)LS8/l;

    move-result-object v1

    const-string v2, "WiFiman SSID"

    invoke-direct {v0, v2, v1}, Lcom/ui/wifiman/ui/component/network/c$a$d;-><init>(Ljava/lang/String;LS8/l;)V

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/g$a;->g:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/g$a;->p0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public o0()V
    .locals 0

    return-void
.end method

.method public p0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/g$a;->g:LLi/z;

    return-object v0
.end method
