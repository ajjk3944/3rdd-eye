.class public final synthetic Lab/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lab/f;


# direct methods
.method public synthetic constructor <init>(Lab/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/e;->a:Lab/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lab/e;->a:Lab/f;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lab/f;->a(Lab/f;Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;

    move-result-object p1

    return-object p1
.end method
