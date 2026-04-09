.class public final synthetic Lcom/ui/wmw/wifi/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/wifi/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/wifi/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/wifi/m;->a:Lcom/ui/wmw/wifi/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/m;->a:Lcom/ui/wmw/wifi/a;

    invoke-static {v0}, Lcom/ui/wmw/wifi/b$i;->a(Lcom/ui/wmw/wifi/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
