.class public final synthetic Lcom/ui/wmw/wifi/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/wifi/n;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/n;->a:Ljava/util/List;

    invoke-static {v0}, Lcom/ui/wmw/wifi/b$l;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
