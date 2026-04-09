.class public final synthetic Lcom/ui/wifiman/ui/component/network/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LA/B;


# direct methods
.method public synthetic constructor <init>(LA/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/D;->a:LA/B;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/D;->a:LA/B;

    invoke-static {v0}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;->f(LA/B;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
