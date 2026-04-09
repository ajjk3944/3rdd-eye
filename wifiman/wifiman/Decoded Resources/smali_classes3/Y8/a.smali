.class public final synthetic LY8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/ui/btle/v2/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/ui/btle/v2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY8/a;->a:Ljava/util/List;

    iput-object p2, p0, LY8/a;->b:Lcom/ui/btle/v2/i;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, LY8/a;->a:Ljava/util/List;

    iget-object v1, p0, LY8/a;->b:Lcom/ui/btle/v2/i;

    invoke-static {v0, v1, p1}, Lcom/ui/btle/v2/i;->c(Ljava/util/List;Lcom/ui/btle/v2/i;Lgg/t;)V

    return-void
.end method
