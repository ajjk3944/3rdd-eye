.class public final synthetic Lxc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxc/c;->a:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lxc/c;->a:I

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->c(I)V

    return-void
.end method
