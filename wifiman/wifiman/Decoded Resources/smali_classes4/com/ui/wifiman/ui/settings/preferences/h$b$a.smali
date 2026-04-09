.class public final Lcom/ui/wifiman/ui/settings/preferences/h$b$a;
.super Lcom/ui/wifiman/ui/settings/preferences/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/h$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/ui/wifiman/ui/settings/preferences/l;-><init>()V

    const-string v0, "192.168.1.1"

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/h$b$a;->g:LLi/z;

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

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/h$b$a;->o0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public o0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/h$b$a;->g:LLi/z;

    return-object v0
.end method
