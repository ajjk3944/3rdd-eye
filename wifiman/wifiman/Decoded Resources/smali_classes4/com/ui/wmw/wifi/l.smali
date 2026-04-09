.class public final synthetic Lcom/ui/wmw/wifi/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/wifi/l;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/wifi/l;->a:Ljava/util/Set;

    invoke-static {v0}, Lcom/ui/wmw/wifi/b$h;->a(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
