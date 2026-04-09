.class public final synthetic Lcom/ui/wmw/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wmw/k;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wmw/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/i;->a:Lcom/ui/wmw/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/i;->a:Lcom/ui/wmw/k;

    invoke-static {v0}, Lcom/ui/wmw/h$c;->b(Lcom/ui/wmw/k;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
