.class public final synthetic Lcom/ui/btle/v2/encryption/dh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Lcom/ui/btle/v2/encryption/dh/a;

.field public final synthetic b:[B


# direct methods
.method public synthetic constructor <init>(Lcom/ui/btle/v2/encryption/dh/a;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/b;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iput-object p2, p0, Lcom/ui/btle/v2/encryption/dh/b;->b:[B

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/b;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iget-object v1, p0, Lcom/ui/btle/v2/encryption/dh/b;->b:[B

    invoke-static {v0, v1, p1}, Lcom/ui/btle/v2/encryption/dh/a$c;->a(Lcom/ui/btle/v2/encryption/dh/a;[BLgg/t;)V

    return-void
.end method
