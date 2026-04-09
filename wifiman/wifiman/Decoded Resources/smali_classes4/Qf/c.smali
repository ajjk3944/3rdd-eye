.class public final synthetic LQf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/wifi/o;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/wifi/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQf/c;->a:Lcom/ui/wmw/wifi/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQf/c;->a:Lcom/ui/wmw/wifi/o;

    invoke-static {v0}, Lcom/ui/wmw/wifi/o;->d(Lcom/ui/wmw/wifi/o;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
